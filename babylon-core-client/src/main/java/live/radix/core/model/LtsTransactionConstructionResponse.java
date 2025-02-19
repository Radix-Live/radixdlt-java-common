/*
 * Radix Core API
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  The default configuration is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function. The node exposes a configuration flag which allows disabling certain endpoints which may be problematic, but monitoring is advised. This configuration parameter is `api.core.flags.enable_unbounded_endpoints` / `RADIXDLT_CORE_API_FLAGS_ENABLE_UNBOUNDED_ENDPOINTS`.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` have high guarantees of forward compatibility in future node versions. We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code.  Other endpoints may be changed with new node versions carrying protocol-updates, although any breaking changes will be flagged clearly in the corresponding release notes.  All responses may have additional fields added, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects. 
 *
 * The version of the OpenAPI document: v1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.core.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import live.radix.core.model.InstantMs;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * LtsTransactionConstructionResponse
 */
@JsonPropertyOrder({
  LtsTransactionConstructionResponse.JSON_PROPERTY_CURRENT_EPOCH,
  LtsTransactionConstructionResponse.JSON_PROPERTY_LEDGER_CLOCK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class LtsTransactionConstructionResponse {
  public static final String JSON_PROPERTY_CURRENT_EPOCH = "current_epoch";
  private Long currentEpoch;

  public static final String JSON_PROPERTY_LEDGER_CLOCK = "ledger_clock";
  private InstantMs ledgerClock;

  public LtsTransactionConstructionResponse() {
  }

  public LtsTransactionConstructionResponse currentEpoch(Long currentEpoch) {
    
    this.currentEpoch = currentEpoch;
    return this;
  }

  /**
   * An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the current epoch
   * minimum: 0
   * maximum: 10000000000
   * @return currentEpoch
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENT_EPOCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCurrentEpoch() {
    return currentEpoch;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_EPOCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentEpoch(Long currentEpoch) {
    this.currentEpoch = currentEpoch;
  }

  public LtsTransactionConstructionResponse ledgerClock(InstantMs ledgerClock) {
    
    this.ledgerClock = ledgerClock;
    return this;
  }

  /**
   * The latest round proposer&#39;s timestamp (rounded down to the current minute). This is provided so that the client can detect if the node is synced up or not.  Note: in abnormal cases (e.g. Byzantine network quorum), this on-ledger field may be set to an arbitrary, extreme value allowed by 64-bit signed integer. The API will still clamp the timestamp to &#x60;0 &lt;&#x3D; ms &lt;&#x3D; 100000000000000 (&#x3D;&#x3D; 10^14)&#x60;, which translates to &#x60;1970-01-01T00:00:00.000Z &lt;&#x3D; t &lt;&#x3D; 5138-11-16T09:46:40.000Z&#x60;. 
   * @return ledgerClock
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LEDGER_CLOCK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InstantMs getLedgerClock() {
    return ledgerClock;
  }


  @JsonProperty(JSON_PROPERTY_LEDGER_CLOCK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLedgerClock(InstantMs ledgerClock) {
    this.ledgerClock = ledgerClock;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtsTransactionConstructionResponse ltsTransactionConstructionResponse = (LtsTransactionConstructionResponse) o;
    return Objects.equals(this.currentEpoch, ltsTransactionConstructionResponse.currentEpoch) &&
        Objects.equals(this.ledgerClock, ltsTransactionConstructionResponse.ledgerClock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentEpoch, ledgerClock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LtsTransactionConstructionResponse {\n");
    sb.append("    currentEpoch: ").append(toIndentedString(currentEpoch)).append("\n");
    sb.append("    ledgerClock: ").append(toIndentedString(ledgerClock)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `current_epoch` to the URL query string
    if (getCurrentEpoch() != null) {
      try {
        joiner.add(String.format("%scurrent_epoch%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrentEpoch()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ledger_clock` to the URL query string
    if (getLedgerClock() != null) {
      joiner.add(getLedgerClock().toUrlQueryString(prefix + "ledger_clock" + suffix));
    }

    return joiner.toString();
  }

}


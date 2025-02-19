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
import live.radix.core.model.ActiveValidatorIndex;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SignallingValidator
 */
@JsonPropertyOrder({
  SignallingValidator.JSON_PROPERTY_INDEX,
  SignallingValidator.JSON_PROPERTY_ACTIVE_STAKE_PROPORTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class SignallingValidator {
  public static final String JSON_PROPERTY_INDEX = "index";
  private ActiveValidatorIndex index;

  public static final String JSON_PROPERTY_ACTIVE_STAKE_PROPORTION = "active_stake_proportion";
  private String activeStakeProportion;

  public SignallingValidator() {
  }

  public SignallingValidator index(ActiveValidatorIndex index) {
    
    this.index = index;
    return this;
  }

  /**
   * Validator index within the &#x60;current_validator_set&#x60;.
   * @return index
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ActiveValidatorIndex getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndex(ActiveValidatorIndex index) {
    this.index = index;
  }

  public SignallingValidator activeStakeProportion(String activeStakeProportion) {
    
    this.activeStakeProportion = activeStakeProportion;
    return this;
  }

  /**
   * A proportion (between 0 and 1) of the total active stake of an entire &#x60;current_validator_set&#x60; (i.e. an easily-computable convenience field). This is a string-encoded fixed-precision decimal to 18 decimal places. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;. 
   * @return activeStakeProportion
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTIVE_STAKE_PROPORTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getActiveStakeProportion() {
    return activeStakeProportion;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_STAKE_PROPORTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActiveStakeProportion(String activeStakeProportion) {
    this.activeStakeProportion = activeStakeProportion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignallingValidator signallingValidator = (SignallingValidator) o;
    return Objects.equals(this.index, signallingValidator.index) &&
        Objects.equals(this.activeStakeProportion, signallingValidator.activeStakeProportion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, activeStakeProportion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignallingValidator {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    activeStakeProportion: ").append(toIndentedString(activeStakeProportion)).append("\n");
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

    // add `index` to the URL query string
    if (getIndex() != null) {
      joiner.add(getIndex().toUrlQueryString(prefix + "index" + suffix));
    }

    // add `active_stake_proportion` to the URL query string
    if (getActiveStakeProportion() != null) {
      try {
        joiner.add(String.format("%sactive_stake_proportion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActiveStakeProportion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


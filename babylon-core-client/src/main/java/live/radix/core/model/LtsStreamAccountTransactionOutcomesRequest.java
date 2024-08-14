/*
 * Radix Core API - Babylon (Bottlenose)
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  The default configuration is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function. The node exposes a configuration flag which allows disabling certain endpoints which may be problematic, but monitoring is advised. This configuration parameter is `api.core.flags.enable_unbounded_endpoints` / `RADIXDLT_CORE_API_FLAGS_ENABLE_UNBOUNDED_ENDPOINTS`.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` have high guarantees of forward compatibility in future node versions. We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code.  Other endpoints may be changed with new node versions carrying protocol-updates, although any breaking changes will be flagged clearly in the corresponding release notes.  All responses may have additional fields added, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects. 
 *
 * The version of the OpenAPI document: v1.2.1
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A request to retrieve a sublist of committed transactions from the ledger. 
 */
@JsonPropertyOrder({
  LtsStreamAccountTransactionOutcomesRequest.JSON_PROPERTY_NETWORK,
  LtsStreamAccountTransactionOutcomesRequest.JSON_PROPERTY_ACCOUNT_ADDRESS,
  LtsStreamAccountTransactionOutcomesRequest.JSON_PROPERTY_FROM_STATE_VERSION,
  LtsStreamAccountTransactionOutcomesRequest.JSON_PROPERTY_LIMIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class LtsStreamAccountTransactionOutcomesRequest {
  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public static final String JSON_PROPERTY_ACCOUNT_ADDRESS = "account_address";
  private String accountAddress;

  public static final String JSON_PROPERTY_FROM_STATE_VERSION = "from_state_version";
  private Long fromStateVersion;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public LtsStreamAccountTransactionOutcomesRequest() {
  }

  public LtsStreamAccountTransactionOutcomesRequest network(String network) {
    
    this.network = network;
    return this;
  }

  /**
   * The logical name of the network
   * @return network
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNetwork() {
    return network;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNetwork(String network) {
    this.network = network;
  }

  public LtsStreamAccountTransactionOutcomesRequest accountAddress(String accountAddress) {
    
    this.accountAddress = accountAddress;
    return this;
  }

  /**
   * The Bech32m-encoded human readable version of the account&#39;s address
   * @return accountAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountAddress() {
    return accountAddress;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountAddress(String accountAddress) {
    this.accountAddress = accountAddress;
  }

  public LtsStreamAccountTransactionOutcomesRequest fromStateVersion(Long fromStateVersion) {
    
    this.fromStateVersion = fromStateVersion;
    return this;
  }

  /**
   * Get fromStateVersion
   * minimum: 1
   * maximum: 100000000000000
   * @return fromStateVersion
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FROM_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getFromStateVersion() {
    return fromStateVersion;
  }


  @JsonProperty(JSON_PROPERTY_FROM_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromStateVersion(Long fromStateVersion) {
    this.fromStateVersion = fromStateVersion;
  }

  public LtsStreamAccountTransactionOutcomesRequest limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

  /**
   * The maximum number of transactions that will be returned.
   * @return limit
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtsStreamAccountTransactionOutcomesRequest ltsStreamAccountTransactionOutcomesRequest = (LtsStreamAccountTransactionOutcomesRequest) o;
    return Objects.equals(this.network, ltsStreamAccountTransactionOutcomesRequest.network) &&
        Objects.equals(this.accountAddress, ltsStreamAccountTransactionOutcomesRequest.accountAddress) &&
        Objects.equals(this.fromStateVersion, ltsStreamAccountTransactionOutcomesRequest.fromStateVersion) &&
        Objects.equals(this.limit, ltsStreamAccountTransactionOutcomesRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, accountAddress, fromStateVersion, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LtsStreamAccountTransactionOutcomesRequest {\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    accountAddress: ").append(toIndentedString(accountAddress)).append("\n");
    sb.append("    fromStateVersion: ").append(toIndentedString(fromStateVersion)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

    // add `network` to the URL query string
    if (getNetwork() != null) {
      try {
        joiner.add(String.format("%snetwork%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNetwork()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `account_address` to the URL query string
    if (getAccountAddress() != null) {
      try {
        joiner.add(String.format("%saccount_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `from_state_version` to the URL query string
    if (getFromStateVersion() != null) {
      try {
        joiner.add(String.format("%sfrom_state_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFromStateVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `limit` to the URL query string
    if (getLimit() != null) {
      try {
        joiner.add(String.format("%slimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ExecutedScenarioTransaction
 */
@JsonPropertyOrder({
  ExecutedScenarioTransaction.JSON_PROPERTY_LOGICAL_NAME,
  ExecutedScenarioTransaction.JSON_PROPERTY_STATE_VERSION,
  ExecutedScenarioTransaction.JSON_PROPERTY_INTENT_HASH,
  ExecutedScenarioTransaction.JSON_PROPERTY_INTENT_HASH_BECH32M
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ExecutedScenarioTransaction {
  public static final String JSON_PROPERTY_LOGICAL_NAME = "logical_name";
  private String logicalName;

  public static final String JSON_PROPERTY_STATE_VERSION = "state_version";
  private Long stateVersion;

  public static final String JSON_PROPERTY_INTENT_HASH = "intent_hash";
  private String intentHash;

  public static final String JSON_PROPERTY_INTENT_HASH_BECH32M = "intent_hash_bech32m";
  private String intentHashBech32m;

  public ExecutedScenarioTransaction() {
  }

  public ExecutedScenarioTransaction logicalName(String logicalName) {
    
    this.logicalName = logicalName;
    return this;
  }

  /**
   * Get logicalName
   * @return logicalName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOGICAL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLogicalName() {
    return logicalName;
  }


  @JsonProperty(JSON_PROPERTY_LOGICAL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLogicalName(String logicalName) {
    this.logicalName = logicalName;
  }

  public ExecutedScenarioTransaction stateVersion(Long stateVersion) {
    
    this.stateVersion = stateVersion;
    return this;
  }

  /**
   * Get stateVersion
   * minimum: 1
   * maximum: 100000000000000
   * @return stateVersion
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getStateVersion() {
    return stateVersion;
  }


  @JsonProperty(JSON_PROPERTY_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStateVersion(Long stateVersion) {
    this.stateVersion = stateVersion;
  }

  public ExecutedScenarioTransaction intentHash(String intentHash) {
    
    this.intentHash = intentHash;
    return this;
  }

  /**
   * The hex-encoded transaction intent hash for a user transaction, also known as the transaction id. This hash identifies the core \&quot;intent\&quot; of the transaction. Each transaction intent can only be committed once. This hash gets signed by any signatories on the transaction, to create the signed intent. 
   * @return intentHash
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTENT_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIntentHash() {
    return intentHash;
  }


  @JsonProperty(JSON_PROPERTY_INTENT_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntentHash(String intentHash) {
    this.intentHash = intentHash;
  }

  public ExecutedScenarioTransaction intentHashBech32m(String intentHashBech32m) {
    
    this.intentHashBech32m = intentHashBech32m;
    return this;
  }

  /**
   * The Bech32m-encoded human readable &#x60;TransactionIntentHash&#x60;.
   * @return intentHashBech32m
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTENT_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIntentHashBech32m() {
    return intentHashBech32m;
  }


  @JsonProperty(JSON_PROPERTY_INTENT_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntentHashBech32m(String intentHashBech32m) {
    this.intentHashBech32m = intentHashBech32m;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutedScenarioTransaction executedScenarioTransaction = (ExecutedScenarioTransaction) o;
    return Objects.equals(this.logicalName, executedScenarioTransaction.logicalName) &&
        Objects.equals(this.stateVersion, executedScenarioTransaction.stateVersion) &&
        Objects.equals(this.intentHash, executedScenarioTransaction.intentHash) &&
        Objects.equals(this.intentHashBech32m, executedScenarioTransaction.intentHashBech32m);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalName, stateVersion, intentHash, intentHashBech32m);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutedScenarioTransaction {\n");
    sb.append("    logicalName: ").append(toIndentedString(logicalName)).append("\n");
    sb.append("    stateVersion: ").append(toIndentedString(stateVersion)).append("\n");
    sb.append("    intentHash: ").append(toIndentedString(intentHash)).append("\n");
    sb.append("    intentHashBech32m: ").append(toIndentedString(intentHashBech32m)).append("\n");
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

    // add `logical_name` to the URL query string
    if (getLogicalName() != null) {
      try {
        joiner.add(String.format("%slogical_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogicalName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state_version` to the URL query string
    if (getStateVersion() != null) {
      try {
        joiner.add(String.format("%sstate_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStateVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `intent_hash` to the URL query string
    if (getIntentHash() != null) {
      try {
        joiner.add(String.format("%sintent_hash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntentHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `intent_hash_bech32m` to the URL query string
    if (getIntentHashBech32m() != null) {
      try {
        joiner.add(String.format("%sintent_hash_bech32m%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntentHashBech32m()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


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
import live.radix.core.model.Substate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubstateValue
 */
@JsonPropertyOrder({
  SubstateValue.JSON_PROPERTY_SUBSTATE_HEX,
  SubstateValue.JSON_PROPERTY_SUBSTATE_DATA_HASH,
  SubstateValue.JSON_PROPERTY_SUBSTATE_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class SubstateValue {
  public static final String JSON_PROPERTY_SUBSTATE_HEX = "substate_hex";
  private String substateHex;

  public static final String JSON_PROPERTY_SUBSTATE_DATA_HASH = "substate_data_hash";
  private String substateDataHash;

  public static final String JSON_PROPERTY_SUBSTATE_DATA = "substate_data";
  private Substate substateData;

  public SubstateValue() {
  }

  public SubstateValue substateHex(String substateHex) {
    
    this.substateHex = substateHex;
    return this;
  }

  /**
   * The hex-encoded, SBOR-encoded substate data bytes. Only returned if enabled in SubstateFormatOptions on your request (default false).
   * @return substateHex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSTATE_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubstateHex() {
    return substateHex;
  }


  @JsonProperty(JSON_PROPERTY_SUBSTATE_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubstateHex(String substateHex) {
    this.substateHex = substateHex;
  }

  public SubstateValue substateDataHash(String substateDataHash) {
    
    this.substateDataHash = substateDataHash;
    return this;
  }

  /**
   * The hex-encoded Blake2b-256 hash of the substate data bytes. Only returned if enabled in SubstateFormatOptions on your request (default false).
   * @return substateDataHash
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSTATE_DATA_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubstateDataHash() {
    return substateDataHash;
  }


  @JsonProperty(JSON_PROPERTY_SUBSTATE_DATA_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubstateDataHash(String substateDataHash) {
    this.substateDataHash = substateDataHash;
  }

  public SubstateValue substateData(Substate substateData) {
    
    this.substateData = substateData;
    return this;
  }

  /**
   * The typed substate value. Only returned if enabled in SubstateFormatOptions on your request (default true).
   * @return substateData
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSTATE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Substate getSubstateData() {
    return substateData;
  }


  @JsonProperty(JSON_PROPERTY_SUBSTATE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubstateData(Substate substateData) {
    this.substateData = substateData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubstateValue substateValue = (SubstateValue) o;
    return Objects.equals(this.substateHex, substateValue.substateHex) &&
        Objects.equals(this.substateDataHash, substateValue.substateDataHash) &&
        Objects.equals(this.substateData, substateValue.substateData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(substateHex, substateDataHash, substateData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubstateValue {\n");
    sb.append("    substateHex: ").append(toIndentedString(substateHex)).append("\n");
    sb.append("    substateDataHash: ").append(toIndentedString(substateDataHash)).append("\n");
    sb.append("    substateData: ").append(toIndentedString(substateData)).append("\n");
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

    // add `substate_hex` to the URL query string
    if (getSubstateHex() != null) {
      try {
        joiner.add(String.format("%ssubstate_hex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubstateHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `substate_data_hash` to the URL query string
    if (getSubstateDataHash() != null) {
      try {
        joiner.add(String.format("%ssubstate_data_hash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubstateDataHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `substate_data` to the URL query string
    if (getSubstateData() != null) {
      joiner.add(getSubstateData().toUrlQueryString(prefix + "substate_data" + suffix));
    }

    return joiner.toString();
  }

}


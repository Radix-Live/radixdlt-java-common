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
 * ReferenceType
 */
@JsonPropertyOrder({
  ReferenceType.JSON_PROPERTY_RAW_BITS,
  ReferenceType.JSON_PROPERTY_NORMAL,
  ReferenceType.JSON_PROPERTY_DIRECT_ACCESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ReferenceType {
  public static final String JSON_PROPERTY_RAW_BITS = "raw_bits";
  private Long rawBits;

  public static final String JSON_PROPERTY_NORMAL = "normal";
  private Boolean normal;

  public static final String JSON_PROPERTY_DIRECT_ACCESS = "direct_access";
  private Boolean directAccess;

  public ReferenceType() {
  }

  public ReferenceType rawBits(Long rawBits) {
    
    this.rawBits = rawBits;
    return this;
  }

  /**
   * Get rawBits
   * minimum: 0
   * maximum: 4294967295
   * @return rawBits
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RAW_BITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getRawBits() {
    return rawBits;
  }


  @JsonProperty(JSON_PROPERTY_RAW_BITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRawBits(Long rawBits) {
    this.rawBits = rawBits;
  }

  public ReferenceType normal(Boolean normal) {
    
    this.normal = normal;
    return this;
  }

  /**
   * Get normal
   * @return normal
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NORMAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isNormal() {
    return normal;
  }


  @JsonProperty(JSON_PROPERTY_NORMAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNormal(Boolean normal) {
    this.normal = normal;
  }

  public ReferenceType directAccess(Boolean directAccess) {
    
    this.directAccess = directAccess;
    return this;
  }

  /**
   * Get directAccess
   * @return directAccess
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DIRECT_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isDirectAccess() {
    return directAccess;
  }


  @JsonProperty(JSON_PROPERTY_DIRECT_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDirectAccess(Boolean directAccess) {
    this.directAccess = directAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceType referenceType = (ReferenceType) o;
    return Objects.equals(this.rawBits, referenceType.rawBits) &&
        Objects.equals(this.normal, referenceType.normal) &&
        Objects.equals(this.directAccess, referenceType.directAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawBits, normal, directAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceType {\n");
    sb.append("    rawBits: ").append(toIndentedString(rawBits)).append("\n");
    sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
    sb.append("    directAccess: ").append(toIndentedString(directAccess)).append("\n");
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

    // add `raw_bits` to the URL query string
    if (getRawBits() != null) {
      try {
        joiner.add(String.format("%sraw_bits%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRawBits()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `normal` to the URL query string
    if (isNormal() != null) {
      try {
        joiner.add(String.format("%snormal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isNormal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `direct_access` to the URL query string
    if (isDirectAccess() != null) {
      try {
        joiner.add(String.format("%sdirect_access%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isDirectAccess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


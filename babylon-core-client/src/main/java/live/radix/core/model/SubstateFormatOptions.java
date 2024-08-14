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
 * Requested substate formats to include in the response
 */
@JsonPropertyOrder({
  SubstateFormatOptions.JSON_PROPERTY_RAW,
  SubstateFormatOptions.JSON_PROPERTY_HASH,
  SubstateFormatOptions.JSON_PROPERTY_TYPED,
  SubstateFormatOptions.JSON_PROPERTY_PREVIOUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class SubstateFormatOptions {
  public static final String JSON_PROPERTY_RAW = "raw";
  private Boolean raw;

  public static final String JSON_PROPERTY_HASH = "hash";
  private Boolean hash;

  public static final String JSON_PROPERTY_TYPED = "typed";
  private Boolean typed;

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  private Boolean previous;

  public SubstateFormatOptions() {
  }

  public SubstateFormatOptions raw(Boolean raw) {
    
    this.raw = raw;
    return this;
  }

  /**
   * Whether to return the raw substate value bytes (default false)
   * @return raw
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isRaw() {
    return raw;
  }


  @JsonProperty(JSON_PROPERTY_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRaw(Boolean raw) {
    this.raw = raw;
  }

  public SubstateFormatOptions hash(Boolean hash) {
    
    this.hash = hash;
    return this;
  }

  /**
   * Whether to return the raw substate value bytes hash (default false)
   * @return hash
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isHash() {
    return hash;
  }


  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHash(Boolean hash) {
    this.hash = hash;
  }

  public SubstateFormatOptions typed(Boolean typed) {
    
    this.typed = typed;
    return this;
  }

  /**
   * Whether to return the typed substate information (default true)
   * @return typed
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isTyped() {
    return typed;
  }


  @JsonProperty(JSON_PROPERTY_TYPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTyped(Boolean typed) {
    this.typed = typed;
  }

  public SubstateFormatOptions previous(Boolean previous) {
    
    this.previous = previous;
    return this;
  }

  /**
   * Whether to return the previous substate value for updates and deletes (default false)
   * @return previous
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isPrevious() {
    return previous;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrevious(Boolean previous) {
    this.previous = previous;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubstateFormatOptions substateFormatOptions = (SubstateFormatOptions) o;
    return Objects.equals(this.raw, substateFormatOptions.raw) &&
        Objects.equals(this.hash, substateFormatOptions.hash) &&
        Objects.equals(this.typed, substateFormatOptions.typed) &&
        Objects.equals(this.previous, substateFormatOptions.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raw, hash, typed, previous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubstateFormatOptions {\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    typed: ").append(toIndentedString(typed)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

    // add `raw` to the URL query string
    if (isRaw() != null) {
      try {
        joiner.add(String.format("%sraw%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isRaw()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hash` to the URL query string
    if (isHash() != null) {
      try {
        joiner.add(String.format("%shash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `typed` to the URL query string
    if (isTyped() != null) {
      try {
        joiner.add(String.format("%styped%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isTyped()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `previous` to the URL query string
    if (isPrevious() != null) {
      try {
        joiner.add(String.format("%sprevious%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isPrevious()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.9.2-L
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.gateway.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import live.radix.gateway.model.ProgrammaticScryptoSborValue;
import live.radix.gateway.model.ProgrammaticScryptoSborValueKind;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ProgrammaticScryptoSborValueBytes
 */
@JsonPropertyOrder({
  ProgrammaticScryptoSborValueBytes.JSON_PROPERTY_ELEMENT_KIND,
  ProgrammaticScryptoSborValueBytes.JSON_PROPERTY_ELEMENT_TYPE_NAME,
  ProgrammaticScryptoSborValueBytes.JSON_PROPERTY_HEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T19:38:04.213407200+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
@JsonIgnoreProperties(
  value = "kind", // ignore manually set kind, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the kind to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", visible = true)

public class ProgrammaticScryptoSborValueBytes extends ProgrammaticScryptoSborValue {
  public static final String JSON_PROPERTY_ELEMENT_KIND = "element_kind";
  private ProgrammaticScryptoSborValueKind elementKind;

  public static final String JSON_PROPERTY_ELEMENT_TYPE_NAME = "element_type_name";
  private String elementTypeName;

  public static final String JSON_PROPERTY_HEX = "hex";
  private String hex;

  public ProgrammaticScryptoSborValueBytes() {

  }

  public ProgrammaticScryptoSborValueBytes elementKind(ProgrammaticScryptoSborValueKind elementKind) {
    
    this.elementKind = elementKind;
    return this;
  }

  /**
   * Get elementKind
   * @return elementKind
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ELEMENT_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProgrammaticScryptoSborValueKind getElementKind() {
    return elementKind;
  }


  @JsonProperty(JSON_PROPERTY_ELEMENT_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setElementKind(ProgrammaticScryptoSborValueKind elementKind) {
    this.elementKind = elementKind;
  }

  public ProgrammaticScryptoSborValueBytes elementTypeName(String elementTypeName) {
    
    this.elementTypeName = elementTypeName;
    return this;
  }

  /**
   * Get elementTypeName
   * @return elementTypeName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELEMENT_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getElementTypeName() {
    return elementTypeName;
  }


  @JsonProperty(JSON_PROPERTY_ELEMENT_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElementTypeName(String elementTypeName) {
    this.elementTypeName = elementTypeName;
  }

  public ProgrammaticScryptoSborValueBytes hex(String hex) {
    
    this.hex = hex;
    return this;
  }

  /**
   * Hex-encoded binary blob.
   * @return hex
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHex() {
    return hex;
  }


  @JsonProperty(JSON_PROPERTY_HEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHex(String hex) {
    this.hex = hex;
  }

  @Override
  public ProgrammaticScryptoSborValueBytes kind(ProgrammaticScryptoSborValueKind kind) {
    this.setKind(kind);
    return this;
  }

  @Override
  public ProgrammaticScryptoSborValueBytes typeName(String typeName) {
    this.setTypeName(typeName);
    return this;
  }

  @Override
  public ProgrammaticScryptoSborValueBytes fieldName(String fieldName) {
    this.setFieldName(fieldName);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammaticScryptoSborValueBytes programmaticScryptoSborValueBytes = (ProgrammaticScryptoSborValueBytes) o;
    return Objects.equals(this.elementKind, programmaticScryptoSborValueBytes.elementKind) &&
        Objects.equals(this.elementTypeName, programmaticScryptoSborValueBytes.elementTypeName) &&
        Objects.equals(this.hex, programmaticScryptoSborValueBytes.hex) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementKind, elementTypeName, hex, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgrammaticScryptoSborValueBytes {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    elementKind: ").append(toIndentedString(elementKind)).append("\n");
    sb.append("    elementTypeName: ").append(toIndentedString(elementTypeName)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
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

    // add `kind` to the URL query string
    if (getKind() != null) {
      try {
        joiner.add(String.format("%skind%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKind()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type_name` to the URL query string
    if (getTypeName() != null) {
      try {
        joiner.add(String.format("%stype_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTypeName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `field_name` to the URL query string
    if (getFieldName() != null) {
      try {
        joiner.add(String.format("%sfield_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFieldName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `element_kind` to the URL query string
    if (getElementKind() != null) {
      try {
        joiner.add(String.format("%selement_kind%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getElementKind()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `element_type_name` to the URL query string
    if (getElementTypeName() != null) {
      try {
        joiner.add(String.format("%selement_type_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getElementTypeName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hex` to the URL query string
    if (getHex() != null) {
      try {
        joiner.add(String.format("%shex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.6.3
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
import live.radix.gateway.model.PublicKeyHash;
import live.radix.gateway.model.PublicKeyHashType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PublicKeyHashEddsaEd25519
 */
@JsonPropertyOrder({
  PublicKeyHashEddsaEd25519.JSON_PROPERTY_HASH_HEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-15T00:18:13.130575900+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
@JsonIgnoreProperties(
  value = "key_hash_type", // ignore manually set key_hash_type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the key_hash_type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "key_hash_type", visible = true)

public class PublicKeyHashEddsaEd25519 extends PublicKeyHash {
  public static final String JSON_PROPERTY_HASH_HEX = "hash_hex";
  private String hashHex;

  public PublicKeyHashEddsaEd25519() {

  }

  public PublicKeyHashEddsaEd25519 hashHex(String hashHex) {
    
    this.hashHex = hashHex;
    return this;
  }

  /**
   * Hex-encoded SHA-256 hash.
   * @return hashHex
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HASH_HEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHashHex() {
    return hashHex;
  }


  @JsonProperty(JSON_PROPERTY_HASH_HEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHashHex(String hashHex) {
    this.hashHex = hashHex;
  }

  @Override
  public PublicKeyHashEddsaEd25519 keyHashType(PublicKeyHashType keyHashType) {
    this.setKeyHashType(keyHashType);
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
    PublicKeyHashEddsaEd25519 publicKeyHashEddsaEd25519 = (PublicKeyHashEddsaEd25519) o;
    return Objects.equals(this.hashHex, publicKeyHashEddsaEd25519.hashHex) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashHex, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicKeyHashEddsaEd25519 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    hashHex: ").append(toIndentedString(hashHex)).append("\n");
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

    // add `key_hash_type` to the URL query string
    if (getKeyHashType() != null) {
      try {
        joiner.add(String.format("%skey_hash_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKeyHashType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hash_hex` to the URL query string
    if (getHashHex() != null) {
      try {
        joiner.add(String.format("%shash_hex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHashHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


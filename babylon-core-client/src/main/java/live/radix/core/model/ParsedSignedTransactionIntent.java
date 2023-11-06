/*
 * Radix Core API - Babylon
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  The default configuration is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function. The node exposes a configuration flag which allows disabling certain endpoints which may be problematic, but monitoring is advised. This configuration parameter is `api.core.flags.enable_unbounded_endpoints` / `RADIXDLT_CORE_API_FLAGS_ENABLE_UNBOUNDED_ENDPOINTS`.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` have high guarantees of forward compatibility in future node versions. We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code.  Other endpoints may be changed with new node versions carrying protocol-updates, although any breaking changes will be flagged clearly in the corresponding release notes.  All responses may have additional fields added, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects. 
 *
 * The version of the OpenAPI document: v1.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.core.model;

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
import live.radix.core.model.ParsedSignedTransactionIntentIdentifiers;
import live.radix.core.model.ParsedTransaction;
import live.radix.core.model.ParsedTransactionType;
import live.radix.core.model.SignedTransactionIntent;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ParsedSignedTransactionIntent
 */
@JsonPropertyOrder({
  ParsedSignedTransactionIntent.JSON_PROPERTY_SIGNED_INTENT,
  ParsedSignedTransactionIntent.JSON_PROPERTY_IDENTIFIERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:51:31.842802500+02:00[Europe/Kiev]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class ParsedSignedTransactionIntent extends ParsedTransaction {
  public static final String JSON_PROPERTY_SIGNED_INTENT = "signed_intent";
  private SignedTransactionIntent signedIntent;

  public static final String JSON_PROPERTY_IDENTIFIERS = "identifiers";
  private ParsedSignedTransactionIntentIdentifiers identifiers;

  public ParsedSignedTransactionIntent() {

  }

  public ParsedSignedTransactionIntent signedIntent(SignedTransactionIntent signedIntent) {
    
    this.signedIntent = signedIntent;
    return this;
  }

   /**
   * Get signedIntent
   * @return signedIntent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNED_INTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SignedTransactionIntent getSignedIntent() {
    return signedIntent;
  }


  @JsonProperty(JSON_PROPERTY_SIGNED_INTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignedIntent(SignedTransactionIntent signedIntent) {
    this.signedIntent = signedIntent;
  }


  public ParsedSignedTransactionIntent identifiers(ParsedSignedTransactionIntentIdentifiers identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

   /**
   * Get identifiers
   * @return identifiers
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ParsedSignedTransactionIntentIdentifiers getIdentifiers() {
    return identifiers;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdentifiers(ParsedSignedTransactionIntentIdentifiers identifiers) {
    this.identifiers = identifiers;
  }

  @Override
  public ParsedSignedTransactionIntent type(ParsedTransactionType type) {
    this.setType(type);
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
    ParsedSignedTransactionIntent parsedSignedTransactionIntent = (ParsedSignedTransactionIntent) o;
    return Objects.equals(this.signedIntent, parsedSignedTransactionIntent.signedIntent) &&
        Objects.equals(this.identifiers, parsedSignedTransactionIntent.identifiers) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedIntent, identifiers, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsedSignedTransactionIntent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    signedIntent: ").append(toIndentedString(signedIntent)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `signed_intent` to the URL query string
    if (getSignedIntent() != null) {
      joiner.add(getSignedIntent().toUrlQueryString(prefix + "signed_intent" + suffix));
    }

    // add `identifiers` to the URL query string
    if (getIdentifiers() != null) {
      joiner.add(getIdentifiers().toUrlQueryString(prefix + "identifiers" + suffix));
    }

    return joiner.toString();
  }

}


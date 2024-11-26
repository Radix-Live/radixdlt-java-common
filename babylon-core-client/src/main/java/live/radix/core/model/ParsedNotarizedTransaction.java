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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import live.radix.core.model.NotarizedTransaction;
import live.radix.core.model.ParsedNotarizedTransactionAllOfValidationError;
import live.radix.core.model.ParsedNotarizedTransactionIdentifiers;
import live.radix.core.model.ParsedTransaction;
import live.radix.core.model.ParsedTransactionType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ParsedNotarizedTransaction
 */
@JsonPropertyOrder({
  ParsedNotarizedTransaction.JSON_PROPERTY_NOTARIZED_TRANSACTION,
  ParsedNotarizedTransaction.JSON_PROPERTY_IDENTIFIERS,
  ParsedNotarizedTransaction.JSON_PROPERTY_VALIDATION_ERROR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class ParsedNotarizedTransaction extends ParsedTransaction {
  public static final String JSON_PROPERTY_NOTARIZED_TRANSACTION = "notarized_transaction";
  private NotarizedTransaction notarizedTransaction;

  public static final String JSON_PROPERTY_IDENTIFIERS = "identifiers";
  private ParsedNotarizedTransactionIdentifiers identifiers;

  public static final String JSON_PROPERTY_VALIDATION_ERROR = "validation_error";
  private ParsedNotarizedTransactionAllOfValidationError validationError;

  public ParsedNotarizedTransaction() {

  }

  public ParsedNotarizedTransaction notarizedTransaction(NotarizedTransaction notarizedTransaction) {
    
    this.notarizedTransaction = notarizedTransaction;
    return this;
  }

  /**
   * Get notarizedTransaction
   * @return notarizedTransaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTARIZED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotarizedTransaction getNotarizedTransaction() {
    return notarizedTransaction;
  }


  @JsonProperty(JSON_PROPERTY_NOTARIZED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotarizedTransaction(NotarizedTransaction notarizedTransaction) {
    this.notarizedTransaction = notarizedTransaction;
  }

  public ParsedNotarizedTransaction identifiers(ParsedNotarizedTransactionIdentifiers identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  /**
   * Get identifiers
   * @return identifiers
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ParsedNotarizedTransactionIdentifiers getIdentifiers() {
    return identifiers;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdentifiers(ParsedNotarizedTransactionIdentifiers identifiers) {
    this.identifiers = identifiers;
  }

  public ParsedNotarizedTransaction validationError(ParsedNotarizedTransactionAllOfValidationError validationError) {
    
    this.validationError = validationError;
    return this;
  }

  /**
   * Get validationError
   * @return validationError
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDATION_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ParsedNotarizedTransactionAllOfValidationError getValidationError() {
    return validationError;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidationError(ParsedNotarizedTransactionAllOfValidationError validationError) {
    this.validationError = validationError;
  }

  @Override
  public ParsedNotarizedTransaction type(ParsedTransactionType type) {
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
    ParsedNotarizedTransaction parsedNotarizedTransaction = (ParsedNotarizedTransaction) o;
    return Objects.equals(this.notarizedTransaction, parsedNotarizedTransaction.notarizedTransaction) &&
        Objects.equals(this.identifiers, parsedNotarizedTransaction.identifiers) &&
        Objects.equals(this.validationError, parsedNotarizedTransaction.validationError) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notarizedTransaction, identifiers, validationError, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsedNotarizedTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    notarizedTransaction: ").append(toIndentedString(notarizedTransaction)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    validationError: ").append(toIndentedString(validationError)).append("\n");
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

    // add `notarized_transaction` to the URL query string
    if (getNotarizedTransaction() != null) {
      joiner.add(getNotarizedTransaction().toUrlQueryString(prefix + "notarized_transaction" + suffix));
    }

    // add `identifiers` to the URL query string
    if (getIdentifiers() != null) {
      joiner.add(getIdentifiers().toUrlQueryString(prefix + "identifiers" + suffix));
    }

    // add `validation_error` to the URL query string
    if (getValidationError() != null) {
      joiner.add(getValidationError().toUrlQueryString(prefix + "validation_error" + suffix));
    }

    return joiner.toString();
  }

}


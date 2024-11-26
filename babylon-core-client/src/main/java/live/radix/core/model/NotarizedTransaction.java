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
import live.radix.core.model.Signature;
import live.radix.core.model.SignedTransactionIntent;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * NotarizedTransaction
 */
@JsonPropertyOrder({
  NotarizedTransaction.JSON_PROPERTY_HASH,
  NotarizedTransaction.JSON_PROPERTY_HASH_BECH32M,
  NotarizedTransaction.JSON_PROPERTY_PAYLOAD_HEX,
  NotarizedTransaction.JSON_PROPERTY_SIGNED_INTENT,
  NotarizedTransaction.JSON_PROPERTY_NOTARY_SIGNATURE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class NotarizedTransaction {
  public static final String JSON_PROPERTY_HASH = "hash";
  private String hash;

  public static final String JSON_PROPERTY_HASH_BECH32M = "hash_bech32m";
  private String hashBech32m;

  public static final String JSON_PROPERTY_PAYLOAD_HEX = "payload_hex";
  private String payloadHex;

  public static final String JSON_PROPERTY_SIGNED_INTENT = "signed_intent";
  private SignedTransactionIntent signedIntent;

  public static final String JSON_PROPERTY_NOTARY_SIGNATURE = "notary_signature";
  private Signature notarySignature;

  public NotarizedTransaction() {
  }

  public NotarizedTransaction hash(String hash) {
    
    this.hash = hash;
    return this;
  }

  /**
   * The hex-encoded notarized transaction hash for a user transaction. This hash identifies the full submittable notarized transaction - ie the signed intent, plus the notary signature. 
   * @return hash
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHash() {
    return hash;
  }


  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHash(String hash) {
    this.hash = hash;
  }

  public NotarizedTransaction hashBech32m(String hashBech32m) {
    
    this.hashBech32m = hashBech32m;
    return this;
  }

  /**
   * The Bech32m-encoded human readable &#x60;NotarizedTransactionHash&#x60;.
   * @return hashBech32m
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHashBech32m() {
    return hashBech32m;
  }


  @JsonProperty(JSON_PROPERTY_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHashBech32m(String hashBech32m) {
    this.hashBech32m = hashBech32m;
  }

  public NotarizedTransaction payloadHex(String payloadHex) {
    
    this.payloadHex = payloadHex;
    return this;
  }

  /**
   * The hex-encoded full notarized transaction payload. Returning this can be disabled in TransactionFormatOptions on your request (default true).
   * @return payloadHex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayloadHex() {
    return payloadHex;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayloadHex(String payloadHex) {
    this.payloadHex = payloadHex;
  }

  public NotarizedTransaction signedIntent(SignedTransactionIntent signedIntent) {
    
    this.signedIntent = signedIntent;
    return this;
  }

  /**
   * Get signedIntent
   * @return signedIntent
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIGNED_INTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SignedTransactionIntent getSignedIntent() {
    return signedIntent;
  }


  @JsonProperty(JSON_PROPERTY_SIGNED_INTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSignedIntent(SignedTransactionIntent signedIntent) {
    this.signedIntent = signedIntent;
  }

  public NotarizedTransaction notarySignature(Signature notarySignature) {
    
    this.notarySignature = notarySignature;
    return this;
  }

  /**
   * Get notarySignature
   * @return notarySignature
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NOTARY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Signature getNotarySignature() {
    return notarySignature;
  }


  @JsonProperty(JSON_PROPERTY_NOTARY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotarySignature(Signature notarySignature) {
    this.notarySignature = notarySignature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotarizedTransaction notarizedTransaction = (NotarizedTransaction) o;
    return Objects.equals(this.hash, notarizedTransaction.hash) &&
        Objects.equals(this.hashBech32m, notarizedTransaction.hashBech32m) &&
        Objects.equals(this.payloadHex, notarizedTransaction.payloadHex) &&
        Objects.equals(this.signedIntent, notarizedTransaction.signedIntent) &&
        Objects.equals(this.notarySignature, notarizedTransaction.notarySignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, hashBech32m, payloadHex, signedIntent, notarySignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotarizedTransaction {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    hashBech32m: ").append(toIndentedString(hashBech32m)).append("\n");
    sb.append("    payloadHex: ").append(toIndentedString(payloadHex)).append("\n");
    sb.append("    signedIntent: ").append(toIndentedString(signedIntent)).append("\n");
    sb.append("    notarySignature: ").append(toIndentedString(notarySignature)).append("\n");
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

    // add `hash` to the URL query string
    if (getHash() != null) {
      try {
        joiner.add(String.format("%shash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hash_bech32m` to the URL query string
    if (getHashBech32m() != null) {
      try {
        joiner.add(String.format("%shash_bech32m%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHashBech32m()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payload_hex` to the URL query string
    if (getPayloadHex() != null) {
      try {
        joiner.add(String.format("%spayload_hex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPayloadHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `signed_intent` to the URL query string
    if (getSignedIntent() != null) {
      joiner.add(getSignedIntent().toUrlQueryString(prefix + "signed_intent" + suffix));
    }

    // add `notary_signature` to the URL query string
    if (getNotarySignature() != null) {
      joiner.add(getNotarySignature().toUrlQueryString(prefix + "notary_signature" + suffix));
    }

    return joiner.toString();
  }

}


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
 * ParsedLedgerTransactionIdentifiers
 */
@JsonPropertyOrder({
  ParsedLedgerTransactionIdentifiers.JSON_PROPERTY_INTENT_HASH,
  ParsedLedgerTransactionIdentifiers.JSON_PROPERTY_INTENT_HASH_BECH32M,
  ParsedLedgerTransactionIdentifiers.JSON_PROPERTY_SIGNED_INTENT_HASH,
  ParsedLedgerTransactionIdentifiers.JSON_PROPERTY_SIGNED_INTENT_HASH_BECH32M,
  ParsedLedgerTransactionIdentifiers.JSON_PROPERTY_PAYLOAD_HASH,
  ParsedLedgerTransactionIdentifiers.JSON_PROPERTY_PAYLOAD_HASH_BECH32M,
  ParsedLedgerTransactionIdentifiers.JSON_PROPERTY_LEDGER_HASH,
  ParsedLedgerTransactionIdentifiers.JSON_PROPERTY_LEDGER_HASH_BECH32M
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ParsedLedgerTransactionIdentifiers {
  public static final String JSON_PROPERTY_INTENT_HASH = "intent_hash";
  private String intentHash;

  public static final String JSON_PROPERTY_INTENT_HASH_BECH32M = "intent_hash_bech32m";
  private String intentHashBech32m;

  public static final String JSON_PROPERTY_SIGNED_INTENT_HASH = "signed_intent_hash";
  private String signedIntentHash;

  public static final String JSON_PROPERTY_SIGNED_INTENT_HASH_BECH32M = "signed_intent_hash_bech32m";
  private String signedIntentHashBech32m;

  public static final String JSON_PROPERTY_PAYLOAD_HASH = "payload_hash";
  private String payloadHash;

  public static final String JSON_PROPERTY_PAYLOAD_HASH_BECH32M = "payload_hash_bech32m";
  private String payloadHashBech32m;

  public static final String JSON_PROPERTY_LEDGER_HASH = "ledger_hash";
  private String ledgerHash;

  public static final String JSON_PROPERTY_LEDGER_HASH_BECH32M = "ledger_hash_bech32m";
  private String ledgerHashBech32m;

  public ParsedLedgerTransactionIdentifiers() {
  }

  public ParsedLedgerTransactionIdentifiers intentHash(String intentHash) {
    
    this.intentHash = intentHash;
    return this;
  }

  /**
   * The hex-encoded intent hash for a user transaction, also known as the transaction id. This hash identifies the core content \&quot;intent\&quot; of the transaction. Each intent can only be committed once. This hash gets signed by any signatories on the transaction, to create the signed intent. 
   * @return intentHash
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTENT_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntentHash() {
    return intentHash;
  }


  @JsonProperty(JSON_PROPERTY_INTENT_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntentHash(String intentHash) {
    this.intentHash = intentHash;
  }

  public ParsedLedgerTransactionIdentifiers intentHashBech32m(String intentHashBech32m) {
    
    this.intentHashBech32m = intentHashBech32m;
    return this;
  }

  /**
   * The Bech32m-encoded human readable &#x60;IntentHash&#x60;.
   * @return intentHashBech32m
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTENT_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntentHashBech32m() {
    return intentHashBech32m;
  }


  @JsonProperty(JSON_PROPERTY_INTENT_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntentHashBech32m(String intentHashBech32m) {
    this.intentHashBech32m = intentHashBech32m;
  }

  public ParsedLedgerTransactionIdentifiers signedIntentHash(String signedIntentHash) {
    
    this.signedIntentHash = signedIntentHash;
    return this;
  }

  /**
   * The hex-encoded signed intent hash for a user transaction. This hash identifies the transaction intent, plus additional signatures. This hash is signed by the notary, to create the submittable NotarizedTransaction. 
   * @return signedIntentHash
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNED_INTENT_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignedIntentHash() {
    return signedIntentHash;
  }


  @JsonProperty(JSON_PROPERTY_SIGNED_INTENT_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignedIntentHash(String signedIntentHash) {
    this.signedIntentHash = signedIntentHash;
  }

  public ParsedLedgerTransactionIdentifiers signedIntentHashBech32m(String signedIntentHashBech32m) {
    
    this.signedIntentHashBech32m = signedIntentHashBech32m;
    return this;
  }

  /**
   * The Bech32m-encoded human readable &#x60;SignedIntentHash&#x60;.
   * @return signedIntentHashBech32m
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNED_INTENT_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignedIntentHashBech32m() {
    return signedIntentHashBech32m;
  }


  @JsonProperty(JSON_PROPERTY_SIGNED_INTENT_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignedIntentHashBech32m(String signedIntentHashBech32m) {
    this.signedIntentHashBech32m = signedIntentHashBech32m;
  }

  public ParsedLedgerTransactionIdentifiers payloadHash(String payloadHash) {
    
    this.payloadHash = payloadHash;
    return this;
  }

  /**
   * The hex-encoded notarized transaction hash for a user transaction. This hash identifies the full submittable notarized transaction - ie the signed intent, plus the notary signature. 
   * @return payloadHash
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayloadHash() {
    return payloadHash;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayloadHash(String payloadHash) {
    this.payloadHash = payloadHash;
  }

  public ParsedLedgerTransactionIdentifiers payloadHashBech32m(String payloadHashBech32m) {
    
    this.payloadHashBech32m = payloadHashBech32m;
    return this;
  }

  /**
   * The Bech32m-encoded human readable &#x60;NotarizedTransactionHash&#x60;.
   * @return payloadHashBech32m
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayloadHashBech32m() {
    return payloadHashBech32m;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayloadHashBech32m(String payloadHashBech32m) {
    this.payloadHashBech32m = payloadHashBech32m;
  }

  public ParsedLedgerTransactionIdentifiers ledgerHash(String ledgerHash) {
    
    this.ledgerHash = ledgerHash;
    return this;
  }

  /**
   * The hex-encoded ledger payload transaction hash. This is a wrapper for both user transactions, and system transactions such as genesis and round changes. 
   * @return ledgerHash
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LEDGER_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLedgerHash() {
    return ledgerHash;
  }


  @JsonProperty(JSON_PROPERTY_LEDGER_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLedgerHash(String ledgerHash) {
    this.ledgerHash = ledgerHash;
  }

  public ParsedLedgerTransactionIdentifiers ledgerHashBech32m(String ledgerHashBech32m) {
    
    this.ledgerHashBech32m = ledgerHashBech32m;
    return this;
  }

  /**
   * The Bech32m-encoded human readable &#x60;LedgerPayloadHash&#x60;.
   * @return ledgerHashBech32m
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LEDGER_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLedgerHashBech32m() {
    return ledgerHashBech32m;
  }


  @JsonProperty(JSON_PROPERTY_LEDGER_HASH_BECH32M)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLedgerHashBech32m(String ledgerHashBech32m) {
    this.ledgerHashBech32m = ledgerHashBech32m;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParsedLedgerTransactionIdentifiers parsedLedgerTransactionIdentifiers = (ParsedLedgerTransactionIdentifiers) o;
    return Objects.equals(this.intentHash, parsedLedgerTransactionIdentifiers.intentHash) &&
        Objects.equals(this.intentHashBech32m, parsedLedgerTransactionIdentifiers.intentHashBech32m) &&
        Objects.equals(this.signedIntentHash, parsedLedgerTransactionIdentifiers.signedIntentHash) &&
        Objects.equals(this.signedIntentHashBech32m, parsedLedgerTransactionIdentifiers.signedIntentHashBech32m) &&
        Objects.equals(this.payloadHash, parsedLedgerTransactionIdentifiers.payloadHash) &&
        Objects.equals(this.payloadHashBech32m, parsedLedgerTransactionIdentifiers.payloadHashBech32m) &&
        Objects.equals(this.ledgerHash, parsedLedgerTransactionIdentifiers.ledgerHash) &&
        Objects.equals(this.ledgerHashBech32m, parsedLedgerTransactionIdentifiers.ledgerHashBech32m);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intentHash, intentHashBech32m, signedIntentHash, signedIntentHashBech32m, payloadHash, payloadHashBech32m, ledgerHash, ledgerHashBech32m);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsedLedgerTransactionIdentifiers {\n");
    sb.append("    intentHash: ").append(toIndentedString(intentHash)).append("\n");
    sb.append("    intentHashBech32m: ").append(toIndentedString(intentHashBech32m)).append("\n");
    sb.append("    signedIntentHash: ").append(toIndentedString(signedIntentHash)).append("\n");
    sb.append("    signedIntentHashBech32m: ").append(toIndentedString(signedIntentHashBech32m)).append("\n");
    sb.append("    payloadHash: ").append(toIndentedString(payloadHash)).append("\n");
    sb.append("    payloadHashBech32m: ").append(toIndentedString(payloadHashBech32m)).append("\n");
    sb.append("    ledgerHash: ").append(toIndentedString(ledgerHash)).append("\n");
    sb.append("    ledgerHashBech32m: ").append(toIndentedString(ledgerHashBech32m)).append("\n");
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

    // add `signed_intent_hash` to the URL query string
    if (getSignedIntentHash() != null) {
      try {
        joiner.add(String.format("%ssigned_intent_hash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSignedIntentHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `signed_intent_hash_bech32m` to the URL query string
    if (getSignedIntentHashBech32m() != null) {
      try {
        joiner.add(String.format("%ssigned_intent_hash_bech32m%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSignedIntentHashBech32m()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payload_hash` to the URL query string
    if (getPayloadHash() != null) {
      try {
        joiner.add(String.format("%spayload_hash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPayloadHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payload_hash_bech32m` to the URL query string
    if (getPayloadHashBech32m() != null) {
      try {
        joiner.add(String.format("%spayload_hash_bech32m%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPayloadHashBech32m()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ledger_hash` to the URL query string
    if (getLedgerHash() != null) {
      try {
        joiner.add(String.format("%sledger_hash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLedgerHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ledger_hash_bech32m` to the URL query string
    if (getLedgerHashBech32m() != null) {
      try {
        joiner.add(String.format("%sledger_hash_bech32m%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLedgerHashBech32m()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


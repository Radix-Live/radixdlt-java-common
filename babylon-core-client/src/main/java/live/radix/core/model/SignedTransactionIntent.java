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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import live.radix.core.model.SignatureWithPublicKey;
import live.radix.core.model.TransactionIntent;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SignedTransactionIntent
 */
@JsonPropertyOrder({
  SignedTransactionIntent.JSON_PROPERTY_HASH,
  SignedTransactionIntent.JSON_PROPERTY_HASH_BECH32M,
  SignedTransactionIntent.JSON_PROPERTY_INTENT,
  SignedTransactionIntent.JSON_PROPERTY_INTENT_SIGNATURES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class SignedTransactionIntent {
  public static final String JSON_PROPERTY_HASH = "hash";
  private String hash;

  public static final String JSON_PROPERTY_HASH_BECH32M = "hash_bech32m";
  private String hashBech32m;

  public static final String JSON_PROPERTY_INTENT = "intent";
  private TransactionIntent intent;

  public static final String JSON_PROPERTY_INTENT_SIGNATURES = "intent_signatures";
  private List<SignatureWithPublicKey> intentSignatures = new ArrayList<>();

  public SignedTransactionIntent() {
  }

  public SignedTransactionIntent hash(String hash) {
    
    this.hash = hash;
    return this;
  }

  /**
   * The hex-encoded signed intent hash for a user transaction. This hash identifies the transaction intent, plus additional signatures. This hash is signed by the notary, to create the submittable NotarizedTransaction. 
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

  public SignedTransactionIntent hashBech32m(String hashBech32m) {
    
    this.hashBech32m = hashBech32m;
    return this;
  }

  /**
   * The Bech32m-encoded human readable &#x60;SignedIntentHash&#x60;.
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

  public SignedTransactionIntent intent(TransactionIntent intent) {
    
    this.intent = intent;
    return this;
  }

  /**
   * Get intent
   * @return intent
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TransactionIntent getIntent() {
    return intent;
  }


  @JsonProperty(JSON_PROPERTY_INTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntent(TransactionIntent intent) {
    this.intent = intent;
  }

  public SignedTransactionIntent intentSignatures(List<SignatureWithPublicKey> intentSignatures) {
    
    this.intentSignatures = intentSignatures;
    return this;
  }

  public SignedTransactionIntent addIntentSignaturesItem(SignatureWithPublicKey intentSignaturesItem) {
    if (this.intentSignatures == null) {
      this.intentSignatures = new ArrayList<>();
    }
    this.intentSignatures.add(intentSignaturesItem);
    return this;
  }

  /**
   * Get intentSignatures
   * @return intentSignatures
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTENT_SIGNATURES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SignatureWithPublicKey> getIntentSignatures() {
    return intentSignatures;
  }


  @JsonProperty(JSON_PROPERTY_INTENT_SIGNATURES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntentSignatures(List<SignatureWithPublicKey> intentSignatures) {
    this.intentSignatures = intentSignatures;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignedTransactionIntent signedTransactionIntent = (SignedTransactionIntent) o;
    return Objects.equals(this.hash, signedTransactionIntent.hash) &&
        Objects.equals(this.hashBech32m, signedTransactionIntent.hashBech32m) &&
        Objects.equals(this.intent, signedTransactionIntent.intent) &&
        Objects.equals(this.intentSignatures, signedTransactionIntent.intentSignatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, hashBech32m, intent, intentSignatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignedTransactionIntent {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    hashBech32m: ").append(toIndentedString(hashBech32m)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    intentSignatures: ").append(toIndentedString(intentSignatures)).append("\n");
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

    // add `intent` to the URL query string
    if (getIntent() != null) {
      joiner.add(getIntent().toUrlQueryString(prefix + "intent" + suffix));
    }

    // add `intent_signatures` to the URL query string
    if (getIntentSignatures() != null) {
      for (int i = 0; i < getIntentSignatures().size(); i++) {
        if (getIntentSignatures().get(i) != null) {
          joiner.add(getIntentSignatures().get(i).toUrlQueryString(String.format("%sintent_signatures%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}


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
 * MempoolTransactionResponsePayloadsInner
 */
@JsonPropertyOrder({
  MempoolTransactionResponsePayloadsInner.JSON_PROPERTY_HASH,
  MempoolTransactionResponsePayloadsInner.JSON_PROPERTY_HASH_BECH32M,
  MempoolTransactionResponsePayloadsInner.JSON_PROPERTY_HEX,
  MempoolTransactionResponsePayloadsInner.JSON_PROPERTY_ERROR
})
@JsonTypeName("MempoolTransactionResponse_payloads_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:51:31.842802500+02:00[Europe/Kiev]")
public class MempoolTransactionResponsePayloadsInner {
  public static final String JSON_PROPERTY_HASH = "hash";
  private String hash;

  public static final String JSON_PROPERTY_HASH_BECH32M = "hash_bech32m";
  private String hashBech32m;

  public static final String JSON_PROPERTY_HEX = "hex";
  private String hex;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public MempoolTransactionResponsePayloadsInner() {
  }

  public MempoolTransactionResponsePayloadsInner hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * The hex-encoded notarized transaction hash for a user transaction. This hash identifies the full submittable notarized transaction - ie the signed intent, plus the notary signature. 
   * @return hash
  **/
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


  public MempoolTransactionResponsePayloadsInner hashBech32m(String hashBech32m) {
    
    this.hashBech32m = hashBech32m;
    return this;
  }

   /**
   * The Bech32m-encoded human readable &#x60;NotarizedTransactionHash&#x60;.
   * @return hashBech32m
  **/
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


  public MempoolTransactionResponsePayloadsInner hex(String hex) {
    
    this.hex = hex;
    return this;
  }

   /**
   * The hex-encoded full notarized transaction payload - returned only if found in mempool.
   * @return hex
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHex() {
    return hex;
  }


  @JsonProperty(JSON_PROPERTY_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHex(String hex) {
    this.hex = hex;
  }


  public MempoolTransactionResponsePayloadsInner error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Error message why &#x60;hex&#x60; field is missing: the transaction was not found in the mempool or the provided hash is invalid. 
   * @return error
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MempoolTransactionResponsePayloadsInner mempoolTransactionResponsePayloadsInner = (MempoolTransactionResponsePayloadsInner) o;
    return Objects.equals(this.hash, mempoolTransactionResponsePayloadsInner.hash) &&
        Objects.equals(this.hashBech32m, mempoolTransactionResponsePayloadsInner.hashBech32m) &&
        Objects.equals(this.hex, mempoolTransactionResponsePayloadsInner.hex) &&
        Objects.equals(this.error, mempoolTransactionResponsePayloadsInner.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, hashBech32m, hex, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MempoolTransactionResponsePayloadsInner {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    hashBech32m: ").append(toIndentedString(hashBech32m)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

    // add `hex` to the URL query string
    if (getHex() != null) {
      try {
        joiner.add(String.format("%shex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error` to the URL query string
    if (getError() != null) {
      try {
        joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

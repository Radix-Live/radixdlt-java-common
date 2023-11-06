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
 * LedgerHashes
 */
@JsonPropertyOrder({
  LedgerHashes.JSON_PROPERTY_STATE_TREE_HASH,
  LedgerHashes.JSON_PROPERTY_TRANSACTION_TREE_HASH,
  LedgerHashes.JSON_PROPERTY_RECEIPT_TREE_HASH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:51:31.842802500+02:00[Europe/Kiev]")
public class LedgerHashes {
  public static final String JSON_PROPERTY_STATE_TREE_HASH = "state_tree_hash";
  private String stateTreeHash;

  public static final String JSON_PROPERTY_TRANSACTION_TREE_HASH = "transaction_tree_hash";
  private String transactionTreeHash;

  public static final String JSON_PROPERTY_RECEIPT_TREE_HASH = "receipt_tree_hash";
  private String receiptTreeHash;

  public LedgerHashes() {
  }

  public LedgerHashes stateTreeHash(String stateTreeHash) {
    
    this.stateTreeHash = stateTreeHash;
    return this;
  }

   /**
   * The hex-encoded root hash of the state tree. This captures the current state of the state on the ledger. 
   * @return stateTreeHash
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE_TREE_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStateTreeHash() {
    return stateTreeHash;
  }


  @JsonProperty(JSON_PROPERTY_STATE_TREE_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStateTreeHash(String stateTreeHash) {
    this.stateTreeHash = stateTreeHash;
  }


  public LedgerHashes transactionTreeHash(String transactionTreeHash) {
    
    this.transactionTreeHash = transactionTreeHash;
    return this;
  }

   /**
   * The hex-encoded root hash of the transaction tree. This captures the ledger transactions committed to the ledger. 
   * @return transactionTreeHash
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTION_TREE_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransactionTreeHash() {
    return transactionTreeHash;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_TREE_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionTreeHash(String transactionTreeHash) {
    this.transactionTreeHash = transactionTreeHash;
  }


  public LedgerHashes receiptTreeHash(String receiptTreeHash) {
    
    this.receiptTreeHash = receiptTreeHash;
    return this;
  }

   /**
   * The hex-encoded root hash of the receipt tree. This captures the consensus-agreed output of each transaction on the ledger. 
   * @return receiptTreeHash
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECEIPT_TREE_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReceiptTreeHash() {
    return receiptTreeHash;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_TREE_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReceiptTreeHash(String receiptTreeHash) {
    this.receiptTreeHash = receiptTreeHash;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LedgerHashes ledgerHashes = (LedgerHashes) o;
    return Objects.equals(this.stateTreeHash, ledgerHashes.stateTreeHash) &&
        Objects.equals(this.transactionTreeHash, ledgerHashes.transactionTreeHash) &&
        Objects.equals(this.receiptTreeHash, ledgerHashes.receiptTreeHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateTreeHash, transactionTreeHash, receiptTreeHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LedgerHashes {\n");
    sb.append("    stateTreeHash: ").append(toIndentedString(stateTreeHash)).append("\n");
    sb.append("    transactionTreeHash: ").append(toIndentedString(transactionTreeHash)).append("\n");
    sb.append("    receiptTreeHash: ").append(toIndentedString(receiptTreeHash)).append("\n");
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

    // add `state_tree_hash` to the URL query string
    if (getStateTreeHash() != null) {
      try {
        joiner.add(String.format("%sstate_tree_hash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStateTreeHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `transaction_tree_hash` to the URL query string
    if (getTransactionTreeHash() != null) {
      try {
        joiner.add(String.format("%stransaction_tree_hash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactionTreeHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_tree_hash` to the URL query string
    if (getReceiptTreeHash() != null) {
      try {
        joiner.add(String.format("%sreceipt_tree_hash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReceiptTreeHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

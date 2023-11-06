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
import live.radix.core.model.CommittedStateIdentifier;
import live.radix.core.model.LedgerTransaction;
import live.radix.core.model.TransactionReceipt;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CommittedTransaction
 */
@JsonPropertyOrder({
  CommittedTransaction.JSON_PROPERTY_RESULTANT_STATE_IDENTIFIERS,
  CommittedTransaction.JSON_PROPERTY_LEDGER_TRANSACTION,
  CommittedTransaction.JSON_PROPERTY_RECEIPT,
  CommittedTransaction.JSON_PROPERTY_PROPOSER_TIMESTAMP_MS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:51:31.842802500+02:00[Europe/Kiev]")
public class CommittedTransaction {
  public static final String JSON_PROPERTY_RESULTANT_STATE_IDENTIFIERS = "resultant_state_identifiers";
  private CommittedStateIdentifier resultantStateIdentifiers;

  public static final String JSON_PROPERTY_LEDGER_TRANSACTION = "ledger_transaction";
  private LedgerTransaction ledgerTransaction;

  public static final String JSON_PROPERTY_RECEIPT = "receipt";
  private TransactionReceipt receipt;

  public static final String JSON_PROPERTY_PROPOSER_TIMESTAMP_MS = "proposer_timestamp_ms";
  private Long proposerTimestampMs;

  public CommittedTransaction() {
  }

  public CommittedTransaction resultantStateIdentifiers(CommittedStateIdentifier resultantStateIdentifiers) {
    
    this.resultantStateIdentifiers = resultantStateIdentifiers;
    return this;
  }

   /**
   * Get resultantStateIdentifiers
   * @return resultantStateIdentifiers
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESULTANT_STATE_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CommittedStateIdentifier getResultantStateIdentifiers() {
    return resultantStateIdentifiers;
  }


  @JsonProperty(JSON_PROPERTY_RESULTANT_STATE_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResultantStateIdentifiers(CommittedStateIdentifier resultantStateIdentifiers) {
    this.resultantStateIdentifiers = resultantStateIdentifiers;
  }


  public CommittedTransaction ledgerTransaction(LedgerTransaction ledgerTransaction) {
    
    this.ledgerTransaction = ledgerTransaction;
    return this;
  }

   /**
   * Get ledgerTransaction
   * @return ledgerTransaction
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LEDGER_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LedgerTransaction getLedgerTransaction() {
    return ledgerTransaction;
  }


  @JsonProperty(JSON_PROPERTY_LEDGER_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLedgerTransaction(LedgerTransaction ledgerTransaction) {
    this.ledgerTransaction = ledgerTransaction;
  }


  public CommittedTransaction receipt(TransactionReceipt receipt) {
    
    this.receipt = receipt;
    return this;
  }

   /**
   * Get receipt
   * @return receipt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TransactionReceipt getReceipt() {
    return receipt;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReceipt(TransactionReceipt receipt) {
    this.receipt = receipt;
  }


  public CommittedTransaction proposerTimestampMs(Long proposerTimestampMs) {
    
    this.proposerTimestampMs = proposerTimestampMs;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;10^14&#x60;, marking the proposer timestamp in ms.
   * minimum: 0
   * maximum: 100000000000000
   * @return proposerTimestampMs
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROPOSER_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getProposerTimestampMs() {
    return proposerTimestampMs;
  }


  @JsonProperty(JSON_PROPERTY_PROPOSER_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProposerTimestampMs(Long proposerTimestampMs) {
    this.proposerTimestampMs = proposerTimestampMs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommittedTransaction committedTransaction = (CommittedTransaction) o;
    return Objects.equals(this.resultantStateIdentifiers, committedTransaction.resultantStateIdentifiers) &&
        Objects.equals(this.ledgerTransaction, committedTransaction.ledgerTransaction) &&
        Objects.equals(this.receipt, committedTransaction.receipt) &&
        Objects.equals(this.proposerTimestampMs, committedTransaction.proposerTimestampMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultantStateIdentifiers, ledgerTransaction, receipt, proposerTimestampMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommittedTransaction {\n");
    sb.append("    resultantStateIdentifiers: ").append(toIndentedString(resultantStateIdentifiers)).append("\n");
    sb.append("    ledgerTransaction: ").append(toIndentedString(ledgerTransaction)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    proposerTimestampMs: ").append(toIndentedString(proposerTimestampMs)).append("\n");
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

    // add `resultant_state_identifiers` to the URL query string
    if (getResultantStateIdentifiers() != null) {
      joiner.add(getResultantStateIdentifiers().toUrlQueryString(prefix + "resultant_state_identifiers" + suffix));
    }

    // add `ledger_transaction` to the URL query string
    if (getLedgerTransaction() != null) {
      joiner.add(getLedgerTransaction().toUrlQueryString(prefix + "ledger_transaction" + suffix));
    }

    // add `receipt` to the URL query string
    if (getReceipt() != null) {
      joiner.add(getReceipt().toUrlQueryString(prefix + "receipt" + suffix));
    }

    // add `proposer_timestamp_ms` to the URL query string
    if (getProposerTimestampMs() != null) {
      try {
        joiner.add(String.format("%sproposer_timestamp_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProposerTimestampMs()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import live.radix.gateway.model.ManifestClass;
import live.radix.gateway.model.TransactionBalanceChanges;
import live.radix.gateway.model.TransactionReceipt;
import live.radix.gateway.model.TransactionStatus;
import live.radix.gateway.model.TransactionSubintentDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CommittedTransactionInfo
 */
@JsonPropertyOrder({
  CommittedTransactionInfo.JSON_PROPERTY_STATE_VERSION,
  CommittedTransactionInfo.JSON_PROPERTY_EPOCH,
  CommittedTransactionInfo.JSON_PROPERTY_ROUND,
  CommittedTransactionInfo.JSON_PROPERTY_ROUND_TIMESTAMP,
  CommittedTransactionInfo.JSON_PROPERTY_TRANSACTION_STATUS,
  CommittedTransactionInfo.JSON_PROPERTY_PAYLOAD_HASH,
  CommittedTransactionInfo.JSON_PROPERTY_INTENT_HASH,
  CommittedTransactionInfo.JSON_PROPERTY_FEE_PAID,
  CommittedTransactionInfo.JSON_PROPERTY_AFFECTED_GLOBAL_ENTITIES,
  CommittedTransactionInfo.JSON_PROPERTY_CONFIRMED_AT,
  CommittedTransactionInfo.JSON_PROPERTY_ERROR_MESSAGE,
  CommittedTransactionInfo.JSON_PROPERTY_RAW_HEX,
  CommittedTransactionInfo.JSON_PROPERTY_RECEIPT,
  CommittedTransactionInfo.JSON_PROPERTY_MANIFEST_INSTRUCTIONS,
  CommittedTransactionInfo.JSON_PROPERTY_MANIFEST_CLASSES,
  CommittedTransactionInfo.JSON_PROPERTY_MESSAGE,
  CommittedTransactionInfo.JSON_PROPERTY_BALANCE_CHANGES,
  CommittedTransactionInfo.JSON_PROPERTY_SUBINTENT_DETAILS,
  CommittedTransactionInfo.JSON_PROPERTY_CHILD_SUBINTENT_HASHES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T19:38:04.213407200+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class CommittedTransactionInfo {
  public static final String JSON_PROPERTY_STATE_VERSION = "state_version";
  private Long stateVersion;

  public static final String JSON_PROPERTY_EPOCH = "epoch";
  private Long epoch;

  public static final String JSON_PROPERTY_ROUND = "round";
  private Long round;

  public static final String JSON_PROPERTY_ROUND_TIMESTAMP = "round_timestamp";
  private String roundTimestamp;

  public static final String JSON_PROPERTY_TRANSACTION_STATUS = "transaction_status";
  private TransactionStatus transactionStatus;

  public static final String JSON_PROPERTY_PAYLOAD_HASH = "payload_hash";
  private String payloadHash;

  public static final String JSON_PROPERTY_INTENT_HASH = "intent_hash";
  private String intentHash;

  public static final String JSON_PROPERTY_FEE_PAID = "fee_paid";
  private String feePaid;

  public static final String JSON_PROPERTY_AFFECTED_GLOBAL_ENTITIES = "affected_global_entities";
  private List<String> affectedGlobalEntities = new ArrayList<>();

  public static final String JSON_PROPERTY_CONFIRMED_AT = "confirmed_at";
  private JsonNullable<OffsetDateTime> confirmedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_RAW_HEX = "raw_hex";
  private String rawHex;

  public static final String JSON_PROPERTY_RECEIPT = "receipt";
  private TransactionReceipt receipt;

  public static final String JSON_PROPERTY_MANIFEST_INSTRUCTIONS = "manifest_instructions";
  private String manifestInstructions;

  public static final String JSON_PROPERTY_MANIFEST_CLASSES = "manifest_classes";
  private List<ManifestClass> manifestClasses = new ArrayList<>();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private Object message;

  public static final String JSON_PROPERTY_BALANCE_CHANGES = "balance_changes";
  private TransactionBalanceChanges balanceChanges;

  public static final String JSON_PROPERTY_SUBINTENT_DETAILS = "subintent_details";
  private List<TransactionSubintentDetails> subintentDetails = new ArrayList<>();

  public static final String JSON_PROPERTY_CHILD_SUBINTENT_HASHES = "child_subintent_hashes";
  private List<String> childSubintentHashes = new ArrayList<>();

  public CommittedTransactionInfo() {
  }

  public CommittedTransactionInfo stateVersion(Long stateVersion) {
    
    this.stateVersion = stateVersion;
    return this;
  }

  /**
   * Get stateVersion
   * @return stateVersion
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getStateVersion() {
    return stateVersion;
  }


  @JsonProperty(JSON_PROPERTY_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStateVersion(Long stateVersion) {
    this.stateVersion = stateVersion;
  }

  public CommittedTransactionInfo epoch(Long epoch) {
    
    this.epoch = epoch;
    return this;
  }

  /**
   * Get epoch
   * @return epoch
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EPOCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getEpoch() {
    return epoch;
  }


  @JsonProperty(JSON_PROPERTY_EPOCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEpoch(Long epoch) {
    this.epoch = epoch;
  }

  public CommittedTransactionInfo round(Long round) {
    
    this.round = round;
    return this;
  }

  /**
   * Get round
   * @return round
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getRound() {
    return round;
  }


  @JsonProperty(JSON_PROPERTY_ROUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRound(Long round) {
    this.round = round;
  }

  public CommittedTransactionInfo roundTimestamp(String roundTimestamp) {
    
    this.roundTimestamp = roundTimestamp;
    return this;
  }

  /**
   * Get roundTimestamp
   * @return roundTimestamp
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUND_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRoundTimestamp() {
    return roundTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_ROUND_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoundTimestamp(String roundTimestamp) {
    this.roundTimestamp = roundTimestamp;
  }

  public CommittedTransactionInfo transactionStatus(TransactionStatus transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

  /**
   * Get transactionStatus
   * @return transactionStatus
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TransactionStatus getTransactionStatus() {
    return transactionStatus;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public CommittedTransactionInfo payloadHash(String payloadHash) {
    
    this.payloadHash = payloadHash;
    return this;
  }

  /**
   * Bech32m-encoded hash.
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

  public CommittedTransactionInfo intentHash(String intentHash) {
    
    this.intentHash = intentHash;
    return this;
  }

  /**
   * Bech32m-encoded hash.
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

  public CommittedTransactionInfo feePaid(String feePaid) {
    
    this.feePaid = feePaid;
    return this;
  }

  /**
   * String-encoded decimal representing the amount of a related fungible resource.
   * @return feePaid
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEE_PAID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFeePaid() {
    return feePaid;
  }


  @JsonProperty(JSON_PROPERTY_FEE_PAID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeePaid(String feePaid) {
    this.feePaid = feePaid;
  }

  public CommittedTransactionInfo affectedGlobalEntities(List<String> affectedGlobalEntities) {
    
    this.affectedGlobalEntities = affectedGlobalEntities;
    return this;
  }

  public CommittedTransactionInfo addAffectedGlobalEntitiesItem(String affectedGlobalEntitiesItem) {
    if (this.affectedGlobalEntities == null) {
      this.affectedGlobalEntities = new ArrayList<>();
    }
    this.affectedGlobalEntities.add(affectedGlobalEntitiesItem);
    return this;
  }

  /**
   * Get affectedGlobalEntities
   * @return affectedGlobalEntities
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_GLOBAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAffectedGlobalEntities() {
    return affectedGlobalEntities;
  }


  @JsonProperty(JSON_PROPERTY_AFFECTED_GLOBAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedGlobalEntities(List<String> affectedGlobalEntities) {
    this.affectedGlobalEntities = affectedGlobalEntities;
  }

  public CommittedTransactionInfo confirmedAt(OffsetDateTime confirmedAt) {
    this.confirmedAt = JsonNullable.<OffsetDateTime>of(confirmedAt);
    
    return this;
  }

  /**
   * Get confirmedAt
   * @return confirmedAt
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getConfirmedAt() {
        return confirmedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIRMED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getConfirmedAt_JsonNullable() {
    return confirmedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CONFIRMED_AT)
  public void setConfirmedAt_JsonNullable(JsonNullable<OffsetDateTime> confirmedAt) {
    this.confirmedAt = confirmedAt;
  }

  public void setConfirmedAt(OffsetDateTime confirmedAt) {
    this.confirmedAt = JsonNullable.<OffsetDateTime>of(confirmedAt);
  }

  public CommittedTransactionInfo errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public CommittedTransactionInfo rawHex(String rawHex) {
    
    this.rawHex = rawHex;
    return this;
  }

  /**
   * Hex-encoded binary blob.
   * @return rawHex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RAW_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRawHex() {
    return rawHex;
  }


  @JsonProperty(JSON_PROPERTY_RAW_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRawHex(String rawHex) {
    this.rawHex = rawHex;
  }

  public CommittedTransactionInfo receipt(TransactionReceipt receipt) {
    
    this.receipt = receipt;
    return this;
  }

  /**
   * Get receipt
   * @return receipt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionReceipt getReceipt() {
    return receipt;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceipt(TransactionReceipt receipt) {
    this.receipt = receipt;
  }

  public CommittedTransactionInfo manifestInstructions(String manifestInstructions) {
    
    this.manifestInstructions = manifestInstructions;
    return this;
  }

  /**
   * A text-representation of a transaction manifest. This field will be present only for user transactions and when explicitly opted-in using the &#x60;manifest_instructions&#x60; flag. 
   * @return manifestInstructions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANIFEST_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManifestInstructions() {
    return manifestInstructions;
  }


  @JsonProperty(JSON_PROPERTY_MANIFEST_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManifestInstructions(String manifestInstructions) {
    this.manifestInstructions = manifestInstructions;
  }

  public CommittedTransactionInfo manifestClasses(List<ManifestClass> manifestClasses) {
    
    this.manifestClasses = manifestClasses;
    return this;
  }

  public CommittedTransactionInfo addManifestClassesItem(ManifestClass manifestClassesItem) {
    if (this.manifestClasses == null) {
      this.manifestClasses = new ArrayList<>();
    }
    this.manifestClasses.add(manifestClassesItem);
    return this;
  }

  /**
   * A collection of zero or more manifest classes ordered from the most specific class to the least specific one. This field will be present only for user transactions. For user transactions with subintents only the root transaction intent is currently used to determine the manifest classes. 
   * @return manifestClasses
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANIFEST_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ManifestClass> getManifestClasses() {
    return manifestClasses;
  }


  @JsonProperty(JSON_PROPERTY_MANIFEST_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManifestClasses(List<ManifestClass> manifestClasses) {
    this.manifestClasses = manifestClasses;
  }

  public CommittedTransactionInfo message(Object message) {
    
    this.message = message;
    return this;
  }

  /**
   * The optional transaction message. This type is defined in the Core API as &#x60;TransactionMessage&#x60;. See the Core API documentation for more details. 
   * @return message
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(Object message) {
    this.message = message;
  }

  public CommittedTransactionInfo balanceChanges(TransactionBalanceChanges balanceChanges) {
    
    this.balanceChanges = balanceChanges;
    return this;
  }

  /**
   * Get balanceChanges
   * @return balanceChanges
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionBalanceChanges getBalanceChanges() {
    return balanceChanges;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceChanges(TransactionBalanceChanges balanceChanges) {
    this.balanceChanges = balanceChanges;
  }

  public CommittedTransactionInfo subintentDetails(List<TransactionSubintentDetails> subintentDetails) {
    
    this.subintentDetails = subintentDetails;
    return this;
  }

  public CommittedTransactionInfo addSubintentDetailsItem(TransactionSubintentDetails subintentDetailsItem) {
    if (this.subintentDetails == null) {
      this.subintentDetails = new ArrayList<>();
    }
    this.subintentDetails.add(subintentDetailsItem);
    return this;
  }

  /**
   * Subintent details. Please note that it is returned regardless of whether the transaction was committed successfully or failed, and it can be returned in multiple transactions. 
   * @return subintentDetails
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBINTENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TransactionSubintentDetails> getSubintentDetails() {
    return subintentDetails;
  }


  @JsonProperty(JSON_PROPERTY_SUBINTENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubintentDetails(List<TransactionSubintentDetails> subintentDetails) {
    this.subintentDetails = subintentDetails;
  }

  public CommittedTransactionInfo childSubintentHashes(List<String> childSubintentHashes) {
    
    this.childSubintentHashes = childSubintentHashes;
    return this;
  }

  public CommittedTransactionInfo addChildSubintentHashesItem(String childSubintentHashesItem) {
    if (this.childSubintentHashes == null) {
      this.childSubintentHashes = new ArrayList<>();
    }
    this.childSubintentHashes.add(childSubintentHashesItem);
    return this;
  }

  /**
   * The child subintent hashes of the root transaction intent. Please note that it is returned regardless of whether the transaction was committed successfully or failed, and it can be returned in multiple transactions. 
   * @return childSubintentHashes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHILD_SUBINTENT_HASHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getChildSubintentHashes() {
    return childSubintentHashes;
  }


  @JsonProperty(JSON_PROPERTY_CHILD_SUBINTENT_HASHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildSubintentHashes(List<String> childSubintentHashes) {
    this.childSubintentHashes = childSubintentHashes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommittedTransactionInfo committedTransactionInfo = (CommittedTransactionInfo) o;
    return Objects.equals(this.stateVersion, committedTransactionInfo.stateVersion) &&
        Objects.equals(this.epoch, committedTransactionInfo.epoch) &&
        Objects.equals(this.round, committedTransactionInfo.round) &&
        Objects.equals(this.roundTimestamp, committedTransactionInfo.roundTimestamp) &&
        Objects.equals(this.transactionStatus, committedTransactionInfo.transactionStatus) &&
        Objects.equals(this.payloadHash, committedTransactionInfo.payloadHash) &&
        Objects.equals(this.intentHash, committedTransactionInfo.intentHash) &&
        Objects.equals(this.feePaid, committedTransactionInfo.feePaid) &&
        Objects.equals(this.affectedGlobalEntities, committedTransactionInfo.affectedGlobalEntities) &&
        equalsNullable(this.confirmedAt, committedTransactionInfo.confirmedAt) &&
        Objects.equals(this.errorMessage, committedTransactionInfo.errorMessage) &&
        Objects.equals(this.rawHex, committedTransactionInfo.rawHex) &&
        Objects.equals(this.receipt, committedTransactionInfo.receipt) &&
        Objects.equals(this.manifestInstructions, committedTransactionInfo.manifestInstructions) &&
        Objects.equals(this.manifestClasses, committedTransactionInfo.manifestClasses) &&
        Objects.equals(this.message, committedTransactionInfo.message) &&
        Objects.equals(this.balanceChanges, committedTransactionInfo.balanceChanges) &&
        Objects.equals(this.subintentDetails, committedTransactionInfo.subintentDetails) &&
        Objects.equals(this.childSubintentHashes, committedTransactionInfo.childSubintentHashes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateVersion, epoch, round, roundTimestamp, transactionStatus, payloadHash, intentHash, feePaid, affectedGlobalEntities, hashCodeNullable(confirmedAt), errorMessage, rawHex, receipt, manifestInstructions, manifestClasses, message, balanceChanges, subintentDetails, childSubintentHashes);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommittedTransactionInfo {\n");
    sb.append("    stateVersion: ").append(toIndentedString(stateVersion)).append("\n");
    sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    roundTimestamp: ").append(toIndentedString(roundTimestamp)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    payloadHash: ").append(toIndentedString(payloadHash)).append("\n");
    sb.append("    intentHash: ").append(toIndentedString(intentHash)).append("\n");
    sb.append("    feePaid: ").append(toIndentedString(feePaid)).append("\n");
    sb.append("    affectedGlobalEntities: ").append(toIndentedString(affectedGlobalEntities)).append("\n");
    sb.append("    confirmedAt: ").append(toIndentedString(confirmedAt)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    rawHex: ").append(toIndentedString(rawHex)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    manifestInstructions: ").append(toIndentedString(manifestInstructions)).append("\n");
    sb.append("    manifestClasses: ").append(toIndentedString(manifestClasses)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    balanceChanges: ").append(toIndentedString(balanceChanges)).append("\n");
    sb.append("    subintentDetails: ").append(toIndentedString(subintentDetails)).append("\n");
    sb.append("    childSubintentHashes: ").append(toIndentedString(childSubintentHashes)).append("\n");
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

    // add `state_version` to the URL query string
    if (getStateVersion() != null) {
      try {
        joiner.add(String.format("%sstate_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStateVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `epoch` to the URL query string
    if (getEpoch() != null) {
      try {
        joiner.add(String.format("%sepoch%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEpoch()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `round` to the URL query string
    if (getRound() != null) {
      try {
        joiner.add(String.format("%sround%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRound()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `round_timestamp` to the URL query string
    if (getRoundTimestamp() != null) {
      try {
        joiner.add(String.format("%sround_timestamp%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoundTimestamp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `transaction_status` to the URL query string
    if (getTransactionStatus() != null) {
      try {
        joiner.add(String.format("%stransaction_status%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactionStatus()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `intent_hash` to the URL query string
    if (getIntentHash() != null) {
      try {
        joiner.add(String.format("%sintent_hash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntentHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fee_paid` to the URL query string
    if (getFeePaid() != null) {
      try {
        joiner.add(String.format("%sfee_paid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFeePaid()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `affected_global_entities` to the URL query string
    if (getAffectedGlobalEntities() != null) {
      for (int i = 0; i < getAffectedGlobalEntities().size(); i++) {
        try {
          joiner.add(String.format("%saffected_global_entities%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getAffectedGlobalEntities().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `confirmed_at` to the URL query string
    if (getConfirmedAt() != null) {
      try {
        joiner.add(String.format("%sconfirmed_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfirmedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error_message` to the URL query string
    if (getErrorMessage() != null) {
      try {
        joiner.add(String.format("%serror_message%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getErrorMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `raw_hex` to the URL query string
    if (getRawHex() != null) {
      try {
        joiner.add(String.format("%sraw_hex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRawHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt` to the URL query string
    if (getReceipt() != null) {
      joiner.add(getReceipt().toUrlQueryString(prefix + "receipt" + suffix));
    }

    // add `manifest_instructions` to the URL query string
    if (getManifestInstructions() != null) {
      try {
        joiner.add(String.format("%smanifest_instructions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getManifestInstructions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `manifest_classes` to the URL query string
    if (getManifestClasses() != null) {
      for (int i = 0; i < getManifestClasses().size(); i++) {
        if (getManifestClasses().get(i) != null) {
          try {
            joiner.add(String.format("%smanifest_classes%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getManifestClasses().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      try {
        joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `balance_changes` to the URL query string
    if (getBalanceChanges() != null) {
      joiner.add(getBalanceChanges().toUrlQueryString(prefix + "balance_changes" + suffix));
    }

    // add `subintent_details` to the URL query string
    if (getSubintentDetails() != null) {
      for (int i = 0; i < getSubintentDetails().size(); i++) {
        if (getSubintentDetails().get(i) != null) {
          joiner.add(getSubintentDetails().get(i).toUrlQueryString(String.format("%ssubintent_details%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `child_subintent_hashes` to the URL query string
    if (getChildSubintentHashes() != null) {
      for (int i = 0; i < getChildSubintentHashes().size(); i++) {
        try {
          joiner.add(String.format("%schild_subintent_hashes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getChildSubintentHashes().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}


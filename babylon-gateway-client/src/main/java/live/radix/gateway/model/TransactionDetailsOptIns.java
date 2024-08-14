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
 * TransactionDetailsOptIns
 */
@JsonPropertyOrder({
  TransactionDetailsOptIns.JSON_PROPERTY_RAW_HEX,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_STATE_CHANGES,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_FEE_SUMMARY,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_FEE_SOURCE,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_FEE_DESTINATION,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_COSTING_PARAMETERS,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_EVENTS,
  TransactionDetailsOptIns.JSON_PROPERTY_RECEIPT_OUTPUT,
  TransactionDetailsOptIns.JSON_PROPERTY_AFFECTED_GLOBAL_ENTITIES,
  TransactionDetailsOptIns.JSON_PROPERTY_MANIFEST_INSTRUCTIONS,
  TransactionDetailsOptIns.JSON_PROPERTY_BALANCE_CHANGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-15T00:18:13.130575900+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class TransactionDetailsOptIns {
  public static final String JSON_PROPERTY_RAW_HEX = "raw_hex";
  private Boolean rawHex = false;

  public static final String JSON_PROPERTY_RECEIPT_STATE_CHANGES = "receipt_state_changes";
  private Boolean receiptStateChanges = false;

  public static final String JSON_PROPERTY_RECEIPT_FEE_SUMMARY = "receipt_fee_summary";
  private Boolean receiptFeeSummary = false;

  public static final String JSON_PROPERTY_RECEIPT_FEE_SOURCE = "receipt_fee_source";
  private Boolean receiptFeeSource = false;

  public static final String JSON_PROPERTY_RECEIPT_FEE_DESTINATION = "receipt_fee_destination";
  private Boolean receiptFeeDestination = false;

  public static final String JSON_PROPERTY_RECEIPT_COSTING_PARAMETERS = "receipt_costing_parameters";
  private Boolean receiptCostingParameters = false;

  public static final String JSON_PROPERTY_RECEIPT_EVENTS = "receipt_events";
  private Boolean receiptEvents = false;

  public static final String JSON_PROPERTY_RECEIPT_OUTPUT = "receipt_output";
  private Boolean receiptOutput = true;

  public static final String JSON_PROPERTY_AFFECTED_GLOBAL_ENTITIES = "affected_global_entities";
  private Boolean affectedGlobalEntities = false;

  public static final String JSON_PROPERTY_MANIFEST_INSTRUCTIONS = "manifest_instructions";
  private Boolean manifestInstructions = false;

  public static final String JSON_PROPERTY_BALANCE_CHANGES = "balance_changes";
  private Boolean balanceChanges = false;

  public TransactionDetailsOptIns() {
  }

  public TransactionDetailsOptIns rawHex(Boolean rawHex) {
    
    this.rawHex = rawHex;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, raw transaction hex is returned.
   * @return rawHex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RAW_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isRawHex() {
    return rawHex;
  }


  @JsonProperty(JSON_PROPERTY_RAW_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRawHex(Boolean rawHex) {
    this.rawHex = rawHex;
  }

  public TransactionDetailsOptIns receiptStateChanges(Boolean receiptStateChanges) {
    
    this.receiptStateChanges = receiptStateChanges;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, state changes inside receipt object are returned.
   * @return receiptStateChanges
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_STATE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptStateChanges() {
    return receiptStateChanges;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_STATE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptStateChanges(Boolean receiptStateChanges) {
    this.receiptStateChanges = receiptStateChanges;
  }

  public TransactionDetailsOptIns receiptFeeSummary(Boolean receiptFeeSummary) {
    
    this.receiptFeeSummary = receiptFeeSummary;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, fee summary inside receipt object is returned.
   * @return receiptFeeSummary
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_FEE_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptFeeSummary() {
    return receiptFeeSummary;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_FEE_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptFeeSummary(Boolean receiptFeeSummary) {
    this.receiptFeeSummary = receiptFeeSummary;
  }

  public TransactionDetailsOptIns receiptFeeSource(Boolean receiptFeeSource) {
    
    this.receiptFeeSource = receiptFeeSource;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, fee source inside receipt object is returned.
   * @return receiptFeeSource
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_FEE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptFeeSource() {
    return receiptFeeSource;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_FEE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptFeeSource(Boolean receiptFeeSource) {
    this.receiptFeeSource = receiptFeeSource;
  }

  public TransactionDetailsOptIns receiptFeeDestination(Boolean receiptFeeDestination) {
    
    this.receiptFeeDestination = receiptFeeDestination;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, fee destination inside receipt object is returned.
   * @return receiptFeeDestination
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_FEE_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptFeeDestination() {
    return receiptFeeDestination;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_FEE_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptFeeDestination(Boolean receiptFeeDestination) {
    this.receiptFeeDestination = receiptFeeDestination;
  }

  public TransactionDetailsOptIns receiptCostingParameters(Boolean receiptCostingParameters) {
    
    this.receiptCostingParameters = receiptCostingParameters;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, costing parameters inside receipt object is returned.
   * @return receiptCostingParameters
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_COSTING_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptCostingParameters() {
    return receiptCostingParameters;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_COSTING_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptCostingParameters(Boolean receiptCostingParameters) {
    this.receiptCostingParameters = receiptCostingParameters;
  }

  public TransactionDetailsOptIns receiptEvents(Boolean receiptEvents) {
    
    this.receiptEvents = receiptEvents;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, events inside receipt object is returned.
   * @return receiptEvents
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptEvents() {
    return receiptEvents;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptEvents(Boolean receiptEvents) {
    this.receiptEvents = receiptEvents;
  }

  public TransactionDetailsOptIns receiptOutput(Boolean receiptOutput) {
    
    this.receiptOutput = receiptOutput;
    return this;
  }

  /**
   * (true by default) if set to &#x60;true&#x60;, transaction receipt output is returned.
   * @return receiptOutput
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isReceiptOutput() {
    return receiptOutput;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptOutput(Boolean receiptOutput) {
    this.receiptOutput = receiptOutput;
  }

  public TransactionDetailsOptIns affectedGlobalEntities(Boolean affectedGlobalEntities) {
    
    this.affectedGlobalEntities = affectedGlobalEntities;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, all affected global entities by given transaction are returned.
   * @return affectedGlobalEntities
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFECTED_GLOBAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isAffectedGlobalEntities() {
    return affectedGlobalEntities;
  }


  @JsonProperty(JSON_PROPERTY_AFFECTED_GLOBAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffectedGlobalEntities(Boolean affectedGlobalEntities) {
    this.affectedGlobalEntities = affectedGlobalEntities;
  }

  public TransactionDetailsOptIns manifestInstructions(Boolean manifestInstructions) {
    
    this.manifestInstructions = manifestInstructions;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, manifest instructions for user transactions are returned.
   * @return manifestInstructions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANIFEST_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isManifestInstructions() {
    return manifestInstructions;
  }


  @JsonProperty(JSON_PROPERTY_MANIFEST_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManifestInstructions(Boolean manifestInstructions) {
    this.manifestInstructions = manifestInstructions;
  }

  public TransactionDetailsOptIns balanceChanges(Boolean balanceChanges) {
    
    this.balanceChanges = balanceChanges;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, returns the fungible and non-fungible balance changes.  **Warning!** This opt-in might be missing for recently committed transactions, in that case a &#x60;null&#x60; value will be returned. Retry the request until non-null value is returned. 
   * @return balanceChanges
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isBalanceChanges() {
    return balanceChanges;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceChanges(Boolean balanceChanges) {
    this.balanceChanges = balanceChanges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetailsOptIns transactionDetailsOptIns = (TransactionDetailsOptIns) o;
    return Objects.equals(this.rawHex, transactionDetailsOptIns.rawHex) &&
        Objects.equals(this.receiptStateChanges, transactionDetailsOptIns.receiptStateChanges) &&
        Objects.equals(this.receiptFeeSummary, transactionDetailsOptIns.receiptFeeSummary) &&
        Objects.equals(this.receiptFeeSource, transactionDetailsOptIns.receiptFeeSource) &&
        Objects.equals(this.receiptFeeDestination, transactionDetailsOptIns.receiptFeeDestination) &&
        Objects.equals(this.receiptCostingParameters, transactionDetailsOptIns.receiptCostingParameters) &&
        Objects.equals(this.receiptEvents, transactionDetailsOptIns.receiptEvents) &&
        Objects.equals(this.receiptOutput, transactionDetailsOptIns.receiptOutput) &&
        Objects.equals(this.affectedGlobalEntities, transactionDetailsOptIns.affectedGlobalEntities) &&
        Objects.equals(this.manifestInstructions, transactionDetailsOptIns.manifestInstructions) &&
        Objects.equals(this.balanceChanges, transactionDetailsOptIns.balanceChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawHex, receiptStateChanges, receiptFeeSummary, receiptFeeSource, receiptFeeDestination, receiptCostingParameters, receiptEvents, receiptOutput, affectedGlobalEntities, manifestInstructions, balanceChanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetailsOptIns {\n");
    sb.append("    rawHex: ").append(toIndentedString(rawHex)).append("\n");
    sb.append("    receiptStateChanges: ").append(toIndentedString(receiptStateChanges)).append("\n");
    sb.append("    receiptFeeSummary: ").append(toIndentedString(receiptFeeSummary)).append("\n");
    sb.append("    receiptFeeSource: ").append(toIndentedString(receiptFeeSource)).append("\n");
    sb.append("    receiptFeeDestination: ").append(toIndentedString(receiptFeeDestination)).append("\n");
    sb.append("    receiptCostingParameters: ").append(toIndentedString(receiptCostingParameters)).append("\n");
    sb.append("    receiptEvents: ").append(toIndentedString(receiptEvents)).append("\n");
    sb.append("    receiptOutput: ").append(toIndentedString(receiptOutput)).append("\n");
    sb.append("    affectedGlobalEntities: ").append(toIndentedString(affectedGlobalEntities)).append("\n");
    sb.append("    manifestInstructions: ").append(toIndentedString(manifestInstructions)).append("\n");
    sb.append("    balanceChanges: ").append(toIndentedString(balanceChanges)).append("\n");
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

    // add `raw_hex` to the URL query string
    if (isRawHex() != null) {
      try {
        joiner.add(String.format("%sraw_hex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isRawHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_state_changes` to the URL query string
    if (isReceiptStateChanges() != null) {
      try {
        joiner.add(String.format("%sreceipt_state_changes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptStateChanges()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_fee_summary` to the URL query string
    if (isReceiptFeeSummary() != null) {
      try {
        joiner.add(String.format("%sreceipt_fee_summary%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptFeeSummary()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_fee_source` to the URL query string
    if (isReceiptFeeSource() != null) {
      try {
        joiner.add(String.format("%sreceipt_fee_source%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptFeeSource()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_fee_destination` to the URL query string
    if (isReceiptFeeDestination() != null) {
      try {
        joiner.add(String.format("%sreceipt_fee_destination%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptFeeDestination()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_costing_parameters` to the URL query string
    if (isReceiptCostingParameters() != null) {
      try {
        joiner.add(String.format("%sreceipt_costing_parameters%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptCostingParameters()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_events` to the URL query string
    if (isReceiptEvents() != null) {
      try {
        joiner.add(String.format("%sreceipt_events%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptEvents()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt_output` to the URL query string
    if (isReceiptOutput() != null) {
      try {
        joiner.add(String.format("%sreceipt_output%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isReceiptOutput()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `affected_global_entities` to the URL query string
    if (isAffectedGlobalEntities() != null) {
      try {
        joiner.add(String.format("%saffected_global_entities%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isAffectedGlobalEntities()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `manifest_instructions` to the URL query string
    if (isManifestInstructions() != null) {
      try {
        joiner.add(String.format("%smanifest_instructions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isManifestInstructions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `balance_changes` to the URL query string
    if (isBalanceChanges() != null) {
      try {
        joiner.add(String.format("%sbalance_changes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isBalanceChanges()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


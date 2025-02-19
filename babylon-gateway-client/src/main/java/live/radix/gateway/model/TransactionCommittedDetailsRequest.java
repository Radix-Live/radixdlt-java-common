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
import live.radix.gateway.model.LedgerStateSelector;
import live.radix.gateway.model.TransactionDetailsOptIns;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionCommittedDetailsRequest
 */
@JsonPropertyOrder({
  TransactionCommittedDetailsRequest.JSON_PROPERTY_AT_LEDGER_STATE,
  TransactionCommittedDetailsRequest.JSON_PROPERTY_INTENT_HASH,
  TransactionCommittedDetailsRequest.JSON_PROPERTY_OPT_INS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T19:38:04.213407200+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class TransactionCommittedDetailsRequest {
  public static final String JSON_PROPERTY_AT_LEDGER_STATE = "at_ledger_state";
  private LedgerStateSelector atLedgerState;

  public static final String JSON_PROPERTY_INTENT_HASH = "intent_hash";
  private String intentHash;

  public static final String JSON_PROPERTY_OPT_INS = "opt_ins";
  private TransactionDetailsOptIns optIns;

  public TransactionCommittedDetailsRequest() {
  }

  public TransactionCommittedDetailsRequest atLedgerState(LedgerStateSelector atLedgerState) {
    
    this.atLedgerState = atLedgerState;
    return this;
  }

  /**
   * Get atLedgerState
   * @return atLedgerState
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AT_LEDGER_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LedgerStateSelector getAtLedgerState() {
    return atLedgerState;
  }


  @JsonProperty(JSON_PROPERTY_AT_LEDGER_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAtLedgerState(LedgerStateSelector atLedgerState) {
    this.atLedgerState = atLedgerState;
  }

  public TransactionCommittedDetailsRequest intentHash(String intentHash) {
    
    this.intentHash = intentHash;
    return this;
  }

  /**
   * Bech32m-encoded hash.
   * @return intentHash
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTENT_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIntentHash() {
    return intentHash;
  }


  @JsonProperty(JSON_PROPERTY_INTENT_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntentHash(String intentHash) {
    this.intentHash = intentHash;
  }

  public TransactionCommittedDetailsRequest optIns(TransactionDetailsOptIns optIns) {
    
    this.optIns = optIns;
    return this;
  }

  /**
   * Get optIns
   * @return optIns
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPT_INS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionDetailsOptIns getOptIns() {
    return optIns;
  }


  @JsonProperty(JSON_PROPERTY_OPT_INS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptIns(TransactionDetailsOptIns optIns) {
    this.optIns = optIns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCommittedDetailsRequest transactionCommittedDetailsRequest = (TransactionCommittedDetailsRequest) o;
    return Objects.equals(this.atLedgerState, transactionCommittedDetailsRequest.atLedgerState) &&
        Objects.equals(this.intentHash, transactionCommittedDetailsRequest.intentHash) &&
        Objects.equals(this.optIns, transactionCommittedDetailsRequest.optIns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atLedgerState, intentHash, optIns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCommittedDetailsRequest {\n");
    sb.append("    atLedgerState: ").append(toIndentedString(atLedgerState)).append("\n");
    sb.append("    intentHash: ").append(toIndentedString(intentHash)).append("\n");
    sb.append("    optIns: ").append(toIndentedString(optIns)).append("\n");
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

    // add `at_ledger_state` to the URL query string
    if (getAtLedgerState() != null) {
      joiner.add(getAtLedgerState().toUrlQueryString(prefix + "at_ledger_state" + suffix));
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

    // add `opt_ins` to the URL query string
    if (getOptIns() != null) {
      joiner.add(getOptIns().toUrlQueryString(prefix + "opt_ins" + suffix));
    }

    return joiner.toString();
  }

}


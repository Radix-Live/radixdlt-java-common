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
import live.radix.core.model.LedgerStateSelector;
import live.radix.core.model.PreviewFlags;
import live.radix.core.model.PreviewTransaction;
import live.radix.core.model.TransactionPreviewV2ResponseOptions;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionPreviewV2Request
 */
@JsonPropertyOrder({
  TransactionPreviewV2Request.JSON_PROPERTY_NETWORK,
  TransactionPreviewV2Request.JSON_PROPERTY_AT_LEDGER_STATE,
  TransactionPreviewV2Request.JSON_PROPERTY_PREVIEW_TRANSACTION,
  TransactionPreviewV2Request.JSON_PROPERTY_FLAGS,
  TransactionPreviewV2Request.JSON_PROPERTY_OPTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class TransactionPreviewV2Request {
  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public static final String JSON_PROPERTY_AT_LEDGER_STATE = "at_ledger_state";
  private LedgerStateSelector atLedgerState;

  public static final String JSON_PROPERTY_PREVIEW_TRANSACTION = "preview_transaction";
  private PreviewTransaction previewTransaction;

  public static final String JSON_PROPERTY_FLAGS = "flags";
  private PreviewFlags flags;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private TransactionPreviewV2ResponseOptions options;

  public TransactionPreviewV2Request() {
  }

  public TransactionPreviewV2Request network(String network) {
    
    this.network = network;
    return this;
  }

  /**
   * The logical name of the network
   * @return network
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNetwork() {
    return network;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNetwork(String network) {
    this.network = network;
  }

  public TransactionPreviewV2Request atLedgerState(LedgerStateSelector atLedgerState) {
    
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

  public TransactionPreviewV2Request previewTransaction(PreviewTransaction previewTransaction) {
    
    this.previewTransaction = previewTransaction;
    return this;
  }

  /**
   * Get previewTransaction
   * @return previewTransaction
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PREVIEW_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PreviewTransaction getPreviewTransaction() {
    return previewTransaction;
  }


  @JsonProperty(JSON_PROPERTY_PREVIEW_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreviewTransaction(PreviewTransaction previewTransaction) {
    this.previewTransaction = previewTransaction;
  }

  public TransactionPreviewV2Request flags(PreviewFlags flags) {
    
    this.flags = flags;
    return this;
  }

  /**
   * Get flags
   * @return flags
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PreviewFlags getFlags() {
    return flags;
  }


  @JsonProperty(JSON_PROPERTY_FLAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlags(PreviewFlags flags) {
    this.flags = flags;
  }

  public TransactionPreviewV2Request options(TransactionPreviewV2ResponseOptions options) {
    
    this.options = options;
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionPreviewV2ResponseOptions getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(TransactionPreviewV2ResponseOptions options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionPreviewV2Request transactionPreviewV2Request = (TransactionPreviewV2Request) o;
    return Objects.equals(this.network, transactionPreviewV2Request.network) &&
        Objects.equals(this.atLedgerState, transactionPreviewV2Request.atLedgerState) &&
        Objects.equals(this.previewTransaction, transactionPreviewV2Request.previewTransaction) &&
        Objects.equals(this.flags, transactionPreviewV2Request.flags) &&
        Objects.equals(this.options, transactionPreviewV2Request.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, atLedgerState, previewTransaction, flags, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionPreviewV2Request {\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    atLedgerState: ").append(toIndentedString(atLedgerState)).append("\n");
    sb.append("    previewTransaction: ").append(toIndentedString(previewTransaction)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

    // add `network` to the URL query string
    if (getNetwork() != null) {
      try {
        joiner.add(String.format("%snetwork%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNetwork()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `at_ledger_state` to the URL query string
    if (getAtLedgerState() != null) {
      joiner.add(getAtLedgerState().toUrlQueryString(prefix + "at_ledger_state" + suffix));
    }

    // add `preview_transaction` to the URL query string
    if (getPreviewTransaction() != null) {
      joiner.add(getPreviewTransaction().toUrlQueryString(prefix + "preview_transaction" + suffix));
    }

    // add `flags` to the URL query string
    if (getFlags() != null) {
      joiner.add(getFlags().toUrlQueryString(prefix + "flags" + suffix));
    }

    // add `options` to the URL query string
    if (getOptions() != null) {
      joiner.add(getOptions().toUrlQueryString(prefix + "options" + suffix));
    }

    return joiner.toString();
  }

}


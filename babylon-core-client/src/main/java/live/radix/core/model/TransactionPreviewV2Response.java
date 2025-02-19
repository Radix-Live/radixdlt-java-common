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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import live.radix.core.model.LedgerStateSummary;
import live.radix.core.model.TransactionPreviewResponseLogsInner;
import live.radix.core.model.TransactionReceipt;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionPreviewV2Response
 */
@JsonPropertyOrder({
  TransactionPreviewV2Response.JSON_PROPERTY_AT_LEDGER_STATE,
  TransactionPreviewV2Response.JSON_PROPERTY_RECEIPT,
  TransactionPreviewV2Response.JSON_PROPERTY_RADIX_ENGINE_TOOLKIT_RECEIPT,
  TransactionPreviewV2Response.JSON_PROPERTY_LOGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class TransactionPreviewV2Response {
  public static final String JSON_PROPERTY_AT_LEDGER_STATE = "at_ledger_state";
  private LedgerStateSummary atLedgerState;

  public static final String JSON_PROPERTY_RECEIPT = "receipt";
  private TransactionReceipt receipt;

  public static final String JSON_PROPERTY_RADIX_ENGINE_TOOLKIT_RECEIPT = "radix_engine_toolkit_receipt";
  private Object radixEngineToolkitReceipt;

  public static final String JSON_PROPERTY_LOGS = "logs";
  private List<TransactionPreviewResponseLogsInner> logs = new ArrayList<>();

  public TransactionPreviewV2Response() {
  }

  public TransactionPreviewV2Response atLedgerState(LedgerStateSummary atLedgerState) {
    
    this.atLedgerState = atLedgerState;
    return this;
  }

  /**
   * A summarized state of the ledger on top of which the preview was performed.
   * @return atLedgerState
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AT_LEDGER_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LedgerStateSummary getAtLedgerState() {
    return atLedgerState;
  }


  @JsonProperty(JSON_PROPERTY_AT_LEDGER_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAtLedgerState(LedgerStateSummary atLedgerState) {
    this.atLedgerState = atLedgerState;
  }

  public TransactionPreviewV2Response receipt(TransactionReceipt receipt) {
    
    this.receipt = receipt;
    return this;
  }

  /**
   * This is provided unless the &#x60;core_api_receipt&#x60; flag is set to false in the &#x60;options&#x60; property of the request. 
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

  public TransactionPreviewV2Response radixEngineToolkitReceipt(Object radixEngineToolkitReceipt) {
    
    this.radixEngineToolkitReceipt = radixEngineToolkitReceipt;
    return this;
  }

  /**
   * An optional field which is only provided if the &#x60;radix_engine_toolkit_receipt&#x60; flag is set to true in the &#x60;options&#x60; property of the request.  This receipt is primarily intended for use with the toolkit and may contain information  that is already available in the receipt provided in the &#x60;receipt&#x60; field of this  response.  A typical client of this API is not expected to use this receipt. The primary clients  this receipt is intended for is the Radix wallet or any client that needs to perform  execution summaries on their transactions. 
   * @return radixEngineToolkitReceipt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RADIX_ENGINE_TOOLKIT_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getRadixEngineToolkitReceipt() {
    return radixEngineToolkitReceipt;
  }


  @JsonProperty(JSON_PROPERTY_RADIX_ENGINE_TOOLKIT_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRadixEngineToolkitReceipt(Object radixEngineToolkitReceipt) {
    this.radixEngineToolkitReceipt = radixEngineToolkitReceipt;
  }

  public TransactionPreviewV2Response logs(List<TransactionPreviewResponseLogsInner> logs) {
    
    this.logs = logs;
    return this;
  }

  public TransactionPreviewV2Response addLogsItem(TransactionPreviewResponseLogsInner logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    return this;
  }

  /**
   * An optional field which is only provided if the &#x60;logs&#x60; flag is set to true in the &#x60;options&#x60; property of the request.  If present, it gives the emitted logs from the transaction execution. 
   * @return logs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TransactionPreviewResponseLogsInner> getLogs() {
    return logs;
  }


  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogs(List<TransactionPreviewResponseLogsInner> logs) {
    this.logs = logs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionPreviewV2Response transactionPreviewV2Response = (TransactionPreviewV2Response) o;
    return Objects.equals(this.atLedgerState, transactionPreviewV2Response.atLedgerState) &&
        Objects.equals(this.receipt, transactionPreviewV2Response.receipt) &&
        Objects.equals(this.radixEngineToolkitReceipt, transactionPreviewV2Response.radixEngineToolkitReceipt) &&
        Objects.equals(this.logs, transactionPreviewV2Response.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atLedgerState, receipt, radixEngineToolkitReceipt, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionPreviewV2Response {\n");
    sb.append("    atLedgerState: ").append(toIndentedString(atLedgerState)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    radixEngineToolkitReceipt: ").append(toIndentedString(radixEngineToolkitReceipt)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

    // add `receipt` to the URL query string
    if (getReceipt() != null) {
      joiner.add(getReceipt().toUrlQueryString(prefix + "receipt" + suffix));
    }

    // add `radix_engine_toolkit_receipt` to the URL query string
    if (getRadixEngineToolkitReceipt() != null) {
      try {
        joiner.add(String.format("%sradix_engine_toolkit_receipt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRadixEngineToolkitReceipt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `logs` to the URL query string
    if (getLogs() != null) {
      for (int i = 0; i < getLogs().size(); i++) {
        if (getLogs().get(i) != null) {
          joiner.add(getLogs().get(i).toUrlQueryString(String.format("%slogs%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}


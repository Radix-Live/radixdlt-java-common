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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import live.radix.gateway.model.EventsItem;
import live.radix.gateway.model.TransactionStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionReceipt
 */
@JsonPropertyOrder({
  TransactionReceipt.JSON_PROPERTY_STATUS,
  TransactionReceipt.JSON_PROPERTY_FEE_SUMMARY,
  TransactionReceipt.JSON_PROPERTY_COSTING_PARAMETERS,
  TransactionReceipt.JSON_PROPERTY_FEE_DESTINATION,
  TransactionReceipt.JSON_PROPERTY_FEE_SOURCE,
  TransactionReceipt.JSON_PROPERTY_STATE_UPDATES,
  TransactionReceipt.JSON_PROPERTY_NEXT_EPOCH,
  TransactionReceipt.JSON_PROPERTY_OUTPUT,
  TransactionReceipt.JSON_PROPERTY_EVENTS,
  TransactionReceipt.JSON_PROPERTY_ERROR_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T19:38:04.213407200+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class TransactionReceipt {
  public static final String JSON_PROPERTY_STATUS = "status";
  private TransactionStatus status;

  public static final String JSON_PROPERTY_FEE_SUMMARY = "fee_summary";
  private Object feeSummary;

  public static final String JSON_PROPERTY_COSTING_PARAMETERS = "costing_parameters";
  private Object costingParameters;

  public static final String JSON_PROPERTY_FEE_DESTINATION = "fee_destination";
  private Object feeDestination;

  public static final String JSON_PROPERTY_FEE_SOURCE = "fee_source";
  private Object feeSource;

  public static final String JSON_PROPERTY_STATE_UPDATES = "state_updates";
  private Object stateUpdates;

  public static final String JSON_PROPERTY_NEXT_EPOCH = "next_epoch";
  private Object nextEpoch;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  private Object output;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<EventsItem> events = new ArrayList<>();

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public TransactionReceipt() {
  }

  public TransactionReceipt status(TransactionStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TransactionStatus status) {
    this.status = status;
  }

  public TransactionReceipt feeSummary(Object feeSummary) {
    
    this.feeSummary = feeSummary;
    return this;
  }

  /**
   * This type is defined in the Core API as &#x60;FeeSummary&#x60;. See the Core API documentation for more details. 
   * @return feeSummary
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEE_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getFeeSummary() {
    return feeSummary;
  }


  @JsonProperty(JSON_PROPERTY_FEE_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeeSummary(Object feeSummary) {
    this.feeSummary = feeSummary;
  }

  public TransactionReceipt costingParameters(Object costingParameters) {
    
    this.costingParameters = costingParameters;
    return this;
  }

  /**
   * Get costingParameters
   * @return costingParameters
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COSTING_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCostingParameters() {
    return costingParameters;
  }


  @JsonProperty(JSON_PROPERTY_COSTING_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostingParameters(Object costingParameters) {
    this.costingParameters = costingParameters;
  }

  public TransactionReceipt feeDestination(Object feeDestination) {
    
    this.feeDestination = feeDestination;
    return this;
  }

  /**
   * This type is defined in the Core API as &#x60;FeeDestination&#x60;. See the Core API documentation for more details. 
   * @return feeDestination
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEE_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getFeeDestination() {
    return feeDestination;
  }


  @JsonProperty(JSON_PROPERTY_FEE_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeeDestination(Object feeDestination) {
    this.feeDestination = feeDestination;
  }

  public TransactionReceipt feeSource(Object feeSource) {
    
    this.feeSource = feeSource;
    return this;
  }

  /**
   * This type is defined in the Core API as &#x60;FeeSource&#x60;. See the Core API documentation for more details. 
   * @return feeSource
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getFeeSource() {
    return feeSource;
  }


  @JsonProperty(JSON_PROPERTY_FEE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeeSource(Object feeSource) {
    this.feeSource = feeSource;
  }

  public TransactionReceipt stateUpdates(Object stateUpdates) {
    
    this.stateUpdates = stateUpdates;
    return this;
  }

  /**
   * This type is defined in the Core API as &#x60;StateUpdates&#x60;. See the Core API documentation for more details. 
   * @return stateUpdates
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getStateUpdates() {
    return stateUpdates;
  }


  @JsonProperty(JSON_PROPERTY_STATE_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateUpdates(Object stateUpdates) {
    this.stateUpdates = stateUpdates;
  }

  public TransactionReceipt nextEpoch(Object nextEpoch) {
    
    this.nextEpoch = nextEpoch;
    return this;
  }

  /**
   * Information (number and active validator list) about new epoch if occured. This type is defined in the Core API as &#x60;NextEpoch&#x60;. See the Core API documentation for more details. 
   * @return nextEpoch
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_EPOCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getNextEpoch() {
    return nextEpoch;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_EPOCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextEpoch(Object nextEpoch) {
    this.nextEpoch = nextEpoch;
  }

  public TransactionReceipt output(Object output) {
    
    this.output = output;
    return this;
  }

  /**
   * The manifest line-by-line engine return data (only present if &#x60;status&#x60; is &#x60;CommittedSuccess&#x60;). This type is defined in the Core API as &#x60;SborData&#x60;. See the Core API documentation for more details. 
   * @return output
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getOutput() {
    return output;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutput(Object output) {
    this.output = output;
  }

  public TransactionReceipt events(List<EventsItem> events) {
    
    this.events = events;
    return this;
  }

  public TransactionReceipt addEventsItem(EventsItem eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Events emitted by a transaction.
   * @return events
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EventsItem> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvents(List<EventsItem> events) {
    this.events = events;
  }

  public TransactionReceipt errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Error message (only present if status is &#x60;Failed&#x60; or &#x60;Rejected&#x60;)
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionReceipt transactionReceipt = (TransactionReceipt) o;
    return Objects.equals(this.status, transactionReceipt.status) &&
        Objects.equals(this.feeSummary, transactionReceipt.feeSummary) &&
        Objects.equals(this.costingParameters, transactionReceipt.costingParameters) &&
        Objects.equals(this.feeDestination, transactionReceipt.feeDestination) &&
        Objects.equals(this.feeSource, transactionReceipt.feeSource) &&
        Objects.equals(this.stateUpdates, transactionReceipt.stateUpdates) &&
        Objects.equals(this.nextEpoch, transactionReceipt.nextEpoch) &&
        Objects.equals(this.output, transactionReceipt.output) &&
        Objects.equals(this.events, transactionReceipt.events) &&
        Objects.equals(this.errorMessage, transactionReceipt.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, feeSummary, costingParameters, feeDestination, feeSource, stateUpdates, nextEpoch, output, events, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionReceipt {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    feeSummary: ").append(toIndentedString(feeSummary)).append("\n");
    sb.append("    costingParameters: ").append(toIndentedString(costingParameters)).append("\n");
    sb.append("    feeDestination: ").append(toIndentedString(feeDestination)).append("\n");
    sb.append("    feeSource: ").append(toIndentedString(feeSource)).append("\n");
    sb.append("    stateUpdates: ").append(toIndentedString(stateUpdates)).append("\n");
    sb.append("    nextEpoch: ").append(toIndentedString(nextEpoch)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fee_summary` to the URL query string
    if (getFeeSummary() != null) {
      try {
        joiner.add(String.format("%sfee_summary%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFeeSummary()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `costing_parameters` to the URL query string
    if (getCostingParameters() != null) {
      try {
        joiner.add(String.format("%scosting_parameters%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCostingParameters()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fee_destination` to the URL query string
    if (getFeeDestination() != null) {
      try {
        joiner.add(String.format("%sfee_destination%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFeeDestination()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fee_source` to the URL query string
    if (getFeeSource() != null) {
      try {
        joiner.add(String.format("%sfee_source%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFeeSource()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state_updates` to the URL query string
    if (getStateUpdates() != null) {
      try {
        joiner.add(String.format("%sstate_updates%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStateUpdates()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `next_epoch` to the URL query string
    if (getNextEpoch() != null) {
      try {
        joiner.add(String.format("%snext_epoch%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextEpoch()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `output` to the URL query string
    if (getOutput() != null) {
      try {
        joiner.add(String.format("%soutput%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOutput()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `events` to the URL query string
    if (getEvents() != null) {
      for (int i = 0; i < getEvents().size(); i++) {
        if (getEvents().get(i) != null) {
          joiner.add(getEvents().get(i).toUrlQueryString(String.format("%sevents%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
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

    return joiner.toString();
  }

}


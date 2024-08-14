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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * LimitParameters
 */
@JsonPropertyOrder({
  LimitParameters.JSON_PROPERTY_MAX_CALL_DEPTH,
  LimitParameters.JSON_PROPERTY_MAX_HEAP_SUBSTATE_TOTAL_BYTES,
  LimitParameters.JSON_PROPERTY_MAX_TRACK_SUBSTATE_TOTAL_BYTES,
  LimitParameters.JSON_PROPERTY_MAX_SUBSTATE_KEY_SIZE,
  LimitParameters.JSON_PROPERTY_MAX_SUBSTATE_VALUE_SIZE,
  LimitParameters.JSON_PROPERTY_MAX_INVOKE_INPUT_SIZE,
  LimitParameters.JSON_PROPERTY_MAX_EVENT_SIZE,
  LimitParameters.JSON_PROPERTY_MAX_LOG_SIZE,
  LimitParameters.JSON_PROPERTY_MAX_PANIC_MESSAGE_SIZE,
  LimitParameters.JSON_PROPERTY_MAX_NUMBER_OF_LOGS,
  LimitParameters.JSON_PROPERTY_MAX_NUMBER_OF_EVENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class LimitParameters {
  public static final String JSON_PROPERTY_MAX_CALL_DEPTH = "max_call_depth";
  private String maxCallDepth;

  public static final String JSON_PROPERTY_MAX_HEAP_SUBSTATE_TOTAL_BYTES = "max_heap_substate_total_bytes";
  private String maxHeapSubstateTotalBytes;

  public static final String JSON_PROPERTY_MAX_TRACK_SUBSTATE_TOTAL_BYTES = "max_track_substate_total_bytes";
  private String maxTrackSubstateTotalBytes;

  public static final String JSON_PROPERTY_MAX_SUBSTATE_KEY_SIZE = "max_substate_key_size";
  private String maxSubstateKeySize;

  public static final String JSON_PROPERTY_MAX_SUBSTATE_VALUE_SIZE = "max_substate_value_size";
  private String maxSubstateValueSize;

  public static final String JSON_PROPERTY_MAX_INVOKE_INPUT_SIZE = "max_invoke_input_size";
  private String maxInvokeInputSize;

  public static final String JSON_PROPERTY_MAX_EVENT_SIZE = "max_event_size";
  private String maxEventSize;

  public static final String JSON_PROPERTY_MAX_LOG_SIZE = "max_log_size";
  private String maxLogSize;

  public static final String JSON_PROPERTY_MAX_PANIC_MESSAGE_SIZE = "max_panic_message_size";
  private String maxPanicMessageSize;

  public static final String JSON_PROPERTY_MAX_NUMBER_OF_LOGS = "max_number_of_logs";
  private String maxNumberOfLogs;

  public static final String JSON_PROPERTY_MAX_NUMBER_OF_EVENTS = "max_number_of_events";
  private String maxNumberOfEvents;

  public LimitParameters() {
  }

  public LimitParameters maxCallDepth(String maxCallDepth) {
    
    this.maxCallDepth = maxCallDepth;
    return this;
  }

  /**
   * A decimal string-encoded 64-bit unsigned integer, representing the configured maximum call depth allowed during transaction execution. 
   * @return maxCallDepth
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_CALL_DEPTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxCallDepth() {
    return maxCallDepth;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CALL_DEPTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxCallDepth(String maxCallDepth) {
    this.maxCallDepth = maxCallDepth;
  }

  public LimitParameters maxHeapSubstateTotalBytes(String maxHeapSubstateTotalBytes) {
    
    this.maxHeapSubstateTotalBytes = maxHeapSubstateTotalBytes;
    return this;
  }

  /**
   * A decimal string-encoded 64-bit unsigned integer, representing the configured maximum byte size of all substates kept on the heap during a single transaction&#39;s execution. 
   * @return maxHeapSubstateTotalBytes
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_HEAP_SUBSTATE_TOTAL_BYTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxHeapSubstateTotalBytes() {
    return maxHeapSubstateTotalBytes;
  }


  @JsonProperty(JSON_PROPERTY_MAX_HEAP_SUBSTATE_TOTAL_BYTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxHeapSubstateTotalBytes(String maxHeapSubstateTotalBytes) {
    this.maxHeapSubstateTotalBytes = maxHeapSubstateTotalBytes;
  }

  public LimitParameters maxTrackSubstateTotalBytes(String maxTrackSubstateTotalBytes) {
    
    this.maxTrackSubstateTotalBytes = maxTrackSubstateTotalBytes;
    return this;
  }

  /**
   * A decimal string-encoded 64-bit unsigned integer, representing the configured maximum byte size of all substates kept in the track during a single transaction&#39;s execution. 
   * @return maxTrackSubstateTotalBytes
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_TRACK_SUBSTATE_TOTAL_BYTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxTrackSubstateTotalBytes() {
    return maxTrackSubstateTotalBytes;
  }


  @JsonProperty(JSON_PROPERTY_MAX_TRACK_SUBSTATE_TOTAL_BYTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxTrackSubstateTotalBytes(String maxTrackSubstateTotalBytes) {
    this.maxTrackSubstateTotalBytes = maxTrackSubstateTotalBytes;
  }

  public LimitParameters maxSubstateKeySize(String maxSubstateKeySize) {
    
    this.maxSubstateKeySize = maxSubstateKeySize;
    return this;
  }

  /**
   * A decimal string-encoded 64-bit unsigned integer, representing the configured maximum byte size of a Substate&#39;s key in the low-level Substate database. 
   * @return maxSubstateKeySize
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_SUBSTATE_KEY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxSubstateKeySize() {
    return maxSubstateKeySize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SUBSTATE_KEY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxSubstateKeySize(String maxSubstateKeySize) {
    this.maxSubstateKeySize = maxSubstateKeySize;
  }

  public LimitParameters maxSubstateValueSize(String maxSubstateValueSize) {
    
    this.maxSubstateValueSize = maxSubstateValueSize;
    return this;
  }

  /**
   * A decimal string-encoded 64-bit unsigned integer, representing the configured maximum byte size of a Substate&#39;s value in the low-level Substate database. 
   * @return maxSubstateValueSize
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_SUBSTATE_VALUE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxSubstateValueSize() {
    return maxSubstateValueSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SUBSTATE_VALUE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxSubstateValueSize(String maxSubstateValueSize) {
    this.maxSubstateValueSize = maxSubstateValueSize;
  }

  public LimitParameters maxInvokeInputSize(String maxInvokeInputSize) {
    
    this.maxInvokeInputSize = maxInvokeInputSize;
    return this;
  }

  /**
   * A decimal string-encoded 64-bit unsigned integer, representing the configured maximum byte size of a single call&#39;s input parameters. 
   * @return maxInvokeInputSize
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_INVOKE_INPUT_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxInvokeInputSize() {
    return maxInvokeInputSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_INVOKE_INPUT_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxInvokeInputSize(String maxInvokeInputSize) {
    this.maxInvokeInputSize = maxInvokeInputSize;
  }

  public LimitParameters maxEventSize(String maxEventSize) {
    
    this.maxEventSize = maxEventSize;
    return this;
  }

  /**
   * A decimal string-encoded 64-bit unsigned integer, representing the configured maximum byte size of a single emitted event. 
   * @return maxEventSize
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_EVENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxEventSize() {
    return maxEventSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_EVENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxEventSize(String maxEventSize) {
    this.maxEventSize = maxEventSize;
  }

  public LimitParameters maxLogSize(String maxLogSize) {
    
    this.maxLogSize = maxLogSize;
    return this;
  }

  /**
   * A decimal string-encoded 64-bit unsigned integer, representing the configured maximum byte size of a single logged line. 
   * @return maxLogSize
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_LOG_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxLogSize() {
    return maxLogSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_LOG_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxLogSize(String maxLogSize) {
    this.maxLogSize = maxLogSize;
  }

  public LimitParameters maxPanicMessageSize(String maxPanicMessageSize) {
    
    this.maxPanicMessageSize = maxPanicMessageSize;
    return this;
  }

  /**
   * A decimal string-encoded 64-bit unsigned integer, representing the configured maximum byte size of a single panic message. 
   * @return maxPanicMessageSize
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_PANIC_MESSAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxPanicMessageSize() {
    return maxPanicMessageSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_PANIC_MESSAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxPanicMessageSize(String maxPanicMessageSize) {
    this.maxPanicMessageSize = maxPanicMessageSize;
  }

  public LimitParameters maxNumberOfLogs(String maxNumberOfLogs) {
    
    this.maxNumberOfLogs = maxNumberOfLogs;
    return this;
  }

  /**
   * A decimal string-encoded 64-bit unsigned integer, representing the configured maximum count of log lines emitted during a single transaction&#39;s execution. 
   * @return maxNumberOfLogs
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_LOGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxNumberOfLogs() {
    return maxNumberOfLogs;
  }


  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_LOGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxNumberOfLogs(String maxNumberOfLogs) {
    this.maxNumberOfLogs = maxNumberOfLogs;
  }

  public LimitParameters maxNumberOfEvents(String maxNumberOfEvents) {
    
    this.maxNumberOfEvents = maxNumberOfEvents;
    return this;
  }

  /**
   * A decimal string-encoded 64-bit unsigned integer, representing the configured maximum count of events emitted during a single transaction&#39;s execution. 
   * @return maxNumberOfEvents
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxNumberOfEvents() {
    return maxNumberOfEvents;
  }


  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxNumberOfEvents(String maxNumberOfEvents) {
    this.maxNumberOfEvents = maxNumberOfEvents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitParameters limitParameters = (LimitParameters) o;
    return Objects.equals(this.maxCallDepth, limitParameters.maxCallDepth) &&
        Objects.equals(this.maxHeapSubstateTotalBytes, limitParameters.maxHeapSubstateTotalBytes) &&
        Objects.equals(this.maxTrackSubstateTotalBytes, limitParameters.maxTrackSubstateTotalBytes) &&
        Objects.equals(this.maxSubstateKeySize, limitParameters.maxSubstateKeySize) &&
        Objects.equals(this.maxSubstateValueSize, limitParameters.maxSubstateValueSize) &&
        Objects.equals(this.maxInvokeInputSize, limitParameters.maxInvokeInputSize) &&
        Objects.equals(this.maxEventSize, limitParameters.maxEventSize) &&
        Objects.equals(this.maxLogSize, limitParameters.maxLogSize) &&
        Objects.equals(this.maxPanicMessageSize, limitParameters.maxPanicMessageSize) &&
        Objects.equals(this.maxNumberOfLogs, limitParameters.maxNumberOfLogs) &&
        Objects.equals(this.maxNumberOfEvents, limitParameters.maxNumberOfEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCallDepth, maxHeapSubstateTotalBytes, maxTrackSubstateTotalBytes, maxSubstateKeySize, maxSubstateValueSize, maxInvokeInputSize, maxEventSize, maxLogSize, maxPanicMessageSize, maxNumberOfLogs, maxNumberOfEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitParameters {\n");
    sb.append("    maxCallDepth: ").append(toIndentedString(maxCallDepth)).append("\n");
    sb.append("    maxHeapSubstateTotalBytes: ").append(toIndentedString(maxHeapSubstateTotalBytes)).append("\n");
    sb.append("    maxTrackSubstateTotalBytes: ").append(toIndentedString(maxTrackSubstateTotalBytes)).append("\n");
    sb.append("    maxSubstateKeySize: ").append(toIndentedString(maxSubstateKeySize)).append("\n");
    sb.append("    maxSubstateValueSize: ").append(toIndentedString(maxSubstateValueSize)).append("\n");
    sb.append("    maxInvokeInputSize: ").append(toIndentedString(maxInvokeInputSize)).append("\n");
    sb.append("    maxEventSize: ").append(toIndentedString(maxEventSize)).append("\n");
    sb.append("    maxLogSize: ").append(toIndentedString(maxLogSize)).append("\n");
    sb.append("    maxPanicMessageSize: ").append(toIndentedString(maxPanicMessageSize)).append("\n");
    sb.append("    maxNumberOfLogs: ").append(toIndentedString(maxNumberOfLogs)).append("\n");
    sb.append("    maxNumberOfEvents: ").append(toIndentedString(maxNumberOfEvents)).append("\n");
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

    // add `max_call_depth` to the URL query string
    if (getMaxCallDepth() != null) {
      try {
        joiner.add(String.format("%smax_call_depth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxCallDepth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_heap_substate_total_bytes` to the URL query string
    if (getMaxHeapSubstateTotalBytes() != null) {
      try {
        joiner.add(String.format("%smax_heap_substate_total_bytes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxHeapSubstateTotalBytes()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_track_substate_total_bytes` to the URL query string
    if (getMaxTrackSubstateTotalBytes() != null) {
      try {
        joiner.add(String.format("%smax_track_substate_total_bytes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxTrackSubstateTotalBytes()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_substate_key_size` to the URL query string
    if (getMaxSubstateKeySize() != null) {
      try {
        joiner.add(String.format("%smax_substate_key_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxSubstateKeySize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_substate_value_size` to the URL query string
    if (getMaxSubstateValueSize() != null) {
      try {
        joiner.add(String.format("%smax_substate_value_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxSubstateValueSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_invoke_input_size` to the URL query string
    if (getMaxInvokeInputSize() != null) {
      try {
        joiner.add(String.format("%smax_invoke_input_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxInvokeInputSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_event_size` to the URL query string
    if (getMaxEventSize() != null) {
      try {
        joiner.add(String.format("%smax_event_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxEventSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_log_size` to the URL query string
    if (getMaxLogSize() != null) {
      try {
        joiner.add(String.format("%smax_log_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxLogSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_panic_message_size` to the URL query string
    if (getMaxPanicMessageSize() != null) {
      try {
        joiner.add(String.format("%smax_panic_message_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxPanicMessageSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_number_of_logs` to the URL query string
    if (getMaxNumberOfLogs() != null) {
      try {
        joiner.add(String.format("%smax_number_of_logs%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxNumberOfLogs()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_number_of_events` to the URL query string
    if (getMaxNumberOfEvents() != null) {
      try {
        joiner.add(String.format("%smax_number_of_events%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxNumberOfEvents()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

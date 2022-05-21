/*
 * Radix Gateway API
 * This API is designed to enable clients to efficiently query information on the RadixDLT ledger, and allow clients to simply build and submit transactions to the network.  The API is designed for use by the Radix Foundation's [Desktop Wallet](https://wallet.radixdlt.com/) and [Explorer](https://explorer.radixdlt.com/), and replaces the original Olympia \"Archive Node API\".  # Gateway API Overview  The Gateway API is separated into distinct groupings:  * `/gateway` - Information about the Gateway API status * `/account/_*` - To query account-related information * `/token/_*` - To query token-related information * `/validator/_*` and `/validators` - To query validator-related information * `/transaction/_*` - To build, finalize and submit transactions, and to read the status and content of submitted and on-ledger transactions. * `/custom/_*` - Additional endpoints that are an unofficial extensions to the Gateway API and available only at some API providers (e.g. `https://radix.live`),           or as a custom build from a [forked repository](https://github.com/Radix-Live/radixdlt-network-gateway)  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/radixdlt-network-gateway), which is configured to read from full node/s to extract and index data from the network.  # Gateway API Format  The API is designed in a JSON-RPC style, using HTTP as a transport layer, which means that:  * All requests are POST requests. * Any error is returned with an HTTP status code of 500, with a returned error object.   * The error object contains an HTTP-like `code`   * The error object also contains a structured/typed `details` sub-object, with a `type` discriminator, allowing for structured error interpretation in clients.  # Comparison to other Radix APIs  * [Core API](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/radixdlt/radixdlt/main/radixdlt-core/radixdlt/src/main/java/com/radixdlt/api/core/api.yaml) - The Core API is a low level API exposed by full nodes, and designed for use on internal networks. It is primarily designed for network integrations such as exchanges, ledger analytics providers, or hosted ledger data dashboards. The Core API provides endpoints for reading the mempool, constructing transactions and also exposes a stream of committed transactions.  * [System API](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/radixdlt/radixdlt/main/radixdlt-core/radixdlt/src/main/java/com/radixdlt/api/system/api.yaml) - The System API is a private API exposed by full nodes to read system status.  The Gateway API offers a much wider range of query options and is more performant than the Core API. It is built on top of the Core API, ingesting data via the Core API transaction stream into a relational database.  The Gateway API transaction/construction endpoints operate with the concept of \"actions\" - these are higher-levels of intent compared with the Core API, which makes it easier for clients to use. The Core API should be used if you require more power/flexiblity for managing UTXOs, or submitting transactions which can't be mapped to a Gateway API action. 
 *
 * The version of the OpenAPI document: 1.1.2-L
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NotSyncedUpErrorAllOf
 */
@JsonPropertyOrder({
  NotSyncedUpErrorAllOf.JSON_PROPERTY_REQUEST_TYPE,
  NotSyncedUpErrorAllOf.JSON_PROPERTY_CURRENT_SYNC_DELAY_SECONDS,
  NotSyncedUpErrorAllOf.JSON_PROPERTY_MAX_ALLOWED_SYNC_DELAY_SECONDS
})
@JsonTypeName("NotSyncedUpError_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-21T06:41:39.744899+03:00[Europe/Kiev]")
public class NotSyncedUpErrorAllOf {
  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private String requestType;

  public static final String JSON_PROPERTY_CURRENT_SYNC_DELAY_SECONDS = "current_sync_delay_seconds";
  private Long currentSyncDelaySeconds;

  public static final String JSON_PROPERTY_MAX_ALLOWED_SYNC_DELAY_SECONDS = "max_allowed_sync_delay_seconds";
  private Long maxAllowedSyncDelaySeconds;

  public NotSyncedUpErrorAllOf() { 
  }

  public NotSyncedUpErrorAllOf requestType(String requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * The request type that triggered this exception.
   * @return requestType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The request type that triggered this exception.")
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRequestType() {
    return requestType;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public NotSyncedUpErrorAllOf currentSyncDelaySeconds(Long currentSyncDelaySeconds) {
    
    this.currentSyncDelaySeconds = currentSyncDelaySeconds;
    return this;
  }

   /**
   * The current delay between the Gateway DB and the network ledger round timestamp.
   * @return currentSyncDelaySeconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The current delay between the Gateway DB and the network ledger round timestamp.")
  @JsonProperty(JSON_PROPERTY_CURRENT_SYNC_DELAY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCurrentSyncDelaySeconds() {
    return currentSyncDelaySeconds;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_SYNC_DELAY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentSyncDelaySeconds(Long currentSyncDelaySeconds) {
    this.currentSyncDelaySeconds = currentSyncDelaySeconds;
  }


  public NotSyncedUpErrorAllOf maxAllowedSyncDelaySeconds(Long maxAllowedSyncDelaySeconds) {
    
    this.maxAllowedSyncDelaySeconds = maxAllowedSyncDelaySeconds;
    return this;
  }

   /**
   * The maximum allowed delay between the Gateway DB and the network ledger round timestamp for this &#x60;request_type&#x60;.
   * @return maxAllowedSyncDelaySeconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The maximum allowed delay between the Gateway DB and the network ledger round timestamp for this `request_type`.")
  @JsonProperty(JSON_PROPERTY_MAX_ALLOWED_SYNC_DELAY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getMaxAllowedSyncDelaySeconds() {
    return maxAllowedSyncDelaySeconds;
  }


  @JsonProperty(JSON_PROPERTY_MAX_ALLOWED_SYNC_DELAY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxAllowedSyncDelaySeconds(Long maxAllowedSyncDelaySeconds) {
    this.maxAllowedSyncDelaySeconds = maxAllowedSyncDelaySeconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotSyncedUpErrorAllOf notSyncedUpErrorAllOf = (NotSyncedUpErrorAllOf) o;
    return Objects.equals(this.requestType, notSyncedUpErrorAllOf.requestType) &&
        Objects.equals(this.currentSyncDelaySeconds, notSyncedUpErrorAllOf.currentSyncDelaySeconds) &&
        Objects.equals(this.maxAllowedSyncDelaySeconds, notSyncedUpErrorAllOf.maxAllowedSyncDelaySeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, currentSyncDelaySeconds, maxAllowedSyncDelaySeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotSyncedUpErrorAllOf {\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    currentSyncDelaySeconds: ").append(toIndentedString(currentSyncDelaySeconds)).append("\n");
    sb.append("    maxAllowedSyncDelaySeconds: ").append(toIndentedString(maxAllowedSyncDelaySeconds)).append("\n");
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

}

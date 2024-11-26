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
import live.radix.core.model.ActiveValidatorIndex;
import live.radix.core.model.InstantMs;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ConsensusManagerFieldStateValue
 */
@JsonPropertyOrder({
  ConsensusManagerFieldStateValue.JSON_PROPERTY_EPOCH,
  ConsensusManagerFieldStateValue.JSON_PROPERTY_ROUND,
  ConsensusManagerFieldStateValue.JSON_PROPERTY_IS_STARTED,
  ConsensusManagerFieldStateValue.JSON_PROPERTY_EFFECTIVE_EPOCH_START,
  ConsensusManagerFieldStateValue.JSON_PROPERTY_ACTUAL_EPOCH_START,
  ConsensusManagerFieldStateValue.JSON_PROPERTY_CURRENT_LEADER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ConsensusManagerFieldStateValue {
  public static final String JSON_PROPERTY_EPOCH = "epoch";
  private Long epoch;

  public static final String JSON_PROPERTY_ROUND = "round";
  private Long round;

  public static final String JSON_PROPERTY_IS_STARTED = "is_started";
  private Boolean isStarted;

  public static final String JSON_PROPERTY_EFFECTIVE_EPOCH_START = "effective_epoch_start";
  private InstantMs effectiveEpochStart;

  public static final String JSON_PROPERTY_ACTUAL_EPOCH_START = "actual_epoch_start";
  private InstantMs actualEpochStart;

  public static final String JSON_PROPERTY_CURRENT_LEADER = "current_leader";
  private ActiveValidatorIndex currentLeader;

  public ConsensusManagerFieldStateValue() {
  }

  public ConsensusManagerFieldStateValue epoch(Long epoch) {
    
    this.epoch = epoch;
    return this;
  }

  /**
   * An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the current epoch
   * minimum: 0
   * maximum: 10000000000
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

  public ConsensusManagerFieldStateValue round(Long round) {
    
    this.round = round;
    return this;
  }

  /**
   * An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the current round in an epoch
   * minimum: 0
   * maximum: 10000000000
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

  public ConsensusManagerFieldStateValue isStarted(Boolean isStarted) {
    
    this.isStarted = isStarted;
    return this;
  }

  /**
   * Get isStarted
   * @return isStarted
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_STARTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsStarted() {
    return isStarted;
  }


  @JsonProperty(JSON_PROPERTY_IS_STARTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsStarted(Boolean isStarted) {
    this.isStarted = isStarted;
  }

  public ConsensusManagerFieldStateValue effectiveEpochStart(InstantMs effectiveEpochStart) {
    
    this.effectiveEpochStart = effectiveEpochStart;
    return this;
  }

  /**
   * The effective time the epoch started. A drift-free measure, used to work out when the epoch should ideally end.   Note: in abnormal cases (e.g. Byzantine network quorum), this on-ledger field may be set to an arbitrary, extreme value allowed by 64-bit signed integer. The API will still clamp the timestamp to &#x60;0 &lt;&#x3D; ms &lt;&#x3D; 100000000000000 (&#x3D;&#x3D; 10^14)&#x60;, which translates to &#x60;1970-01-01T00:00:00.000Z &lt;&#x3D; t &lt;&#x3D; 5138-11-16T09:46:40.000Z&#x60;. 
   * @return effectiveEpochStart
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_EPOCH_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InstantMs getEffectiveEpochStart() {
    return effectiveEpochStart;
  }


  @JsonProperty(JSON_PROPERTY_EFFECTIVE_EPOCH_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEffectiveEpochStart(InstantMs effectiveEpochStart) {
    this.effectiveEpochStart = effectiveEpochStart;
  }

  public ConsensusManagerFieldStateValue actualEpochStart(InstantMs actualEpochStart) {
    
    this.actualEpochStart = actualEpochStart;
    return this;
  }

  /**
   * The actual time the epoch started. Not used by any logic, but the difference between this and the effective start gives a measure of the time it took for the end-of-epoch to be noticed.  Note: in abnormal cases (e.g. Byzantine network quorum), this on-ledger field may be set to an arbitrary, extreme value allowed by 64-bit signed integer. The API will still clamp the timestamp to &#x60;0 &lt;&#x3D; ms &lt;&#x3D; 100000000000000 (&#x3D;&#x3D; 10^14)&#x60;, which translates to &#x60;1970-01-01T00:00:00.000Z &lt;&#x3D; t &lt;&#x3D; 5138-11-16T09:46:40.000Z&#x60;. 
   * @return actualEpochStart
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTUAL_EPOCH_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InstantMs getActualEpochStart() {
    return actualEpochStart;
  }


  @JsonProperty(JSON_PROPERTY_ACTUAL_EPOCH_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActualEpochStart(InstantMs actualEpochStart) {
    this.actualEpochStart = actualEpochStart;
  }

  public ConsensusManagerFieldStateValue currentLeader(ActiveValidatorIndex currentLeader) {
    
    this.currentLeader = currentLeader;
    return this;
  }

  /**
   * Get currentLeader
   * @return currentLeader
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_LEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActiveValidatorIndex getCurrentLeader() {
    return currentLeader;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_LEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentLeader(ActiveValidatorIndex currentLeader) {
    this.currentLeader = currentLeader;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsensusManagerFieldStateValue consensusManagerFieldStateValue = (ConsensusManagerFieldStateValue) o;
    return Objects.equals(this.epoch, consensusManagerFieldStateValue.epoch) &&
        Objects.equals(this.round, consensusManagerFieldStateValue.round) &&
        Objects.equals(this.isStarted, consensusManagerFieldStateValue.isStarted) &&
        Objects.equals(this.effectiveEpochStart, consensusManagerFieldStateValue.effectiveEpochStart) &&
        Objects.equals(this.actualEpochStart, consensusManagerFieldStateValue.actualEpochStart) &&
        Objects.equals(this.currentLeader, consensusManagerFieldStateValue.currentLeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epoch, round, isStarted, effectiveEpochStart, actualEpochStart, currentLeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsensusManagerFieldStateValue {\n");
    sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    isStarted: ").append(toIndentedString(isStarted)).append("\n");
    sb.append("    effectiveEpochStart: ").append(toIndentedString(effectiveEpochStart)).append("\n");
    sb.append("    actualEpochStart: ").append(toIndentedString(actualEpochStart)).append("\n");
    sb.append("    currentLeader: ").append(toIndentedString(currentLeader)).append("\n");
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

    // add `is_started` to the URL query string
    if (isIsStarted() != null) {
      try {
        joiner.add(String.format("%sis_started%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsStarted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `effective_epoch_start` to the URL query string
    if (getEffectiveEpochStart() != null) {
      joiner.add(getEffectiveEpochStart().toUrlQueryString(prefix + "effective_epoch_start" + suffix));
    }

    // add `actual_epoch_start` to the URL query string
    if (getActualEpochStart() != null) {
      joiner.add(getActualEpochStart().toUrlQueryString(prefix + "actual_epoch_start" + suffix));
    }

    // add `current_leader` to the URL query string
    if (getCurrentLeader() != null) {
      joiner.add(getCurrentLeader().toUrlQueryString(prefix + "current_leader" + suffix));
    }

    return joiner.toString();
  }

}


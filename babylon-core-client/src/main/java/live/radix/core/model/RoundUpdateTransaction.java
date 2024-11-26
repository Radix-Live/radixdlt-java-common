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
import live.radix.core.model.InstantMs;
import live.radix.core.model.LeaderProposalHistory;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RoundUpdateTransaction
 */
@JsonPropertyOrder({
  RoundUpdateTransaction.JSON_PROPERTY_PROPOSER_TIMESTAMP,
  RoundUpdateTransaction.JSON_PROPERTY_EPOCH,
  RoundUpdateTransaction.JSON_PROPERTY_ROUND_IN_EPOCH,
  RoundUpdateTransaction.JSON_PROPERTY_LEADER_PROPOSAL_HISTORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class RoundUpdateTransaction {
  public static final String JSON_PROPERTY_PROPOSER_TIMESTAMP = "proposer_timestamp";
  private InstantMs proposerTimestamp;

  public static final String JSON_PROPERTY_EPOCH = "epoch";
  private Long epoch;

  public static final String JSON_PROPERTY_ROUND_IN_EPOCH = "round_in_epoch";
  private Long roundInEpoch;

  public static final String JSON_PROPERTY_LEADER_PROPOSAL_HISTORY = "leader_proposal_history";
  private LeaderProposalHistory leaderProposalHistory;

  public RoundUpdateTransaction() {
  }

  public RoundUpdateTransaction proposerTimestamp(InstantMs proposerTimestamp) {
    
    this.proposerTimestamp = proposerTimestamp;
    return this;
  }

  /**
   * The round proposer&#39;s timestamp.  Note: in abnormal cases (e.g. Byzantine network quorum), this on-ledger field may be set to an arbitrary, extreme value allowed by 64-bit signed integer. The API will still clamp the timestamp to &#x60;0 &lt;&#x3D; ms &lt;&#x3D; 100000000000000 (&#x3D;&#x3D; 10^14)&#x60;, which translates to &#x60;1970-01-01T00:00:00.000Z &lt;&#x3D; t &lt;&#x3D; 5138-11-16T09:46:40.000Z&#x60;. 
   * @return proposerTimestamp
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROPOSER_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InstantMs getProposerTimestamp() {
    return proposerTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_PROPOSER_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProposerTimestamp(InstantMs proposerTimestamp) {
    this.proposerTimestamp = proposerTimestamp;
  }

  public RoundUpdateTransaction epoch(Long epoch) {
    
    this.epoch = epoch;
    return this;
  }

  /**
   * An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the epoch. 
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

  public RoundUpdateTransaction roundInEpoch(Long roundInEpoch) {
    
    this.roundInEpoch = roundInEpoch;
    return this;
  }

  /**
   * An integer between &#x60;0&#x60; and &#x60;10^10&#x60;, marking the consensus round in the epoch
   * minimum: 0
   * maximum: 10000000000
   * @return roundInEpoch
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUND_IN_EPOCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getRoundInEpoch() {
    return roundInEpoch;
  }


  @JsonProperty(JSON_PROPERTY_ROUND_IN_EPOCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoundInEpoch(Long roundInEpoch) {
    this.roundInEpoch = roundInEpoch;
  }

  public RoundUpdateTransaction leaderProposalHistory(LeaderProposalHistory leaderProposalHistory) {
    
    this.leaderProposalHistory = leaderProposalHistory;
    return this;
  }

  /**
   * A recent history (i.e. since the previous &#x60;RoundUpdateValidatorTransaction&#x60;) of consensus round leaders&#39; reliability. Used for validator emissions calculation.
   * @return leaderProposalHistory
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LEADER_PROPOSAL_HISTORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LeaderProposalHistory getLeaderProposalHistory() {
    return leaderProposalHistory;
  }


  @JsonProperty(JSON_PROPERTY_LEADER_PROPOSAL_HISTORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLeaderProposalHistory(LeaderProposalHistory leaderProposalHistory) {
    this.leaderProposalHistory = leaderProposalHistory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoundUpdateTransaction roundUpdateTransaction = (RoundUpdateTransaction) o;
    return Objects.equals(this.proposerTimestamp, roundUpdateTransaction.proposerTimestamp) &&
        Objects.equals(this.epoch, roundUpdateTransaction.epoch) &&
        Objects.equals(this.roundInEpoch, roundUpdateTransaction.roundInEpoch) &&
        Objects.equals(this.leaderProposalHistory, roundUpdateTransaction.leaderProposalHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposerTimestamp, epoch, roundInEpoch, leaderProposalHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoundUpdateTransaction {\n");
    sb.append("    proposerTimestamp: ").append(toIndentedString(proposerTimestamp)).append("\n");
    sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
    sb.append("    roundInEpoch: ").append(toIndentedString(roundInEpoch)).append("\n");
    sb.append("    leaderProposalHistory: ").append(toIndentedString(leaderProposalHistory)).append("\n");
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

    // add `proposer_timestamp` to the URL query string
    if (getProposerTimestamp() != null) {
      joiner.add(getProposerTimestamp().toUrlQueryString(prefix + "proposer_timestamp" + suffix));
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

    // add `round_in_epoch` to the URL query string
    if (getRoundInEpoch() != null) {
      try {
        joiner.add(String.format("%sround_in_epoch%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoundInEpoch()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `leader_proposal_history` to the URL query string
    if (getLeaderProposalHistory() != null) {
      joiner.add(getLeaderProposalHistory().toUrlQueryString(prefix + "leader_proposal_history" + suffix));
    }

    return joiner.toString();
  }

}


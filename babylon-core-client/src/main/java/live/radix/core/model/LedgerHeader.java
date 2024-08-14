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
import live.radix.core.model.LedgerHashes;
import live.radix.core.model.NextEpoch;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * LedgerHeader
 */
@JsonPropertyOrder({
  LedgerHeader.JSON_PROPERTY_EPOCH,
  LedgerHeader.JSON_PROPERTY_ROUND,
  LedgerHeader.JSON_PROPERTY_STATE_VERSION,
  LedgerHeader.JSON_PROPERTY_HASHES,
  LedgerHeader.JSON_PROPERTY_CONSENSUS_PARENT_ROUND_TIMESTAMP_MS,
  LedgerHeader.JSON_PROPERTY_PROPOSER_TIMESTAMP_MS,
  LedgerHeader.JSON_PROPERTY_NEXT_EPOCH,
  LedgerHeader.JSON_PROPERTY_NEXT_PROTOCOL_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class LedgerHeader {
  public static final String JSON_PROPERTY_EPOCH = "epoch";
  private Long epoch;

  public static final String JSON_PROPERTY_ROUND = "round";
  private Long round;

  public static final String JSON_PROPERTY_STATE_VERSION = "state_version";
  private Long stateVersion;

  public static final String JSON_PROPERTY_HASHES = "hashes";
  private LedgerHashes hashes;

  public static final String JSON_PROPERTY_CONSENSUS_PARENT_ROUND_TIMESTAMP_MS = "consensus_parent_round_timestamp_ms";
  private Long consensusParentRoundTimestampMs;

  public static final String JSON_PROPERTY_PROPOSER_TIMESTAMP_MS = "proposer_timestamp_ms";
  private Long proposerTimestampMs;

  public static final String JSON_PROPERTY_NEXT_EPOCH = "next_epoch";
  private NextEpoch nextEpoch;

  public static final String JSON_PROPERTY_NEXT_PROTOCOL_VERSION = "next_protocol_version";
  private String nextProtocolVersion;

  public LedgerHeader() {
  }

  public LedgerHeader epoch(Long epoch) {
    
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

  public LedgerHeader round(Long round) {
    
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

  public LedgerHeader stateVersion(Long stateVersion) {
    
    this.stateVersion = stateVersion;
    return this;
  }

  /**
   * Get stateVersion
   * minimum: 1
   * maximum: 100000000000000
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

  public LedgerHeader hashes(LedgerHashes hashes) {
    
    this.hashes = hashes;
    return this;
  }

  /**
   * Get hashes
   * @return hashes
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HASHES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LedgerHashes getHashes() {
    return hashes;
  }


  @JsonProperty(JSON_PROPERTY_HASHES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHashes(LedgerHashes hashes) {
    this.hashes = hashes;
  }

  public LedgerHeader consensusParentRoundTimestampMs(Long consensusParentRoundTimestampMs) {
    
    this.consensusParentRoundTimestampMs = consensusParentRoundTimestampMs;
    return this;
  }

  /**
   * An integer between &#x60;0&#x60; and &#x60;10^14&#x60;, marking the consensus parent round timestamp in ms.
   * minimum: 0
   * maximum: 100000000000000
   * @return consensusParentRoundTimestampMs
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONSENSUS_PARENT_ROUND_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getConsensusParentRoundTimestampMs() {
    return consensusParentRoundTimestampMs;
  }


  @JsonProperty(JSON_PROPERTY_CONSENSUS_PARENT_ROUND_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsensusParentRoundTimestampMs(Long consensusParentRoundTimestampMs) {
    this.consensusParentRoundTimestampMs = consensusParentRoundTimestampMs;
  }

  public LedgerHeader proposerTimestampMs(Long proposerTimestampMs) {
    
    this.proposerTimestampMs = proposerTimestampMs;
    return this;
  }

  /**
   * An integer between &#x60;0&#x60; and &#x60;10^14&#x60;, marking the proposer timestamp in ms.
   * minimum: 0
   * maximum: 100000000000000
   * @return proposerTimestampMs
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROPOSER_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getProposerTimestampMs() {
    return proposerTimestampMs;
  }


  @JsonProperty(JSON_PROPERTY_PROPOSER_TIMESTAMP_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProposerTimestampMs(Long proposerTimestampMs) {
    this.proposerTimestampMs = proposerTimestampMs;
  }

  public LedgerHeader nextEpoch(NextEpoch nextEpoch) {
    
    this.nextEpoch = nextEpoch;
    return this;
  }

  /**
   * Get nextEpoch
   * @return nextEpoch
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_EPOCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NextEpoch getNextEpoch() {
    return nextEpoch;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_EPOCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextEpoch(NextEpoch nextEpoch) {
    this.nextEpoch = nextEpoch;
  }

  public LedgerHeader nextProtocolVersion(String nextProtocolVersion) {
    
    this.nextProtocolVersion = nextProtocolVersion;
    return this;
  }

  /**
   * If present, indicates that this proof triggers the enactment of the given protocol version.
   * @return nextProtocolVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_PROTOCOL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextProtocolVersion() {
    return nextProtocolVersion;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_PROTOCOL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextProtocolVersion(String nextProtocolVersion) {
    this.nextProtocolVersion = nextProtocolVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LedgerHeader ledgerHeader = (LedgerHeader) o;
    return Objects.equals(this.epoch, ledgerHeader.epoch) &&
        Objects.equals(this.round, ledgerHeader.round) &&
        Objects.equals(this.stateVersion, ledgerHeader.stateVersion) &&
        Objects.equals(this.hashes, ledgerHeader.hashes) &&
        Objects.equals(this.consensusParentRoundTimestampMs, ledgerHeader.consensusParentRoundTimestampMs) &&
        Objects.equals(this.proposerTimestampMs, ledgerHeader.proposerTimestampMs) &&
        Objects.equals(this.nextEpoch, ledgerHeader.nextEpoch) &&
        Objects.equals(this.nextProtocolVersion, ledgerHeader.nextProtocolVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epoch, round, stateVersion, hashes, consensusParentRoundTimestampMs, proposerTimestampMs, nextEpoch, nextProtocolVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LedgerHeader {\n");
    sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    stateVersion: ").append(toIndentedString(stateVersion)).append("\n");
    sb.append("    hashes: ").append(toIndentedString(hashes)).append("\n");
    sb.append("    consensusParentRoundTimestampMs: ").append(toIndentedString(consensusParentRoundTimestampMs)).append("\n");
    sb.append("    proposerTimestampMs: ").append(toIndentedString(proposerTimestampMs)).append("\n");
    sb.append("    nextEpoch: ").append(toIndentedString(nextEpoch)).append("\n");
    sb.append("    nextProtocolVersion: ").append(toIndentedString(nextProtocolVersion)).append("\n");
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

    // add `state_version` to the URL query string
    if (getStateVersion() != null) {
      try {
        joiner.add(String.format("%sstate_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStateVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hashes` to the URL query string
    if (getHashes() != null) {
      joiner.add(getHashes().toUrlQueryString(prefix + "hashes" + suffix));
    }

    // add `consensus_parent_round_timestamp_ms` to the URL query string
    if (getConsensusParentRoundTimestampMs() != null) {
      try {
        joiner.add(String.format("%sconsensus_parent_round_timestamp_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsensusParentRoundTimestampMs()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `proposer_timestamp_ms` to the URL query string
    if (getProposerTimestampMs() != null) {
      try {
        joiner.add(String.format("%sproposer_timestamp_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProposerTimestampMs()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `next_epoch` to the URL query string
    if (getNextEpoch() != null) {
      joiner.add(getNextEpoch().toUrlQueryString(prefix + "next_epoch" + suffix));
    }

    // add `next_protocol_version` to the URL query string
    if (getNextProtocolVersion() != null) {
      try {
        joiner.add(String.format("%snext_protocol_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextProtocolVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


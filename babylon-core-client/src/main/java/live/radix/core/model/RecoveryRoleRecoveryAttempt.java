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
import live.radix.core.model.RecoveryProposal;
import live.radix.core.model.ScryptoInstant;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RecoveryRoleRecoveryAttempt
 */
@JsonPropertyOrder({
  RecoveryRoleRecoveryAttempt.JSON_PROPERTY_RECOVERY_PROPOSAL,
  RecoveryRoleRecoveryAttempt.JSON_PROPERTY_ALLOW_TIMED_RECOVERY_AFTER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class RecoveryRoleRecoveryAttempt {
  public static final String JSON_PROPERTY_RECOVERY_PROPOSAL = "recovery_proposal";
  private RecoveryProposal recoveryProposal;

  public static final String JSON_PROPERTY_ALLOW_TIMED_RECOVERY_AFTER = "allow_timed_recovery_after";
  private ScryptoInstant allowTimedRecoveryAfter;

  public RecoveryRoleRecoveryAttempt() {
  }

  public RecoveryRoleRecoveryAttempt recoveryProposal(RecoveryProposal recoveryProposal) {
    
    this.recoveryProposal = recoveryProposal;
    return this;
  }

  /**
   * A new set of rules being proposed for different roles.
   * @return recoveryProposal
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECOVERY_PROPOSAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RecoveryProposal getRecoveryProposal() {
    return recoveryProposal;
  }


  @JsonProperty(JSON_PROPERTY_RECOVERY_PROPOSAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecoveryProposal(RecoveryProposal recoveryProposal) {
    this.recoveryProposal = recoveryProposal;
  }

  public RecoveryRoleRecoveryAttempt allowTimedRecoveryAfter(ScryptoInstant allowTimedRecoveryAfter) {
    
    this.allowTimedRecoveryAfter = allowTimedRecoveryAfter;
    return this;
  }

  /**
   * The time after which the recovery is allowed. Only present if this is a timed recovery.
   * @return allowTimedRecoveryAfter
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_TIMED_RECOVERY_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScryptoInstant getAllowTimedRecoveryAfter() {
    return allowTimedRecoveryAfter;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_TIMED_RECOVERY_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowTimedRecoveryAfter(ScryptoInstant allowTimedRecoveryAfter) {
    this.allowTimedRecoveryAfter = allowTimedRecoveryAfter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecoveryRoleRecoveryAttempt recoveryRoleRecoveryAttempt = (RecoveryRoleRecoveryAttempt) o;
    return Objects.equals(this.recoveryProposal, recoveryRoleRecoveryAttempt.recoveryProposal) &&
        Objects.equals(this.allowTimedRecoveryAfter, recoveryRoleRecoveryAttempt.allowTimedRecoveryAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recoveryProposal, allowTimedRecoveryAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoveryRoleRecoveryAttempt {\n");
    sb.append("    recoveryProposal: ").append(toIndentedString(recoveryProposal)).append("\n");
    sb.append("    allowTimedRecoveryAfter: ").append(toIndentedString(allowTimedRecoveryAfter)).append("\n");
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

    // add `recovery_proposal` to the URL query string
    if (getRecoveryProposal() != null) {
      joiner.add(getRecoveryProposal().toUrlQueryString(prefix + "recovery_proposal" + suffix));
    }

    // add `allow_timed_recovery_after` to the URL query string
    if (getAllowTimedRecoveryAfter() != null) {
      joiner.add(getAllowTimedRecoveryAfter().toUrlQueryString(prefix + "allow_timed_recovery_after" + suffix));
    }

    return joiner.toString();
  }

}


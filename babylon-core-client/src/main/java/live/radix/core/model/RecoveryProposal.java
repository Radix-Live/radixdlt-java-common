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
import live.radix.core.model.AccessRule;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RecoveryProposal
 */
@JsonPropertyOrder({
  RecoveryProposal.JSON_PROPERTY_PRIMARY_ROLE,
  RecoveryProposal.JSON_PROPERTY_RECOVERY_ROLE,
  RecoveryProposal.JSON_PROPERTY_CONFIRMATION_ROLE,
  RecoveryProposal.JSON_PROPERTY_TIMED_RECOVERY_DELAY_MINUTES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class RecoveryProposal {
  public static final String JSON_PROPERTY_PRIMARY_ROLE = "primary_role";
  private AccessRule primaryRole;

  public static final String JSON_PROPERTY_RECOVERY_ROLE = "recovery_role";
  private AccessRule recoveryRole;

  public static final String JSON_PROPERTY_CONFIRMATION_ROLE = "confirmation_role";
  private AccessRule confirmationRole;

  public static final String JSON_PROPERTY_TIMED_RECOVERY_DELAY_MINUTES = "timed_recovery_delay_minutes";
  private Long timedRecoveryDelayMinutes;

  public RecoveryProposal() {
  }

  public RecoveryProposal primaryRole(AccessRule primaryRole) {
    
    this.primaryRole = primaryRole;
    return this;
  }

  /**
   * Get primaryRole
   * @return primaryRole
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRIMARY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccessRule getPrimaryRole() {
    return primaryRole;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrimaryRole(AccessRule primaryRole) {
    this.primaryRole = primaryRole;
  }

  public RecoveryProposal recoveryRole(AccessRule recoveryRole) {
    
    this.recoveryRole = recoveryRole;
    return this;
  }

  /**
   * Get recoveryRole
   * @return recoveryRole
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECOVERY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccessRule getRecoveryRole() {
    return recoveryRole;
  }


  @JsonProperty(JSON_PROPERTY_RECOVERY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecoveryRole(AccessRule recoveryRole) {
    this.recoveryRole = recoveryRole;
  }

  public RecoveryProposal confirmationRole(AccessRule confirmationRole) {
    
    this.confirmationRole = confirmationRole;
    return this;
  }

  /**
   * Get confirmationRole
   * @return confirmationRole
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONFIRMATION_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccessRule getConfirmationRole() {
    return confirmationRole;
  }


  @JsonProperty(JSON_PROPERTY_CONFIRMATION_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfirmationRole(AccessRule confirmationRole) {
    this.confirmationRole = confirmationRole;
  }

  public RecoveryProposal timedRecoveryDelayMinutes(Long timedRecoveryDelayMinutes) {
    
    this.timedRecoveryDelayMinutes = timedRecoveryDelayMinutes;
    return this;
  }

  /**
   * An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, specifying the optional proposal delay of timed recoveries. 
   * minimum: 0
   * maximum: 4294967295
   * @return timedRecoveryDelayMinutes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMED_RECOVERY_DELAY_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimedRecoveryDelayMinutes() {
    return timedRecoveryDelayMinutes;
  }


  @JsonProperty(JSON_PROPERTY_TIMED_RECOVERY_DELAY_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimedRecoveryDelayMinutes(Long timedRecoveryDelayMinutes) {
    this.timedRecoveryDelayMinutes = timedRecoveryDelayMinutes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecoveryProposal recoveryProposal = (RecoveryProposal) o;
    return Objects.equals(this.primaryRole, recoveryProposal.primaryRole) &&
        Objects.equals(this.recoveryRole, recoveryProposal.recoveryRole) &&
        Objects.equals(this.confirmationRole, recoveryProposal.confirmationRole) &&
        Objects.equals(this.timedRecoveryDelayMinutes, recoveryProposal.timedRecoveryDelayMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryRole, recoveryRole, confirmationRole, timedRecoveryDelayMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoveryProposal {\n");
    sb.append("    primaryRole: ").append(toIndentedString(primaryRole)).append("\n");
    sb.append("    recoveryRole: ").append(toIndentedString(recoveryRole)).append("\n");
    sb.append("    confirmationRole: ").append(toIndentedString(confirmationRole)).append("\n");
    sb.append("    timedRecoveryDelayMinutes: ").append(toIndentedString(timedRecoveryDelayMinutes)).append("\n");
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

    // add `primary_role` to the URL query string
    if (getPrimaryRole() != null) {
      joiner.add(getPrimaryRole().toUrlQueryString(prefix + "primary_role" + suffix));
    }

    // add `recovery_role` to the URL query string
    if (getRecoveryRole() != null) {
      joiner.add(getRecoveryRole().toUrlQueryString(prefix + "recovery_role" + suffix));
    }

    // add `confirmation_role` to the URL query string
    if (getConfirmationRole() != null) {
      joiner.add(getConfirmationRole().toUrlQueryString(prefix + "confirmation_role" + suffix));
    }

    // add `timed_recovery_delay_minutes` to the URL query string
    if (getTimedRecoveryDelayMinutes() != null) {
      try {
        joiner.add(String.format("%stimed_recovery_delay_minutes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimedRecoveryDelayMinutes()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


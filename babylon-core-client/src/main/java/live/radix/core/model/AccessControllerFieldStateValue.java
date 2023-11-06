/*
 * Radix Core API - Babylon
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  The default configuration is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function. The node exposes a configuration flag which allows disabling certain endpoints which may be problematic, but monitoring is advised. This configuration parameter is `api.core.flags.enable_unbounded_endpoints` / `RADIXDLT_CORE_API_FLAGS_ENABLE_UNBOUNDED_ENDPOINTS`.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` have high guarantees of forward compatibility in future node versions. We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code.  Other endpoints may be changed with new node versions carrying protocol-updates, although any breaking changes will be flagged clearly in the corresponding release notes.  All responses may have additional fields added, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects. 
 *
 * The version of the OpenAPI document: v1.0.4
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
import live.radix.core.model.EntityReference;
import live.radix.core.model.PrimaryRoleRecoveryAttempt;
import live.radix.core.model.RecoveryRoleRecoveryAttempt;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AccessControllerFieldStateValue
 */
@JsonPropertyOrder({
  AccessControllerFieldStateValue.JSON_PROPERTY_CONTROLLED_VAULT,
  AccessControllerFieldStateValue.JSON_PROPERTY_TIMED_RECOVERY_DELAY_MINUTES,
  AccessControllerFieldStateValue.JSON_PROPERTY_RECOVERY_BADGE_RESOURCE_ADDRESS,
  AccessControllerFieldStateValue.JSON_PROPERTY_IS_PRIMARY_ROLE_LOCKED,
  AccessControllerFieldStateValue.JSON_PROPERTY_PRIMARY_ROLE_RECOVERY_ATTEMPT,
  AccessControllerFieldStateValue.JSON_PROPERTY_HAS_PRIMARY_ROLE_BADGE_WITHDRAW_ATTEMPT,
  AccessControllerFieldStateValue.JSON_PROPERTY_RECOVERY_ROLE_RECOVERY_ATTEMPT,
  AccessControllerFieldStateValue.JSON_PROPERTY_HAS_RECOVERY_ROLE_BADGE_WITHDRAW_ATTEMPT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:51:31.842802500+02:00[Europe/Kiev]")
public class AccessControllerFieldStateValue {
  public static final String JSON_PROPERTY_CONTROLLED_VAULT = "controlled_vault";
  private EntityReference controlledVault;

  public static final String JSON_PROPERTY_TIMED_RECOVERY_DELAY_MINUTES = "timed_recovery_delay_minutes";
  private Long timedRecoveryDelayMinutes;

  public static final String JSON_PROPERTY_RECOVERY_BADGE_RESOURCE_ADDRESS = "recovery_badge_resource_address";
  private String recoveryBadgeResourceAddress;

  public static final String JSON_PROPERTY_IS_PRIMARY_ROLE_LOCKED = "is_primary_role_locked";
  private Boolean isPrimaryRoleLocked;

  public static final String JSON_PROPERTY_PRIMARY_ROLE_RECOVERY_ATTEMPT = "primary_role_recovery_attempt";
  private PrimaryRoleRecoveryAttempt primaryRoleRecoveryAttempt;

  public static final String JSON_PROPERTY_HAS_PRIMARY_ROLE_BADGE_WITHDRAW_ATTEMPT = "has_primary_role_badge_withdraw_attempt";
  private Boolean hasPrimaryRoleBadgeWithdrawAttempt;

  public static final String JSON_PROPERTY_RECOVERY_ROLE_RECOVERY_ATTEMPT = "recovery_role_recovery_attempt";
  private RecoveryRoleRecoveryAttempt recoveryRoleRecoveryAttempt;

  public static final String JSON_PROPERTY_HAS_RECOVERY_ROLE_BADGE_WITHDRAW_ATTEMPT = "has_recovery_role_badge_withdraw_attempt";
  private Boolean hasRecoveryRoleBadgeWithdrawAttempt;

  public AccessControllerFieldStateValue() {
  }

  public AccessControllerFieldStateValue controlledVault(EntityReference controlledVault) {
    
    this.controlledVault = controlledVault;
    return this;
  }

   /**
   * Get controlledVault
   * @return controlledVault
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTROLLED_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EntityReference getControlledVault() {
    return controlledVault;
  }


  @JsonProperty(JSON_PROPERTY_CONTROLLED_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setControlledVault(EntityReference controlledVault) {
    this.controlledVault = controlledVault;
  }


  public AccessControllerFieldStateValue timedRecoveryDelayMinutes(Long timedRecoveryDelayMinutes) {
    
    this.timedRecoveryDelayMinutes = timedRecoveryDelayMinutes;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, specifying the amount of time (in minutes) that it takes for timed recovery to be done. When not present, then timed recovery can not be performed through this access controller. 
   * minimum: 0
   * maximum: 4294967295
   * @return timedRecoveryDelayMinutes
  **/
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


  public AccessControllerFieldStateValue recoveryBadgeResourceAddress(String recoveryBadgeResourceAddress) {
    
    this.recoveryBadgeResourceAddress = recoveryBadgeResourceAddress;
    return this;
  }

   /**
   * The Bech32m-encoded human readable version of the resource address
   * @return recoveryBadgeResourceAddress
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECOVERY_BADGE_RESOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRecoveryBadgeResourceAddress() {
    return recoveryBadgeResourceAddress;
  }


  @JsonProperty(JSON_PROPERTY_RECOVERY_BADGE_RESOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecoveryBadgeResourceAddress(String recoveryBadgeResourceAddress) {
    this.recoveryBadgeResourceAddress = recoveryBadgeResourceAddress;
  }


  public AccessControllerFieldStateValue isPrimaryRoleLocked(Boolean isPrimaryRoleLocked) {
    
    this.isPrimaryRoleLocked = isPrimaryRoleLocked;
    return this;
  }

   /**
   * Whether the primary role is currently locked.
   * @return isPrimaryRoleLocked
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_PRIMARY_ROLE_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsPrimaryRoleLocked() {
    return isPrimaryRoleLocked;
  }


  @JsonProperty(JSON_PROPERTY_IS_PRIMARY_ROLE_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsPrimaryRoleLocked(Boolean isPrimaryRoleLocked) {
    this.isPrimaryRoleLocked = isPrimaryRoleLocked;
  }


  public AccessControllerFieldStateValue primaryRoleRecoveryAttempt(PrimaryRoleRecoveryAttempt primaryRoleRecoveryAttempt) {
    
    this.primaryRoleRecoveryAttempt = primaryRoleRecoveryAttempt;
    return this;
  }

   /**
   * Get primaryRoleRecoveryAttempt
   * @return primaryRoleRecoveryAttempt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_ROLE_RECOVERY_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrimaryRoleRecoveryAttempt getPrimaryRoleRecoveryAttempt() {
    return primaryRoleRecoveryAttempt;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_ROLE_RECOVERY_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryRoleRecoveryAttempt(PrimaryRoleRecoveryAttempt primaryRoleRecoveryAttempt) {
    this.primaryRoleRecoveryAttempt = primaryRoleRecoveryAttempt;
  }


  public AccessControllerFieldStateValue hasPrimaryRoleBadgeWithdrawAttempt(Boolean hasPrimaryRoleBadgeWithdrawAttempt) {
    
    this.hasPrimaryRoleBadgeWithdrawAttempt = hasPrimaryRoleBadgeWithdrawAttempt;
    return this;
  }

   /**
   * Whether the primary role badge withdraw is currently being attempted.
   * @return hasPrimaryRoleBadgeWithdrawAttempt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_PRIMARY_ROLE_BADGE_WITHDRAW_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isHasPrimaryRoleBadgeWithdrawAttempt() {
    return hasPrimaryRoleBadgeWithdrawAttempt;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PRIMARY_ROLE_BADGE_WITHDRAW_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasPrimaryRoleBadgeWithdrawAttempt(Boolean hasPrimaryRoleBadgeWithdrawAttempt) {
    this.hasPrimaryRoleBadgeWithdrawAttempt = hasPrimaryRoleBadgeWithdrawAttempt;
  }


  public AccessControllerFieldStateValue recoveryRoleRecoveryAttempt(RecoveryRoleRecoveryAttempt recoveryRoleRecoveryAttempt) {
    
    this.recoveryRoleRecoveryAttempt = recoveryRoleRecoveryAttempt;
    return this;
  }

   /**
   * Get recoveryRoleRecoveryAttempt
   * @return recoveryRoleRecoveryAttempt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOVERY_ROLE_RECOVERY_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecoveryRoleRecoveryAttempt getRecoveryRoleRecoveryAttempt() {
    return recoveryRoleRecoveryAttempt;
  }


  @JsonProperty(JSON_PROPERTY_RECOVERY_ROLE_RECOVERY_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecoveryRoleRecoveryAttempt(RecoveryRoleRecoveryAttempt recoveryRoleRecoveryAttempt) {
    this.recoveryRoleRecoveryAttempt = recoveryRoleRecoveryAttempt;
  }


  public AccessControllerFieldStateValue hasRecoveryRoleBadgeWithdrawAttempt(Boolean hasRecoveryRoleBadgeWithdrawAttempt) {
    
    this.hasRecoveryRoleBadgeWithdrawAttempt = hasRecoveryRoleBadgeWithdrawAttempt;
    return this;
  }

   /**
   * Whether the recovery role badge withdraw is currently being attempted.
   * @return hasRecoveryRoleBadgeWithdrawAttempt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_RECOVERY_ROLE_BADGE_WITHDRAW_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isHasRecoveryRoleBadgeWithdrawAttempt() {
    return hasRecoveryRoleBadgeWithdrawAttempt;
  }


  @JsonProperty(JSON_PROPERTY_HAS_RECOVERY_ROLE_BADGE_WITHDRAW_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasRecoveryRoleBadgeWithdrawAttempt(Boolean hasRecoveryRoleBadgeWithdrawAttempt) {
    this.hasRecoveryRoleBadgeWithdrawAttempt = hasRecoveryRoleBadgeWithdrawAttempt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessControllerFieldStateValue accessControllerFieldStateValue = (AccessControllerFieldStateValue) o;
    return Objects.equals(this.controlledVault, accessControllerFieldStateValue.controlledVault) &&
        Objects.equals(this.timedRecoveryDelayMinutes, accessControllerFieldStateValue.timedRecoveryDelayMinutes) &&
        Objects.equals(this.recoveryBadgeResourceAddress, accessControllerFieldStateValue.recoveryBadgeResourceAddress) &&
        Objects.equals(this.isPrimaryRoleLocked, accessControllerFieldStateValue.isPrimaryRoleLocked) &&
        Objects.equals(this.primaryRoleRecoveryAttempt, accessControllerFieldStateValue.primaryRoleRecoveryAttempt) &&
        Objects.equals(this.hasPrimaryRoleBadgeWithdrawAttempt, accessControllerFieldStateValue.hasPrimaryRoleBadgeWithdrawAttempt) &&
        Objects.equals(this.recoveryRoleRecoveryAttempt, accessControllerFieldStateValue.recoveryRoleRecoveryAttempt) &&
        Objects.equals(this.hasRecoveryRoleBadgeWithdrawAttempt, accessControllerFieldStateValue.hasRecoveryRoleBadgeWithdrawAttempt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlledVault, timedRecoveryDelayMinutes, recoveryBadgeResourceAddress, isPrimaryRoleLocked, primaryRoleRecoveryAttempt, hasPrimaryRoleBadgeWithdrawAttempt, recoveryRoleRecoveryAttempt, hasRecoveryRoleBadgeWithdrawAttempt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessControllerFieldStateValue {\n");
    sb.append("    controlledVault: ").append(toIndentedString(controlledVault)).append("\n");
    sb.append("    timedRecoveryDelayMinutes: ").append(toIndentedString(timedRecoveryDelayMinutes)).append("\n");
    sb.append("    recoveryBadgeResourceAddress: ").append(toIndentedString(recoveryBadgeResourceAddress)).append("\n");
    sb.append("    isPrimaryRoleLocked: ").append(toIndentedString(isPrimaryRoleLocked)).append("\n");
    sb.append("    primaryRoleRecoveryAttempt: ").append(toIndentedString(primaryRoleRecoveryAttempt)).append("\n");
    sb.append("    hasPrimaryRoleBadgeWithdrawAttempt: ").append(toIndentedString(hasPrimaryRoleBadgeWithdrawAttempt)).append("\n");
    sb.append("    recoveryRoleRecoveryAttempt: ").append(toIndentedString(recoveryRoleRecoveryAttempt)).append("\n");
    sb.append("    hasRecoveryRoleBadgeWithdrawAttempt: ").append(toIndentedString(hasRecoveryRoleBadgeWithdrawAttempt)).append("\n");
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

    // add `controlled_vault` to the URL query string
    if (getControlledVault() != null) {
      joiner.add(getControlledVault().toUrlQueryString(prefix + "controlled_vault" + suffix));
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

    // add `recovery_badge_resource_address` to the URL query string
    if (getRecoveryBadgeResourceAddress() != null) {
      try {
        joiner.add(String.format("%srecovery_badge_resource_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecoveryBadgeResourceAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `is_primary_role_locked` to the URL query string
    if (isIsPrimaryRoleLocked() != null) {
      try {
        joiner.add(String.format("%sis_primary_role_locked%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsPrimaryRoleLocked()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `primary_role_recovery_attempt` to the URL query string
    if (getPrimaryRoleRecoveryAttempt() != null) {
      joiner.add(getPrimaryRoleRecoveryAttempt().toUrlQueryString(prefix + "primary_role_recovery_attempt" + suffix));
    }

    // add `has_primary_role_badge_withdraw_attempt` to the URL query string
    if (isHasPrimaryRoleBadgeWithdrawAttempt() != null) {
      try {
        joiner.add(String.format("%shas_primary_role_badge_withdraw_attempt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isHasPrimaryRoleBadgeWithdrawAttempt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recovery_role_recovery_attempt` to the URL query string
    if (getRecoveryRoleRecoveryAttempt() != null) {
      joiner.add(getRecoveryRoleRecoveryAttempt().toUrlQueryString(prefix + "recovery_role_recovery_attempt" + suffix));
    }

    // add `has_recovery_role_badge_withdraw_attempt` to the URL query string
    if (isHasRecoveryRoleBadgeWithdrawAttempt() != null) {
      try {
        joiner.add(String.format("%shas_recovery_role_badge_withdraw_attempt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isHasRecoveryRoleBadgeWithdrawAttempt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


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
import live.radix.core.model.EcdsaSecp256k1PublicKey;
import live.radix.core.model.EntityReference;
import live.radix.core.model.PendingOwnerStakeWithdrawal;
import live.radix.core.model.SubstateKey;
import live.radix.core.model.ValidatorFeeChangeRequest;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ValidatorFieldStateValue
 */
@JsonPropertyOrder({
  ValidatorFieldStateValue.JSON_PROPERTY_SORTED_KEY,
  ValidatorFieldStateValue.JSON_PROPERTY_PUBLIC_KEY,
  ValidatorFieldStateValue.JSON_PROPERTY_IS_REGISTERED,
  ValidatorFieldStateValue.JSON_PROPERTY_ACCEPTS_DELEGATED_STAKE,
  ValidatorFieldStateValue.JSON_PROPERTY_VALIDATOR_FEE_FACTOR,
  ValidatorFieldStateValue.JSON_PROPERTY_VALIDATOR_FEE_CHANGE_REQUEST,
  ValidatorFieldStateValue.JSON_PROPERTY_STAKE_UNIT_RESOURCE_ADDRESS,
  ValidatorFieldStateValue.JSON_PROPERTY_STAKE_XRD_VAULT,
  ValidatorFieldStateValue.JSON_PROPERTY_CLAIM_TOKEN_RESOURCE_ADDRESS,
  ValidatorFieldStateValue.JSON_PROPERTY_PENDING_XRD_WITHDRAW_VAULT,
  ValidatorFieldStateValue.JSON_PROPERTY_LOCKED_OWNER_STAKE_UNIT_VAULT,
  ValidatorFieldStateValue.JSON_PROPERTY_PENDING_OWNER_STAKE_UNIT_UNLOCK_VAULT,
  ValidatorFieldStateValue.JSON_PROPERTY_PENDING_OWNER_STAKE_UNIT_WITHDRAWALS,
  ValidatorFieldStateValue.JSON_PROPERTY_ALREADY_UNLOCKED_OWNER_STAKE_UNIT_AMOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ValidatorFieldStateValue {
  public static final String JSON_PROPERTY_SORTED_KEY = "sorted_key";
  private SubstateKey sortedKey;

  public static final String JSON_PROPERTY_PUBLIC_KEY = "public_key";
  private EcdsaSecp256k1PublicKey publicKey;

  public static final String JSON_PROPERTY_IS_REGISTERED = "is_registered";
  private Boolean isRegistered;

  public static final String JSON_PROPERTY_ACCEPTS_DELEGATED_STAKE = "accepts_delegated_stake";
  private Boolean acceptsDelegatedStake;

  public static final String JSON_PROPERTY_VALIDATOR_FEE_FACTOR = "validator_fee_factor";
  private String validatorFeeFactor;

  public static final String JSON_PROPERTY_VALIDATOR_FEE_CHANGE_REQUEST = "validator_fee_change_request";
  private ValidatorFeeChangeRequest validatorFeeChangeRequest;

  public static final String JSON_PROPERTY_STAKE_UNIT_RESOURCE_ADDRESS = "stake_unit_resource_address";
  private String stakeUnitResourceAddress;

  public static final String JSON_PROPERTY_STAKE_XRD_VAULT = "stake_xrd_vault";
  private EntityReference stakeXrdVault;

  public static final String JSON_PROPERTY_CLAIM_TOKEN_RESOURCE_ADDRESS = "claim_token_resource_address";
  private String claimTokenResourceAddress;

  public static final String JSON_PROPERTY_PENDING_XRD_WITHDRAW_VAULT = "pending_xrd_withdraw_vault";
  private EntityReference pendingXrdWithdrawVault;

  public static final String JSON_PROPERTY_LOCKED_OWNER_STAKE_UNIT_VAULT = "locked_owner_stake_unit_vault";
  private EntityReference lockedOwnerStakeUnitVault;

  public static final String JSON_PROPERTY_PENDING_OWNER_STAKE_UNIT_UNLOCK_VAULT = "pending_owner_stake_unit_unlock_vault";
  private EntityReference pendingOwnerStakeUnitUnlockVault;

  public static final String JSON_PROPERTY_PENDING_OWNER_STAKE_UNIT_WITHDRAWALS = "pending_owner_stake_unit_withdrawals";
  private List<PendingOwnerStakeWithdrawal> pendingOwnerStakeUnitWithdrawals = new ArrayList<>();

  public static final String JSON_PROPERTY_ALREADY_UNLOCKED_OWNER_STAKE_UNIT_AMOUNT = "already_unlocked_owner_stake_unit_amount";
  private String alreadyUnlockedOwnerStakeUnitAmount;

  public ValidatorFieldStateValue() {
  }

  public ValidatorFieldStateValue sortedKey(SubstateKey sortedKey) {
    
    this.sortedKey = sortedKey;
    return this;
  }

  /**
   * Get sortedKey
   * @return sortedKey
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORTED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubstateKey getSortedKey() {
    return sortedKey;
  }


  @JsonProperty(JSON_PROPERTY_SORTED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortedKey(SubstateKey sortedKey) {
    this.sortedKey = sortedKey;
  }

  public ValidatorFieldStateValue publicKey(EcdsaSecp256k1PublicKey publicKey) {
    
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Get publicKey
   * @return publicKey
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EcdsaSecp256k1PublicKey getPublicKey() {
    return publicKey;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPublicKey(EcdsaSecp256k1PublicKey publicKey) {
    this.publicKey = publicKey;
  }

  public ValidatorFieldStateValue isRegistered(Boolean isRegistered) {
    
    this.isRegistered = isRegistered;
    return this;
  }

  /**
   * Get isRegistered
   * @return isRegistered
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsRegistered() {
    return isRegistered;
  }


  @JsonProperty(JSON_PROPERTY_IS_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
  }

  public ValidatorFieldStateValue acceptsDelegatedStake(Boolean acceptsDelegatedStake) {
    
    this.acceptsDelegatedStake = acceptsDelegatedStake;
    return this;
  }

  /**
   * Get acceptsDelegatedStake
   * @return acceptsDelegatedStake
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCEPTS_DELEGATED_STAKE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isAcceptsDelegatedStake() {
    return acceptsDelegatedStake;
  }


  @JsonProperty(JSON_PROPERTY_ACCEPTS_DELEGATED_STAKE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAcceptsDelegatedStake(Boolean acceptsDelegatedStake) {
    this.acceptsDelegatedStake = acceptsDelegatedStake;
  }

  public ValidatorFieldStateValue validatorFeeFactor(String validatorFeeFactor) {
    
    this.validatorFeeFactor = validatorFeeFactor;
    return this;
  }

  /**
   * A string-encoded fixed-precision decimal to 18 decimal places. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;. 
   * @return validatorFeeFactor
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALIDATOR_FEE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValidatorFeeFactor() {
    return validatorFeeFactor;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATOR_FEE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValidatorFeeFactor(String validatorFeeFactor) {
    this.validatorFeeFactor = validatorFeeFactor;
  }

  public ValidatorFieldStateValue validatorFeeChangeRequest(ValidatorFeeChangeRequest validatorFeeChangeRequest) {
    
    this.validatorFeeChangeRequest = validatorFeeChangeRequest;
    return this;
  }

  /**
   * Get validatorFeeChangeRequest
   * @return validatorFeeChangeRequest
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDATOR_FEE_CHANGE_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValidatorFeeChangeRequest getValidatorFeeChangeRequest() {
    return validatorFeeChangeRequest;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATOR_FEE_CHANGE_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidatorFeeChangeRequest(ValidatorFeeChangeRequest validatorFeeChangeRequest) {
    this.validatorFeeChangeRequest = validatorFeeChangeRequest;
  }

  public ValidatorFieldStateValue stakeUnitResourceAddress(String stakeUnitResourceAddress) {
    
    this.stakeUnitResourceAddress = stakeUnitResourceAddress;
    return this;
  }

  /**
   * The Bech32m-encoded human readable version of the resource address
   * @return stakeUnitResourceAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STAKE_UNIT_RESOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStakeUnitResourceAddress() {
    return stakeUnitResourceAddress;
  }


  @JsonProperty(JSON_PROPERTY_STAKE_UNIT_RESOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStakeUnitResourceAddress(String stakeUnitResourceAddress) {
    this.stakeUnitResourceAddress = stakeUnitResourceAddress;
  }

  public ValidatorFieldStateValue stakeXrdVault(EntityReference stakeXrdVault) {
    
    this.stakeXrdVault = stakeXrdVault;
    return this;
  }

  /**
   * Get stakeXrdVault
   * @return stakeXrdVault
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STAKE_XRD_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EntityReference getStakeXrdVault() {
    return stakeXrdVault;
  }


  @JsonProperty(JSON_PROPERTY_STAKE_XRD_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStakeXrdVault(EntityReference stakeXrdVault) {
    this.stakeXrdVault = stakeXrdVault;
  }

  public ValidatorFieldStateValue claimTokenResourceAddress(String claimTokenResourceAddress) {
    
    this.claimTokenResourceAddress = claimTokenResourceAddress;
    return this;
  }

  /**
   * The Bech32m-encoded human readable version of the resource address
   * @return claimTokenResourceAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLAIM_TOKEN_RESOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClaimTokenResourceAddress() {
    return claimTokenResourceAddress;
  }


  @JsonProperty(JSON_PROPERTY_CLAIM_TOKEN_RESOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClaimTokenResourceAddress(String claimTokenResourceAddress) {
    this.claimTokenResourceAddress = claimTokenResourceAddress;
  }

  public ValidatorFieldStateValue pendingXrdWithdrawVault(EntityReference pendingXrdWithdrawVault) {
    
    this.pendingXrdWithdrawVault = pendingXrdWithdrawVault;
    return this;
  }

  /**
   * Get pendingXrdWithdrawVault
   * @return pendingXrdWithdrawVault
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PENDING_XRD_WITHDRAW_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EntityReference getPendingXrdWithdrawVault() {
    return pendingXrdWithdrawVault;
  }


  @JsonProperty(JSON_PROPERTY_PENDING_XRD_WITHDRAW_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPendingXrdWithdrawVault(EntityReference pendingXrdWithdrawVault) {
    this.pendingXrdWithdrawVault = pendingXrdWithdrawVault;
  }

  public ValidatorFieldStateValue lockedOwnerStakeUnitVault(EntityReference lockedOwnerStakeUnitVault) {
    
    this.lockedOwnerStakeUnitVault = lockedOwnerStakeUnitVault;
    return this;
  }

  /**
   * Get lockedOwnerStakeUnitVault
   * @return lockedOwnerStakeUnitVault
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCKED_OWNER_STAKE_UNIT_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EntityReference getLockedOwnerStakeUnitVault() {
    return lockedOwnerStakeUnitVault;
  }


  @JsonProperty(JSON_PROPERTY_LOCKED_OWNER_STAKE_UNIT_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLockedOwnerStakeUnitVault(EntityReference lockedOwnerStakeUnitVault) {
    this.lockedOwnerStakeUnitVault = lockedOwnerStakeUnitVault;
  }

  public ValidatorFieldStateValue pendingOwnerStakeUnitUnlockVault(EntityReference pendingOwnerStakeUnitUnlockVault) {
    
    this.pendingOwnerStakeUnitUnlockVault = pendingOwnerStakeUnitUnlockVault;
    return this;
  }

  /**
   * Get pendingOwnerStakeUnitUnlockVault
   * @return pendingOwnerStakeUnitUnlockVault
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PENDING_OWNER_STAKE_UNIT_UNLOCK_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EntityReference getPendingOwnerStakeUnitUnlockVault() {
    return pendingOwnerStakeUnitUnlockVault;
  }


  @JsonProperty(JSON_PROPERTY_PENDING_OWNER_STAKE_UNIT_UNLOCK_VAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPendingOwnerStakeUnitUnlockVault(EntityReference pendingOwnerStakeUnitUnlockVault) {
    this.pendingOwnerStakeUnitUnlockVault = pendingOwnerStakeUnitUnlockVault;
  }

  public ValidatorFieldStateValue pendingOwnerStakeUnitWithdrawals(List<PendingOwnerStakeWithdrawal> pendingOwnerStakeUnitWithdrawals) {
    
    this.pendingOwnerStakeUnitWithdrawals = pendingOwnerStakeUnitWithdrawals;
    return this;
  }

  public ValidatorFieldStateValue addPendingOwnerStakeUnitWithdrawalsItem(PendingOwnerStakeWithdrawal pendingOwnerStakeUnitWithdrawalsItem) {
    if (this.pendingOwnerStakeUnitWithdrawals == null) {
      this.pendingOwnerStakeUnitWithdrawals = new ArrayList<>();
    }
    this.pendingOwnerStakeUnitWithdrawals.add(pendingOwnerStakeUnitWithdrawalsItem);
    return this;
  }

  /**
   * Get pendingOwnerStakeUnitWithdrawals
   * @return pendingOwnerStakeUnitWithdrawals
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PENDING_OWNER_STAKE_UNIT_WITHDRAWALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<PendingOwnerStakeWithdrawal> getPendingOwnerStakeUnitWithdrawals() {
    return pendingOwnerStakeUnitWithdrawals;
  }


  @JsonProperty(JSON_PROPERTY_PENDING_OWNER_STAKE_UNIT_WITHDRAWALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPendingOwnerStakeUnitWithdrawals(List<PendingOwnerStakeWithdrawal> pendingOwnerStakeUnitWithdrawals) {
    this.pendingOwnerStakeUnitWithdrawals = pendingOwnerStakeUnitWithdrawals;
  }

  public ValidatorFieldStateValue alreadyUnlockedOwnerStakeUnitAmount(String alreadyUnlockedOwnerStakeUnitAmount) {
    
    this.alreadyUnlockedOwnerStakeUnitAmount = alreadyUnlockedOwnerStakeUnitAmount;
    return this;
  }

  /**
   * A string-encoded fixed-precision decimal to 18 decimal places. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;. 
   * @return alreadyUnlockedOwnerStakeUnitAmount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALREADY_UNLOCKED_OWNER_STAKE_UNIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAlreadyUnlockedOwnerStakeUnitAmount() {
    return alreadyUnlockedOwnerStakeUnitAmount;
  }


  @JsonProperty(JSON_PROPERTY_ALREADY_UNLOCKED_OWNER_STAKE_UNIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAlreadyUnlockedOwnerStakeUnitAmount(String alreadyUnlockedOwnerStakeUnitAmount) {
    this.alreadyUnlockedOwnerStakeUnitAmount = alreadyUnlockedOwnerStakeUnitAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatorFieldStateValue validatorFieldStateValue = (ValidatorFieldStateValue) o;
    return Objects.equals(this.sortedKey, validatorFieldStateValue.sortedKey) &&
        Objects.equals(this.publicKey, validatorFieldStateValue.publicKey) &&
        Objects.equals(this.isRegistered, validatorFieldStateValue.isRegistered) &&
        Objects.equals(this.acceptsDelegatedStake, validatorFieldStateValue.acceptsDelegatedStake) &&
        Objects.equals(this.validatorFeeFactor, validatorFieldStateValue.validatorFeeFactor) &&
        Objects.equals(this.validatorFeeChangeRequest, validatorFieldStateValue.validatorFeeChangeRequest) &&
        Objects.equals(this.stakeUnitResourceAddress, validatorFieldStateValue.stakeUnitResourceAddress) &&
        Objects.equals(this.stakeXrdVault, validatorFieldStateValue.stakeXrdVault) &&
        Objects.equals(this.claimTokenResourceAddress, validatorFieldStateValue.claimTokenResourceAddress) &&
        Objects.equals(this.pendingXrdWithdrawVault, validatorFieldStateValue.pendingXrdWithdrawVault) &&
        Objects.equals(this.lockedOwnerStakeUnitVault, validatorFieldStateValue.lockedOwnerStakeUnitVault) &&
        Objects.equals(this.pendingOwnerStakeUnitUnlockVault, validatorFieldStateValue.pendingOwnerStakeUnitUnlockVault) &&
        Objects.equals(this.pendingOwnerStakeUnitWithdrawals, validatorFieldStateValue.pendingOwnerStakeUnitWithdrawals) &&
        Objects.equals(this.alreadyUnlockedOwnerStakeUnitAmount, validatorFieldStateValue.alreadyUnlockedOwnerStakeUnitAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortedKey, publicKey, isRegistered, acceptsDelegatedStake, validatorFeeFactor, validatorFeeChangeRequest, stakeUnitResourceAddress, stakeXrdVault, claimTokenResourceAddress, pendingXrdWithdrawVault, lockedOwnerStakeUnitVault, pendingOwnerStakeUnitUnlockVault, pendingOwnerStakeUnitWithdrawals, alreadyUnlockedOwnerStakeUnitAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatorFieldStateValue {\n");
    sb.append("    sortedKey: ").append(toIndentedString(sortedKey)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    isRegistered: ").append(toIndentedString(isRegistered)).append("\n");
    sb.append("    acceptsDelegatedStake: ").append(toIndentedString(acceptsDelegatedStake)).append("\n");
    sb.append("    validatorFeeFactor: ").append(toIndentedString(validatorFeeFactor)).append("\n");
    sb.append("    validatorFeeChangeRequest: ").append(toIndentedString(validatorFeeChangeRequest)).append("\n");
    sb.append("    stakeUnitResourceAddress: ").append(toIndentedString(stakeUnitResourceAddress)).append("\n");
    sb.append("    stakeXrdVault: ").append(toIndentedString(stakeXrdVault)).append("\n");
    sb.append("    claimTokenResourceAddress: ").append(toIndentedString(claimTokenResourceAddress)).append("\n");
    sb.append("    pendingXrdWithdrawVault: ").append(toIndentedString(pendingXrdWithdrawVault)).append("\n");
    sb.append("    lockedOwnerStakeUnitVault: ").append(toIndentedString(lockedOwnerStakeUnitVault)).append("\n");
    sb.append("    pendingOwnerStakeUnitUnlockVault: ").append(toIndentedString(pendingOwnerStakeUnitUnlockVault)).append("\n");
    sb.append("    pendingOwnerStakeUnitWithdrawals: ").append(toIndentedString(pendingOwnerStakeUnitWithdrawals)).append("\n");
    sb.append("    alreadyUnlockedOwnerStakeUnitAmount: ").append(toIndentedString(alreadyUnlockedOwnerStakeUnitAmount)).append("\n");
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

    // add `sorted_key` to the URL query string
    if (getSortedKey() != null) {
      joiner.add(getSortedKey().toUrlQueryString(prefix + "sorted_key" + suffix));
    }

    // add `public_key` to the URL query string
    if (getPublicKey() != null) {
      joiner.add(getPublicKey().toUrlQueryString(prefix + "public_key" + suffix));
    }

    // add `is_registered` to the URL query string
    if (isIsRegistered() != null) {
      try {
        joiner.add(String.format("%sis_registered%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsRegistered()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `accepts_delegated_stake` to the URL query string
    if (isAcceptsDelegatedStake() != null) {
      try {
        joiner.add(String.format("%saccepts_delegated_stake%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isAcceptsDelegatedStake()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `validator_fee_factor` to the URL query string
    if (getValidatorFeeFactor() != null) {
      try {
        joiner.add(String.format("%svalidator_fee_factor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValidatorFeeFactor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `validator_fee_change_request` to the URL query string
    if (getValidatorFeeChangeRequest() != null) {
      joiner.add(getValidatorFeeChangeRequest().toUrlQueryString(prefix + "validator_fee_change_request" + suffix));
    }

    // add `stake_unit_resource_address` to the URL query string
    if (getStakeUnitResourceAddress() != null) {
      try {
        joiner.add(String.format("%sstake_unit_resource_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStakeUnitResourceAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `stake_xrd_vault` to the URL query string
    if (getStakeXrdVault() != null) {
      joiner.add(getStakeXrdVault().toUrlQueryString(prefix + "stake_xrd_vault" + suffix));
    }

    // add `claim_token_resource_address` to the URL query string
    if (getClaimTokenResourceAddress() != null) {
      try {
        joiner.add(String.format("%sclaim_token_resource_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClaimTokenResourceAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pending_xrd_withdraw_vault` to the URL query string
    if (getPendingXrdWithdrawVault() != null) {
      joiner.add(getPendingXrdWithdrawVault().toUrlQueryString(prefix + "pending_xrd_withdraw_vault" + suffix));
    }

    // add `locked_owner_stake_unit_vault` to the URL query string
    if (getLockedOwnerStakeUnitVault() != null) {
      joiner.add(getLockedOwnerStakeUnitVault().toUrlQueryString(prefix + "locked_owner_stake_unit_vault" + suffix));
    }

    // add `pending_owner_stake_unit_unlock_vault` to the URL query string
    if (getPendingOwnerStakeUnitUnlockVault() != null) {
      joiner.add(getPendingOwnerStakeUnitUnlockVault().toUrlQueryString(prefix + "pending_owner_stake_unit_unlock_vault" + suffix));
    }

    // add `pending_owner_stake_unit_withdrawals` to the URL query string
    if (getPendingOwnerStakeUnitWithdrawals() != null) {
      for (int i = 0; i < getPendingOwnerStakeUnitWithdrawals().size(); i++) {
        if (getPendingOwnerStakeUnitWithdrawals().get(i) != null) {
          joiner.add(getPendingOwnerStakeUnitWithdrawals().get(i).toUrlQueryString(String.format("%spending_owner_stake_unit_withdrawals%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `already_unlocked_owner_stake_unit_amount` to the URL query string
    if (getAlreadyUnlockedOwnerStakeUnitAmount() != null) {
      try {
        joiner.add(String.format("%salready_unlocked_owner_stake_unit_amount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAlreadyUnlockedOwnerStakeUnitAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


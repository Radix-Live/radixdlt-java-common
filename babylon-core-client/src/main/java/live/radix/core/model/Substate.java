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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import live.radix.core.model.SubstateType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Substate
 */
@JsonPropertyOrder({
  Substate.JSON_PROPERTY_SUBSTATE_TYPE,
  Substate.JSON_PROPERTY_IS_LOCKED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:51:31.842802500+02:00[Europe/Kiev]")
@JsonIgnoreProperties(
  value = "substate_type", // ignore manually set substate_type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the substate_type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "substate_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AccessControllerFieldStateSubstate.class, name = "AccessControllerFieldState"),
  @JsonSubTypes.Type(value = AccountAuthorizedDepositorEntrySubstate.class, name = "AccountAuthorizedDepositorEntry"),
  @JsonSubTypes.Type(value = AccountFieldStateSubstate.class, name = "AccountFieldState"),
  @JsonSubTypes.Type(value = AccountResourcePreferenceEntrySubstate.class, name = "AccountResourcePreferenceEntry"),
  @JsonSubTypes.Type(value = AccountVaultEntrySubstate.class, name = "AccountVaultEntry"),
  @JsonSubTypes.Type(value = ConsensusManagerFieldConfigSubstate.class, name = "ConsensusManagerFieldConfig"),
  @JsonSubTypes.Type(value = ConsensusManagerFieldCurrentProposalStatisticSubstate.class, name = "ConsensusManagerFieldCurrentProposalStatistic"),
  @JsonSubTypes.Type(value = ConsensusManagerFieldCurrentTimeSubstate.class, name = "ConsensusManagerFieldCurrentTime"),
  @JsonSubTypes.Type(value = ConsensusManagerFieldCurrentTimeRoundedToMinutesSubstate.class, name = "ConsensusManagerFieldCurrentTimeRoundedToMinutes"),
  @JsonSubTypes.Type(value = ConsensusManagerFieldCurrentValidatorSetSubstate.class, name = "ConsensusManagerFieldCurrentValidatorSet"),
  @JsonSubTypes.Type(value = ConsensusManagerFieldStateSubstate.class, name = "ConsensusManagerFieldState"),
  @JsonSubTypes.Type(value = ConsensusManagerFieldValidatorRewardsSubstate.class, name = "ConsensusManagerFieldValidatorRewards"),
  @JsonSubTypes.Type(value = ConsensusManagerRegisteredValidatorsByStakeIndexEntrySubstate.class, name = "ConsensusManagerRegisteredValidatorsByStakeIndexEntry"),
  @JsonSubTypes.Type(value = FungibleResourceManagerFieldDivisibilitySubstate.class, name = "FungibleResourceManagerFieldDivisibility"),
  @JsonSubTypes.Type(value = FungibleResourceManagerFieldTotalSupplySubstate.class, name = "FungibleResourceManagerFieldTotalSupply"),
  @JsonSubTypes.Type(value = FungibleVaultFieldBalanceSubstate.class, name = "FungibleVaultFieldBalance"),
  @JsonSubTypes.Type(value = FungibleVaultFieldFrozenStatusSubstate.class, name = "FungibleVaultFieldFrozenStatus"),
  @JsonSubTypes.Type(value = GenericKeyValueStoreEntrySubstate.class, name = "GenericKeyValueStoreEntry"),
  @JsonSubTypes.Type(value = GenericScryptoComponentFieldStateSubstate.class, name = "GenericScryptoComponentFieldState"),
  @JsonSubTypes.Type(value = MetadataModuleEntrySubstate.class, name = "MetadataModuleEntry"),
  @JsonSubTypes.Type(value = MultiResourcePoolFieldStateSubstate.class, name = "MultiResourcePoolFieldState"),
  @JsonSubTypes.Type(value = NonFungibleResourceManagerDataEntrySubstate.class, name = "NonFungibleResourceManagerDataEntry"),
  @JsonSubTypes.Type(value = NonFungibleResourceManagerFieldIdTypeSubstate.class, name = "NonFungibleResourceManagerFieldIdType"),
  @JsonSubTypes.Type(value = NonFungibleResourceManagerFieldMutableFieldsSubstate.class, name = "NonFungibleResourceManagerFieldMutableFields"),
  @JsonSubTypes.Type(value = NonFungibleResourceManagerFieldTotalSupplySubstate.class, name = "NonFungibleResourceManagerFieldTotalSupply"),
  @JsonSubTypes.Type(value = NonFungibleVaultContentsIndexEntrySubstate.class, name = "NonFungibleVaultContentsIndexEntry"),
  @JsonSubTypes.Type(value = NonFungibleVaultFieldBalanceSubstate.class, name = "NonFungibleVaultFieldBalance"),
  @JsonSubTypes.Type(value = NonFungibleVaultFieldFrozenStatusSubstate.class, name = "NonFungibleVaultFieldFrozenStatus"),
  @JsonSubTypes.Type(value = OneResourcePoolFieldStateSubstate.class, name = "OneResourcePoolFieldState"),
  @JsonSubTypes.Type(value = PackageBlueprintAuthTemplateEntrySubstate.class, name = "PackageBlueprintAuthTemplateEntry"),
  @JsonSubTypes.Type(value = PackageBlueprintDefinitionEntrySubstate.class, name = "PackageBlueprintDefinitionEntry"),
  @JsonSubTypes.Type(value = PackageBlueprintDependenciesEntrySubstate.class, name = "PackageBlueprintDependenciesEntry"),
  @JsonSubTypes.Type(value = PackageBlueprintRoyaltyEntrySubstate.class, name = "PackageBlueprintRoyaltyEntry"),
  @JsonSubTypes.Type(value = PackageCodeInstrumentedCodeEntrySubstate.class, name = "PackageCodeInstrumentedCodeEntry"),
  @JsonSubTypes.Type(value = PackageCodeOriginalCodeEntrySubstate.class, name = "PackageCodeOriginalCodeEntry"),
  @JsonSubTypes.Type(value = PackageCodeVmTypeEntrySubstate.class, name = "PackageCodeVmTypeEntry"),
  @JsonSubTypes.Type(value = PackageFieldRoyaltyAccumulatorSubstate.class, name = "PackageFieldRoyaltyAccumulator"),
  @JsonSubTypes.Type(value = RoleAssignmentModuleFieldOwnerRoleSubstate.class, name = "RoleAssignmentModuleFieldOwnerRole"),
  @JsonSubTypes.Type(value = RoleAssignmentModuleRuleEntrySubstate.class, name = "RoleAssignmentModuleRuleEntry"),
  @JsonSubTypes.Type(value = RoyaltyModuleFieldStateSubstate.class, name = "RoyaltyModuleFieldState"),
  @JsonSubTypes.Type(value = RoyaltyModuleMethodRoyaltyEntrySubstate.class, name = "RoyaltyModuleMethodRoyaltyEntry"),
  @JsonSubTypes.Type(value = SchemaEntrySubstate.class, name = "SchemaEntry"),
  @JsonSubTypes.Type(value = TransactionTrackerCollectionEntrySubstate.class, name = "TransactionTrackerCollectionEntry"),
  @JsonSubTypes.Type(value = TransactionTrackerFieldStateSubstate.class, name = "TransactionTrackerFieldState"),
  @JsonSubTypes.Type(value = TwoResourcePoolFieldStateSubstate.class, name = "TwoResourcePoolFieldState"),
  @JsonSubTypes.Type(value = TypeInfoModuleFieldTypeInfoSubstate.class, name = "TypeInfoModuleFieldTypeInfo"),
  @JsonSubTypes.Type(value = ValidatorFieldProtocolUpdateReadinessSignalSubstate.class, name = "ValidatorFieldProtocolUpdateReadinessSignal"),
  @JsonSubTypes.Type(value = ValidatorFieldStateSubstate.class, name = "ValidatorFieldState"),
})

public class Substate {
  public static final String JSON_PROPERTY_SUBSTATE_TYPE = "substate_type";
  protected SubstateType substateType;

  public static final String JSON_PROPERTY_IS_LOCKED = "is_locked";
  private Boolean isLocked;

  public Substate() {
  }

  public Substate substateType(SubstateType substateType) {
    
    this.substateType = substateType;
    return this;
  }

   /**
   * Get substateType
   * @return substateType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBSTATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubstateType getSubstateType() {
    return substateType;
  }


  @JsonProperty(JSON_PROPERTY_SUBSTATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubstateType(SubstateType substateType) {
    this.substateType = substateType;
  }


  public Substate isLocked(Boolean isLocked) {
    
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsLocked() {
    return isLocked;
  }


  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Substate substate = (Substate) o;
    return Objects.equals(this.substateType, substate.substateType) &&
        Objects.equals(this.isLocked, substate.isLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(substateType, isLocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Substate {\n");
    sb.append("    substateType: ").append(toIndentedString(substateType)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
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

    // add `substate_type` to the URL query string
    if (getSubstateType() != null) {
      try {
        joiner.add(String.format("%ssubstate_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubstateType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `is_locked` to the URL query string
    if (isIsLocked() != null) {
      try {
        joiner.add(String.format("%sis_locked%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsLocked()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


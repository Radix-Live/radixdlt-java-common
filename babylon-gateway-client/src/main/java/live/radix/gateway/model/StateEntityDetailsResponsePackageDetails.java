/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.gateway.model;

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
import live.radix.gateway.model.ComponentEntityRoleAssignments;
import live.radix.gateway.model.EntitySchemaCollection;
import live.radix.gateway.model.PackageBlueprintCollection;
import live.radix.gateway.model.PackageCodeCollection;
import live.radix.gateway.model.PackageVmType;
import live.radix.gateway.model.StateEntityDetailsResponseItemDetails;
import live.radix.gateway.model.StateEntityDetailsResponseItemDetailsType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * vm_type, code_hash_hex and code_hex are always going to be empty, use &#x60;codes&#x60; property which will return collection (it&#39;s possible after protocol update that package might have multiple codes)
 */
@JsonPropertyOrder({
  StateEntityDetailsResponsePackageDetails.JSON_PROPERTY_CODES,
  StateEntityDetailsResponsePackageDetails.JSON_PROPERTY_VM_TYPE,
  StateEntityDetailsResponsePackageDetails.JSON_PROPERTY_CODE_HASH_HEX,
  StateEntityDetailsResponsePackageDetails.JSON_PROPERTY_CODE_HEX,
  StateEntityDetailsResponsePackageDetails.JSON_PROPERTY_ROYALTY_VAULT_BALANCE,
  StateEntityDetailsResponsePackageDetails.JSON_PROPERTY_BLUEPRINTS,
  StateEntityDetailsResponsePackageDetails.JSON_PROPERTY_SCHEMAS,
  StateEntityDetailsResponsePackageDetails.JSON_PROPERTY_ROLE_ASSIGNMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-15T00:18:13.130575900+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class StateEntityDetailsResponsePackageDetails extends StateEntityDetailsResponseItemDetails {
  public static final String JSON_PROPERTY_CODES = "codes";
  private PackageCodeCollection codes;

  public static final String JSON_PROPERTY_VM_TYPE = "vm_type";
  private PackageVmType vmType;

  public static final String JSON_PROPERTY_CODE_HASH_HEX = "code_hash_hex";
  private String codeHashHex;

  public static final String JSON_PROPERTY_CODE_HEX = "code_hex";
  private String codeHex;

  public static final String JSON_PROPERTY_ROYALTY_VAULT_BALANCE = "royalty_vault_balance";
  private String royaltyVaultBalance;

  public static final String JSON_PROPERTY_BLUEPRINTS = "blueprints";
  private PackageBlueprintCollection blueprints;

  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private EntitySchemaCollection schemas;

  public static final String JSON_PROPERTY_ROLE_ASSIGNMENTS = "role_assignments";
  private ComponentEntityRoleAssignments roleAssignments;

  public StateEntityDetailsResponsePackageDetails() {

  }

  public StateEntityDetailsResponsePackageDetails codes(PackageCodeCollection codes) {
    
    this.codes = codes;
    return this;
  }

  /**
   * Get codes
   * @return codes
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PackageCodeCollection getCodes() {
    return codes;
  }


  @JsonProperty(JSON_PROPERTY_CODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCodes(PackageCodeCollection codes) {
    this.codes = codes;
  }

  public StateEntityDetailsResponsePackageDetails vmType(PackageVmType vmType) {
    
    this.vmType = vmType;
    return this;
  }

  /**
   * **Obsolete!** Use &#x60;codes&#x60; collection instead.
   * @return vmType
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PackageVmType getVmType() {
    return vmType;
  }


  @JsonProperty(JSON_PROPERTY_VM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVmType(PackageVmType vmType) {
    this.vmType = vmType;
  }

  public StateEntityDetailsResponsePackageDetails codeHashHex(String codeHashHex) {
    
    this.codeHashHex = codeHashHex;
    return this;
  }

  /**
   * Hex-encoded binary blob.
   * @return codeHashHex
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE_HASH_HEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCodeHashHex() {
    return codeHashHex;
  }


  @JsonProperty(JSON_PROPERTY_CODE_HASH_HEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCodeHashHex(String codeHashHex) {
    this.codeHashHex = codeHashHex;
  }

  public StateEntityDetailsResponsePackageDetails codeHex(String codeHex) {
    
    this.codeHex = codeHex;
    return this;
  }

  /**
   * Hex-encoded binary blob.
   * @return codeHex
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE_HEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCodeHex() {
    return codeHex;
  }


  @JsonProperty(JSON_PROPERTY_CODE_HEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCodeHex(String codeHex) {
    this.codeHex = codeHex;
  }

  public StateEntityDetailsResponsePackageDetails royaltyVaultBalance(String royaltyVaultBalance) {
    
    this.royaltyVaultBalance = royaltyVaultBalance;
    return this;
  }

  /**
   * String-encoded decimal representing the amount of a related fungible resource.
   * @return royaltyVaultBalance
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROYALTY_VAULT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoyaltyVaultBalance() {
    return royaltyVaultBalance;
  }


  @JsonProperty(JSON_PROPERTY_ROYALTY_VAULT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoyaltyVaultBalance(String royaltyVaultBalance) {
    this.royaltyVaultBalance = royaltyVaultBalance;
  }

  public StateEntityDetailsResponsePackageDetails blueprints(PackageBlueprintCollection blueprints) {
    
    this.blueprints = blueprints;
    return this;
  }

  /**
   * Get blueprints
   * @return blueprints
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLUEPRINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PackageBlueprintCollection getBlueprints() {
    return blueprints;
  }


  @JsonProperty(JSON_PROPERTY_BLUEPRINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlueprints(PackageBlueprintCollection blueprints) {
    this.blueprints = blueprints;
  }

  public StateEntityDetailsResponsePackageDetails schemas(EntitySchemaCollection schemas) {
    
    this.schemas = schemas;
    return this;
  }

  /**
   * Get schemas
   * @return schemas
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntitySchemaCollection getSchemas() {
    return schemas;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemas(EntitySchemaCollection schemas) {
    this.schemas = schemas;
  }

  public StateEntityDetailsResponsePackageDetails roleAssignments(ComponentEntityRoleAssignments roleAssignments) {
    
    this.roleAssignments = roleAssignments;
    return this;
  }

  /**
   * Get roleAssignments
   * @return roleAssignments
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_ASSIGNMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComponentEntityRoleAssignments getRoleAssignments() {
    return roleAssignments;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ASSIGNMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleAssignments(ComponentEntityRoleAssignments roleAssignments) {
    this.roleAssignments = roleAssignments;
  }

  @Override
  public StateEntityDetailsResponsePackageDetails type(StateEntityDetailsResponseItemDetailsType type) {
    this.setType(type);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateEntityDetailsResponsePackageDetails stateEntityDetailsResponsePackageDetails = (StateEntityDetailsResponsePackageDetails) o;
    return Objects.equals(this.codes, stateEntityDetailsResponsePackageDetails.codes) &&
        Objects.equals(this.vmType, stateEntityDetailsResponsePackageDetails.vmType) &&
        Objects.equals(this.codeHashHex, stateEntityDetailsResponsePackageDetails.codeHashHex) &&
        Objects.equals(this.codeHex, stateEntityDetailsResponsePackageDetails.codeHex) &&
        Objects.equals(this.royaltyVaultBalance, stateEntityDetailsResponsePackageDetails.royaltyVaultBalance) &&
        Objects.equals(this.blueprints, stateEntityDetailsResponsePackageDetails.blueprints) &&
        Objects.equals(this.schemas, stateEntityDetailsResponsePackageDetails.schemas) &&
        Objects.equals(this.roleAssignments, stateEntityDetailsResponsePackageDetails.roleAssignments) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codes, vmType, codeHashHex, codeHex, royaltyVaultBalance, blueprints, schemas, roleAssignments, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateEntityDetailsResponsePackageDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    vmType: ").append(toIndentedString(vmType)).append("\n");
    sb.append("    codeHashHex: ").append(toIndentedString(codeHashHex)).append("\n");
    sb.append("    codeHex: ").append(toIndentedString(codeHex)).append("\n");
    sb.append("    royaltyVaultBalance: ").append(toIndentedString(royaltyVaultBalance)).append("\n");
    sb.append("    blueprints: ").append(toIndentedString(blueprints)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    roleAssignments: ").append(toIndentedString(roleAssignments)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `codes` to the URL query string
    if (getCodes() != null) {
      joiner.add(getCodes().toUrlQueryString(prefix + "codes" + suffix));
    }

    // add `vm_type` to the URL query string
    if (getVmType() != null) {
      try {
        joiner.add(String.format("%svm_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVmType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `code_hash_hex` to the URL query string
    if (getCodeHashHex() != null) {
      try {
        joiner.add(String.format("%scode_hash_hex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCodeHashHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `code_hex` to the URL query string
    if (getCodeHex() != null) {
      try {
        joiner.add(String.format("%scode_hex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCodeHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `royalty_vault_balance` to the URL query string
    if (getRoyaltyVaultBalance() != null) {
      try {
        joiner.add(String.format("%sroyalty_vault_balance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoyaltyVaultBalance()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `blueprints` to the URL query string
    if (getBlueprints() != null) {
      joiner.add(getBlueprints().toUrlQueryString(prefix + "blueprints" + suffix));
    }

    // add `schemas` to the URL query string
    if (getSchemas() != null) {
      joiner.add(getSchemas().toUrlQueryString(prefix + "schemas" + suffix));
    }

    // add `role_assignments` to the URL query string
    if (getRoleAssignments() != null) {
      joiner.add(getRoleAssignments().toUrlQueryString(prefix + "role_assignments" + suffix));
    }

    return joiner.toString();
  }

}


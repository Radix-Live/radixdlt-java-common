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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Check detailed [OptIns](#section/Using-endpoints-with-opt-in-features) documentation for more details
 */
@JsonPropertyOrder({
  StateEntityDetailsOptIns.JSON_PROPERTY_ANCESTOR_IDENTITIES,
  StateEntityDetailsOptIns.JSON_PROPERTY_COMPONENT_ROYALTY_CONFIG,
  StateEntityDetailsOptIns.JSON_PROPERTY_COMPONENT_ROYALTY_VAULT_BALANCE,
  StateEntityDetailsOptIns.JSON_PROPERTY_PACKAGE_ROYALTY_VAULT_BALANCE,
  StateEntityDetailsOptIns.JSON_PROPERTY_NON_FUNGIBLE_INCLUDE_NFIDS,
  StateEntityDetailsOptIns.JSON_PROPERTY_EXPLICIT_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-15T00:18:13.130575900+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class StateEntityDetailsOptIns {
  public static final String JSON_PROPERTY_ANCESTOR_IDENTITIES = "ancestor_identities";
  private Boolean ancestorIdentities = false;

  public static final String JSON_PROPERTY_COMPONENT_ROYALTY_CONFIG = "component_royalty_config";
  private Boolean componentRoyaltyConfig = false;

  public static final String JSON_PROPERTY_COMPONENT_ROYALTY_VAULT_BALANCE = "component_royalty_vault_balance";
  private Boolean componentRoyaltyVaultBalance = false;

  public static final String JSON_PROPERTY_PACKAGE_ROYALTY_VAULT_BALANCE = "package_royalty_vault_balance";
  private Boolean packageRoyaltyVaultBalance = false;

  public static final String JSON_PROPERTY_NON_FUNGIBLE_INCLUDE_NFIDS = "non_fungible_include_nfids";
  private Boolean nonFungibleIncludeNfids = false;

  public static final String JSON_PROPERTY_EXPLICIT_METADATA = "explicit_metadata";
  private List<String> explicitMetadata = new ArrayList<>();

  public StateEntityDetailsOptIns() {
  }

  public StateEntityDetailsOptIns ancestorIdentities(Boolean ancestorIdentities) {
    
    this.ancestorIdentities = ancestorIdentities;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, ancestor addresses - &#x60;parent_address&#x60;, &#x60;owner_address&#x60; and &#x60;global_address&#x60; for entities are returned.
   * @return ancestorIdentities
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANCESTOR_IDENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isAncestorIdentities() {
    return ancestorIdentities;
  }


  @JsonProperty(JSON_PROPERTY_ANCESTOR_IDENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAncestorIdentities(Boolean ancestorIdentities) {
    this.ancestorIdentities = ancestorIdentities;
  }

  public StateEntityDetailsOptIns componentRoyaltyConfig(Boolean componentRoyaltyConfig) {
    
    this.componentRoyaltyConfig = componentRoyaltyConfig;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, &#x60;royalty_config&#x60; for component entities is returned.
   * @return componentRoyaltyConfig
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_ROYALTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isComponentRoyaltyConfig() {
    return componentRoyaltyConfig;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT_ROYALTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponentRoyaltyConfig(Boolean componentRoyaltyConfig) {
    this.componentRoyaltyConfig = componentRoyaltyConfig;
  }

  public StateEntityDetailsOptIns componentRoyaltyVaultBalance(Boolean componentRoyaltyVaultBalance) {
    
    this.componentRoyaltyVaultBalance = componentRoyaltyVaultBalance;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, &#x60;royalty_vault_balance&#x60; for component entities is returned.
   * @return componentRoyaltyVaultBalance
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_ROYALTY_VAULT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isComponentRoyaltyVaultBalance() {
    return componentRoyaltyVaultBalance;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT_ROYALTY_VAULT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponentRoyaltyVaultBalance(Boolean componentRoyaltyVaultBalance) {
    this.componentRoyaltyVaultBalance = componentRoyaltyVaultBalance;
  }

  public StateEntityDetailsOptIns packageRoyaltyVaultBalance(Boolean packageRoyaltyVaultBalance) {
    
    this.packageRoyaltyVaultBalance = packageRoyaltyVaultBalance;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, &#x60;royalty_vault_balance&#x60; for package entities is returned.
   * @return packageRoyaltyVaultBalance
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKAGE_ROYALTY_VAULT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isPackageRoyaltyVaultBalance() {
    return packageRoyaltyVaultBalance;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_ROYALTY_VAULT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageRoyaltyVaultBalance(Boolean packageRoyaltyVaultBalance) {
    this.packageRoyaltyVaultBalance = packageRoyaltyVaultBalance;
  }

  public StateEntityDetailsOptIns nonFungibleIncludeNfids(Boolean nonFungibleIncludeNfids) {
    
    this.nonFungibleIncludeNfids = nonFungibleIncludeNfids;
    return this;
  }

  /**
   * if set to &#x60;true&#x60;, first page of non fungible ids are returned for each non fungible resource, with &#x60;next_cursor&#x60; which can be later used at &#x60;/state/entity/page/non-fungible-vault/ids&#x60; endpoint.
   * @return nonFungibleIncludeNfids
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_INCLUDE_NFIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isNonFungibleIncludeNfids() {
    return nonFungibleIncludeNfids;
  }


  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_INCLUDE_NFIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonFungibleIncludeNfids(Boolean nonFungibleIncludeNfids) {
    this.nonFungibleIncludeNfids = nonFungibleIncludeNfids;
  }

  public StateEntityDetailsOptIns explicitMetadata(List<String> explicitMetadata) {
    
    this.explicitMetadata = explicitMetadata;
    return this;
  }

  public StateEntityDetailsOptIns addExplicitMetadataItem(String explicitMetadataItem) {
    if (this.explicitMetadata == null) {
      this.explicitMetadata = new ArrayList<>();
    }
    this.explicitMetadata.add(explicitMetadataItem);
    return this;
  }

  /**
   * allows specifying explicitly metadata properties which should be returned in response.
   * @return explicitMetadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPLICIT_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExplicitMetadata() {
    return explicitMetadata;
  }


  @JsonProperty(JSON_PROPERTY_EXPLICIT_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExplicitMetadata(List<String> explicitMetadata) {
    this.explicitMetadata = explicitMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateEntityDetailsOptIns stateEntityDetailsOptIns = (StateEntityDetailsOptIns) o;
    return Objects.equals(this.ancestorIdentities, stateEntityDetailsOptIns.ancestorIdentities) &&
        Objects.equals(this.componentRoyaltyConfig, stateEntityDetailsOptIns.componentRoyaltyConfig) &&
        Objects.equals(this.componentRoyaltyVaultBalance, stateEntityDetailsOptIns.componentRoyaltyVaultBalance) &&
        Objects.equals(this.packageRoyaltyVaultBalance, stateEntityDetailsOptIns.packageRoyaltyVaultBalance) &&
        Objects.equals(this.nonFungibleIncludeNfids, stateEntityDetailsOptIns.nonFungibleIncludeNfids) &&
        Objects.equals(this.explicitMetadata, stateEntityDetailsOptIns.explicitMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestorIdentities, componentRoyaltyConfig, componentRoyaltyVaultBalance, packageRoyaltyVaultBalance, nonFungibleIncludeNfids, explicitMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateEntityDetailsOptIns {\n");
    sb.append("    ancestorIdentities: ").append(toIndentedString(ancestorIdentities)).append("\n");
    sb.append("    componentRoyaltyConfig: ").append(toIndentedString(componentRoyaltyConfig)).append("\n");
    sb.append("    componentRoyaltyVaultBalance: ").append(toIndentedString(componentRoyaltyVaultBalance)).append("\n");
    sb.append("    packageRoyaltyVaultBalance: ").append(toIndentedString(packageRoyaltyVaultBalance)).append("\n");
    sb.append("    nonFungibleIncludeNfids: ").append(toIndentedString(nonFungibleIncludeNfids)).append("\n");
    sb.append("    explicitMetadata: ").append(toIndentedString(explicitMetadata)).append("\n");
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

    // add `ancestor_identities` to the URL query string
    if (isAncestorIdentities() != null) {
      try {
        joiner.add(String.format("%sancestor_identities%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isAncestorIdentities()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `component_royalty_config` to the URL query string
    if (isComponentRoyaltyConfig() != null) {
      try {
        joiner.add(String.format("%scomponent_royalty_config%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isComponentRoyaltyConfig()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `component_royalty_vault_balance` to the URL query string
    if (isComponentRoyaltyVaultBalance() != null) {
      try {
        joiner.add(String.format("%scomponent_royalty_vault_balance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isComponentRoyaltyVaultBalance()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `package_royalty_vault_balance` to the URL query string
    if (isPackageRoyaltyVaultBalance() != null) {
      try {
        joiner.add(String.format("%spackage_royalty_vault_balance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isPackageRoyaltyVaultBalance()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `non_fungible_include_nfids` to the URL query string
    if (isNonFungibleIncludeNfids() != null) {
      try {
        joiner.add(String.format("%snon_fungible_include_nfids%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isNonFungibleIncludeNfids()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `explicit_metadata` to the URL query string
    if (getExplicitMetadata() != null) {
      for (int i = 0; i < getExplicitMetadata().size(); i++) {
        try {
          joiner.add(String.format("%sexplicit_metadata%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExplicitMetadata().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}


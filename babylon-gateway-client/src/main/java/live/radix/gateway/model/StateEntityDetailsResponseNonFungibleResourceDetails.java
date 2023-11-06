/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.2.0
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
import live.radix.gateway.model.NonFungibleIdType;
import live.radix.gateway.model.StateEntityDetailsResponseItemDetails;
import live.radix.gateway.model.StateEntityDetailsResponseItemDetailsType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * StateEntityDetailsResponseNonFungibleResourceDetails
 */
@JsonPropertyOrder({
  StateEntityDetailsResponseNonFungibleResourceDetails.JSON_PROPERTY_ROLE_ASSIGNMENTS,
  StateEntityDetailsResponseNonFungibleResourceDetails.JSON_PROPERTY_NON_FUNGIBLE_ID_TYPE,
  StateEntityDetailsResponseNonFungibleResourceDetails.JSON_PROPERTY_TOTAL_SUPPLY,
  StateEntityDetailsResponseNonFungibleResourceDetails.JSON_PROPERTY_TOTAL_MINTED,
  StateEntityDetailsResponseNonFungibleResourceDetails.JSON_PROPERTY_TOTAL_BURNED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:53:11.950430200+02:00[Europe/Kiev]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class StateEntityDetailsResponseNonFungibleResourceDetails extends StateEntityDetailsResponseItemDetails {
  public static final String JSON_PROPERTY_ROLE_ASSIGNMENTS = "role_assignments";
  private ComponentEntityRoleAssignments roleAssignments;

  public static final String JSON_PROPERTY_NON_FUNGIBLE_ID_TYPE = "non_fungible_id_type";
  private NonFungibleIdType nonFungibleIdType;

  public static final String JSON_PROPERTY_TOTAL_SUPPLY = "total_supply";
  private String totalSupply;

  public static final String JSON_PROPERTY_TOTAL_MINTED = "total_minted";
  private String totalMinted;

  public static final String JSON_PROPERTY_TOTAL_BURNED = "total_burned";
  private String totalBurned;

  public StateEntityDetailsResponseNonFungibleResourceDetails() {

  }

  public StateEntityDetailsResponseNonFungibleResourceDetails roleAssignments(ComponentEntityRoleAssignments roleAssignments) {
    
    this.roleAssignments = roleAssignments;
    return this;
  }

   /**
   * Get roleAssignments
   * @return roleAssignments
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE_ASSIGNMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ComponentEntityRoleAssignments getRoleAssignments() {
    return roleAssignments;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ASSIGNMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoleAssignments(ComponentEntityRoleAssignments roleAssignments) {
    this.roleAssignments = roleAssignments;
  }


  public StateEntityDetailsResponseNonFungibleResourceDetails nonFungibleIdType(NonFungibleIdType nonFungibleIdType) {
    
    this.nonFungibleIdType = nonFungibleIdType;
    return this;
  }

   /**
   * Get nonFungibleIdType
   * @return nonFungibleIdType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NonFungibleIdType getNonFungibleIdType() {
    return nonFungibleIdType;
  }


  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNonFungibleIdType(NonFungibleIdType nonFungibleIdType) {
    this.nonFungibleIdType = nonFungibleIdType;
  }


  public StateEntityDetailsResponseNonFungibleResourceDetails totalSupply(String totalSupply) {
    
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * String-encoded decimal representing the amount of a related fungible resource.
   * @return totalSupply
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalSupply() {
    return totalSupply;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }


  public StateEntityDetailsResponseNonFungibleResourceDetails totalMinted(String totalMinted) {
    
    this.totalMinted = totalMinted;
    return this;
  }

   /**
   * String-encoded decimal representing the amount of a related fungible resource.
   * @return totalMinted
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_MINTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalMinted() {
    return totalMinted;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_MINTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalMinted(String totalMinted) {
    this.totalMinted = totalMinted;
  }


  public StateEntityDetailsResponseNonFungibleResourceDetails totalBurned(String totalBurned) {
    
    this.totalBurned = totalBurned;
    return this;
  }

   /**
   * String-encoded decimal representing the amount of a related fungible resource.
   * @return totalBurned
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_BURNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalBurned() {
    return totalBurned;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_BURNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalBurned(String totalBurned) {
    this.totalBurned = totalBurned;
  }

  @Override
  public StateEntityDetailsResponseNonFungibleResourceDetails type(StateEntityDetailsResponseItemDetailsType type) {
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
    StateEntityDetailsResponseNonFungibleResourceDetails stateEntityDetailsResponseNonFungibleResourceDetails = (StateEntityDetailsResponseNonFungibleResourceDetails) o;
    return Objects.equals(this.roleAssignments, stateEntityDetailsResponseNonFungibleResourceDetails.roleAssignments) &&
        Objects.equals(this.nonFungibleIdType, stateEntityDetailsResponseNonFungibleResourceDetails.nonFungibleIdType) &&
        Objects.equals(this.totalSupply, stateEntityDetailsResponseNonFungibleResourceDetails.totalSupply) &&
        Objects.equals(this.totalMinted, stateEntityDetailsResponseNonFungibleResourceDetails.totalMinted) &&
        Objects.equals(this.totalBurned, stateEntityDetailsResponseNonFungibleResourceDetails.totalBurned) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleAssignments, nonFungibleIdType, totalSupply, totalMinted, totalBurned, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateEntityDetailsResponseNonFungibleResourceDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    roleAssignments: ").append(toIndentedString(roleAssignments)).append("\n");
    sb.append("    nonFungibleIdType: ").append(toIndentedString(nonFungibleIdType)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    totalMinted: ").append(toIndentedString(totalMinted)).append("\n");
    sb.append("    totalBurned: ").append(toIndentedString(totalBurned)).append("\n");
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

    // add `role_assignments` to the URL query string
    if (getRoleAssignments() != null) {
      joiner.add(getRoleAssignments().toUrlQueryString(prefix + "role_assignments" + suffix));
    }

    // add `non_fungible_id_type` to the URL query string
    if (getNonFungibleIdType() != null) {
      try {
        joiner.add(String.format("%snon_fungible_id_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNonFungibleIdType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `total_supply` to the URL query string
    if (getTotalSupply() != null) {
      try {
        joiner.add(String.format("%stotal_supply%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalSupply()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `total_minted` to the URL query string
    if (getTotalMinted() != null) {
      try {
        joiner.add(String.format("%stotal_minted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalMinted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `total_burned` to the URL query string
    if (getTotalBurned() != null) {
      try {
        joiner.add(String.format("%stotal_burned%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalBurned()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


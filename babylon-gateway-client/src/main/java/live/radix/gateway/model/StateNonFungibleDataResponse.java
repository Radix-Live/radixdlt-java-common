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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import live.radix.gateway.model.LedgerState;
import live.radix.gateway.model.NonFungibleIdType;
import live.radix.gateway.model.StateNonFungibleDetailsResponseItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * StateNonFungibleDataResponse
 */
@JsonPropertyOrder({
  StateNonFungibleDataResponse.JSON_PROPERTY_LEDGER_STATE,
  StateNonFungibleDataResponse.JSON_PROPERTY_RESOURCE_ADDRESS,
  StateNonFungibleDataResponse.JSON_PROPERTY_NON_FUNGIBLE_ID_TYPE,
  StateNonFungibleDataResponse.JSON_PROPERTY_NON_FUNGIBLE_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:53:11.950430200+02:00[Europe/Kiev]")
public class StateNonFungibleDataResponse {
  public static final String JSON_PROPERTY_LEDGER_STATE = "ledger_state";
  private LedgerState ledgerState;

  public static final String JSON_PROPERTY_RESOURCE_ADDRESS = "resource_address";
  private String resourceAddress;

  public static final String JSON_PROPERTY_NON_FUNGIBLE_ID_TYPE = "non_fungible_id_type";
  private NonFungibleIdType nonFungibleIdType;

  public static final String JSON_PROPERTY_NON_FUNGIBLE_IDS = "non_fungible_ids";
  private List<StateNonFungibleDetailsResponseItem> nonFungibleIds = new ArrayList<>();

  public StateNonFungibleDataResponse() {
  }

  public StateNonFungibleDataResponse ledgerState(LedgerState ledgerState) {
    
    this.ledgerState = ledgerState;
    return this;
  }

   /**
   * Get ledgerState
   * @return ledgerState
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LEDGER_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LedgerState getLedgerState() {
    return ledgerState;
  }


  @JsonProperty(JSON_PROPERTY_LEDGER_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLedgerState(LedgerState ledgerState) {
    this.ledgerState = ledgerState;
  }


  public StateNonFungibleDataResponse resourceAddress(String resourceAddress) {
    
    this.resourceAddress = resourceAddress;
    return this;
  }

   /**
   * Bech32m-encoded human readable version of the address.
   * @return resourceAddress
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResourceAddress() {
    return resourceAddress;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceAddress(String resourceAddress) {
    this.resourceAddress = resourceAddress;
  }


  public StateNonFungibleDataResponse nonFungibleIdType(NonFungibleIdType nonFungibleIdType) {
    
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


  public StateNonFungibleDataResponse nonFungibleIds(List<StateNonFungibleDetailsResponseItem> nonFungibleIds) {
    
    this.nonFungibleIds = nonFungibleIds;
    return this;
  }

  public StateNonFungibleDataResponse addNonFungibleIdsItem(StateNonFungibleDetailsResponseItem nonFungibleIdsItem) {
    if (this.nonFungibleIds == null) {
      this.nonFungibleIds = new ArrayList<>();
    }
    this.nonFungibleIds.add(nonFungibleIdsItem);
    return this;
  }

   /**
   * Get nonFungibleIds
   * @return nonFungibleIds
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StateNonFungibleDetailsResponseItem> getNonFungibleIds() {
    return nonFungibleIds;
  }


  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNonFungibleIds(List<StateNonFungibleDetailsResponseItem> nonFungibleIds) {
    this.nonFungibleIds = nonFungibleIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateNonFungibleDataResponse stateNonFungibleDataResponse = (StateNonFungibleDataResponse) o;
    return Objects.equals(this.ledgerState, stateNonFungibleDataResponse.ledgerState) &&
        Objects.equals(this.resourceAddress, stateNonFungibleDataResponse.resourceAddress) &&
        Objects.equals(this.nonFungibleIdType, stateNonFungibleDataResponse.nonFungibleIdType) &&
        Objects.equals(this.nonFungibleIds, stateNonFungibleDataResponse.nonFungibleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ledgerState, resourceAddress, nonFungibleIdType, nonFungibleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateNonFungibleDataResponse {\n");
    sb.append("    ledgerState: ").append(toIndentedString(ledgerState)).append("\n");
    sb.append("    resourceAddress: ").append(toIndentedString(resourceAddress)).append("\n");
    sb.append("    nonFungibleIdType: ").append(toIndentedString(nonFungibleIdType)).append("\n");
    sb.append("    nonFungibleIds: ").append(toIndentedString(nonFungibleIds)).append("\n");
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

    // add `ledger_state` to the URL query string
    if (getLedgerState() != null) {
      joiner.add(getLedgerState().toUrlQueryString(prefix + "ledger_state" + suffix));
    }

    // add `resource_address` to the URL query string
    if (getResourceAddress() != null) {
      try {
        joiner.add(String.format("%sresource_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResourceAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `non_fungible_ids` to the URL query string
    if (getNonFungibleIds() != null) {
      for (int i = 0; i < getNonFungibleIds().size(); i++) {
        if (getNonFungibleIds().get(i) != null) {
          joiner.add(getNonFungibleIds().get(i).toUrlQueryString(String.format("%snon_fungible_ids%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}


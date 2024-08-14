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
import live.radix.gateway.model.ScryptoSborValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * StateNonFungibleDetailsResponseItem
 */
@JsonPropertyOrder({
  StateNonFungibleDetailsResponseItem.JSON_PROPERTY_IS_BURNED,
  StateNonFungibleDetailsResponseItem.JSON_PROPERTY_NON_FUNGIBLE_ID,
  StateNonFungibleDetailsResponseItem.JSON_PROPERTY_DATA,
  StateNonFungibleDetailsResponseItem.JSON_PROPERTY_LAST_UPDATED_AT_STATE_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-15T00:18:13.130575900+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class StateNonFungibleDetailsResponseItem {
  public static final String JSON_PROPERTY_IS_BURNED = "is_burned";
  private Boolean isBurned;

  public static final String JSON_PROPERTY_NON_FUNGIBLE_ID = "non_fungible_id";
  private String nonFungibleId;

  public static final String JSON_PROPERTY_DATA = "data";
  private ScryptoSborValue data;

  public static final String JSON_PROPERTY_LAST_UPDATED_AT_STATE_VERSION = "last_updated_at_state_version";
  private Long lastUpdatedAtStateVersion;

  public StateNonFungibleDetailsResponseItem() {
  }

  public StateNonFungibleDetailsResponseItem isBurned(Boolean isBurned) {
    
    this.isBurned = isBurned;
    return this;
  }

  /**
   * Get isBurned
   * @return isBurned
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_BURNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsBurned() {
    return isBurned;
  }


  @JsonProperty(JSON_PROPERTY_IS_BURNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsBurned(Boolean isBurned) {
    this.isBurned = isBurned;
  }

  public StateNonFungibleDetailsResponseItem nonFungibleId(String nonFungibleId) {
    
    this.nonFungibleId = nonFungibleId;
    return this;
  }

  /**
   * String-encoded non-fungible ID.
   * @return nonFungibleId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNonFungibleId() {
    return nonFungibleId;
  }


  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNonFungibleId(String nonFungibleId) {
    this.nonFungibleId = nonFungibleId;
  }

  public StateNonFungibleDetailsResponseItem data(ScryptoSborValue data) {
    
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScryptoSborValue getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(ScryptoSborValue data) {
    this.data = data;
  }

  public StateNonFungibleDetailsResponseItem lastUpdatedAtStateVersion(Long lastUpdatedAtStateVersion) {
    
    this.lastUpdatedAtStateVersion = lastUpdatedAtStateVersion;
    return this;
  }

  /**
   * The most recent state version underlying object was modified at.
   * minimum: 1
   * maximum: 100000000000000
   * @return lastUpdatedAtStateVersion
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getLastUpdatedAtStateVersion() {
    return lastUpdatedAtStateVersion;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastUpdatedAtStateVersion(Long lastUpdatedAtStateVersion) {
    this.lastUpdatedAtStateVersion = lastUpdatedAtStateVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateNonFungibleDetailsResponseItem stateNonFungibleDetailsResponseItem = (StateNonFungibleDetailsResponseItem) o;
    return Objects.equals(this.isBurned, stateNonFungibleDetailsResponseItem.isBurned) &&
        Objects.equals(this.nonFungibleId, stateNonFungibleDetailsResponseItem.nonFungibleId) &&
        Objects.equals(this.data, stateNonFungibleDetailsResponseItem.data) &&
        Objects.equals(this.lastUpdatedAtStateVersion, stateNonFungibleDetailsResponseItem.lastUpdatedAtStateVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBurned, nonFungibleId, data, lastUpdatedAtStateVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateNonFungibleDetailsResponseItem {\n");
    sb.append("    isBurned: ").append(toIndentedString(isBurned)).append("\n");
    sb.append("    nonFungibleId: ").append(toIndentedString(nonFungibleId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    lastUpdatedAtStateVersion: ").append(toIndentedString(lastUpdatedAtStateVersion)).append("\n");
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

    // add `is_burned` to the URL query string
    if (isIsBurned() != null) {
      try {
        joiner.add(String.format("%sis_burned%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsBurned()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `non_fungible_id` to the URL query string
    if (getNonFungibleId() != null) {
      try {
        joiner.add(String.format("%snon_fungible_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNonFungibleId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `data` to the URL query string
    if (getData() != null) {
      joiner.add(getData().toUrlQueryString(prefix + "data" + suffix));
    }

    // add `last_updated_at_state_version` to the URL query string
    if (getLastUpdatedAtStateVersion() != null) {
      try {
        joiner.add(String.format("%slast_updated_at_state_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastUpdatedAtStateVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


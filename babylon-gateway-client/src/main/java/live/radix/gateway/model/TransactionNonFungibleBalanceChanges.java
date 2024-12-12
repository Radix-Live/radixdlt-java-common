/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.9.2-L
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
 * TransactionNonFungibleBalanceChanges
 */
@JsonPropertyOrder({
  TransactionNonFungibleBalanceChanges.JSON_PROPERTY_ENTITY_ADDRESS,
  TransactionNonFungibleBalanceChanges.JSON_PROPERTY_RESOURCE_ADDRESS,
  TransactionNonFungibleBalanceChanges.JSON_PROPERTY_ADDED,
  TransactionNonFungibleBalanceChanges.JSON_PROPERTY_REMOVED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T19:38:04.213407200+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class TransactionNonFungibleBalanceChanges {
  public static final String JSON_PROPERTY_ENTITY_ADDRESS = "entity_address";
  private String entityAddress;

  public static final String JSON_PROPERTY_RESOURCE_ADDRESS = "resource_address";
  private String resourceAddress;

  public static final String JSON_PROPERTY_ADDED = "added";
  private List<String> added = new ArrayList<>();

  public static final String JSON_PROPERTY_REMOVED = "removed";
  private List<String> removed = new ArrayList<>();

  public TransactionNonFungibleBalanceChanges() {
  }

  public TransactionNonFungibleBalanceChanges entityAddress(String entityAddress) {
    
    this.entityAddress = entityAddress;
    return this;
  }

  /**
   * Bech32m-encoded human readable version of the address.
   * @return entityAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTITY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntityAddress() {
    return entityAddress;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityAddress(String entityAddress) {
    this.entityAddress = entityAddress;
  }

  public TransactionNonFungibleBalanceChanges resourceAddress(String resourceAddress) {
    
    this.resourceAddress = resourceAddress;
    return this;
  }

  /**
   * Bech32m-encoded human readable version of the address.
   * @return resourceAddress
   */
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

  public TransactionNonFungibleBalanceChanges added(List<String> added) {
    
    this.added = added;
    return this;
  }

  public TransactionNonFungibleBalanceChanges addAddedItem(String addedItem) {
    if (this.added == null) {
      this.added = new ArrayList<>();
    }
    this.added.add(addedItem);
    return this;
  }

  /**
   * Get added
   * @return added
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAdded() {
    return added;
  }


  @JsonProperty(JSON_PROPERTY_ADDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdded(List<String> added) {
    this.added = added;
  }

  public TransactionNonFungibleBalanceChanges removed(List<String> removed) {
    
    this.removed = removed;
    return this;
  }

  public TransactionNonFungibleBalanceChanges addRemovedItem(String removedItem) {
    if (this.removed == null) {
      this.removed = new ArrayList<>();
    }
    this.removed.add(removedItem);
    return this;
  }

  /**
   * Get removed
   * @return removed
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REMOVED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getRemoved() {
    return removed;
  }


  @JsonProperty(JSON_PROPERTY_REMOVED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRemoved(List<String> removed) {
    this.removed = removed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionNonFungibleBalanceChanges transactionNonFungibleBalanceChanges = (TransactionNonFungibleBalanceChanges) o;
    return Objects.equals(this.entityAddress, transactionNonFungibleBalanceChanges.entityAddress) &&
        Objects.equals(this.resourceAddress, transactionNonFungibleBalanceChanges.resourceAddress) &&
        Objects.equals(this.added, transactionNonFungibleBalanceChanges.added) &&
        Objects.equals(this.removed, transactionNonFungibleBalanceChanges.removed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityAddress, resourceAddress, added, removed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionNonFungibleBalanceChanges {\n");
    sb.append("    entityAddress: ").append(toIndentedString(entityAddress)).append("\n");
    sb.append("    resourceAddress: ").append(toIndentedString(resourceAddress)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
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

    // add `entity_address` to the URL query string
    if (getEntityAddress() != null) {
      try {
        joiner.add(String.format("%sentity_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `added` to the URL query string
    if (getAdded() != null) {
      for (int i = 0; i < getAdded().size(); i++) {
        try {
          joiner.add(String.format("%sadded%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getAdded().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `removed` to the URL query string
    if (getRemoved() != null) {
      for (int i = 0; i < getRemoved().size(); i++) {
        try {
          joiner.add(String.format("%sremoved%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getRemoved().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}


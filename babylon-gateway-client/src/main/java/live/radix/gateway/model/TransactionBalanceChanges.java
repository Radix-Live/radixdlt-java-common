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
import live.radix.gateway.model.TransactionFungibleBalanceChanges;
import live.radix.gateway.model.TransactionFungibleFeeBalanceChanges;
import live.radix.gateway.model.TransactionNonFungibleBalanceChanges;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionBalanceChanges
 */
@JsonPropertyOrder({
  TransactionBalanceChanges.JSON_PROPERTY_FUNGIBLE_FEE_BALANCE_CHANGES,
  TransactionBalanceChanges.JSON_PROPERTY_FUNGIBLE_BALANCE_CHANGES,
  TransactionBalanceChanges.JSON_PROPERTY_NON_FUNGIBLE_BALANCE_CHANGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:53:11.950430200+02:00[Europe/Kiev]")
public class TransactionBalanceChanges {
  public static final String JSON_PROPERTY_FUNGIBLE_FEE_BALANCE_CHANGES = "fungible_fee_balance_changes";
  private List<TransactionFungibleFeeBalanceChanges> fungibleFeeBalanceChanges = new ArrayList<>();

  public static final String JSON_PROPERTY_FUNGIBLE_BALANCE_CHANGES = "fungible_balance_changes";
  private List<TransactionFungibleBalanceChanges> fungibleBalanceChanges = new ArrayList<>();

  public static final String JSON_PROPERTY_NON_FUNGIBLE_BALANCE_CHANGES = "non_fungible_balance_changes";
  private List<TransactionNonFungibleBalanceChanges> nonFungibleBalanceChanges = new ArrayList<>();

  public TransactionBalanceChanges() {
  }

  public TransactionBalanceChanges fungibleFeeBalanceChanges(List<TransactionFungibleFeeBalanceChanges> fungibleFeeBalanceChanges) {
    
    this.fungibleFeeBalanceChanges = fungibleFeeBalanceChanges;
    return this;
  }

  public TransactionBalanceChanges addFungibleFeeBalanceChangesItem(TransactionFungibleFeeBalanceChanges fungibleFeeBalanceChangesItem) {
    if (this.fungibleFeeBalanceChanges == null) {
      this.fungibleFeeBalanceChanges = new ArrayList<>();
    }
    this.fungibleFeeBalanceChanges.add(fungibleFeeBalanceChangesItem);
    return this;
  }

   /**
   * A list of all fee-related fungible balance changes per entity and resource. 
   * @return fungibleFeeBalanceChanges
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FUNGIBLE_FEE_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TransactionFungibleFeeBalanceChanges> getFungibleFeeBalanceChanges() {
    return fungibleFeeBalanceChanges;
  }


  @JsonProperty(JSON_PROPERTY_FUNGIBLE_FEE_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFungibleFeeBalanceChanges(List<TransactionFungibleFeeBalanceChanges> fungibleFeeBalanceChanges) {
    this.fungibleFeeBalanceChanges = fungibleFeeBalanceChanges;
  }


  public TransactionBalanceChanges fungibleBalanceChanges(List<TransactionFungibleBalanceChanges> fungibleBalanceChanges) {
    
    this.fungibleBalanceChanges = fungibleBalanceChanges;
    return this;
  }

  public TransactionBalanceChanges addFungibleBalanceChangesItem(TransactionFungibleBalanceChanges fungibleBalanceChangesItem) {
    if (this.fungibleBalanceChanges == null) {
      this.fungibleBalanceChanges = new ArrayList<>();
    }
    this.fungibleBalanceChanges.add(fungibleBalanceChangesItem);
    return this;
  }

   /**
   * A list of all non-fee-related fungible balance changes per entity and resource. 
   * @return fungibleBalanceChanges
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FUNGIBLE_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TransactionFungibleBalanceChanges> getFungibleBalanceChanges() {
    return fungibleBalanceChanges;
  }


  @JsonProperty(JSON_PROPERTY_FUNGIBLE_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFungibleBalanceChanges(List<TransactionFungibleBalanceChanges> fungibleBalanceChanges) {
    this.fungibleBalanceChanges = fungibleBalanceChanges;
  }


  public TransactionBalanceChanges nonFungibleBalanceChanges(List<TransactionNonFungibleBalanceChanges> nonFungibleBalanceChanges) {
    
    this.nonFungibleBalanceChanges = nonFungibleBalanceChanges;
    return this;
  }

  public TransactionBalanceChanges addNonFungibleBalanceChangesItem(TransactionNonFungibleBalanceChanges nonFungibleBalanceChangesItem) {
    if (this.nonFungibleBalanceChanges == null) {
      this.nonFungibleBalanceChanges = new ArrayList<>();
    }
    this.nonFungibleBalanceChanges.add(nonFungibleBalanceChangesItem);
    return this;
  }

   /**
   * A list of all non-fungible changes per entity and resource. 
   * @return nonFungibleBalanceChanges
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TransactionNonFungibleBalanceChanges> getNonFungibleBalanceChanges() {
    return nonFungibleBalanceChanges;
  }


  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNonFungibleBalanceChanges(List<TransactionNonFungibleBalanceChanges> nonFungibleBalanceChanges) {
    this.nonFungibleBalanceChanges = nonFungibleBalanceChanges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionBalanceChanges transactionBalanceChanges = (TransactionBalanceChanges) o;
    return Objects.equals(this.fungibleFeeBalanceChanges, transactionBalanceChanges.fungibleFeeBalanceChanges) &&
        Objects.equals(this.fungibleBalanceChanges, transactionBalanceChanges.fungibleBalanceChanges) &&
        Objects.equals(this.nonFungibleBalanceChanges, transactionBalanceChanges.nonFungibleBalanceChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fungibleFeeBalanceChanges, fungibleBalanceChanges, nonFungibleBalanceChanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionBalanceChanges {\n");
    sb.append("    fungibleFeeBalanceChanges: ").append(toIndentedString(fungibleFeeBalanceChanges)).append("\n");
    sb.append("    fungibleBalanceChanges: ").append(toIndentedString(fungibleBalanceChanges)).append("\n");
    sb.append("    nonFungibleBalanceChanges: ").append(toIndentedString(nonFungibleBalanceChanges)).append("\n");
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

    // add `fungible_fee_balance_changes` to the URL query string
    if (getFungibleFeeBalanceChanges() != null) {
      for (int i = 0; i < getFungibleFeeBalanceChanges().size(); i++) {
        if (getFungibleFeeBalanceChanges().get(i) != null) {
          joiner.add(getFungibleFeeBalanceChanges().get(i).toUrlQueryString(String.format("%sfungible_fee_balance_changes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `fungible_balance_changes` to the URL query string
    if (getFungibleBalanceChanges() != null) {
      for (int i = 0; i < getFungibleBalanceChanges().size(); i++) {
        if (getFungibleBalanceChanges().get(i) != null) {
          joiner.add(getFungibleBalanceChanges().get(i).toUrlQueryString(String.format("%sfungible_balance_changes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `non_fungible_balance_changes` to the URL query string
    if (getNonFungibleBalanceChanges() != null) {
      for (int i = 0; i < getNonFungibleBalanceChanges().size(); i++) {
        if (getNonFungibleBalanceChanges().get(i) != null) {
          joiner.add(getNonFungibleBalanceChanges().get(i).toUrlQueryString(String.format("%snon_fungible_balance_changes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

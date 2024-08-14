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
import live.radix.gateway.model.AccountAuthorizedDepositorsResponseItem;
import live.radix.gateway.model.LedgerState;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * StateAccountAuthorizedDepositorsPageResponse
 */
@JsonPropertyOrder({
  StateAccountAuthorizedDepositorsPageResponse.JSON_PROPERTY_LEDGER_STATE,
  StateAccountAuthorizedDepositorsPageResponse.JSON_PROPERTY_TOTAL_COUNT,
  StateAccountAuthorizedDepositorsPageResponse.JSON_PROPERTY_NEXT_CURSOR,
  StateAccountAuthorizedDepositorsPageResponse.JSON_PROPERTY_ITEMS,
  StateAccountAuthorizedDepositorsPageResponse.JSON_PROPERTY_ACCOUNT_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-15T00:18:13.130575900+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class StateAccountAuthorizedDepositorsPageResponse {
  public static final String JSON_PROPERTY_LEDGER_STATE = "ledger_state";
  private LedgerState ledgerState;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;

  public static final String JSON_PROPERTY_NEXT_CURSOR = "next_cursor";
  private String nextCursor;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<AccountAuthorizedDepositorsResponseItem> items = new ArrayList<>();

  public static final String JSON_PROPERTY_ACCOUNT_ADDRESS = "account_address";
  private String accountAddress;

  public StateAccountAuthorizedDepositorsPageResponse() {
  }

  public StateAccountAuthorizedDepositorsPageResponse ledgerState(LedgerState ledgerState) {
    
    this.ledgerState = ledgerState;
    return this;
  }

  /**
   * Get ledgerState
   * @return ledgerState
   */
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

  public StateAccountAuthorizedDepositorsPageResponse totalCount(Long totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total number of items in underlying collection, fragment of which is available in &#x60;items&#x60; collection.
   * @return totalCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public StateAccountAuthorizedDepositorsPageResponse nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

  /**
   * If specified, contains a cursor to query next page of the &#x60;items&#x60; collection.
   * @return nextCursor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextCursor() {
    return nextCursor;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }

  public StateAccountAuthorizedDepositorsPageResponse items(List<AccountAuthorizedDepositorsResponseItem> items) {
    
    this.items = items;
    return this;
  }

  public StateAccountAuthorizedDepositorsPageResponse addItemsItem(AccountAuthorizedDepositorsResponseItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AccountAuthorizedDepositorsResponseItem> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(List<AccountAuthorizedDepositorsResponseItem> items) {
    this.items = items;
  }

  public StateAccountAuthorizedDepositorsPageResponse accountAddress(String accountAddress) {
    
    this.accountAddress = accountAddress;
    return this;
  }

  /**
   * Bech32m-encoded human readable version of the address.
   * @return accountAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountAddress() {
    return accountAddress;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountAddress(String accountAddress) {
    this.accountAddress = accountAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateAccountAuthorizedDepositorsPageResponse stateAccountAuthorizedDepositorsPageResponse = (StateAccountAuthorizedDepositorsPageResponse) o;
    return Objects.equals(this.ledgerState, stateAccountAuthorizedDepositorsPageResponse.ledgerState) &&
        Objects.equals(this.totalCount, stateAccountAuthorizedDepositorsPageResponse.totalCount) &&
        Objects.equals(this.nextCursor, stateAccountAuthorizedDepositorsPageResponse.nextCursor) &&
        Objects.equals(this.items, stateAccountAuthorizedDepositorsPageResponse.items) &&
        Objects.equals(this.accountAddress, stateAccountAuthorizedDepositorsPageResponse.accountAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ledgerState, totalCount, nextCursor, items, accountAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateAccountAuthorizedDepositorsPageResponse {\n");
    sb.append("    ledgerState: ").append(toIndentedString(ledgerState)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    accountAddress: ").append(toIndentedString(accountAddress)).append("\n");
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

    // add `total_count` to the URL query string
    if (getTotalCount() != null) {
      try {
        joiner.add(String.format("%stotal_count%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `next_cursor` to the URL query string
    if (getNextCursor() != null) {
      try {
        joiner.add(String.format("%snext_cursor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextCursor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `items` to the URL query string
    if (getItems() != null) {
      for (int i = 0; i < getItems().size(); i++) {
        if (getItems().get(i) != null) {
          joiner.add(getItems().get(i).toUrlQueryString(String.format("%sitems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `account_address` to the URL query string
    if (getAccountAddress() != null) {
      try {
        joiner.add(String.format("%saccount_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


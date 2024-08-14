/*
 * Radix Core API - Babylon (Bottlenose)
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  The default configuration is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function. The node exposes a configuration flag which allows disabling certain endpoints which may be problematic, but monitoring is advised. This configuration parameter is `api.core.flags.enable_unbounded_endpoints` / `RADIXDLT_CORE_API_FLAGS_ENABLE_UNBOUNDED_ENDPOINTS`.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` have high guarantees of forward compatibility in future node versions. We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code.  Other endpoints may be changed with new node versions carrying protocol-updates, although any breaking changes will be flagged clearly in the corresponding release notes.  All responses may have additional fields added, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects. 
 *
 * The version of the OpenAPI document: v1.2.1
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
import live.radix.core.model.LedgerHeaderSummary;
import live.radix.core.model.LtsFungibleResourceBalance;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * LtsStateAccountFungibleResourceBalanceResponse
 */
@JsonPropertyOrder({
  LtsStateAccountFungibleResourceBalanceResponse.JSON_PROPERTY_STATE_VERSION,
  LtsStateAccountFungibleResourceBalanceResponse.JSON_PROPERTY_LEDGER_HEADER_SUMMARY,
  LtsStateAccountFungibleResourceBalanceResponse.JSON_PROPERTY_ACCOUNT_ADDRESS,
  LtsStateAccountFungibleResourceBalanceResponse.JSON_PROPERTY_FUNGIBLE_RESOURCE_BALANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class LtsStateAccountFungibleResourceBalanceResponse {
  public static final String JSON_PROPERTY_STATE_VERSION = "state_version";
  private Long stateVersion;

  public static final String JSON_PROPERTY_LEDGER_HEADER_SUMMARY = "ledger_header_summary";
  private LedgerHeaderSummary ledgerHeaderSummary;

  public static final String JSON_PROPERTY_ACCOUNT_ADDRESS = "account_address";
  private String accountAddress;

  public static final String JSON_PROPERTY_FUNGIBLE_RESOURCE_BALANCE = "fungible_resource_balance";
  private LtsFungibleResourceBalance fungibleResourceBalance;

  public LtsStateAccountFungibleResourceBalanceResponse() {
  }

  public LtsStateAccountFungibleResourceBalanceResponse stateVersion(Long stateVersion) {
    
    this.stateVersion = stateVersion;
    return this;
  }

  /**
   * Get stateVersion
   * minimum: 1
   * maximum: 100000000000000
   * @return stateVersion
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getStateVersion() {
    return stateVersion;
  }


  @JsonProperty(JSON_PROPERTY_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStateVersion(Long stateVersion) {
    this.stateVersion = stateVersion;
  }

  public LtsStateAccountFungibleResourceBalanceResponse ledgerHeaderSummary(LedgerHeaderSummary ledgerHeaderSummary) {
    
    this.ledgerHeaderSummary = ledgerHeaderSummary;
    return this;
  }

  /**
   * The excerpt from the ledger header committed at the &#x60;state_version&#x60;.
   * @return ledgerHeaderSummary
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LEDGER_HEADER_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LedgerHeaderSummary getLedgerHeaderSummary() {
    return ledgerHeaderSummary;
  }


  @JsonProperty(JSON_PROPERTY_LEDGER_HEADER_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLedgerHeaderSummary(LedgerHeaderSummary ledgerHeaderSummary) {
    this.ledgerHeaderSummary = ledgerHeaderSummary;
  }

  public LtsStateAccountFungibleResourceBalanceResponse accountAddress(String accountAddress) {
    
    this.accountAddress = accountAddress;
    return this;
  }

  /**
   * The Bech32m-encoded human readable version of the account&#39;s address
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

  public LtsStateAccountFungibleResourceBalanceResponse fungibleResourceBalance(LtsFungibleResourceBalance fungibleResourceBalance) {
    
    this.fungibleResourceBalance = fungibleResourceBalance;
    return this;
  }

  /**
   * Get fungibleResourceBalance
   * @return fungibleResourceBalance
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FUNGIBLE_RESOURCE_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LtsFungibleResourceBalance getFungibleResourceBalance() {
    return fungibleResourceBalance;
  }


  @JsonProperty(JSON_PROPERTY_FUNGIBLE_RESOURCE_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFungibleResourceBalance(LtsFungibleResourceBalance fungibleResourceBalance) {
    this.fungibleResourceBalance = fungibleResourceBalance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtsStateAccountFungibleResourceBalanceResponse ltsStateAccountFungibleResourceBalanceResponse = (LtsStateAccountFungibleResourceBalanceResponse) o;
    return Objects.equals(this.stateVersion, ltsStateAccountFungibleResourceBalanceResponse.stateVersion) &&
        Objects.equals(this.ledgerHeaderSummary, ltsStateAccountFungibleResourceBalanceResponse.ledgerHeaderSummary) &&
        Objects.equals(this.accountAddress, ltsStateAccountFungibleResourceBalanceResponse.accountAddress) &&
        Objects.equals(this.fungibleResourceBalance, ltsStateAccountFungibleResourceBalanceResponse.fungibleResourceBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateVersion, ledgerHeaderSummary, accountAddress, fungibleResourceBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LtsStateAccountFungibleResourceBalanceResponse {\n");
    sb.append("    stateVersion: ").append(toIndentedString(stateVersion)).append("\n");
    sb.append("    ledgerHeaderSummary: ").append(toIndentedString(ledgerHeaderSummary)).append("\n");
    sb.append("    accountAddress: ").append(toIndentedString(accountAddress)).append("\n");
    sb.append("    fungibleResourceBalance: ").append(toIndentedString(fungibleResourceBalance)).append("\n");
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

    // add `state_version` to the URL query string
    if (getStateVersion() != null) {
      try {
        joiner.add(String.format("%sstate_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStateVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ledger_header_summary` to the URL query string
    if (getLedgerHeaderSummary() != null) {
      joiner.add(getLedgerHeaderSummary().toUrlQueryString(prefix + "ledger_header_summary" + suffix));
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

    // add `fungible_resource_balance` to the URL query string
    if (getFungibleResourceBalance() != null) {
      joiner.add(getFungibleResourceBalance().toUrlQueryString(prefix + "fungible_resource_balance" + suffix));
    }

    return joiner.toString();
  }

}


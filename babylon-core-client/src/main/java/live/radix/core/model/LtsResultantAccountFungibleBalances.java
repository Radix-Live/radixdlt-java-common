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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import live.radix.core.model.LtsResultantFungibleBalance;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * LtsResultantAccountFungibleBalances
 */
@JsonPropertyOrder({
  LtsResultantAccountFungibleBalances.JSON_PROPERTY_ACCOUNT_ADDRESS,
  LtsResultantAccountFungibleBalances.JSON_PROPERTY_RESULTANT_BALANCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class LtsResultantAccountFungibleBalances {
  public static final String JSON_PROPERTY_ACCOUNT_ADDRESS = "account_address";
  private String accountAddress;

  public static final String JSON_PROPERTY_RESULTANT_BALANCES = "resultant_balances";
  private List<LtsResultantFungibleBalance> resultantBalances = new ArrayList<>();

  public LtsResultantAccountFungibleBalances() {
  }

  public LtsResultantAccountFungibleBalances accountAddress(String accountAddress) {
    
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

  public LtsResultantAccountFungibleBalances resultantBalances(List<LtsResultantFungibleBalance> resultantBalances) {
    
    this.resultantBalances = resultantBalances;
    return this;
  }

  public LtsResultantAccountFungibleBalances addResultantBalancesItem(LtsResultantFungibleBalance resultantBalancesItem) {
    if (this.resultantBalances == null) {
      this.resultantBalances = new ArrayList<>();
    }
    this.resultantBalances.add(resultantBalancesItem);
    return this;
  }

  /**
   * Get resultantBalances
   * @return resultantBalances
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESULTANT_BALANCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LtsResultantFungibleBalance> getResultantBalances() {
    return resultantBalances;
  }


  @JsonProperty(JSON_PROPERTY_RESULTANT_BALANCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResultantBalances(List<LtsResultantFungibleBalance> resultantBalances) {
    this.resultantBalances = resultantBalances;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtsResultantAccountFungibleBalances ltsResultantAccountFungibleBalances = (LtsResultantAccountFungibleBalances) o;
    return Objects.equals(this.accountAddress, ltsResultantAccountFungibleBalances.accountAddress) &&
        Objects.equals(this.resultantBalances, ltsResultantAccountFungibleBalances.resultantBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountAddress, resultantBalances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LtsResultantAccountFungibleBalances {\n");
    sb.append("    accountAddress: ").append(toIndentedString(accountAddress)).append("\n");
    sb.append("    resultantBalances: ").append(toIndentedString(resultantBalances)).append("\n");
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

    // add `account_address` to the URL query string
    if (getAccountAddress() != null) {
      try {
        joiner.add(String.format("%saccount_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resultant_balances` to the URL query string
    if (getResultantBalances() != null) {
      for (int i = 0; i < getResultantBalances().size(); i++) {
        if (getResultantBalances().get(i) != null) {
          joiner.add(getResultantBalances().get(i).toUrlQueryString(String.format("%sresultant_balances%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}


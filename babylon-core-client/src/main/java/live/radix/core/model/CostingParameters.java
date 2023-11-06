/*
 * Radix Core API - Babylon
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  The default configuration is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function. The node exposes a configuration flag which allows disabling certain endpoints which may be problematic, but monitoring is advised. This configuration parameter is `api.core.flags.enable_unbounded_endpoints` / `RADIXDLT_CORE_API_FLAGS_ENABLE_UNBOUNDED_ENDPOINTS`.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` have high guarantees of forward compatibility in future node versions. We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code.  Other endpoints may be changed with new node versions carrying protocol-updates, although any breaking changes will be flagged clearly in the corresponding release notes.  All responses may have additional fields added, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects. 
 *
 * The version of the OpenAPI document: v1.0.4
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CostingParameters
 */
@JsonPropertyOrder({
  CostingParameters.JSON_PROPERTY_EXECUTION_COST_UNIT_PRICE,
  CostingParameters.JSON_PROPERTY_EXECUTION_COST_UNIT_LIMIT,
  CostingParameters.JSON_PROPERTY_EXECUTION_COST_UNIT_LOAN,
  CostingParameters.JSON_PROPERTY_FINALIZATION_COST_UNIT_PRICE,
  CostingParameters.JSON_PROPERTY_FINALIZATION_COST_UNIT_LIMIT,
  CostingParameters.JSON_PROPERTY_XRD_USD_PRICE,
  CostingParameters.JSON_PROPERTY_XRD_STORAGE_PRICE,
  CostingParameters.JSON_PROPERTY_TIP_PERCENTAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:51:31.842802500+02:00[Europe/Kiev]")
public class CostingParameters {
  public static final String JSON_PROPERTY_EXECUTION_COST_UNIT_PRICE = "execution_cost_unit_price";
  private String executionCostUnitPrice;

  public static final String JSON_PROPERTY_EXECUTION_COST_UNIT_LIMIT = "execution_cost_unit_limit";
  private Long executionCostUnitLimit;

  public static final String JSON_PROPERTY_EXECUTION_COST_UNIT_LOAN = "execution_cost_unit_loan";
  private Long executionCostUnitLoan;

  public static final String JSON_PROPERTY_FINALIZATION_COST_UNIT_PRICE = "finalization_cost_unit_price";
  private String finalizationCostUnitPrice;

  public static final String JSON_PROPERTY_FINALIZATION_COST_UNIT_LIMIT = "finalization_cost_unit_limit";
  private Long finalizationCostUnitLimit;

  public static final String JSON_PROPERTY_XRD_USD_PRICE = "xrd_usd_price";
  private String xrdUsdPrice;

  public static final String JSON_PROPERTY_XRD_STORAGE_PRICE = "xrd_storage_price";
  private String xrdStoragePrice;

  public static final String JSON_PROPERTY_TIP_PERCENTAGE = "tip_percentage";
  private Integer tipPercentage;

  public CostingParameters() {
  }

  public CostingParameters executionCostUnitPrice(String executionCostUnitPrice) {
    
    this.executionCostUnitPrice = executionCostUnitPrice;
    return this;
  }

   /**
   * The string-encoded decimal representing the XRD price of a single cost unit of transaction execution. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;. 
   * @return executionCostUnitPrice
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXECUTION_COST_UNIT_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExecutionCostUnitPrice() {
    return executionCostUnitPrice;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_COST_UNIT_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExecutionCostUnitPrice(String executionCostUnitPrice) {
    this.executionCostUnitPrice = executionCostUnitPrice;
  }


  public CostingParameters executionCostUnitLimit(Long executionCostUnitLimit) {
    
    this.executionCostUnitLimit = executionCostUnitLimit;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, representing the maximum amount of cost units available for the transaction execution.
   * minimum: 0
   * maximum: 4294967295
   * @return executionCostUnitLimit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXECUTION_COST_UNIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getExecutionCostUnitLimit() {
    return executionCostUnitLimit;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_COST_UNIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExecutionCostUnitLimit(Long executionCostUnitLimit) {
    this.executionCostUnitLimit = executionCostUnitLimit;
  }


  public CostingParameters executionCostUnitLoan(Long executionCostUnitLoan) {
    
    this.executionCostUnitLoan = executionCostUnitLoan;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, representing the number of execution cost units loaned from system.
   * minimum: 0
   * maximum: 4294967295
   * @return executionCostUnitLoan
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXECUTION_COST_UNIT_LOAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getExecutionCostUnitLoan() {
    return executionCostUnitLoan;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_COST_UNIT_LOAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExecutionCostUnitLoan(Long executionCostUnitLoan) {
    this.executionCostUnitLoan = executionCostUnitLoan;
  }


  public CostingParameters finalizationCostUnitPrice(String finalizationCostUnitPrice) {
    
    this.finalizationCostUnitPrice = finalizationCostUnitPrice;
    return this;
  }

   /**
   * The string-encoded decimal representing the XRD price of a single cost unit of transaction finalization. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;. 
   * @return finalizationCostUnitPrice
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FINALIZATION_COST_UNIT_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFinalizationCostUnitPrice() {
    return finalizationCostUnitPrice;
  }


  @JsonProperty(JSON_PROPERTY_FINALIZATION_COST_UNIT_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFinalizationCostUnitPrice(String finalizationCostUnitPrice) {
    this.finalizationCostUnitPrice = finalizationCostUnitPrice;
  }


  public CostingParameters finalizationCostUnitLimit(Long finalizationCostUnitLimit) {
    
    this.finalizationCostUnitLimit = finalizationCostUnitLimit;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, representing the maximum amount of cost units available for the transaction finalization.
   * minimum: 0
   * maximum: 4294967295
   * @return finalizationCostUnitLimit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FINALIZATION_COST_UNIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getFinalizationCostUnitLimit() {
    return finalizationCostUnitLimit;
  }


  @JsonProperty(JSON_PROPERTY_FINALIZATION_COST_UNIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFinalizationCostUnitLimit(Long finalizationCostUnitLimit) {
    this.finalizationCostUnitLimit = finalizationCostUnitLimit;
  }


  public CostingParameters xrdUsdPrice(String xrdUsdPrice) {
    
    this.xrdUsdPrice = xrdUsdPrice;
    return this;
  }

   /**
   * The string-encoded decimal representing the price of 1 USD, expressed in XRD. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;. 
   * @return xrdUsdPrice
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_XRD_USD_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getXrdUsdPrice() {
    return xrdUsdPrice;
  }


  @JsonProperty(JSON_PROPERTY_XRD_USD_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setXrdUsdPrice(String xrdUsdPrice) {
    this.xrdUsdPrice = xrdUsdPrice;
  }


  public CostingParameters xrdStoragePrice(String xrdStoragePrice) {
    
    this.xrdStoragePrice = xrdStoragePrice;
    return this;
  }

   /**
   * The string-encoded decimal representing the price of 1 byte of storage, expressed in XRD. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;. 
   * @return xrdStoragePrice
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_XRD_STORAGE_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getXrdStoragePrice() {
    return xrdStoragePrice;
  }


  @JsonProperty(JSON_PROPERTY_XRD_STORAGE_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setXrdStoragePrice(String xrdStoragePrice) {
    this.xrdStoragePrice = xrdStoragePrice;
  }


  public CostingParameters tipPercentage(Integer tipPercentage) {
    
    this.tipPercentage = tipPercentage;
    return this;
  }

   /**
   * An integer between &#x60;0&#x60; and &#x60;255&#x60;, giving the validator tip as a percentage amount. A value of &#x60;1&#x60; corresponds to 1% of the fee.
   * minimum: 0
   * maximum: 255
   * @return tipPercentage
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIP_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTipPercentage() {
    return tipPercentage;
  }


  @JsonProperty(JSON_PROPERTY_TIP_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTipPercentage(Integer tipPercentage) {
    this.tipPercentage = tipPercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostingParameters costingParameters = (CostingParameters) o;
    return Objects.equals(this.executionCostUnitPrice, costingParameters.executionCostUnitPrice) &&
        Objects.equals(this.executionCostUnitLimit, costingParameters.executionCostUnitLimit) &&
        Objects.equals(this.executionCostUnitLoan, costingParameters.executionCostUnitLoan) &&
        Objects.equals(this.finalizationCostUnitPrice, costingParameters.finalizationCostUnitPrice) &&
        Objects.equals(this.finalizationCostUnitLimit, costingParameters.finalizationCostUnitLimit) &&
        Objects.equals(this.xrdUsdPrice, costingParameters.xrdUsdPrice) &&
        Objects.equals(this.xrdStoragePrice, costingParameters.xrdStoragePrice) &&
        Objects.equals(this.tipPercentage, costingParameters.tipPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionCostUnitPrice, executionCostUnitLimit, executionCostUnitLoan, finalizationCostUnitPrice, finalizationCostUnitLimit, xrdUsdPrice, xrdStoragePrice, tipPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostingParameters {\n");
    sb.append("    executionCostUnitPrice: ").append(toIndentedString(executionCostUnitPrice)).append("\n");
    sb.append("    executionCostUnitLimit: ").append(toIndentedString(executionCostUnitLimit)).append("\n");
    sb.append("    executionCostUnitLoan: ").append(toIndentedString(executionCostUnitLoan)).append("\n");
    sb.append("    finalizationCostUnitPrice: ").append(toIndentedString(finalizationCostUnitPrice)).append("\n");
    sb.append("    finalizationCostUnitLimit: ").append(toIndentedString(finalizationCostUnitLimit)).append("\n");
    sb.append("    xrdUsdPrice: ").append(toIndentedString(xrdUsdPrice)).append("\n");
    sb.append("    xrdStoragePrice: ").append(toIndentedString(xrdStoragePrice)).append("\n");
    sb.append("    tipPercentage: ").append(toIndentedString(tipPercentage)).append("\n");
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

    // add `execution_cost_unit_price` to the URL query string
    if (getExecutionCostUnitPrice() != null) {
      try {
        joiner.add(String.format("%sexecution_cost_unit_price%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExecutionCostUnitPrice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `execution_cost_unit_limit` to the URL query string
    if (getExecutionCostUnitLimit() != null) {
      try {
        joiner.add(String.format("%sexecution_cost_unit_limit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExecutionCostUnitLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `execution_cost_unit_loan` to the URL query string
    if (getExecutionCostUnitLoan() != null) {
      try {
        joiner.add(String.format("%sexecution_cost_unit_loan%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExecutionCostUnitLoan()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `finalization_cost_unit_price` to the URL query string
    if (getFinalizationCostUnitPrice() != null) {
      try {
        joiner.add(String.format("%sfinalization_cost_unit_price%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFinalizationCostUnitPrice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `finalization_cost_unit_limit` to the URL query string
    if (getFinalizationCostUnitLimit() != null) {
      try {
        joiner.add(String.format("%sfinalization_cost_unit_limit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFinalizationCostUnitLimit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `xrd_usd_price` to the URL query string
    if (getXrdUsdPrice() != null) {
      try {
        joiner.add(String.format("%sxrd_usd_price%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getXrdUsdPrice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `xrd_storage_price` to the URL query string
    if (getXrdStoragePrice() != null) {
      try {
        joiner.add(String.format("%sxrd_storage_price%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getXrdStoragePrice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tip_percentage` to the URL query string
    if (getTipPercentage() != null) {
      try {
        joiner.add(String.format("%stip_percentage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTipPercentage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


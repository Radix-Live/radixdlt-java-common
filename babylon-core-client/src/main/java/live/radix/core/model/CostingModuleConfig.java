/*
 * Radix Core API
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  The default configuration is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function. The node exposes a configuration flag which allows disabling certain endpoints which may be problematic, but monitoring is advised. This configuration parameter is `api.core.flags.enable_unbounded_endpoints` / `RADIXDLT_CORE_API_FLAGS_ENABLE_UNBOUNDED_ENDPOINTS`.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` have high guarantees of forward compatibility in future node versions. We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code.  Other endpoints may be changed with new node versions carrying protocol-updates, although any breaking changes will be flagged clearly in the corresponding release notes.  All responses may have additional fields added, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects. 
 *
 * The version of the OpenAPI document: v1.3.0
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
 * CostingModuleConfig
 */
@JsonPropertyOrder({
  CostingModuleConfig.JSON_PROPERTY_XRD_MAX_PER_FUNCTION_ROYALTY,
  CostingModuleConfig.JSON_PROPERTY_APPLY_EXECUTION_COST_FOR_ALL_SYSTEM_CALLS,
  CostingModuleConfig.JSON_PROPERTY_APPLY_BOOT_REF_CHECK_COSTING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class CostingModuleConfig {
  public static final String JSON_PROPERTY_XRD_MAX_PER_FUNCTION_ROYALTY = "xrd_max_per_function_royalty";
  private String xrdMaxPerFunctionRoyalty;

  public static final String JSON_PROPERTY_APPLY_EXECUTION_COST_FOR_ALL_SYSTEM_CALLS = "apply_execution_cost_for_all_system_calls";
  private Boolean applyExecutionCostForAllSystemCalls;

  public static final String JSON_PROPERTY_APPLY_BOOT_REF_CHECK_COSTING = "apply_boot_ref_check_costing";
  private Boolean applyBootRefCheckCosting;

  public CostingModuleConfig() {
  }

  public CostingModuleConfig xrdMaxPerFunctionRoyalty(String xrdMaxPerFunctionRoyalty) {
    
    this.xrdMaxPerFunctionRoyalty = xrdMaxPerFunctionRoyalty;
    return this;
  }

  /**
   * The string-encoded decimal representing the maximum amount of XRD configurable for a single function&#39;s royalty. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;. 
   * @return xrdMaxPerFunctionRoyalty
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_XRD_MAX_PER_FUNCTION_ROYALTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getXrdMaxPerFunctionRoyalty() {
    return xrdMaxPerFunctionRoyalty;
  }


  @JsonProperty(JSON_PROPERTY_XRD_MAX_PER_FUNCTION_ROYALTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setXrdMaxPerFunctionRoyalty(String xrdMaxPerFunctionRoyalty) {
    this.xrdMaxPerFunctionRoyalty = xrdMaxPerFunctionRoyalty;
  }

  public CostingModuleConfig applyExecutionCostForAllSystemCalls(Boolean applyExecutionCostForAllSystemCalls) {
    
    this.applyExecutionCostForAllSystemCalls = applyExecutionCostForAllSystemCalls;
    return this;
  }

  /**
   * Whether to apply execution costing for all system calls.
   * @return applyExecutionCostForAllSystemCalls
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APPLY_EXECUTION_COST_FOR_ALL_SYSTEM_CALLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isApplyExecutionCostForAllSystemCalls() {
    return applyExecutionCostForAllSystemCalls;
  }


  @JsonProperty(JSON_PROPERTY_APPLY_EXECUTION_COST_FOR_ALL_SYSTEM_CALLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplyExecutionCostForAllSystemCalls(Boolean applyExecutionCostForAllSystemCalls) {
    this.applyExecutionCostForAllSystemCalls = applyExecutionCostForAllSystemCalls;
  }

  public CostingModuleConfig applyBootRefCheckCosting(Boolean applyBootRefCheckCosting) {
    
    this.applyBootRefCheckCosting = applyBootRefCheckCosting;
    return this;
  }

  /**
   * Whether to apply costing for reference checks on boot.
   * @return applyBootRefCheckCosting
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APPLY_BOOT_REF_CHECK_COSTING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isApplyBootRefCheckCosting() {
    return applyBootRefCheckCosting;
  }


  @JsonProperty(JSON_PROPERTY_APPLY_BOOT_REF_CHECK_COSTING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplyBootRefCheckCosting(Boolean applyBootRefCheckCosting) {
    this.applyBootRefCheckCosting = applyBootRefCheckCosting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostingModuleConfig costingModuleConfig = (CostingModuleConfig) o;
    return Objects.equals(this.xrdMaxPerFunctionRoyalty, costingModuleConfig.xrdMaxPerFunctionRoyalty) &&
        Objects.equals(this.applyExecutionCostForAllSystemCalls, costingModuleConfig.applyExecutionCostForAllSystemCalls) &&
        Objects.equals(this.applyBootRefCheckCosting, costingModuleConfig.applyBootRefCheckCosting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xrdMaxPerFunctionRoyalty, applyExecutionCostForAllSystemCalls, applyBootRefCheckCosting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostingModuleConfig {\n");
    sb.append("    xrdMaxPerFunctionRoyalty: ").append(toIndentedString(xrdMaxPerFunctionRoyalty)).append("\n");
    sb.append("    applyExecutionCostForAllSystemCalls: ").append(toIndentedString(applyExecutionCostForAllSystemCalls)).append("\n");
    sb.append("    applyBootRefCheckCosting: ").append(toIndentedString(applyBootRefCheckCosting)).append("\n");
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

    // add `xrd_max_per_function_royalty` to the URL query string
    if (getXrdMaxPerFunctionRoyalty() != null) {
      try {
        joiner.add(String.format("%sxrd_max_per_function_royalty%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getXrdMaxPerFunctionRoyalty()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `apply_execution_cost_for_all_system_calls` to the URL query string
    if (isApplyExecutionCostForAllSystemCalls() != null) {
      try {
        joiner.add(String.format("%sapply_execution_cost_for_all_system_calls%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isApplyExecutionCostForAllSystemCalls()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `apply_boot_ref_check_costing` to the URL query string
    if (isApplyBootRefCheckCosting() != null) {
      try {
        joiner.add(String.format("%sapply_boot_ref_check_costing%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isApplyBootRefCheckCosting()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


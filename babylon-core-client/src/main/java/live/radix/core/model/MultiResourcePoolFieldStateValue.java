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
import live.radix.core.model.PoolVault;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MultiResourcePoolFieldStateValue
 */
@JsonPropertyOrder({
  MultiResourcePoolFieldStateValue.JSON_PROPERTY_VAULTS,
  MultiResourcePoolFieldStateValue.JSON_PROPERTY_POOL_UNIT_RESOURCE_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class MultiResourcePoolFieldStateValue {
  public static final String JSON_PROPERTY_VAULTS = "vaults";
  private List<PoolVault> vaults = new ArrayList<>();

  public static final String JSON_PROPERTY_POOL_UNIT_RESOURCE_ADDRESS = "pool_unit_resource_address";
  private String poolUnitResourceAddress;

  public MultiResourcePoolFieldStateValue() {
  }

  public MultiResourcePoolFieldStateValue vaults(List<PoolVault> vaults) {
    
    this.vaults = vaults;
    return this;
  }

  public MultiResourcePoolFieldStateValue addVaultsItem(PoolVault vaultsItem) {
    if (this.vaults == null) {
      this.vaults = new ArrayList<>();
    }
    this.vaults.add(vaultsItem);
    return this;
  }

  /**
   * Get vaults
   * @return vaults
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VAULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<PoolVault> getVaults() {
    return vaults;
  }


  @JsonProperty(JSON_PROPERTY_VAULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVaults(List<PoolVault> vaults) {
    this.vaults = vaults;
  }

  public MultiResourcePoolFieldStateValue poolUnitResourceAddress(String poolUnitResourceAddress) {
    
    this.poolUnitResourceAddress = poolUnitResourceAddress;
    return this;
  }

  /**
   * The Bech32m-encoded human readable version of the resource address
   * @return poolUnitResourceAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POOL_UNIT_RESOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPoolUnitResourceAddress() {
    return poolUnitResourceAddress;
  }


  @JsonProperty(JSON_PROPERTY_POOL_UNIT_RESOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPoolUnitResourceAddress(String poolUnitResourceAddress) {
    this.poolUnitResourceAddress = poolUnitResourceAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiResourcePoolFieldStateValue multiResourcePoolFieldStateValue = (MultiResourcePoolFieldStateValue) o;
    return Objects.equals(this.vaults, multiResourcePoolFieldStateValue.vaults) &&
        Objects.equals(this.poolUnitResourceAddress, multiResourcePoolFieldStateValue.poolUnitResourceAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaults, poolUnitResourceAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiResourcePoolFieldStateValue {\n");
    sb.append("    vaults: ").append(toIndentedString(vaults)).append("\n");
    sb.append("    poolUnitResourceAddress: ").append(toIndentedString(poolUnitResourceAddress)).append("\n");
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

    // add `vaults` to the URL query string
    if (getVaults() != null) {
      for (int i = 0; i < getVaults().size(); i++) {
        if (getVaults().get(i) != null) {
          joiner.add(getVaults().get(i).toUrlQueryString(String.format("%svaults%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `pool_unit_resource_address` to the URL query string
    if (getPoolUnitResourceAddress() != null) {
      try {
        joiner.add(String.format("%spool_unit_resource_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPoolUnitResourceAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


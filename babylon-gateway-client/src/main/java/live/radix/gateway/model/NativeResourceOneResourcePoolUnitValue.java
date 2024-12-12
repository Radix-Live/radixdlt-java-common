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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import live.radix.gateway.model.NativeResourceDetails;
import live.radix.gateway.model.NativeResourceKind;
import live.radix.gateway.model.NativeResourceRedemptionValueItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * NativeResourceOneResourcePoolUnitValue
 */
@JsonPropertyOrder({
  NativeResourceOneResourcePoolUnitValue.JSON_PROPERTY_POOL_ADDRESS,
  NativeResourceOneResourcePoolUnitValue.JSON_PROPERTY_REDEMPTION_RESOURCE_COUNT,
  NativeResourceOneResourcePoolUnitValue.JSON_PROPERTY_UNIT_REDEMPTION_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T19:38:04.213407200+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
@JsonIgnoreProperties(
  value = "kind", // ignore manually set kind, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the kind to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", visible = true)

public class NativeResourceOneResourcePoolUnitValue extends NativeResourceDetails {
  public static final String JSON_PROPERTY_POOL_ADDRESS = "pool_address";
  private String poolAddress;

  public static final String JSON_PROPERTY_REDEMPTION_RESOURCE_COUNT = "redemption_resource_count";
  private Integer redemptionResourceCount;

  public static final String JSON_PROPERTY_UNIT_REDEMPTION_VALUE = "unit_redemption_value";
  private List<NativeResourceRedemptionValueItem> unitRedemptionValue = new ArrayList<>();

  public NativeResourceOneResourcePoolUnitValue() {

  }

  public NativeResourceOneResourcePoolUnitValue poolAddress(String poolAddress) {
    
    this.poolAddress = poolAddress;
    return this;
  }

  /**
   * Bech32m-encoded human readable version of the address.
   * @return poolAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POOL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPoolAddress() {
    return poolAddress;
  }


  @JsonProperty(JSON_PROPERTY_POOL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPoolAddress(String poolAddress) {
    this.poolAddress = poolAddress;
  }

  public NativeResourceOneResourcePoolUnitValue redemptionResourceCount(Integer redemptionResourceCount) {
    
    this.redemptionResourceCount = redemptionResourceCount;
    return this;
  }

  /**
   * Get redemptionResourceCount
   * @return redemptionResourceCount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REDEMPTION_RESOURCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRedemptionResourceCount() {
    return redemptionResourceCount;
  }


  @JsonProperty(JSON_PROPERTY_REDEMPTION_RESOURCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedemptionResourceCount(Integer redemptionResourceCount) {
    this.redemptionResourceCount = redemptionResourceCount;
  }

  public NativeResourceOneResourcePoolUnitValue unitRedemptionValue(List<NativeResourceRedemptionValueItem> unitRedemptionValue) {
    
    this.unitRedemptionValue = unitRedemptionValue;
    return this;
  }

  public NativeResourceOneResourcePoolUnitValue addUnitRedemptionValueItem(NativeResourceRedemptionValueItem unitRedemptionValueItem) {
    if (this.unitRedemptionValue == null) {
      this.unitRedemptionValue = new ArrayList<>();
    }
    this.unitRedemptionValue.add(unitRedemptionValueItem);
    return this;
  }

  /**
   * Get unitRedemptionValue
   * @return unitRedemptionValue
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIT_REDEMPTION_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<NativeResourceRedemptionValueItem> getUnitRedemptionValue() {
    return unitRedemptionValue;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_REDEMPTION_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnitRedemptionValue(List<NativeResourceRedemptionValueItem> unitRedemptionValue) {
    this.unitRedemptionValue = unitRedemptionValue;
  }

  @Override
  public NativeResourceOneResourcePoolUnitValue kind(NativeResourceKind kind) {
    this.setKind(kind);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeResourceOneResourcePoolUnitValue nativeResourceOneResourcePoolUnitValue = (NativeResourceOneResourcePoolUnitValue) o;
    return Objects.equals(this.poolAddress, nativeResourceOneResourcePoolUnitValue.poolAddress) &&
        Objects.equals(this.redemptionResourceCount, nativeResourceOneResourcePoolUnitValue.redemptionResourceCount) &&
        Objects.equals(this.unitRedemptionValue, nativeResourceOneResourcePoolUnitValue.unitRedemptionValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolAddress, redemptionResourceCount, unitRedemptionValue, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeResourceOneResourcePoolUnitValue {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    poolAddress: ").append(toIndentedString(poolAddress)).append("\n");
    sb.append("    redemptionResourceCount: ").append(toIndentedString(redemptionResourceCount)).append("\n");
    sb.append("    unitRedemptionValue: ").append(toIndentedString(unitRedemptionValue)).append("\n");
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

    // add `kind` to the URL query string
    if (getKind() != null) {
      try {
        joiner.add(String.format("%skind%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKind()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pool_address` to the URL query string
    if (getPoolAddress() != null) {
      try {
        joiner.add(String.format("%spool_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPoolAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `redemption_resource_count` to the URL query string
    if (getRedemptionResourceCount() != null) {
      try {
        joiner.add(String.format("%sredemption_resource_count%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRedemptionResourceCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unit_redemption_value` to the URL query string
    if (getUnitRedemptionValue() != null) {
      for (int i = 0; i < getUnitRedemptionValue().size(); i++) {
        if (getUnitRedemptionValue().get(i) != null) {
          joiner.add(getUnitRedemptionValue().get(i).toUrlQueryString(String.format("%sunit_redemption_value%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}


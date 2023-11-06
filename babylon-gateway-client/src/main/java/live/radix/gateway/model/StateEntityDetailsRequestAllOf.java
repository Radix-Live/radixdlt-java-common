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
import live.radix.gateway.model.ResourceAggregationLevel;
import live.radix.gateway.model.StateEntityDetailsOptIns;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * StateEntityDetailsRequestAllOf
 */
@JsonPropertyOrder({
  StateEntityDetailsRequestAllOf.JSON_PROPERTY_OPT_INS,
  StateEntityDetailsRequestAllOf.JSON_PROPERTY_ADDRESSES,
  StateEntityDetailsRequestAllOf.JSON_PROPERTY_AGGREGATION_LEVEL
})
@JsonTypeName("StateEntityDetailsRequest_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:53:11.950430200+02:00[Europe/Kiev]")
public class StateEntityDetailsRequestAllOf {
  public static final String JSON_PROPERTY_OPT_INS = "opt_ins";
  private StateEntityDetailsOptIns optIns;

  public static final String JSON_PROPERTY_ADDRESSES = "addresses";
  private List<String> addresses = new ArrayList<>();

  public static final String JSON_PROPERTY_AGGREGATION_LEVEL = "aggregation_level";
  private ResourceAggregationLevel aggregationLevel;

  public StateEntityDetailsRequestAllOf() {
  }

  public StateEntityDetailsRequestAllOf optIns(StateEntityDetailsOptIns optIns) {
    
    this.optIns = optIns;
    return this;
  }

   /**
   * Get optIns
   * @return optIns
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPT_INS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEntityDetailsOptIns getOptIns() {
    return optIns;
  }


  @JsonProperty(JSON_PROPERTY_OPT_INS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptIns(StateEntityDetailsOptIns optIns) {
    this.optIns = optIns;
  }


  public StateEntityDetailsRequestAllOf addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public StateEntityDetailsRequestAllOf addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAddresses() {
    return addresses;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public StateEntityDetailsRequestAllOf aggregationLevel(ResourceAggregationLevel aggregationLevel) {
    
    this.aggregationLevel = aggregationLevel;
    return this;
  }

   /**
   * Get aggregationLevel
   * @return aggregationLevel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResourceAggregationLevel getAggregationLevel() {
    return aggregationLevel;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregationLevel(ResourceAggregationLevel aggregationLevel) {
    this.aggregationLevel = aggregationLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateEntityDetailsRequestAllOf stateEntityDetailsRequestAllOf = (StateEntityDetailsRequestAllOf) o;
    return Objects.equals(this.optIns, stateEntityDetailsRequestAllOf.optIns) &&
        Objects.equals(this.addresses, stateEntityDetailsRequestAllOf.addresses) &&
        Objects.equals(this.aggregationLevel, stateEntityDetailsRequestAllOf.aggregationLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optIns, addresses, aggregationLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateEntityDetailsRequestAllOf {\n");
    sb.append("    optIns: ").append(toIndentedString(optIns)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    aggregationLevel: ").append(toIndentedString(aggregationLevel)).append("\n");
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

    // add `opt_ins` to the URL query string
    if (getOptIns() != null) {
      joiner.add(getOptIns().toUrlQueryString(prefix + "opt_ins" + suffix));
    }

    // add `addresses` to the URL query string
    if (getAddresses() != null) {
      for (int i = 0; i < getAddresses().size(); i++) {
        try {
          joiner.add(String.format("%saddresses%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getAddresses().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `aggregation_level` to the URL query string
    if (getAggregationLevel() != null) {
      try {
        joiner.add(String.format("%saggregation_level%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAggregationLevel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


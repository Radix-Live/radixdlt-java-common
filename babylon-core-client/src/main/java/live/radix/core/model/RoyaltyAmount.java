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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RoyaltyAmount
 */
@JsonPropertyOrder({
  RoyaltyAmount.JSON_PROPERTY_AMOUNT,
  RoyaltyAmount.JSON_PROPERTY_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class RoyaltyAmount {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  /**
   * Gets or Sets unit
   */
  public enum UnitEnum {
    XRD("XRD"),
    
    USD("USD");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_UNIT = "unit";
  private UnitEnum unit;

  public RoyaltyAmount() {
  }

  public RoyaltyAmount amount(String amount) {
    
    this.amount = amount;
    return this;
  }

  /**
   * A string-encoded fixed-precision decimal to 18 decimal places. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;. 
   * @return amount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(String amount) {
    this.amount = amount;
  }

  public RoyaltyAmount unit(UnitEnum unit) {
    
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UnitEnum getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoyaltyAmount royaltyAmount = (RoyaltyAmount) o;
    return Objects.equals(this.amount, royaltyAmount.amount) &&
        Objects.equals(this.unit, royaltyAmount.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoyaltyAmount {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      try {
        joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unit` to the URL query string
    if (getUnit() != null) {
      try {
        joiner.add(String.format("%sunit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


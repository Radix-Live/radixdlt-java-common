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
 * FrozenStatus
 */
@JsonPropertyOrder({
  FrozenStatus.JSON_PROPERTY_IS_WITHDRAW_FROZEN,
  FrozenStatus.JSON_PROPERTY_IS_DEPOSIT_FROZEN,
  FrozenStatus.JSON_PROPERTY_IS_BURN_FROZEN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:51:31.842802500+02:00[Europe/Kiev]")
public class FrozenStatus {
  public static final String JSON_PROPERTY_IS_WITHDRAW_FROZEN = "is_withdraw_frozen";
  private Boolean isWithdrawFrozen;

  public static final String JSON_PROPERTY_IS_DEPOSIT_FROZEN = "is_deposit_frozen";
  private Boolean isDepositFrozen;

  public static final String JSON_PROPERTY_IS_BURN_FROZEN = "is_burn_frozen";
  private Boolean isBurnFrozen;

  public FrozenStatus() {
  }

  public FrozenStatus isWithdrawFrozen(Boolean isWithdrawFrozen) {
    
    this.isWithdrawFrozen = isWithdrawFrozen;
    return this;
  }

   /**
   * Get isWithdrawFrozen
   * @return isWithdrawFrozen
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_WITHDRAW_FROZEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsWithdrawFrozen() {
    return isWithdrawFrozen;
  }


  @JsonProperty(JSON_PROPERTY_IS_WITHDRAW_FROZEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsWithdrawFrozen(Boolean isWithdrawFrozen) {
    this.isWithdrawFrozen = isWithdrawFrozen;
  }


  public FrozenStatus isDepositFrozen(Boolean isDepositFrozen) {
    
    this.isDepositFrozen = isDepositFrozen;
    return this;
  }

   /**
   * Get isDepositFrozen
   * @return isDepositFrozen
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_DEPOSIT_FROZEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsDepositFrozen() {
    return isDepositFrozen;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEPOSIT_FROZEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsDepositFrozen(Boolean isDepositFrozen) {
    this.isDepositFrozen = isDepositFrozen;
  }


  public FrozenStatus isBurnFrozen(Boolean isBurnFrozen) {
    
    this.isBurnFrozen = isBurnFrozen;
    return this;
  }

   /**
   * Get isBurnFrozen
   * @return isBurnFrozen
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_BURN_FROZEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsBurnFrozen() {
    return isBurnFrozen;
  }


  @JsonProperty(JSON_PROPERTY_IS_BURN_FROZEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsBurnFrozen(Boolean isBurnFrozen) {
    this.isBurnFrozen = isBurnFrozen;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrozenStatus frozenStatus = (FrozenStatus) o;
    return Objects.equals(this.isWithdrawFrozen, frozenStatus.isWithdrawFrozen) &&
        Objects.equals(this.isDepositFrozen, frozenStatus.isDepositFrozen) &&
        Objects.equals(this.isBurnFrozen, frozenStatus.isBurnFrozen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isWithdrawFrozen, isDepositFrozen, isBurnFrozen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrozenStatus {\n");
    sb.append("    isWithdrawFrozen: ").append(toIndentedString(isWithdrawFrozen)).append("\n");
    sb.append("    isDepositFrozen: ").append(toIndentedString(isDepositFrozen)).append("\n");
    sb.append("    isBurnFrozen: ").append(toIndentedString(isBurnFrozen)).append("\n");
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

    // add `is_withdraw_frozen` to the URL query string
    if (isIsWithdrawFrozen() != null) {
      try {
        joiner.add(String.format("%sis_withdraw_frozen%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsWithdrawFrozen()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `is_deposit_frozen` to the URL query string
    if (isIsDepositFrozen() != null) {
      try {
        joiner.add(String.format("%sis_deposit_frozen%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsDepositFrozen()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `is_burn_frozen` to the URL query string
    if (isIsBurnFrozen() != null) {
      try {
        joiner.add(String.format("%sis_burn_frozen%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsBurnFrozen()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


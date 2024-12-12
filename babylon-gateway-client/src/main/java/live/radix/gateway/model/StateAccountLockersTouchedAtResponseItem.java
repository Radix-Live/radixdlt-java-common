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
 * StateAccountLockersTouchedAtResponseItem
 */
@JsonPropertyOrder({
  StateAccountLockersTouchedAtResponseItem.JSON_PROPERTY_LOCKER_ADDRESS,
  StateAccountLockersTouchedAtResponseItem.JSON_PROPERTY_ACCOUNT_ADDRESS,
  StateAccountLockersTouchedAtResponseItem.JSON_PROPERTY_LAST_TOUCHED_AT_STATE_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T19:38:04.213407200+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class StateAccountLockersTouchedAtResponseItem {
  public static final String JSON_PROPERTY_LOCKER_ADDRESS = "locker_address";
  private String lockerAddress;

  public static final String JSON_PROPERTY_ACCOUNT_ADDRESS = "account_address";
  private String accountAddress;

  public static final String JSON_PROPERTY_LAST_TOUCHED_AT_STATE_VERSION = "last_touched_at_state_version";
  private Long lastTouchedAtStateVersion;

  public StateAccountLockersTouchedAtResponseItem() {
  }

  public StateAccountLockersTouchedAtResponseItem lockerAddress(String lockerAddress) {
    
    this.lockerAddress = lockerAddress;
    return this;
  }

  /**
   * Bech32m-encoded human readable version of the address.
   * @return lockerAddress
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCKER_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLockerAddress() {
    return lockerAddress;
  }


  @JsonProperty(JSON_PROPERTY_LOCKER_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLockerAddress(String lockerAddress) {
    this.lockerAddress = lockerAddress;
  }

  public StateAccountLockersTouchedAtResponseItem accountAddress(String accountAddress) {
    
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

  public StateAccountLockersTouchedAtResponseItem lastTouchedAtStateVersion(Long lastTouchedAtStateVersion) {
    
    this.lastTouchedAtStateVersion = lastTouchedAtStateVersion;
    return this;
  }

  /**
   * The most recent state version underlying object was modified at.
   * minimum: 1
   * maximum: 100000000000000
   * @return lastTouchedAtStateVersion
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_TOUCHED_AT_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getLastTouchedAtStateVersion() {
    return lastTouchedAtStateVersion;
  }


  @JsonProperty(JSON_PROPERTY_LAST_TOUCHED_AT_STATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastTouchedAtStateVersion(Long lastTouchedAtStateVersion) {
    this.lastTouchedAtStateVersion = lastTouchedAtStateVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateAccountLockersTouchedAtResponseItem stateAccountLockersTouchedAtResponseItem = (StateAccountLockersTouchedAtResponseItem) o;
    return Objects.equals(this.lockerAddress, stateAccountLockersTouchedAtResponseItem.lockerAddress) &&
        Objects.equals(this.accountAddress, stateAccountLockersTouchedAtResponseItem.accountAddress) &&
        Objects.equals(this.lastTouchedAtStateVersion, stateAccountLockersTouchedAtResponseItem.lastTouchedAtStateVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockerAddress, accountAddress, lastTouchedAtStateVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateAccountLockersTouchedAtResponseItem {\n");
    sb.append("    lockerAddress: ").append(toIndentedString(lockerAddress)).append("\n");
    sb.append("    accountAddress: ").append(toIndentedString(accountAddress)).append("\n");
    sb.append("    lastTouchedAtStateVersion: ").append(toIndentedString(lastTouchedAtStateVersion)).append("\n");
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

    // add `locker_address` to the URL query string
    if (getLockerAddress() != null) {
      try {
        joiner.add(String.format("%slocker_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLockerAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `last_touched_at_state_version` to the URL query string
    if (getLastTouchedAtStateVersion() != null) {
      try {
        joiner.add(String.format("%slast_touched_at_state_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastTouchedAtStateVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


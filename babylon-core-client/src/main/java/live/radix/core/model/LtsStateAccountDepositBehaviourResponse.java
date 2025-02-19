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
import java.util.HashMap;
import java.util.Map;
import live.radix.core.model.DefaultDepositRule;
import live.radix.core.model.LedgerHeaderSummary;
import live.radix.core.model.ResourceSpecificDepositBehaviour;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * LtsStateAccountDepositBehaviourResponse
 */
@JsonPropertyOrder({
  LtsStateAccountDepositBehaviourResponse.JSON_PROPERTY_STATE_VERSION,
  LtsStateAccountDepositBehaviourResponse.JSON_PROPERTY_LEDGER_HEADER_SUMMARY,
  LtsStateAccountDepositBehaviourResponse.JSON_PROPERTY_DEFAULT_DEPOSIT_RULE,
  LtsStateAccountDepositBehaviourResponse.JSON_PROPERTY_IS_BADGE_AUTHORIZED_DEPOSITOR,
  LtsStateAccountDepositBehaviourResponse.JSON_PROPERTY_RESOURCE_SPECIFIC_BEHAVIOURS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class LtsStateAccountDepositBehaviourResponse {
  public static final String JSON_PROPERTY_STATE_VERSION = "state_version";
  private Long stateVersion;

  public static final String JSON_PROPERTY_LEDGER_HEADER_SUMMARY = "ledger_header_summary";
  private LedgerHeaderSummary ledgerHeaderSummary;

  public static final String JSON_PROPERTY_DEFAULT_DEPOSIT_RULE = "default_deposit_rule";
  private DefaultDepositRule defaultDepositRule;

  public static final String JSON_PROPERTY_IS_BADGE_AUTHORIZED_DEPOSITOR = "is_badge_authorized_depositor";
  private Boolean isBadgeAuthorizedDepositor;

  public static final String JSON_PROPERTY_RESOURCE_SPECIFIC_BEHAVIOURS = "resource_specific_behaviours";
  private Map<String, ResourceSpecificDepositBehaviour> resourceSpecificBehaviours = new HashMap<>();

  public LtsStateAccountDepositBehaviourResponse() {
  }

  public LtsStateAccountDepositBehaviourResponse stateVersion(Long stateVersion) {
    
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

  public LtsStateAccountDepositBehaviourResponse ledgerHeaderSummary(LedgerHeaderSummary ledgerHeaderSummary) {
    
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

  public LtsStateAccountDepositBehaviourResponse defaultDepositRule(DefaultDepositRule defaultDepositRule) {
    
    this.defaultDepositRule = defaultDepositRule;
    return this;
  }

  /**
   * Get defaultDepositRule
   * @return defaultDepositRule
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEFAULT_DEPOSIT_RULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DefaultDepositRule getDefaultDepositRule() {
    return defaultDepositRule;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_DEPOSIT_RULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDefaultDepositRule(DefaultDepositRule defaultDepositRule) {
    this.defaultDepositRule = defaultDepositRule;
  }

  public LtsStateAccountDepositBehaviourResponse isBadgeAuthorizedDepositor(Boolean isBadgeAuthorizedDepositor) {
    
    this.isBadgeAuthorizedDepositor = isBadgeAuthorizedDepositor;
    return this;
  }

  /**
   * Whether the input &#x60;badge&#x60; belongs to the account&#39;s set of authorized depositors. This field will only be present if any badge was passed in the request. 
   * @return isBadgeAuthorizedDepositor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BADGE_AUTHORIZED_DEPOSITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isIsBadgeAuthorizedDepositor() {
    return isBadgeAuthorizedDepositor;
  }


  @JsonProperty(JSON_PROPERTY_IS_BADGE_AUTHORIZED_DEPOSITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsBadgeAuthorizedDepositor(Boolean isBadgeAuthorizedDepositor) {
    this.isBadgeAuthorizedDepositor = isBadgeAuthorizedDepositor;
  }

  public LtsStateAccountDepositBehaviourResponse resourceSpecificBehaviours(Map<String, ResourceSpecificDepositBehaviour> resourceSpecificBehaviours) {
    
    this.resourceSpecificBehaviours = resourceSpecificBehaviours;
    return this;
  }

  public LtsStateAccountDepositBehaviourResponse putResourceSpecificBehavioursItem(String key, ResourceSpecificDepositBehaviour resourceSpecificBehavioursItem) {
    if (this.resourceSpecificBehaviours == null) {
      this.resourceSpecificBehaviours = new HashMap<>();
    }
    this.resourceSpecificBehaviours.put(key, resourceSpecificBehavioursItem);
    return this;
  }

  /**
   * A map from one of the input &#x60;resource_addresses&#x60; to its specific deposit behavior configured for this account. This field will only be present if an array of specific resource addresses was passed in the request (even if empty). 
   * @return resourceSpecificBehaviours
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_SPECIFIC_BEHAVIOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, ResourceSpecificDepositBehaviour> getResourceSpecificBehaviours() {
    return resourceSpecificBehaviours;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_SPECIFIC_BEHAVIOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceSpecificBehaviours(Map<String, ResourceSpecificDepositBehaviour> resourceSpecificBehaviours) {
    this.resourceSpecificBehaviours = resourceSpecificBehaviours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LtsStateAccountDepositBehaviourResponse ltsStateAccountDepositBehaviourResponse = (LtsStateAccountDepositBehaviourResponse) o;
    return Objects.equals(this.stateVersion, ltsStateAccountDepositBehaviourResponse.stateVersion) &&
        Objects.equals(this.ledgerHeaderSummary, ltsStateAccountDepositBehaviourResponse.ledgerHeaderSummary) &&
        Objects.equals(this.defaultDepositRule, ltsStateAccountDepositBehaviourResponse.defaultDepositRule) &&
        Objects.equals(this.isBadgeAuthorizedDepositor, ltsStateAccountDepositBehaviourResponse.isBadgeAuthorizedDepositor) &&
        Objects.equals(this.resourceSpecificBehaviours, ltsStateAccountDepositBehaviourResponse.resourceSpecificBehaviours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateVersion, ledgerHeaderSummary, defaultDepositRule, isBadgeAuthorizedDepositor, resourceSpecificBehaviours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LtsStateAccountDepositBehaviourResponse {\n");
    sb.append("    stateVersion: ").append(toIndentedString(stateVersion)).append("\n");
    sb.append("    ledgerHeaderSummary: ").append(toIndentedString(ledgerHeaderSummary)).append("\n");
    sb.append("    defaultDepositRule: ").append(toIndentedString(defaultDepositRule)).append("\n");
    sb.append("    isBadgeAuthorizedDepositor: ").append(toIndentedString(isBadgeAuthorizedDepositor)).append("\n");
    sb.append("    resourceSpecificBehaviours: ").append(toIndentedString(resourceSpecificBehaviours)).append("\n");
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

    // add `default_deposit_rule` to the URL query string
    if (getDefaultDepositRule() != null) {
      try {
        joiner.add(String.format("%sdefault_deposit_rule%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultDepositRule()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `is_badge_authorized_depositor` to the URL query string
    if (isIsBadgeAuthorizedDepositor() != null) {
      try {
        joiner.add(String.format("%sis_badge_authorized_depositor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsBadgeAuthorizedDepositor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resource_specific_behaviours` to the URL query string
    if (getResourceSpecificBehaviours() != null) {
      for (String _key : getResourceSpecificBehaviours().keySet()) {
        if (getResourceSpecificBehaviours().get(_key) != null) {
          joiner.add(getResourceSpecificBehaviours().get(_key).toUrlQueryString(String.format("%sresource_specific_behaviours%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}


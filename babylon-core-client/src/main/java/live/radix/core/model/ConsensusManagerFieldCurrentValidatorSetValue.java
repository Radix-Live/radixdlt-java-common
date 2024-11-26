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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import live.radix.core.model.ActiveValidator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ConsensusManagerFieldCurrentValidatorSetValue
 */
@JsonPropertyOrder({
  ConsensusManagerFieldCurrentValidatorSetValue.JSON_PROPERTY_VALIDATOR_SET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class ConsensusManagerFieldCurrentValidatorSetValue {
  public static final String JSON_PROPERTY_VALIDATOR_SET = "validator_set";
  private List<ActiveValidator> validatorSet = new ArrayList<>();

  public ConsensusManagerFieldCurrentValidatorSetValue() {
  }

  public ConsensusManagerFieldCurrentValidatorSetValue validatorSet(List<ActiveValidator> validatorSet) {
    
    this.validatorSet = validatorSet;
    return this;
  }

  public ConsensusManagerFieldCurrentValidatorSetValue addValidatorSetItem(ActiveValidator validatorSetItem) {
    if (this.validatorSet == null) {
      this.validatorSet = new ArrayList<>();
    }
    this.validatorSet.add(validatorSetItem);
    return this;
  }

  /**
   * Get validatorSet
   * @return validatorSet
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALIDATOR_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ActiveValidator> getValidatorSet() {
    return validatorSet;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATOR_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValidatorSet(List<ActiveValidator> validatorSet) {
    this.validatorSet = validatorSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsensusManagerFieldCurrentValidatorSetValue consensusManagerFieldCurrentValidatorSetValue = (ConsensusManagerFieldCurrentValidatorSetValue) o;
    return Objects.equals(this.validatorSet, consensusManagerFieldCurrentValidatorSetValue.validatorSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validatorSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsensusManagerFieldCurrentValidatorSetValue {\n");
    sb.append("    validatorSet: ").append(toIndentedString(validatorSet)).append("\n");
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

    // add `validator_set` to the URL query string
    if (getValidatorSet() != null) {
      for (int i = 0; i < getValidatorSet().size(); i++) {
        if (getValidatorSet().get(i) != null) {
          joiner.add(getValidatorSet().get(i).toUrlQueryString(String.format("%svalidator_set%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}


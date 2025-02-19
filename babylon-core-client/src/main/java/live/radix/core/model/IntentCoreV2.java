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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import live.radix.core.model.IntentHeaderV2;
import live.radix.core.model.TransactionMessage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * IntentCoreV2
 */
@JsonPropertyOrder({
  IntentCoreV2.JSON_PROPERTY_INTENT_HEADER,
  IntentCoreV2.JSON_PROPERTY_CHILDREN_SPECIFIERS,
  IntentCoreV2.JSON_PROPERTY_BLOBS_HEX,
  IntentCoreV2.JSON_PROPERTY_MESSAGE,
  IntentCoreV2.JSON_PROPERTY_INSTRUCTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class IntentCoreV2 {
  public static final String JSON_PROPERTY_INTENT_HEADER = "intent_header";
  private IntentHeaderV2 intentHeader;

  public static final String JSON_PROPERTY_CHILDREN_SPECIFIERS = "children_specifiers";
  private List<String> childrenSpecifiers = new ArrayList<>();

  public static final String JSON_PROPERTY_BLOBS_HEX = "blobs_hex";
  private Map<String, String> blobsHex = new HashMap<>();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private TransactionMessage message;

  public static final String JSON_PROPERTY_INSTRUCTIONS = "instructions";
  private String instructions;

  public IntentCoreV2() {
  }

  public IntentCoreV2 intentHeader(IntentHeaderV2 intentHeader) {
    
    this.intentHeader = intentHeader;
    return this;
  }

  /**
   * Get intentHeader
   * @return intentHeader
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTENT_HEADER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IntentHeaderV2 getIntentHeader() {
    return intentHeader;
  }


  @JsonProperty(JSON_PROPERTY_INTENT_HEADER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntentHeader(IntentHeaderV2 intentHeader) {
    this.intentHeader = intentHeader;
  }

  public IntentCoreV2 childrenSpecifiers(List<String> childrenSpecifiers) {
    
    this.childrenSpecifiers = childrenSpecifiers;
    return this;
  }

  public IntentCoreV2 addChildrenSpecifiersItem(String childrenSpecifiersItem) {
    if (this.childrenSpecifiers == null) {
      this.childrenSpecifiers = new ArrayList<>();
    }
    this.childrenSpecifiers.add(childrenSpecifiersItem);
    return this;
  }

  /**
   * Get childrenSpecifiers
   * @return childrenSpecifiers
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHILDREN_SPECIFIERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getChildrenSpecifiers() {
    return childrenSpecifiers;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN_SPECIFIERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChildrenSpecifiers(List<String> childrenSpecifiers) {
    this.childrenSpecifiers = childrenSpecifiers;
  }

  public IntentCoreV2 blobsHex(Map<String, String> blobsHex) {
    
    this.blobsHex = blobsHex;
    return this;
  }

  public IntentCoreV2 putBlobsHexItem(String key, String blobsHexItem) {
    if (this.blobsHex == null) {
      this.blobsHex = new HashMap<>();
    }
    this.blobsHex.put(key, blobsHexItem);
    return this;
  }

  /**
   * A map of the hex-encoded blob hash, to hex-encoded blob content. Only returned if enabled in &#x60;TransactionFormatOptions&#x60; on your request.
   * @return blobsHex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOBS_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getBlobsHex() {
    return blobsHex;
  }


  @JsonProperty(JSON_PROPERTY_BLOBS_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlobsHex(Map<String, String> blobsHex) {
    this.blobsHex = blobsHex;
  }

  public IntentCoreV2 message(TransactionMessage message) {
    
    this.message = message;
    return this;
  }

  /**
   * The optional transaction message. Only returned if present and enabled in &#x60;TransactionFormatOptions&#x60; on your request.
   * @return message
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionMessage getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(TransactionMessage message) {
    this.message = message;
  }

  public IntentCoreV2 instructions(String instructions) {
    
    this.instructions = instructions;
    return this;
  }

  /**
   * The decompiled transaction manifest instructions. Only returned if enabled in &#x60;TransactionFormatOptions&#x60; on your request.
   * @return instructions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstructions() {
    return instructions;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntentCoreV2 intentCoreV2 = (IntentCoreV2) o;
    return Objects.equals(this.intentHeader, intentCoreV2.intentHeader) &&
        Objects.equals(this.childrenSpecifiers, intentCoreV2.childrenSpecifiers) &&
        Objects.equals(this.blobsHex, intentCoreV2.blobsHex) &&
        Objects.equals(this.message, intentCoreV2.message) &&
        Objects.equals(this.instructions, intentCoreV2.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intentHeader, childrenSpecifiers, blobsHex, message, instructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentCoreV2 {\n");
    sb.append("    intentHeader: ").append(toIndentedString(intentHeader)).append("\n");
    sb.append("    childrenSpecifiers: ").append(toIndentedString(childrenSpecifiers)).append("\n");
    sb.append("    blobsHex: ").append(toIndentedString(blobsHex)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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

    // add `intent_header` to the URL query string
    if (getIntentHeader() != null) {
      joiner.add(getIntentHeader().toUrlQueryString(prefix + "intent_header" + suffix));
    }

    // add `children_specifiers` to the URL query string
    if (getChildrenSpecifiers() != null) {
      for (int i = 0; i < getChildrenSpecifiers().size(); i++) {
        try {
          joiner.add(String.format("%schildren_specifiers%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getChildrenSpecifiers().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `blobs_hex` to the URL query string
    if (getBlobsHex() != null) {
      for (String _key : getBlobsHex().keySet()) {
        try {
          joiner.add(String.format("%sblobs_hex%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getBlobsHex().get(_key), URLEncoder.encode(String.valueOf(getBlobsHex().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(getMessage().toUrlQueryString(prefix + "message" + suffix));
    }

    // add `instructions` to the URL query string
    if (getInstructions() != null) {
      try {
        joiner.add(String.format("%sinstructions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstructions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


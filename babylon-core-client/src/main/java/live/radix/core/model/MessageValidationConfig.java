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
 * MessageValidationConfig
 */
@JsonPropertyOrder({
  MessageValidationConfig.JSON_PROPERTY_MAX_PLAINTEXT_MESSAGE_LENGTH,
  MessageValidationConfig.JSON_PROPERTY_MAX_ENCRYPTED_MESSAGE_LENGTH,
  MessageValidationConfig.JSON_PROPERTY_MAX_MIME_TYPE_LENGTH,
  MessageValidationConfig.JSON_PROPERTY_MAX_DECRYPTORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class MessageValidationConfig {
  public static final String JSON_PROPERTY_MAX_PLAINTEXT_MESSAGE_LENGTH = "max_plaintext_message_length";
  private String maxPlaintextMessageLength;

  public static final String JSON_PROPERTY_MAX_ENCRYPTED_MESSAGE_LENGTH = "max_encrypted_message_length";
  private String maxEncryptedMessageLength;

  public static final String JSON_PROPERTY_MAX_MIME_TYPE_LENGTH = "max_mime_type_length";
  private String maxMimeTypeLength;

  public static final String JSON_PROPERTY_MAX_DECRYPTORS = "max_decryptors";
  private String maxDecryptors;

  public MessageValidationConfig() {
  }

  public MessageValidationConfig maxPlaintextMessageLength(String maxPlaintextMessageLength) {
    
    this.maxPlaintextMessageLength = maxPlaintextMessageLength;
    return this;
  }

  /**
   * Get maxPlaintextMessageLength
   * @return maxPlaintextMessageLength
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_PLAINTEXT_MESSAGE_LENGTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxPlaintextMessageLength() {
    return maxPlaintextMessageLength;
  }


  @JsonProperty(JSON_PROPERTY_MAX_PLAINTEXT_MESSAGE_LENGTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxPlaintextMessageLength(String maxPlaintextMessageLength) {
    this.maxPlaintextMessageLength = maxPlaintextMessageLength;
  }

  public MessageValidationConfig maxEncryptedMessageLength(String maxEncryptedMessageLength) {
    
    this.maxEncryptedMessageLength = maxEncryptedMessageLength;
    return this;
  }

  /**
   * Get maxEncryptedMessageLength
   * @return maxEncryptedMessageLength
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_ENCRYPTED_MESSAGE_LENGTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxEncryptedMessageLength() {
    return maxEncryptedMessageLength;
  }


  @JsonProperty(JSON_PROPERTY_MAX_ENCRYPTED_MESSAGE_LENGTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxEncryptedMessageLength(String maxEncryptedMessageLength) {
    this.maxEncryptedMessageLength = maxEncryptedMessageLength;
  }

  public MessageValidationConfig maxMimeTypeLength(String maxMimeTypeLength) {
    
    this.maxMimeTypeLength = maxMimeTypeLength;
    return this;
  }

  /**
   * Get maxMimeTypeLength
   * @return maxMimeTypeLength
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_MIME_TYPE_LENGTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxMimeTypeLength() {
    return maxMimeTypeLength;
  }


  @JsonProperty(JSON_PROPERTY_MAX_MIME_TYPE_LENGTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxMimeTypeLength(String maxMimeTypeLength) {
    this.maxMimeTypeLength = maxMimeTypeLength;
  }

  public MessageValidationConfig maxDecryptors(String maxDecryptors) {
    
    this.maxDecryptors = maxDecryptors;
    return this;
  }

  /**
   * Get maxDecryptors
   * @return maxDecryptors
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_DECRYPTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxDecryptors() {
    return maxDecryptors;
  }


  @JsonProperty(JSON_PROPERTY_MAX_DECRYPTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxDecryptors(String maxDecryptors) {
    this.maxDecryptors = maxDecryptors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageValidationConfig messageValidationConfig = (MessageValidationConfig) o;
    return Objects.equals(this.maxPlaintextMessageLength, messageValidationConfig.maxPlaintextMessageLength) &&
        Objects.equals(this.maxEncryptedMessageLength, messageValidationConfig.maxEncryptedMessageLength) &&
        Objects.equals(this.maxMimeTypeLength, messageValidationConfig.maxMimeTypeLength) &&
        Objects.equals(this.maxDecryptors, messageValidationConfig.maxDecryptors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPlaintextMessageLength, maxEncryptedMessageLength, maxMimeTypeLength, maxDecryptors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageValidationConfig {\n");
    sb.append("    maxPlaintextMessageLength: ").append(toIndentedString(maxPlaintextMessageLength)).append("\n");
    sb.append("    maxEncryptedMessageLength: ").append(toIndentedString(maxEncryptedMessageLength)).append("\n");
    sb.append("    maxMimeTypeLength: ").append(toIndentedString(maxMimeTypeLength)).append("\n");
    sb.append("    maxDecryptors: ").append(toIndentedString(maxDecryptors)).append("\n");
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

    // add `max_plaintext_message_length` to the URL query string
    if (getMaxPlaintextMessageLength() != null) {
      try {
        joiner.add(String.format("%smax_plaintext_message_length%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxPlaintextMessageLength()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_encrypted_message_length` to the URL query string
    if (getMaxEncryptedMessageLength() != null) {
      try {
        joiner.add(String.format("%smax_encrypted_message_length%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxEncryptedMessageLength()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_mime_type_length` to the URL query string
    if (getMaxMimeTypeLength() != null) {
      try {
        joiner.add(String.format("%smax_mime_type_length%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxMimeTypeLength()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_decryptors` to the URL query string
    if (getMaxDecryptors() != null) {
      try {
        joiner.add(String.format("%smax_decryptors%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxDecryptors()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

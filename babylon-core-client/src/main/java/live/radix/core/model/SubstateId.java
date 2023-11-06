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
import live.radix.core.model.EntityModule;
import live.radix.core.model.EntityType;
import live.radix.core.model.PartitionKind;
import live.radix.core.model.SubstateKey;
import live.radix.core.model.SubstateType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubstateId
 */
@JsonPropertyOrder({
  SubstateId.JSON_PROPERTY_ENTITY_TYPE,
  SubstateId.JSON_PROPERTY_ENTITY_ADDRESS,
  SubstateId.JSON_PROPERTY_ENTITY_MODULE,
  SubstateId.JSON_PROPERTY_PARTITION_KIND,
  SubstateId.JSON_PROPERTY_PARTITION_NUMBER,
  SubstateId.JSON_PROPERTY_SUBSTATE_TYPE,
  SubstateId.JSON_PROPERTY_SUBSTATE_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-06T18:51:31.842802500+02:00[Europe/Kiev]")
public class SubstateId {
  public static final String JSON_PROPERTY_ENTITY_TYPE = "entity_type";
  private EntityType entityType;

  public static final String JSON_PROPERTY_ENTITY_ADDRESS = "entity_address";
  private String entityAddress;

  public static final String JSON_PROPERTY_ENTITY_MODULE = "entity_module";
  private EntityModule entityModule;

  public static final String JSON_PROPERTY_PARTITION_KIND = "partition_kind";
  private PartitionKind partitionKind;

  public static final String JSON_PROPERTY_PARTITION_NUMBER = "partition_number";
  private Integer partitionNumber;

  public static final String JSON_PROPERTY_SUBSTATE_TYPE = "substate_type";
  private SubstateType substateType;

  public static final String JSON_PROPERTY_SUBSTATE_KEY = "substate_key";
  private SubstateKey substateKey;

  public SubstateId() {
  }

  public SubstateId entityType(EntityType entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }


  public SubstateId entityAddress(String entityAddress) {
    
    this.entityAddress = entityAddress;
    return this;
  }

   /**
   * Bech32m-encoded human readable version of the entity&#39;s address (ie the entity&#39;s node id)
   * @return entityAddress
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTITY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntityAddress() {
    return entityAddress;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityAddress(String entityAddress) {
    this.entityAddress = entityAddress;
  }


  public SubstateId entityModule(EntityModule entityModule) {
    
    this.entityModule = entityModule;
    return this;
  }

   /**
   * Get entityModule
   * @return entityModule
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTITY_MODULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EntityModule getEntityModule() {
    return entityModule;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_MODULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityModule(EntityModule entityModule) {
    this.entityModule = entityModule;
  }


  public SubstateId partitionKind(PartitionKind partitionKind) {
    
    this.partitionKind = partitionKind;
    return this;
  }

   /**
   * Get partitionKind
   * @return partitionKind
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARTITION_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PartitionKind getPartitionKind() {
    return partitionKind;
  }


  @JsonProperty(JSON_PROPERTY_PARTITION_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPartitionKind(PartitionKind partitionKind) {
    this.partitionKind = partitionKind;
  }


  public SubstateId partitionNumber(Integer partitionNumber) {
    
    this.partitionNumber = partitionNumber;
    return this;
  }

   /**
   * Get partitionNumber
   * minimum: 0
   * maximum: 255
   * @return partitionNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARTITION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPartitionNumber() {
    return partitionNumber;
  }


  @JsonProperty(JSON_PROPERTY_PARTITION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPartitionNumber(Integer partitionNumber) {
    this.partitionNumber = partitionNumber;
  }


  public SubstateId substateType(SubstateType substateType) {
    
    this.substateType = substateType;
    return this;
  }

   /**
   * Get substateType
   * @return substateType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBSTATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubstateType getSubstateType() {
    return substateType;
  }


  @JsonProperty(JSON_PROPERTY_SUBSTATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubstateType(SubstateType substateType) {
    this.substateType = substateType;
  }


  public SubstateId substateKey(SubstateKey substateKey) {
    
    this.substateKey = substateKey;
    return this;
  }

   /**
   * Get substateKey
   * @return substateKey
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBSTATE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubstateKey getSubstateKey() {
    return substateKey;
  }


  @JsonProperty(JSON_PROPERTY_SUBSTATE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubstateKey(SubstateKey substateKey) {
    this.substateKey = substateKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubstateId substateId = (SubstateId) o;
    return Objects.equals(this.entityType, substateId.entityType) &&
        Objects.equals(this.entityAddress, substateId.entityAddress) &&
        Objects.equals(this.entityModule, substateId.entityModule) &&
        Objects.equals(this.partitionKind, substateId.partitionKind) &&
        Objects.equals(this.partitionNumber, substateId.partitionNumber) &&
        Objects.equals(this.substateType, substateId.substateType) &&
        Objects.equals(this.substateKey, substateId.substateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, entityAddress, entityModule, partitionKind, partitionNumber, substateType, substateKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubstateId {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityAddress: ").append(toIndentedString(entityAddress)).append("\n");
    sb.append("    entityModule: ").append(toIndentedString(entityModule)).append("\n");
    sb.append("    partitionKind: ").append(toIndentedString(partitionKind)).append("\n");
    sb.append("    partitionNumber: ").append(toIndentedString(partitionNumber)).append("\n");
    sb.append("    substateType: ").append(toIndentedString(substateType)).append("\n");
    sb.append("    substateKey: ").append(toIndentedString(substateKey)).append("\n");
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

    // add `entity_type` to the URL query string
    if (getEntityType() != null) {
      try {
        joiner.add(String.format("%sentity_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `entity_address` to the URL query string
    if (getEntityAddress() != null) {
      try {
        joiner.add(String.format("%sentity_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `entity_module` to the URL query string
    if (getEntityModule() != null) {
      try {
        joiner.add(String.format("%sentity_module%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityModule()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `partition_kind` to the URL query string
    if (getPartitionKind() != null) {
      try {
        joiner.add(String.format("%spartition_kind%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPartitionKind()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `partition_number` to the URL query string
    if (getPartitionNumber() != null) {
      try {
        joiner.add(String.format("%spartition_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPartitionNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `substate_type` to the URL query string
    if (getSubstateType() != null) {
      try {
        joiner.add(String.format("%ssubstate_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubstateType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `substate_key` to the URL query string
    if (getSubstateKey() != null) {
      joiner.add(getSubstateKey().toUrlQueryString(prefix + "substate_key" + suffix));
    }

    return joiner.toString();
  }

}


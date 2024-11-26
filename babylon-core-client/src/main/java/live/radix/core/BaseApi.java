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

package live.radix.core;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collections;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public abstract class BaseApi {

  protected ApiClient apiClient;

  public BaseApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BaseApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Directly invoke the API for the given URL. Useful if the API returns direct links/URLs for subsequent requests.
   * @param url The URL for the request, either full URL or only the path.
   * @param method The HTTP method for the request.
   * @throws ApiException if fails to make API call.
   */
  public void invokeAPI(String url, String method) throws ApiException {
    invokeAPI(url, method, null, null, Collections.emptyMap());
  }

  /**
   * Directly invoke the API for the given URL. Useful if the API returns direct links/URLs for subsequent requests.
   * @param url The URL for the request, either full URL or only the path.
   * @param method The HTTP method for the request.
   * @param additionalHeaders Additional headers for the request.
   * @throws ApiException if fails to make API call.
   */
  public void invokeAPI(String url, String method, Map<String, String> additionalHeaders) throws ApiException {
    invokeAPI(url, method, null, null, additionalHeaders);
  }

  /**
   * Directly invoke the API for the given URL. Useful if the API returns direct links/URLs for subsequent requests.
   * @param url The URL for the request, either full URL or only the path.
   * @param method The HTTP method for the request.
   * @param request The request object.
   * @throws ApiException if fails to make API call.
   */
  public void invokeAPI(String url, String method, Object request) throws ApiException {
    invokeAPI(url, method, request, null, Collections.emptyMap());
  }

  /**
   * Directly invoke the API for the given URL. Useful if the API returns direct links/URLs for subsequent requests.
   * @param url The URL for the request, either full URL or only the path.
   * @param method The HTTP method for the request.
   * @param request The request object.
   * @param additionalHeaders Additional headers for the request.
   * @throws ApiException if fails to make API call.
   */
  public void invokeAPI(String url, String method, Object request, Map<String, String> additionalHeaders) throws ApiException {
    invokeAPI(url, method, request, null, additionalHeaders);
  }

  /**
   * Directly invoke the API for the given URL. Useful if the API returns direct links/URLs for subsequent requests.
   * @param url The URL for the request, either full URL or only the path.
   * @param method The HTTP method for the request.
   * @param returnType The return type.
   * @return The API response in the specified type.
   * @throws ApiException if fails to make API call.
   */
  public <T> T invokeAPI(String url, String method, TypeReference<T> returnType) throws ApiException {
    return invokeAPI(url, method, null, returnType, Collections.emptyMap());
  }

  /**
   * Directly invoke the API for the given URL. Useful if the API returns direct links/URLs for subsequent requests.
   * @param url The URL for the request, either full URL or only the path.
   * @param method The HTTP method for the request.
   * @param request The request object.
   * @param returnType The return type.
   * @return The API response in the specified type.
   * @throws ApiException if fails to make API call.
   */
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType) throws ApiException {
    return invokeAPI(url, method, request, returnType, Collections.emptyMap());
  }

  /**
   * Directly invoke the API for the given URL. Useful if the API returns direct links/URLs for subsequent requests.
   * @param url The URL for the request, either full URL or only the path.
   * @param method The HTTP method for the request.
   * @param request The request object.
   * @param returnType The return type.
   * @param additionalHeaders Additional headers for the request.
   * @return The API response in the specified type.
   * @throws ApiException if fails to make API call.
   */
  public abstract <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException;
}

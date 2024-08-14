/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package live.radix.gateway;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collections;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-15T00:18:13.130575900+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
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

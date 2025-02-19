# ExtensionsApi

All URIs are relative to *https://gateway.radix.live*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resourceHoldersPage**](ExtensionsApi.md#resourceHoldersPage) | **POST** /extensions/resource-holders/page | Get Resource Holders Page |



## resourceHoldersPage

> ResourceHoldersResponse resourceHoldersPage(resourceHoldersRequest)

Get Resource Holders Page

A paginated endpoint to discover which global entities hold the most of a given resource. More specifically, it returns a page of global entities which hold the given resource, ordered descending by the total fungible balance / total count of non-fungibles stored in vaults in the state tree of that entity (excluding unclaimed royalty balances). This endpoint operates only at the **current state version**, it is not possible to browse historical data. Because of that, it is not possible to offer stable pagination as data constantly changes. Balances might change between pages being read, which might result in gaps or some entries being returned twice. Under default Gateway configuration, up to 100 entries are returned per response. This can be increased up to 1000 entries per page with the &#x60;limit_per_page&#x60; parameter. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        ResourceHoldersRequest resourceHoldersRequest = new ResourceHoldersRequest(); // ResourceHoldersRequest | 
        try {
            ResourceHoldersResponse result = apiInstance.resourceHoldersPage(resourceHoldersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#resourceHoldersPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **resourceHoldersRequest** | [**ResourceHoldersRequest**](ResourceHoldersRequest.md)|  | |

### Return type

[**ResourceHoldersResponse**](ResourceHoldersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Resource holders |  -  |
| **4XX** | Client-originated request error |  -  |


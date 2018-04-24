# ChainApi

All URIs are relative to *http://localhost:3000/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**restChaininfo**](ChainApi.md#restChaininfo) | **GET** /chaininfo.json | Returns various state info regarding block chain processing.


<a name="restChaininfo"></a>
# **restChaininfo**
> ChainInfo restChaininfo()

Returns various state info regarding block chain processing.

Returns various state info regarding block chain processing. Only supports JSON as output format.

### Example
```java
// Import classes:
//import io.swagger.client.api.ChainApi;

ChainApi apiInstance = new ChainApi();
try {
    ChainInfo result = apiInstance.restChaininfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainApi#restChaininfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChainInfo**](ChainInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


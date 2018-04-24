# BlockApi

All URIs are relative to *http://localhost:3000/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**restBlockExtended**](BlockApi.md#restBlockExtended) | **GET** /block/{blockHash} | Get block by hash.
[**restBlockNotxdetails**](BlockApi.md#restBlockNotxdetails) | **GET** /block/notxdetails/{blockHash}.{format} | Get block by hash.


<a name="restBlockExtended"></a>
# **restBlockExtended**
> Block restBlockExtended(blockHash)

Get block by hash.

Given a block hash: returns a block, in binary, hex-encoded binary or JSON formats. The HTTP request and response are both handled entirely in-memory, thus making maximum memory usage at least 2.66MB (1 MB max block, plus hex encoding) per request. With the /notxdetails/ option JSON response will only contain the transaction hash instead of the complete transaction details. The option only affects the JSON response.

### Example
```java
// Import classes:
//import io.swagger.client.api.BlockApi;

BlockApi apiInstance = new BlockApi();
String blockHash = "blockHash_example"; // String | the block hash
try {
    Block result = apiInstance.restBlockExtended(blockHash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#restBlockExtended");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockHash** | **String**| the block hash |

### Return type

[**Block**](Block.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, text/plain, application/json

<a name="restBlockNotxdetails"></a>
# **restBlockNotxdetails**
> Block restBlockNotxdetails(blockHash, format)

Get block by hash.

Given a block hash: returns a block, in binary, hex-encoded binary or JSON formats. The HTTP request and response are both handled entirely in-memory, thus making maximum memory usage at least 2.66MB (1 MB max block, plus hex encoding) per request. With the /notxdetails/ option JSON response will only contain the transaction hash instead of the complete transaction details. The option only affects the JSON response.

### Example
```java
// Import classes:
//import io.swagger.client.api.BlockApi;

BlockApi apiInstance = new BlockApi();
String blockHash = "blockHash_example"; // String | The block hash
String format = "format_example"; // String | The expected format
try {
    Block result = apiInstance.restBlockNotxdetails(blockHash, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#restBlockNotxdetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockHash** | **String**| The block hash |
 **format** | **String**| The expected format | [enum: json, bin, hex]

### Return type

[**Block**](Block.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, text/plain, application/json


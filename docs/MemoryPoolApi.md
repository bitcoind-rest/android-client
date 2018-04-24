# MemoryPoolApi

All URIs are relative to *http://localhost:3000/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**restGetutxos**](MemoryPoolApi.md#restGetutxos) | **GET** /getutxos/checkmempool/{txHash}-{txOutput}.{format} | Returns Unspent Transaction (TX) Outputs
[**restHeaders**](MemoryPoolApi.md#restHeaders) | **GET** /headers/{headerCount}/{blockHash}.{format} | Returns headers.
[**restMempoolContents**](MemoryPoolApi.md#restMempoolContents) | **GET** /mempool/contents.json | Returns transactions in the TX mempool.
[**restMempoolInfo**](MemoryPoolApi.md#restMempoolInfo) | **GET** /mempool/info.json | Returns various information about the TX mempool.


<a name="restGetutxos"></a>
# **restGetutxos**
> InlineResponse200 restGetutxos(txHash, txOutput, format)

Returns Unspent Transaction (TX) Outputs

Only supports JSON as output format.

### Example
```java
// Import classes:
//import io.swagger.client.api.MemoryPoolApi;

MemoryPoolApi apiInstance = new MemoryPoolApi();
String txHash = "txHash_example"; // String | The transaction hash
String txOutput = "txOutput_example"; // String | The transaction output
String format = "format_example"; // String | The expected format
try {
    InlineResponse200 result = apiInstance.restGetutxos(txHash, txOutput, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemoryPoolApi#restGetutxos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txHash** | **String**| The transaction hash |
 **txOutput** | **String**| The transaction output |
 **format** | **String**| The expected format | [enum: json, bin, hex]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, text/plain

<a name="restHeaders"></a>
# **restHeaders**
> String restHeaders(headerCount, blockHash, format)

Returns headers.

Only supports BIN and HEX as output format.

### Example
```java
// Import classes:
//import io.swagger.client.api.MemoryPoolApi;

MemoryPoolApi apiInstance = new MemoryPoolApi();
Integer headerCount = 56; // Integer | The header count
String blockHash = "blockHash_example"; // String | The block hash
String format = "format_example"; // String | The expected format
try {
    String result = apiInstance.restHeaders(headerCount, blockHash, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemoryPoolApi#restHeaders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headerCount** | **Integer**| The header count |
 **blockHash** | **String**| The block hash |
 **format** | **String**| The expected format | [enum: bin, hex]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, text/plain

<a name="restMempoolContents"></a>
# **restMempoolContents**
> InlineResponseDefault restMempoolContents()

Returns transactions in the TX mempool.

Only supports JSON as output format.

### Example
```java
// Import classes:
//import io.swagger.client.api.MemoryPoolApi;

MemoryPoolApi apiInstance = new MemoryPoolApi();
try {
    InlineResponseDefault result = apiInstance.restMempoolContents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemoryPoolApi#restMempoolContents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponseDefault**](InlineResponseDefault.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restMempoolInfo"></a>
# **restMempoolInfo**
> MemoryPool restMempoolInfo()

Returns various information about the TX mempool.

Only supports JSON as output format.

### Example
```java
// Import classes:
//import io.swagger.client.api.MemoryPoolApi;

MemoryPoolApi apiInstance = new MemoryPoolApi();
try {
    MemoryPool result = apiInstance.restMempoolInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemoryPoolApi#restMempoolInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MemoryPool**](MemoryPool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


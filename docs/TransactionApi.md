# TransactionApi

All URIs are relative to *http://localhost:3000/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**restTx**](TransactionApi.md#restTx) | **GET** /tx/{txHash} | Get transaction by hash.


<a name="restTx"></a>
# **restTx**
> Transaction restTx(txHash)

Get transaction by hash.

Given a transaction hash: returns a transaction in binary, hex-encoded binary, or JSON formats. For full TX query capability, one must enable the transaction index via txindex&#x3D;1 command line / configuration option.

### Example
```java
// Import classes:
//import io.swagger.client.api.TransactionApi;

TransactionApi apiInstance = new TransactionApi();
String txHash = "txHash_example"; // String | The transaction hash.
try {
    Transaction result = apiInstance.restTx(txHash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#restTx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txHash** | **String**| The transaction hash. |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, text/plain, application/json


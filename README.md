# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.BlockApi;

public class BlockApiExample {

    public static void main(String[] args) {
        BlockApi apiInstance = new BlockApi();
        String blockHash = "blockHash_example"; // String | the block hash
        try {
            Block result = apiInstance.restBlockExtended(blockHash);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockApi#restBlockExtended");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:3000/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BlockApi* | [**restBlockExtended**](docs/BlockApi.md#restBlockExtended) | **GET** /block/{blockHash} | Get block by hash.
*BlockApi* | [**restBlockNotxdetails**](docs/BlockApi.md#restBlockNotxdetails) | **GET** /block/notxdetails/{blockHash}.{format} | Get block by hash.
*ChainApi* | [**restChaininfo**](docs/ChainApi.md#restChaininfo) | **GET** /chaininfo.json | Returns various state info regarding block chain processing.
*MemoryPoolApi* | [**restGetutxos**](docs/MemoryPoolApi.md#restGetutxos) | **GET** /getutxos/checkmempool/{txHash}-{txOutput}.{format} | Returns Unspent Transaction (TX) Outputs
*MemoryPoolApi* | [**restHeaders**](docs/MemoryPoolApi.md#restHeaders) | **GET** /headers/{headerCount}/{blockHash}.{format} | Returns headers.
*MemoryPoolApi* | [**restMempoolContents**](docs/MemoryPoolApi.md#restMempoolContents) | **GET** /mempool/contents.json | Returns transactions in the TX mempool.
*MemoryPoolApi* | [**restMempoolInfo**](docs/MemoryPoolApi.md#restMempoolInfo) | **GET** /mempool/info.json | Returns various information about the TX mempool.
*TransactionApi* | [**restTx**](docs/TransactionApi.md#restTx) | **GET** /tx/{txHash} | Get transaction by hash.


## Documentation for Models

 - [BIP](docs/BIP.md)
 - [BIP9](docs/BIP9.md)
 - [BIPReject](docs/BIPReject.md)
 - [Block](docs/Block.md)
 - [ChainInfo](docs/ChainInfo.md)
 - [ChainInfoBip9Softforks](docs/ChainInfoBip9Softforks.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponseDefault](docs/InlineResponseDefault.md)
 - [MemoryPool](docs/MemoryPool.md)
 - [ScriptPubKey](docs/ScriptPubKey.md)
 - [Transaction](docs/Transaction.md)
 - [UTxO](docs/UTxO.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

johan@lepetitbloc.net


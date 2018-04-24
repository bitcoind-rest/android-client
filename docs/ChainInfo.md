
# ChainInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chain** | [**ChainEnum**](#ChainEnum) | Current network name as defined in BIP70 (main, test, regtest) |  [optional]
**blocks** | **Long** | The current number of blocks processed in the server |  [optional]
**headers** | **Long** | The current number of headers we have validated |  [optional]
**bestblockhash** | **String** | The hash of the currently best block |  [optional]
**difficulty** | **Long** | The current difficulty |  [optional]
**mediantime** | **Integer** | The median time of the 11 blocks before the most recent block on the blockchain |  [optional]
**verificationprogress** | **Integer** | Estimate of verification progress [0..1] |  [optional]
**initialblockdownload** | **Boolean** |  |  [optional]
**chainwork** | **String** | Total amount of work in active chain, in hexadecimal |  [optional]
**sizeOnDisk** | **Long** |  |  [optional]
**pruned** | **Boolean** | If the blocks are subject to pruning |  [optional]
**softforks** | [**List&lt;BIP&gt;**](BIP.md) | status of softforks in progress |  [optional]
**bip9Softforks** | [**ChainInfoBip9Softforks**](ChainInfoBip9Softforks.md) |  |  [optional]
**warnings** | **String** | An eventual warning on the current build status. |  [optional]


<a name="ChainEnum"></a>
## Enum: ChainEnum
Name | Value
---- | -----





# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Float** | The transaction amount in BTC |  [optional]
**fee** | **Float** | The amount of the fee in BTC. This is negative and only available for the send category of transactions. |  [optional]
**confirmations** | **Long** | The number of confirmations |  [optional]
**blockhash** | **String** | The block hash |  [optional]
**blockindex** | **Long** | The index of the transaction in the block that includes it |  [optional]
**blocktime** | **Integer** | The time in seconds since epoch (1 Jan 1970 GMT) |  [optional]
**txid** | **String** | The transaction id |  [optional]
**txhash** | **String** | The transaction hash |  [optional]
**version** | **Integer** |  |  [optional]
**size** | **Integer** |  |  [optional]
**vsize** | **Integer** |  |  [optional]
**locktime** | **Integer** |  |  [optional]
**time** | **Integer** | The transaction time in seconds since epoch (1 Jan 1970 GMT) |  [optional]
**timereceived** | **Integer** | The time received in seconds since epoch (1 Jan 1970 GMT) |  [optional]
**bip125Replaceable** | [**Bip125ReplaceableEnum**](#Bip125ReplaceableEnum) | Whether this transaction could be replaced due to BIP125 (replace-by-fee); may be unknown for unconfirmed transactions not in the mempool |  [optional]


<a name="Bip125ReplaceableEnum"></a>
## Enum: Bip125ReplaceableEnum
Name | Value
---- | -----




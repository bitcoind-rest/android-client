
# BIP9

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**startTime** | **Long** | The starttime specifies a minimum median time past of a block at which the bit gains its meaning. |  [optional]
**timeout** | **Long** | The timeout specifies a time at which the deployment is considered failed. If the median time past of a block &gt;&#x3D; timeout and the soft fork has not yet locked in (including this block&#39;s bit state), the deployment is considered failed on all descendants of the block. |  [optional]
**since** | **Long** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----




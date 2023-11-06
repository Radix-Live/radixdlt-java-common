

# ParsedSignedTransactionIntentIdentifiers


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**intentHash** | **String** | The hex-encoded intent hash for a user transaction, also known as the transaction id. This hash identifies the core content \&quot;intent\&quot; of the transaction. Each intent can only be committed once. This hash gets signed by any signatories on the transaction, to create the signed intent.  |  |
|**intentHashBech32m** | **String** | The Bech32m-encoded human readable &#x60;IntentHash&#x60;. |  |
|**signedIntentHash** | **String** | The hex-encoded signed intent hash for a user transaction. This hash identifies the transaction intent, plus additional signatures. This hash is signed by the notary, to create the submittable NotarizedTransaction.  |  |
|**signedIntentHashBech32m** | **String** | The Bech32m-encoded human readable &#x60;SignedIntentHash&#x60;. |  |



# babylon-gateway-client

Radix Gateway API - Babylon

- API version: v1.9.2-L

- Build date: 2024-12-12T19:38:04.213407200+02:00[Europe/Kiev]

- Generator version: 7.7.0

This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic
state on the RadixDLT ledger, and intelligently handle transaction submission.

It is designed for use by wallets and explorers, and for light queries from front-end dApps.
For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using
the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.

The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway),
which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract
and index data from the network.

This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more
about how to run a Gateway of your own.

## Migration guide

Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).

## Integration and forward compatibility guarantees

All responses may have additional fields added at any release, so clients are advised to use JSON parsers which
ignore unknown fields on JSON objects.

When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the
API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update
in advance to be able to handle these new variants when a protocol update comes out.

On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with
deprecation notices on previous versions. These deprecation notices will include a safe migration path.
Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.

The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes
will be flagged in the release notes so clients doing custom DB integrations can prepare.



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>live.radix</groupId>
  <artifactId>babylon-gateway-client</artifactId>
  <version>v1.9.2-L</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "live.radix:babylon-gateway-client:v1.9.2-L"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/babylon-gateway-client-v1.9.2-L.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import live.radix.gateway.*;
import live.radix.gateway.auth.*;
import live.radix.gateway.model.*;
import live.radix.gateway.client.ExtensionsApi;

public class ExtensionsApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *https://gateway.radix.live*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ExtensionsApi* | [**resourceHoldersPage**](docs/ExtensionsApi.md#resourceHoldersPage) | **POST** /extensions/resource-holders/page | Get Resource Holders Page
*StateApi* | [**accountAuthorizedDepositorsPage**](docs/StateApi.md#accountAuthorizedDepositorsPage) | **POST** /state/account/page/authorized-depositors | Get Account authorized depositors
*StateApi* | [**accountLockerVaultsPage**](docs/StateApi.md#accountLockerVaultsPage) | **POST** /state/account-locker/page/vaults | Get Account Locker Vaults Page
*StateApi* | [**accountLockersTouchedAt**](docs/StateApi.md#accountLockersTouchedAt) | **POST** /state/account-lockers/touched-at | Get Most Recent Touch of Account Lockers
*StateApi* | [**accountResourcePreferencesPage**](docs/StateApi.md#accountResourcePreferencesPage) | **POST** /state/account/page/resource-preferences | Get Account resource preferences
*StateApi* | [**entityFungibleResourceVaultPage**](docs/StateApi.md#entityFungibleResourceVaultPage) | **POST** /state/entity/page/fungible-vaults/ | Get page of Global Entity Fungible Resource Vaults
*StateApi* | [**entityFungiblesPage**](docs/StateApi.md#entityFungiblesPage) | **POST** /state/entity/page/fungibles/ | Get page of Global Entity Fungible Resource Balances
*StateApi* | [**entityMetadataPage**](docs/StateApi.md#entityMetadataPage) | **POST** /state/entity/page/metadata | Get Entity Metadata Page
*StateApi* | [**entityNonFungibleIdsPage**](docs/StateApi.md#entityNonFungibleIdsPage) | **POST** /state/entity/page/non-fungible-vault/ids | Get page of Non-Fungibles in Vault
*StateApi* | [**entityNonFungibleResourceVaultPage**](docs/StateApi.md#entityNonFungibleResourceVaultPage) | **POST** /state/entity/page/non-fungible-vaults/ | Get page of Global Entity Non-Fungible Resource Vaults
*StateApi* | [**entityNonFungiblesPage**](docs/StateApi.md#entityNonFungiblesPage) | **POST** /state/entity/page/non-fungibles/ | Get page of Global Entity Non-Fungible Resource Balances
*StateApi* | [**entitySchemaPage**](docs/StateApi.md#entitySchemaPage) | **POST** /state/entity/page/schemas | Get Entity Schema Page
*StateApi* | [**keyValueStoreData**](docs/StateApi.md#keyValueStoreData) | **POST** /state/key-value-store/data | Get KeyValueStore Data
*StateApi* | [**keyValueStoreKeys**](docs/StateApi.md#keyValueStoreKeys) | **POST** /state/key-value-store/keys | Get KeyValueStore Keys
*StateApi* | [**nonFungibleData**](docs/StateApi.md#nonFungibleData) | **POST** /state/non-fungible/data | Get Non-Fungible Data
*StateApi* | [**nonFungibleIds**](docs/StateApi.md#nonFungibleIds) | **POST** /state/non-fungible/ids | Get page of Non-Fungible Ids in Resource Collection
*StateApi* | [**nonFungibleLocation**](docs/StateApi.md#nonFungibleLocation) | **POST** /state/non-fungible/location | Get Non-Fungible Location
*StateApi* | [**packageBlueprintPage**](docs/StateApi.md#packageBlueprintPage) | **POST** /state/package/page/blueprints | Get Package Blueprints Page
*StateApi* | [**packageCodePage**](docs/StateApi.md#packageCodePage) | **POST** /state/package/page/codes | Get Package Codes Page
*StateApi* | [**stateEntityDetails**](docs/StateApi.md#stateEntityDetails) | **POST** /state/entity/details | Get Entity Details
*StateApi* | [**stateValidatorsList**](docs/StateApi.md#stateValidatorsList) | **POST** /state/validators/list | Get Validators List
*StatisticsApi* | [**validatorsUptime**](docs/StatisticsApi.md#validatorsUptime) | **POST** /statistics/validators/uptime | Get Validators Uptime
*StatusApi* | [**gatewayStatus**](docs/StatusApi.md#gatewayStatus) | **POST** /status/gateway-status | Get Gateway Status
*StatusApi* | [**networkConfiguration**](docs/StatusApi.md#networkConfiguration) | **POST** /status/network-configuration | Get Network Configuration
*StreamApi* | [**streamTransactions**](docs/StreamApi.md#streamTransactions) | **POST** /stream/transactions | Get Transactions Stream
*TransactionApi* | [**accountDepositPreValidation**](docs/TransactionApi.md#accountDepositPreValidation) | **POST** /transaction/account-deposit-pre-validation | PreValidate deposit of resources to an account
*TransactionApi* | [**transactionCommittedDetails**](docs/TransactionApi.md#transactionCommittedDetails) | **POST** /transaction/committed-details | Get Committed Transaction Details
*TransactionApi* | [**transactionConstruction**](docs/TransactionApi.md#transactionConstruction) | **POST** /transaction/construction | Get Construction Metadata
*TransactionApi* | [**transactionPreview**](docs/TransactionApi.md#transactionPreview) | **POST** /transaction/preview | Preview Transaction
*TransactionApi* | [**transactionPreviewV2**](docs/TransactionApi.md#transactionPreviewV2) | **POST** /transaction/preview-v2 | Preview Transaction V2
*TransactionApi* | [**transactionStatus**](docs/TransactionApi.md#transactionStatus) | **POST** /transaction/status | Get Transaction Status
*TransactionApi* | [**transactionSubintentStatus**](docs/TransactionApi.md#transactionSubintentStatus) | **POST** /transaction/subintent-status | Get Subintent Status
*TransactionApi* | [**transactionSubmit**](docs/TransactionApi.md#transactionSubmit) | **POST** /transaction/submit | Submit Transaction


## Documentation for Models

 - [AccountAuthorizedDepositorBadgeType](docs/AccountAuthorizedDepositorBadgeType.md)
 - [AccountAuthorizedDepositorsCollection](docs/AccountAuthorizedDepositorsCollection.md)
 - [AccountAuthorizedDepositorsNonFungibleBadge](docs/AccountAuthorizedDepositorsNonFungibleBadge.md)
 - [AccountAuthorizedDepositorsResourceBadge](docs/AccountAuthorizedDepositorsResourceBadge.md)
 - [AccountAuthorizedDepositorsResponseItem](docs/AccountAuthorizedDepositorsResponseItem.md)
 - [AccountDefaultDepositRule](docs/AccountDefaultDepositRule.md)
 - [AccountDepositPreValidationDecidingFactors](docs/AccountDepositPreValidationDecidingFactors.md)
 - [AccountDepositPreValidationDecidingFactorsResourceSpecificDetailsItem](docs/AccountDepositPreValidationDecidingFactorsResourceSpecificDetailsItem.md)
 - [AccountDepositPreValidationNonFungibleBadge](docs/AccountDepositPreValidationNonFungibleBadge.md)
 - [AccountDepositPreValidationRequest](docs/AccountDepositPreValidationRequest.md)
 - [AccountDepositPreValidationResourceBadge](docs/AccountDepositPreValidationResourceBadge.md)
 - [AccountDepositPreValidationResourceSpecificBehaviourItem](docs/AccountDepositPreValidationResourceSpecificBehaviourItem.md)
 - [AccountDepositPreValidationResponse](docs/AccountDepositPreValidationResponse.md)
 - [AccountLockerAddress](docs/AccountLockerAddress.md)
 - [AccountLockerNotFoundError](docs/AccountLockerNotFoundError.md)
 - [AccountLockerVaultCollection](docs/AccountLockerVaultCollection.md)
 - [AccountLockerVaultCollectionItem](docs/AccountLockerVaultCollectionItem.md)
 - [AccountLockerVaultCollectionItemFungible](docs/AccountLockerVaultCollectionItemFungible.md)
 - [AccountLockerVaultCollectionItemNonFungible](docs/AccountLockerVaultCollectionItemNonFungible.md)
 - [AccountLockerVaultCollectionItemType](docs/AccountLockerVaultCollectionItemType.md)
 - [AccountResourcePreferenceRule](docs/AccountResourcePreferenceRule.md)
 - [AccountResourcePreferencesCollection](docs/AccountResourcePreferencesCollection.md)
 - [AccountResourcePreferencesResponseItem](docs/AccountResourcePreferencesResponseItem.md)
 - [AtLedgerStateMixin](docs/AtLedgerStateMixin.md)
 - [BlueprintMethodRoyalty](docs/BlueprintMethodRoyalty.md)
 - [BlueprintRoyaltyConfig](docs/BlueprintRoyaltyConfig.md)
 - [CommittedTransactionInfo](docs/CommittedTransactionInfo.md)
 - [CompiledPreviewTransaction](docs/CompiledPreviewTransaction.md)
 - [ComponentEntityRoleAssignmentEntry](docs/ComponentEntityRoleAssignmentEntry.md)
 - [ComponentEntityRoleAssignmentEntryAssignment](docs/ComponentEntityRoleAssignmentEntryAssignment.md)
 - [ComponentEntityRoleAssignmentEntryExplicitAssignment](docs/ComponentEntityRoleAssignmentEntryExplicitAssignment.md)
 - [ComponentEntityRoleAssignmentEntryOwnerAssignment](docs/ComponentEntityRoleAssignmentEntryOwnerAssignment.md)
 - [ComponentEntityRoleAssignments](docs/ComponentEntityRoleAssignments.md)
 - [ComponentMethodRoyalty](docs/ComponentMethodRoyalty.md)
 - [ComponentRoyaltyConfig](docs/ComponentRoyaltyConfig.md)
 - [CursorLimitMixin](docs/CursorLimitMixin.md)
 - [EntityMetadataCollection](docs/EntityMetadataCollection.md)
 - [EntityMetadataItem](docs/EntityMetadataItem.md)
 - [EntityMetadataItemValue](docs/EntityMetadataItemValue.md)
 - [EntityNotFoundError](docs/EntityNotFoundError.md)
 - [EntitySchemaCollection](docs/EntitySchemaCollection.md)
 - [EntitySchemaCollectionItem](docs/EntitySchemaCollectionItem.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [EventsItem](docs/EventsItem.md)
 - [FromLedgerStateMixin](docs/FromLedgerStateMixin.md)
 - [FungibleResourcesCollection](docs/FungibleResourcesCollection.md)
 - [FungibleResourcesCollectionItem](docs/FungibleResourcesCollectionItem.md)
 - [FungibleResourcesCollectionItemGloballyAggregated](docs/FungibleResourcesCollectionItemGloballyAggregated.md)
 - [FungibleResourcesCollectionItemVaultAggregated](docs/FungibleResourcesCollectionItemVaultAggregated.md)
 - [FungibleResourcesCollectionItemVaultAggregatedVault](docs/FungibleResourcesCollectionItemVaultAggregatedVault.md)
 - [FungibleResourcesCollectionItemVaultAggregatedVaultItem](docs/FungibleResourcesCollectionItemVaultAggregatedVaultItem.md)
 - [GatewayError](docs/GatewayError.md)
 - [GatewayInfoResponseKnownTarget](docs/GatewayInfoResponseKnownTarget.md)
 - [GatewayInfoResponseReleaseInfo](docs/GatewayInfoResponseReleaseInfo.md)
 - [GatewayStatusResponse](docs/GatewayStatusResponse.md)
 - [InternalServerError](docs/InternalServerError.md)
 - [InvalidEntityError](docs/InvalidEntityError.md)
 - [InvalidRequestError](docs/InvalidRequestError.md)
 - [InvalidTransactionError](docs/InvalidTransactionError.md)
 - [LedgerState](docs/LedgerState.md)
 - [LedgerStateMixin](docs/LedgerStateMixin.md)
 - [LedgerStateSelector](docs/LedgerStateSelector.md)
 - [ManifestClass](docs/ManifestClass.md)
 - [MetadataBoolArrayValue](docs/MetadataBoolArrayValue.md)
 - [MetadataBoolValue](docs/MetadataBoolValue.md)
 - [MetadataDecimalArrayValue](docs/MetadataDecimalArrayValue.md)
 - [MetadataDecimalValue](docs/MetadataDecimalValue.md)
 - [MetadataGlobalAddressArrayValue](docs/MetadataGlobalAddressArrayValue.md)
 - [MetadataGlobalAddressValue](docs/MetadataGlobalAddressValue.md)
 - [MetadataI32ArrayValue](docs/MetadataI32ArrayValue.md)
 - [MetadataI32Value](docs/MetadataI32Value.md)
 - [MetadataI64ArrayValue](docs/MetadataI64ArrayValue.md)
 - [MetadataI64Value](docs/MetadataI64Value.md)
 - [MetadataInstantArrayValue](docs/MetadataInstantArrayValue.md)
 - [MetadataInstantValue](docs/MetadataInstantValue.md)
 - [MetadataNonFungibleGlobalIdArrayValue](docs/MetadataNonFungibleGlobalIdArrayValue.md)
 - [MetadataNonFungibleGlobalIdArrayValueAllOfValues](docs/MetadataNonFungibleGlobalIdArrayValueAllOfValues.md)
 - [MetadataNonFungibleGlobalIdValue](docs/MetadataNonFungibleGlobalIdValue.md)
 - [MetadataNonFungibleLocalIdArrayValue](docs/MetadataNonFungibleLocalIdArrayValue.md)
 - [MetadataNonFungibleLocalIdValue](docs/MetadataNonFungibleLocalIdValue.md)
 - [MetadataOriginArrayValue](docs/MetadataOriginArrayValue.md)
 - [MetadataOriginValue](docs/MetadataOriginValue.md)
 - [MetadataPublicKeyArrayValue](docs/MetadataPublicKeyArrayValue.md)
 - [MetadataPublicKeyHashArrayValue](docs/MetadataPublicKeyHashArrayValue.md)
 - [MetadataPublicKeyHashValue](docs/MetadataPublicKeyHashValue.md)
 - [MetadataPublicKeyValue](docs/MetadataPublicKeyValue.md)
 - [MetadataStringArrayValue](docs/MetadataStringArrayValue.md)
 - [MetadataStringValue](docs/MetadataStringValue.md)
 - [MetadataTypedValue](docs/MetadataTypedValue.md)
 - [MetadataU32ArrayValue](docs/MetadataU32ArrayValue.md)
 - [MetadataU32Value](docs/MetadataU32Value.md)
 - [MetadataU64ArrayValue](docs/MetadataU64ArrayValue.md)
 - [MetadataU64Value](docs/MetadataU64Value.md)
 - [MetadataU8ArrayValue](docs/MetadataU8ArrayValue.md)
 - [MetadataU8Value](docs/MetadataU8Value.md)
 - [MetadataUrlArrayValue](docs/MetadataUrlArrayValue.md)
 - [MetadataUrlValue](docs/MetadataUrlValue.md)
 - [MetadataValueType](docs/MetadataValueType.md)
 - [NativeResourceAccessControllerRecoveryBadgeValue](docs/NativeResourceAccessControllerRecoveryBadgeValue.md)
 - [NativeResourceAccountOwnerBadgeValue](docs/NativeResourceAccountOwnerBadgeValue.md)
 - [NativeResourceDetails](docs/NativeResourceDetails.md)
 - [NativeResourceEd25519SignatureResourceValue](docs/NativeResourceEd25519SignatureResourceValue.md)
 - [NativeResourceGlobalCallerResourceValue](docs/NativeResourceGlobalCallerResourceValue.md)
 - [NativeResourceIdentityOwnerBadgeValue](docs/NativeResourceIdentityOwnerBadgeValue.md)
 - [NativeResourceKind](docs/NativeResourceKind.md)
 - [NativeResourceMultiResourcePoolUnitValue](docs/NativeResourceMultiResourcePoolUnitValue.md)
 - [NativeResourceOneResourcePoolUnitValue](docs/NativeResourceOneResourcePoolUnitValue.md)
 - [NativeResourcePackageOfDirectCallerResourceValue](docs/NativeResourcePackageOfDirectCallerResourceValue.md)
 - [NativeResourcePackageOwnerBadgeValue](docs/NativeResourcePackageOwnerBadgeValue.md)
 - [NativeResourceRedemptionValueItem](docs/NativeResourceRedemptionValueItem.md)
 - [NativeResourceSecp256k1SignatureResourceValue](docs/NativeResourceSecp256k1SignatureResourceValue.md)
 - [NativeResourceSystemExecutionResourceValue](docs/NativeResourceSystemExecutionResourceValue.md)
 - [NativeResourceTwoResourcePoolUnitValue](docs/NativeResourceTwoResourcePoolUnitValue.md)
 - [NativeResourceValidatorClaimNftValue](docs/NativeResourceValidatorClaimNftValue.md)
 - [NativeResourceValidatorLiquidStakeUnitValue](docs/NativeResourceValidatorLiquidStakeUnitValue.md)
 - [NativeResourceValidatorOwnerBadgeValue](docs/NativeResourceValidatorOwnerBadgeValue.md)
 - [NativeResourceXrdValue](docs/NativeResourceXrdValue.md)
 - [NetworkConfigurationResponse](docs/NetworkConfigurationResponse.md)
 - [NetworkConfigurationResponseWellKnownAddresses](docs/NetworkConfigurationResponseWellKnownAddresses.md)
 - [NonFungibleIdType](docs/NonFungibleIdType.md)
 - [NonFungibleIdsCollection](docs/NonFungibleIdsCollection.md)
 - [NonFungibleResourcesCollection](docs/NonFungibleResourcesCollection.md)
 - [NonFungibleResourcesCollectionItem](docs/NonFungibleResourcesCollectionItem.md)
 - [NonFungibleResourcesCollectionItemGloballyAggregated](docs/NonFungibleResourcesCollectionItemGloballyAggregated.md)
 - [NonFungibleResourcesCollectionItemVaultAggregated](docs/NonFungibleResourcesCollectionItemVaultAggregated.md)
 - [NonFungibleResourcesCollectionItemVaultAggregatedVault](docs/NonFungibleResourcesCollectionItemVaultAggregatedVault.md)
 - [NonFungibleResourcesCollectionItemVaultAggregatedVaultItem](docs/NonFungibleResourcesCollectionItemVaultAggregatedVaultItem.md)
 - [NotSyncedUpError](docs/NotSyncedUpError.md)
 - [ObjectModuleId](docs/ObjectModuleId.md)
 - [OptionalNonFungibleIdsCollection](docs/OptionalNonFungibleIdsCollection.md)
 - [PackageBlueprintCollection](docs/PackageBlueprintCollection.md)
 - [PackageBlueprintCollectionItem](docs/PackageBlueprintCollectionItem.md)
 - [PackageCodeCollection](docs/PackageCodeCollection.md)
 - [PackageCodeCollectionItem](docs/PackageCodeCollectionItem.md)
 - [PackageVmType](docs/PackageVmType.md)
 - [PreviewFlags](docs/PreviewFlags.md)
 - [PreviewTransaction](docs/PreviewTransaction.md)
 - [PreviewTransactionType](docs/PreviewTransactionType.md)
 - [ProgrammaticScryptoSborValue](docs/ProgrammaticScryptoSborValue.md)
 - [ProgrammaticScryptoSborValueArray](docs/ProgrammaticScryptoSborValueArray.md)
 - [ProgrammaticScryptoSborValueBool](docs/ProgrammaticScryptoSborValueBool.md)
 - [ProgrammaticScryptoSborValueBytes](docs/ProgrammaticScryptoSborValueBytes.md)
 - [ProgrammaticScryptoSborValueDecimal](docs/ProgrammaticScryptoSborValueDecimal.md)
 - [ProgrammaticScryptoSborValueEnum](docs/ProgrammaticScryptoSborValueEnum.md)
 - [ProgrammaticScryptoSborValueI128](docs/ProgrammaticScryptoSborValueI128.md)
 - [ProgrammaticScryptoSborValueI16](docs/ProgrammaticScryptoSborValueI16.md)
 - [ProgrammaticScryptoSborValueI32](docs/ProgrammaticScryptoSborValueI32.md)
 - [ProgrammaticScryptoSborValueI64](docs/ProgrammaticScryptoSborValueI64.md)
 - [ProgrammaticScryptoSborValueI8](docs/ProgrammaticScryptoSborValueI8.md)
 - [ProgrammaticScryptoSborValueKind](docs/ProgrammaticScryptoSborValueKind.md)
 - [ProgrammaticScryptoSborValueMap](docs/ProgrammaticScryptoSborValueMap.md)
 - [ProgrammaticScryptoSborValueMapEntry](docs/ProgrammaticScryptoSborValueMapEntry.md)
 - [ProgrammaticScryptoSborValueNonFungibleLocalId](docs/ProgrammaticScryptoSborValueNonFungibleLocalId.md)
 - [ProgrammaticScryptoSborValueOwn](docs/ProgrammaticScryptoSborValueOwn.md)
 - [ProgrammaticScryptoSborValuePreciseDecimal](docs/ProgrammaticScryptoSborValuePreciseDecimal.md)
 - [ProgrammaticScryptoSborValueReference](docs/ProgrammaticScryptoSborValueReference.md)
 - [ProgrammaticScryptoSborValueString](docs/ProgrammaticScryptoSborValueString.md)
 - [ProgrammaticScryptoSborValueTuple](docs/ProgrammaticScryptoSborValueTuple.md)
 - [ProgrammaticScryptoSborValueU128](docs/ProgrammaticScryptoSborValueU128.md)
 - [ProgrammaticScryptoSborValueU16](docs/ProgrammaticScryptoSborValueU16.md)
 - [ProgrammaticScryptoSborValueU32](docs/ProgrammaticScryptoSborValueU32.md)
 - [ProgrammaticScryptoSborValueU64](docs/ProgrammaticScryptoSborValueU64.md)
 - [ProgrammaticScryptoSborValueU8](docs/ProgrammaticScryptoSborValueU8.md)
 - [PublicKey](docs/PublicKey.md)
 - [PublicKeyEcdsaSecp256k1](docs/PublicKeyEcdsaSecp256k1.md)
 - [PublicKeyEddsaEd25519](docs/PublicKeyEddsaEd25519.md)
 - [PublicKeyHash](docs/PublicKeyHash.md)
 - [PublicKeyHashEcdsaSecp256k1](docs/PublicKeyHashEcdsaSecp256k1.md)
 - [PublicKeyHashEddsaEd25519](docs/PublicKeyHashEddsaEd25519.md)
 - [PublicKeyHashType](docs/PublicKeyHashType.md)
 - [PublicKeyType](docs/PublicKeyType.md)
 - [ResourceAggregationLevel](docs/ResourceAggregationLevel.md)
 - [ResourceHoldersCollection](docs/ResourceHoldersCollection.md)
 - [ResourceHoldersCollectionFungibleResourceItem](docs/ResourceHoldersCollectionFungibleResourceItem.md)
 - [ResourceHoldersCollectionItem](docs/ResourceHoldersCollectionItem.md)
 - [ResourceHoldersCollectionNonFungibleResourceItem](docs/ResourceHoldersCollectionNonFungibleResourceItem.md)
 - [ResourceHoldersRequest](docs/ResourceHoldersRequest.md)
 - [ResourceHoldersResourceType](docs/ResourceHoldersResourceType.md)
 - [ResourceHoldersResponse](docs/ResourceHoldersResponse.md)
 - [ResultSetCursorMixin](docs/ResultSetCursorMixin.md)
 - [RoleAssignmentResolution](docs/RoleAssignmentResolution.md)
 - [RoleKey](docs/RoleKey.md)
 - [RoyaltyAmount](docs/RoyaltyAmount.md)
 - [ScryptoSborValue](docs/ScryptoSborValue.md)
 - [StateAccountAuthorizedDepositorsPageRequest](docs/StateAccountAuthorizedDepositorsPageRequest.md)
 - [StateAccountAuthorizedDepositorsPageResponse](docs/StateAccountAuthorizedDepositorsPageResponse.md)
 - [StateAccountLockerPageVaultsRequest](docs/StateAccountLockerPageVaultsRequest.md)
 - [StateAccountLockerPageVaultsResponse](docs/StateAccountLockerPageVaultsResponse.md)
 - [StateAccountLockersTouchedAtRequest](docs/StateAccountLockersTouchedAtRequest.md)
 - [StateAccountLockersTouchedAtResponse](docs/StateAccountLockersTouchedAtResponse.md)
 - [StateAccountLockersTouchedAtResponseItem](docs/StateAccountLockersTouchedAtResponseItem.md)
 - [StateAccountResourcePreferencesPageRequest](docs/StateAccountResourcePreferencesPageRequest.md)
 - [StateAccountResourcePreferencesPageResponse](docs/StateAccountResourcePreferencesPageResponse.md)
 - [StateEntityDetailsOptIns](docs/StateEntityDetailsOptIns.md)
 - [StateEntityDetailsRequest](docs/StateEntityDetailsRequest.md)
 - [StateEntityDetailsResponse](docs/StateEntityDetailsResponse.md)
 - [StateEntityDetailsResponseComponentDetails](docs/StateEntityDetailsResponseComponentDetails.md)
 - [StateEntityDetailsResponseFungibleResourceDetails](docs/StateEntityDetailsResponseFungibleResourceDetails.md)
 - [StateEntityDetailsResponseFungibleVaultDetails](docs/StateEntityDetailsResponseFungibleVaultDetails.md)
 - [StateEntityDetailsResponseItem](docs/StateEntityDetailsResponseItem.md)
 - [StateEntityDetailsResponseItemAncestorIdentities](docs/StateEntityDetailsResponseItemAncestorIdentities.md)
 - [StateEntityDetailsResponseItemDetails](docs/StateEntityDetailsResponseItemDetails.md)
 - [StateEntityDetailsResponseItemDetailsType](docs/StateEntityDetailsResponseItemDetailsType.md)
 - [StateEntityDetailsResponseNonFungibleResourceDetails](docs/StateEntityDetailsResponseNonFungibleResourceDetails.md)
 - [StateEntityDetailsResponseNonFungibleVaultDetails](docs/StateEntityDetailsResponseNonFungibleVaultDetails.md)
 - [StateEntityDetailsResponsePackageDetails](docs/StateEntityDetailsResponsePackageDetails.md)
 - [StateEntityFungibleResourceVaultsPageRequest](docs/StateEntityFungibleResourceVaultsPageRequest.md)
 - [StateEntityFungibleResourceVaultsPageResponse](docs/StateEntityFungibleResourceVaultsPageResponse.md)
 - [StateEntityFungiblesPageRequest](docs/StateEntityFungiblesPageRequest.md)
 - [StateEntityFungiblesPageRequestOptIns](docs/StateEntityFungiblesPageRequestOptIns.md)
 - [StateEntityFungiblesPageResponse](docs/StateEntityFungiblesPageResponse.md)
 - [StateEntityMetadataPageRequest](docs/StateEntityMetadataPageRequest.md)
 - [StateEntityMetadataPageResponse](docs/StateEntityMetadataPageResponse.md)
 - [StateEntityNonFungibleIdsPageRequest](docs/StateEntityNonFungibleIdsPageRequest.md)
 - [StateEntityNonFungibleIdsPageResponse](docs/StateEntityNonFungibleIdsPageResponse.md)
 - [StateEntityNonFungibleResourceVaultsPageOptIns](docs/StateEntityNonFungibleResourceVaultsPageOptIns.md)
 - [StateEntityNonFungibleResourceVaultsPageRequest](docs/StateEntityNonFungibleResourceVaultsPageRequest.md)
 - [StateEntityNonFungibleResourceVaultsPageResponse](docs/StateEntityNonFungibleResourceVaultsPageResponse.md)
 - [StateEntityNonFungiblesPageRequest](docs/StateEntityNonFungiblesPageRequest.md)
 - [StateEntityNonFungiblesPageRequestOptIns](docs/StateEntityNonFungiblesPageRequestOptIns.md)
 - [StateEntityNonFungiblesPageResponse](docs/StateEntityNonFungiblesPageResponse.md)
 - [StateEntitySchemaPageRequest](docs/StateEntitySchemaPageRequest.md)
 - [StateEntitySchemaPageResponse](docs/StateEntitySchemaPageResponse.md)
 - [StateKeyValueStoreDataRequest](docs/StateKeyValueStoreDataRequest.md)
 - [StateKeyValueStoreDataRequestKeyItem](docs/StateKeyValueStoreDataRequestKeyItem.md)
 - [StateKeyValueStoreDataResponse](docs/StateKeyValueStoreDataResponse.md)
 - [StateKeyValueStoreDataResponseItem](docs/StateKeyValueStoreDataResponseItem.md)
 - [StateKeyValueStoreKeysCollection](docs/StateKeyValueStoreKeysCollection.md)
 - [StateKeyValueStoreKeysRequest](docs/StateKeyValueStoreKeysRequest.md)
 - [StateKeyValueStoreKeysResponse](docs/StateKeyValueStoreKeysResponse.md)
 - [StateKeyValueStoreKeysResponseItem](docs/StateKeyValueStoreKeysResponseItem.md)
 - [StateNonFungibleDataRequest](docs/StateNonFungibleDataRequest.md)
 - [StateNonFungibleDataResponse](docs/StateNonFungibleDataResponse.md)
 - [StateNonFungibleDetailsResponseItem](docs/StateNonFungibleDetailsResponseItem.md)
 - [StateNonFungibleIdsRequest](docs/StateNonFungibleIdsRequest.md)
 - [StateNonFungibleIdsResponse](docs/StateNonFungibleIdsResponse.md)
 - [StateNonFungibleLocationRequest](docs/StateNonFungibleLocationRequest.md)
 - [StateNonFungibleLocationResponse](docs/StateNonFungibleLocationResponse.md)
 - [StateNonFungibleLocationResponseItem](docs/StateNonFungibleLocationResponseItem.md)
 - [StatePackageBlueprintPageRequest](docs/StatePackageBlueprintPageRequest.md)
 - [StatePackageBlueprintPageResponse](docs/StatePackageBlueprintPageResponse.md)
 - [StatePackageCodePageRequest](docs/StatePackageCodePageRequest.md)
 - [StatePackageCodePageResponse](docs/StatePackageCodePageResponse.md)
 - [StateValidatorsListRequest](docs/StateValidatorsListRequest.md)
 - [StateValidatorsListResponse](docs/StateValidatorsListResponse.md)
 - [StreamTransactionsRequest](docs/StreamTransactionsRequest.md)
 - [StreamTransactionsRequestAllOfManifestClassFilter](docs/StreamTransactionsRequestAllOfManifestClassFilter.md)
 - [StreamTransactionsRequestEventFilterItem](docs/StreamTransactionsRequestEventFilterItem.md)
 - [StreamTransactionsResponse](docs/StreamTransactionsResponse.md)
 - [SubintentStatus](docs/SubintentStatus.md)
 - [TransactionAccountDepositPreValidationAuthorizedDepositorBadge](docs/TransactionAccountDepositPreValidationAuthorizedDepositorBadge.md)
 - [TransactionBalanceChanges](docs/TransactionBalanceChanges.md)
 - [TransactionCommittedDetailsRequest](docs/TransactionCommittedDetailsRequest.md)
 - [TransactionCommittedDetailsResponse](docs/TransactionCommittedDetailsResponse.md)
 - [TransactionConstructionResponse](docs/TransactionConstructionResponse.md)
 - [TransactionDetailsOptIns](docs/TransactionDetailsOptIns.md)
 - [TransactionFungibleBalanceChanges](docs/TransactionFungibleBalanceChanges.md)
 - [TransactionFungibleFeeBalanceChangeType](docs/TransactionFungibleFeeBalanceChangeType.md)
 - [TransactionFungibleFeeBalanceChanges](docs/TransactionFungibleFeeBalanceChanges.md)
 - [TransactionIntentStatus](docs/TransactionIntentStatus.md)
 - [TransactionNonFungibleBalanceChanges](docs/TransactionNonFungibleBalanceChanges.md)
 - [TransactionNotFoundError](docs/TransactionNotFoundError.md)
 - [TransactionPayloadGatewayHandlingStatus](docs/TransactionPayloadGatewayHandlingStatus.md)
 - [TransactionPayloadStatus](docs/TransactionPayloadStatus.md)
 - [TransactionPreviewOptIns](docs/TransactionPreviewOptIns.md)
 - [TransactionPreviewRequest](docs/TransactionPreviewRequest.md)
 - [TransactionPreviewResponse](docs/TransactionPreviewResponse.md)
 - [TransactionPreviewResponseLogsInner](docs/TransactionPreviewResponseLogsInner.md)
 - [TransactionPreviewV2OptIns](docs/TransactionPreviewV2OptIns.md)
 - [TransactionPreviewV2Request](docs/TransactionPreviewV2Request.md)
 - [TransactionPreviewV2Response](docs/TransactionPreviewV2Response.md)
 - [TransactionReceipt](docs/TransactionReceipt.md)
 - [TransactionStatus](docs/TransactionStatus.md)
 - [TransactionStatusRequest](docs/TransactionStatusRequest.md)
 - [TransactionStatusResponse](docs/TransactionStatusResponse.md)
 - [TransactionStatusResponseKnownPayloadItem](docs/TransactionStatusResponseKnownPayloadItem.md)
 - [TransactionSubintentDetails](docs/TransactionSubintentDetails.md)
 - [TransactionSubintentStatusRequest](docs/TransactionSubintentStatusRequest.md)
 - [TransactionSubintentStatusResponse](docs/TransactionSubintentStatusResponse.md)
 - [TransactionSubmitRequest](docs/TransactionSubmitRequest.md)
 - [TransactionSubmitResponse](docs/TransactionSubmitResponse.md)
 - [TwoWayLinkedDappOnLedgerDetails](docs/TwoWayLinkedDappOnLedgerDetails.md)
 - [TwoWayLinkedDappsCollection](docs/TwoWayLinkedDappsCollection.md)
 - [TwoWayLinkedDappsCollectionItem](docs/TwoWayLinkedDappsCollectionItem.md)
 - [TwoWayLinkedEntitiesCollection](docs/TwoWayLinkedEntitiesCollection.md)
 - [TwoWayLinkedEntitiesCollectionItem](docs/TwoWayLinkedEntitiesCollectionItem.md)
 - [ValidationErrorsAtPath](docs/ValidationErrorsAtPath.md)
 - [ValidatorCollection](docs/ValidatorCollection.md)
 - [ValidatorCollectionItem](docs/ValidatorCollectionItem.md)
 - [ValidatorCollectionItemActiveInEpoch](docs/ValidatorCollectionItemActiveInEpoch.md)
 - [ValidatorCollectionItemEffectiveFeeFactor](docs/ValidatorCollectionItemEffectiveFeeFactor.md)
 - [ValidatorCollectionItemEffectiveFeeFactorCurrent](docs/ValidatorCollectionItemEffectiveFeeFactorCurrent.md)
 - [ValidatorCollectionItemEffectiveFeeFactorPending](docs/ValidatorCollectionItemEffectiveFeeFactorPending.md)
 - [ValidatorUptimeCollection](docs/ValidatorUptimeCollection.md)
 - [ValidatorUptimeCollectionItem](docs/ValidatorUptimeCollectionItem.md)
 - [ValidatorVaultItem](docs/ValidatorVaultItem.md)
 - [ValidatorsUptimeRequest](docs/ValidatorsUptimeRequest.md)
 - [ValidatorsUptimeResponse](docs/ValidatorsUptimeResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




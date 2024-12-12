/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.9.2-L
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.gateway.client;

import live.radix.gateway.ApiException;
import live.radix.gateway.model.ErrorResponse;
import live.radix.gateway.model.StateAccountAuthorizedDepositorsPageRequest;
import live.radix.gateway.model.StateAccountAuthorizedDepositorsPageResponse;
import live.radix.gateway.model.StateAccountLockerPageVaultsRequest;
import live.radix.gateway.model.StateAccountLockerPageVaultsResponse;
import live.radix.gateway.model.StateAccountLockersTouchedAtRequest;
import live.radix.gateway.model.StateAccountLockersTouchedAtResponse;
import live.radix.gateway.model.StateAccountResourcePreferencesPageRequest;
import live.radix.gateway.model.StateAccountResourcePreferencesPageResponse;
import live.radix.gateway.model.StateEntityDetailsRequest;
import live.radix.gateway.model.StateEntityDetailsResponse;
import live.radix.gateway.model.StateEntityFungibleResourceVaultsPageRequest;
import live.radix.gateway.model.StateEntityFungibleResourceVaultsPageResponse;
import live.radix.gateway.model.StateEntityFungiblesPageRequest;
import live.radix.gateway.model.StateEntityFungiblesPageResponse;
import live.radix.gateway.model.StateEntityMetadataPageRequest;
import live.radix.gateway.model.StateEntityMetadataPageResponse;
import live.radix.gateway.model.StateEntityNonFungibleIdsPageRequest;
import live.radix.gateway.model.StateEntityNonFungibleIdsPageResponse;
import live.radix.gateway.model.StateEntityNonFungibleResourceVaultsPageRequest;
import live.radix.gateway.model.StateEntityNonFungibleResourceVaultsPageResponse;
import live.radix.gateway.model.StateEntityNonFungiblesPageRequest;
import live.radix.gateway.model.StateEntityNonFungiblesPageResponse;
import live.radix.gateway.model.StateEntitySchemaPageRequest;
import live.radix.gateway.model.StateEntitySchemaPageResponse;
import live.radix.gateway.model.StateKeyValueStoreDataRequest;
import live.radix.gateway.model.StateKeyValueStoreDataResponse;
import live.radix.gateway.model.StateKeyValueStoreKeysRequest;
import live.radix.gateway.model.StateKeyValueStoreKeysResponse;
import live.radix.gateway.model.StateNonFungibleDataRequest;
import live.radix.gateway.model.StateNonFungibleDataResponse;
import live.radix.gateway.model.StateNonFungibleIdsRequest;
import live.radix.gateway.model.StateNonFungibleIdsResponse;
import live.radix.gateway.model.StateNonFungibleLocationRequest;
import live.radix.gateway.model.StateNonFungibleLocationResponse;
import live.radix.gateway.model.StatePackageBlueprintPageRequest;
import live.radix.gateway.model.StatePackageBlueprintPageResponse;
import live.radix.gateway.model.StatePackageCodePageRequest;
import live.radix.gateway.model.StatePackageCodePageResponse;
import live.radix.gateway.model.StateValidatorsListRequest;
import live.radix.gateway.model.StateValidatorsListResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StateApi
 */
@Disabled
public class StateApiTest {

    private final StateApi api = new StateApi();

    /**
     * Get Account authorized depositors
     *
     * Returns paginable collection of authorized depositors for given account. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountAuthorizedDepositorsPageTest() throws ApiException {
        StateAccountAuthorizedDepositorsPageRequest stateAccountAuthorizedDepositorsPageRequest = null;
        StateAccountAuthorizedDepositorsPageResponse response = api.accountAuthorizedDepositorsPage(stateAccountAuthorizedDepositorsPageRequest);

        // TODO: test validations
    }
    /**
     * Get Account Locker Vaults Page
     *
     * Returns all the resource vaults associated with a given account locker. The returned response is in a paginated format, ordered by the most recent resource vault creation on the ledger. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountLockerVaultsPageTest() throws ApiException {
        StateAccountLockerPageVaultsRequest stateAccountLockerPageVaultsRequest = null;
        StateAccountLockerPageVaultsResponse response = api.accountLockerVaultsPage(stateAccountLockerPageVaultsRequest);

        // TODO: test validations
    }
    /**
     * Get Most Recent Touch of Account Lockers
     *
     * Returns most recent state version given account locker has been touched. Touch refers to the creation of the account locker itself as well as any modification to its contents, such as resource claim, airdrop or store. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountLockersTouchedAtTest() throws ApiException {
        StateAccountLockersTouchedAtRequest stateAccountLockersTouchedAtRequest = null;
        StateAccountLockersTouchedAtResponse response = api.accountLockersTouchedAt(stateAccountLockersTouchedAtRequest);

        // TODO: test validations
    }
    /**
     * Get Account resource preferences
     *
     * Returns paginable collection of resource preference rules for given account. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountResourcePreferencesPageTest() throws ApiException {
        StateAccountResourcePreferencesPageRequest stateAccountResourcePreferencesPageRequest = null;
        StateAccountResourcePreferencesPageResponse response = api.accountResourcePreferencesPage(stateAccountResourcePreferencesPageRequest);

        // TODO: test validations
    }
    /**
     * Get page of Global Entity Fungible Resource Vaults
     *
     * Returns vaults for fungible resource owned by a given global entity. The returned response is in a paginated format, ordered by the resource&#39;s first appearance on the ledger. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityFungibleResourceVaultPageTest() throws ApiException {
        StateEntityFungibleResourceVaultsPageRequest stateEntityFungibleResourceVaultsPageRequest = null;
        StateEntityFungibleResourceVaultsPageResponse response = api.entityFungibleResourceVaultPage(stateEntityFungibleResourceVaultsPageRequest);

        // TODO: test validations
    }
    /**
     * Get page of Global Entity Fungible Resource Balances
     *
     * Returns the total amount of each fungible resource owned by a given global entity. Result can be aggregated globally or per vault. The returned response is in a paginated format, ordered by the resource&#39;s first appearance on the ledger. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityFungiblesPageTest() throws ApiException {
        StateEntityFungiblesPageRequest stateEntityFungiblesPageRequest = null;
        StateEntityFungiblesPageResponse response = api.entityFungiblesPage(stateEntityFungiblesPageRequest);

        // TODO: test validations
    }
    /**
     * Get Entity Metadata Page
     *
     * Returns all the metadata properties associated with a given global entity. The returned response is in a paginated format, ordered by first appearance on the ledger. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityMetadataPageTest() throws ApiException {
        StateEntityMetadataPageRequest stateEntityMetadataPageRequest = null;
        StateEntityMetadataPageResponse response = api.entityMetadataPage(stateEntityMetadataPageRequest);

        // TODO: test validations
    }
    /**
     * Get page of Non-Fungibles in Vault
     *
     * Returns all non-fungible IDs of a given non-fungible resource owned by a given entity. The returned response is in a paginated format, ordered by the resource&#39;s first appearence on the ledger. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityNonFungibleIdsPageTest() throws ApiException {
        StateEntityNonFungibleIdsPageRequest stateEntityNonFungibleIdsPageRequest = null;
        StateEntityNonFungibleIdsPageResponse response = api.entityNonFungibleIdsPage(stateEntityNonFungibleIdsPageRequest);

        // TODO: test validations
    }
    /**
     * Get page of Global Entity Non-Fungible Resource Vaults
     *
     * Returns vaults for non fungible resource owned by a given global entity. The returned response is in a paginated format, ordered by the resource&#39;s first appearance on the ledger. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityNonFungibleResourceVaultPageTest() throws ApiException {
        StateEntityNonFungibleResourceVaultsPageRequest stateEntityNonFungibleResourceVaultsPageRequest = null;
        StateEntityNonFungibleResourceVaultsPageResponse response = api.entityNonFungibleResourceVaultPage(stateEntityNonFungibleResourceVaultsPageRequest);

        // TODO: test validations
    }
    /**
     * Get page of Global Entity Non-Fungible Resource Balances
     *
     * Returns the total amount of each non-fungible resource owned by a given global entity. Result can be aggregated globally or per vault. The returned response is in a paginated format, ordered by the resource&#39;s first appearance on the ledger. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entityNonFungiblesPageTest() throws ApiException {
        StateEntityNonFungiblesPageRequest stateEntityNonFungiblesPageRequest = null;
        StateEntityNonFungiblesPageResponse response = api.entityNonFungiblesPage(stateEntityNonFungiblesPageRequest);

        // TODO: test validations
    }
    /**
     * Get Entity Schema Page
     *
     * Returns all the schemas associated with a given global entity. The returned response is in a paginated format, ordered by first appearance on the ledger. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entitySchemaPageTest() throws ApiException {
        StateEntitySchemaPageRequest stateEntitySchemaPageRequest = null;
        StateEntitySchemaPageResponse response = api.entitySchemaPage(stateEntitySchemaPageRequest);

        // TODO: test validations
    }
    /**
     * Get KeyValueStore Data
     *
     * Returns data (value) associated with a given key of a given key-value store. [Check detailed documentation for explanation](#section/How-to-query-the-content-of-a-key-value-store-inside-a-component) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyValueStoreDataTest() throws ApiException {
        StateKeyValueStoreDataRequest stateKeyValueStoreDataRequest = null;
        StateKeyValueStoreDataResponse response = api.keyValueStoreData(stateKeyValueStoreDataRequest);

        // TODO: test validations
    }
    /**
     * Get KeyValueStore Keys
     *
     * Allows to iterate over key value store keys.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyValueStoreKeysTest() throws ApiException {
        StateKeyValueStoreKeysRequest stateKeyValueStoreKeysRequest = null;
        StateKeyValueStoreKeysResponse response = api.keyValueStoreKeys(stateKeyValueStoreKeysRequest);

        // TODO: test validations
    }
    /**
     * Get Non-Fungible Data
     *
     * Returns data associated with a given non-fungible ID of a given non-fungible resource. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nonFungibleDataTest() throws ApiException {
        StateNonFungibleDataRequest stateNonFungibleDataRequest = null;
        StateNonFungibleDataResponse response = api.nonFungibleData(stateNonFungibleDataRequest);

        // TODO: test validations
    }
    /**
     * Get page of Non-Fungible Ids in Resource Collection
     *
     * Returns the non-fungible IDs of a given non-fungible resource. Returned response is in a paginated format, ordered by their first appearance on the ledger. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nonFungibleIdsTest() throws ApiException {
        StateNonFungibleIdsRequest stateNonFungibleIdsRequest = null;
        StateNonFungibleIdsResponse response = api.nonFungibleIds(stateNonFungibleIdsRequest);

        // TODO: test validations
    }
    /**
     * Get Non-Fungible Location
     *
     * Returns location of a given non-fungible ID. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nonFungibleLocationTest() throws ApiException {
        StateNonFungibleLocationRequest stateNonFungibleLocationRequest = null;
        StateNonFungibleLocationResponse response = api.nonFungibleLocation(stateNonFungibleLocationRequest);

        // TODO: test validations
    }
    /**
     * Get Package Blueprints Page
     *
     * Returns all the blueprints associated with a given package entity. The returned response is in a paginated format, ordered by first appearance on the ledger. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void packageBlueprintPageTest() throws ApiException {
        StatePackageBlueprintPageRequest statePackageBlueprintPageRequest = null;
        StatePackageBlueprintPageResponse response = api.packageBlueprintPage(statePackageBlueprintPageRequest);

        // TODO: test validations
    }
    /**
     * Get Package Codes Page
     *
     * Returns all the codes associated with a given package entity. The returned response is in a paginated format, ordered by first appearance on the ledger. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void packageCodePageTest() throws ApiException {
        StatePackageCodePageRequest statePackageCodePageRequest = null;
        StatePackageCodePageResponse response = api.packageCodePage(statePackageCodePageRequest);

        // TODO: test validations
    }
    /**
     * Get Entity Details
     *
     * Returns detailed information for collection of entities. Aggregate resources globally by default. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stateEntityDetailsTest() throws ApiException {
        StateEntityDetailsRequest stateEntityDetailsRequest = null;
        StateEntityDetailsResponse response = api.stateEntityDetails(stateEntityDetailsRequest);

        // TODO: test validations
    }
    /**
     * Get Validators List
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stateValidatorsListTest() throws ApiException {
        StateValidatorsListRequest stateValidatorsListRequest = null;
        StateValidatorsListResponse response = api.stateValidatorsList(stateValidatorsListRequest);

        // TODO: test validations
    }
}

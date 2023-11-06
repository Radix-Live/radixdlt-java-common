/*
 * Radix Core API - Babylon
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  The default configuration is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function. The node exposes a configuration flag which allows disabling certain endpoints which may be problematic, but monitoring is advised. This configuration parameter is `api.core.flags.enable_unbounded_endpoints` / `RADIXDLT_CORE_API_FLAGS_ENABLE_UNBOUNDED_ENDPOINTS`.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` have high guarantees of forward compatibility in future node versions. We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code.  Other endpoints may be changed with new node versions carrying protocol-updates, although any breaking changes will be flagged clearly in the corresponding release notes.  All responses may have additional fields added, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects. 
 *
 * The version of the OpenAPI document: v1.0.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.core.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for NetworkConfigurationResponseWellKnownAddresses
 */
public class NetworkConfigurationResponseWellKnownAddressesTest {
    private final NetworkConfigurationResponseWellKnownAddresses model = new NetworkConfigurationResponseWellKnownAddresses();

    /**
     * Model tests for NetworkConfigurationResponseWellKnownAddresses
     */
    @Test
    public void testNetworkConfigurationResponseWellKnownAddresses() {
        // TODO: test NetworkConfigurationResponseWellKnownAddresses
    }

    /**
     * Test the property 'xrd'
     */
    @Test
    public void xrdTest() {
        // TODO: test xrd
    }

    /**
     * Test the property 'secp256k1SignatureVirtualBadge'
     */
    @Test
    public void secp256k1SignatureVirtualBadgeTest() {
        // TODO: test secp256k1SignatureVirtualBadge
    }

    /**
     * Test the property 'ed25519SignatureVirtualBadge'
     */
    @Test
    public void ed25519SignatureVirtualBadgeTest() {
        // TODO: test ed25519SignatureVirtualBadge
    }

    /**
     * Test the property 'packageOfDirectCallerVirtualBadge'
     */
    @Test
    public void packageOfDirectCallerVirtualBadgeTest() {
        // TODO: test packageOfDirectCallerVirtualBadge
    }

    /**
     * Test the property 'globalCallerVirtualBadge'
     */
    @Test
    public void globalCallerVirtualBadgeTest() {
        // TODO: test globalCallerVirtualBadge
    }

    /**
     * Test the property 'systemTransactionBadge'
     */
    @Test
    public void systemTransactionBadgeTest() {
        // TODO: test systemTransactionBadge
    }

    /**
     * Test the property 'packageOwnerBadge'
     */
    @Test
    public void packageOwnerBadgeTest() {
        // TODO: test packageOwnerBadge
    }

    /**
     * Test the property 'validatorOwnerBadge'
     */
    @Test
    public void validatorOwnerBadgeTest() {
        // TODO: test validatorOwnerBadge
    }

    /**
     * Test the property 'accountOwnerBadge'
     */
    @Test
    public void accountOwnerBadgeTest() {
        // TODO: test accountOwnerBadge
    }

    /**
     * Test the property 'identityOwnerBadge'
     */
    @Test
    public void identityOwnerBadgeTest() {
        // TODO: test identityOwnerBadge
    }

    /**
     * Test the property 'packagePackage'
     */
    @Test
    public void packagePackageTest() {
        // TODO: test packagePackage
    }

    /**
     * Test the property 'resourcePackage'
     */
    @Test
    public void resourcePackageTest() {
        // TODO: test resourcePackage
    }

    /**
     * Test the property 'accountPackage'
     */
    @Test
    public void accountPackageTest() {
        // TODO: test accountPackage
    }

    /**
     * Test the property 'identityPackage'
     */
    @Test
    public void identityPackageTest() {
        // TODO: test identityPackage
    }

    /**
     * Test the property 'consensusManagerPackage'
     */
    @Test
    public void consensusManagerPackageTest() {
        // TODO: test consensusManagerPackage
    }

    /**
     * Test the property 'accessControllerPackage'
     */
    @Test
    public void accessControllerPackageTest() {
        // TODO: test accessControllerPackage
    }

    /**
     * Test the property 'transactionProcessorPackage'
     */
    @Test
    public void transactionProcessorPackageTest() {
        // TODO: test transactionProcessorPackage
    }

    /**
     * Test the property 'metadataModulePackage'
     */
    @Test
    public void metadataModulePackageTest() {
        // TODO: test metadataModulePackage
    }

    /**
     * Test the property 'royaltyModulePackage'
     */
    @Test
    public void royaltyModulePackageTest() {
        // TODO: test royaltyModulePackage
    }

    /**
     * Test the property 'roleAssignmentModulePackage'
     */
    @Test
    public void roleAssignmentModulePackageTest() {
        // TODO: test roleAssignmentModulePackage
    }

    /**
     * Test the property 'genesisHelperPackage'
     */
    @Test
    public void genesisHelperPackageTest() {
        // TODO: test genesisHelperPackage
    }

    /**
     * Test the property 'faucetPackage'
     */
    @Test
    public void faucetPackageTest() {
        // TODO: test faucetPackage
    }

    /**
     * Test the property 'poolPackage'
     */
    @Test
    public void poolPackageTest() {
        // TODO: test poolPackage
    }

    /**
     * Test the property 'consensusManager'
     */
    @Test
    public void consensusManagerTest() {
        // TODO: test consensusManager
    }

    /**
     * Test the property 'genesisHelper'
     */
    @Test
    public void genesisHelperTest() {
        // TODO: test genesisHelper
    }

    /**
     * Test the property 'faucet'
     */
    @Test
    public void faucetTest() {
        // TODO: test faucet
    }

}
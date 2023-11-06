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
import java.util.ArrayList;
import java.util.List;
import live.radix.core.model.EcdsaSecp256k1PublicKey;
import live.radix.core.model.EntityReference;
import live.radix.core.model.PendingOwnerStakeWithdrawal;
import live.radix.core.model.SubstateKey;
import live.radix.core.model.ValidatorFeeChangeRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ValidatorFieldStateValue
 */
public class ValidatorFieldStateValueTest {
    private final ValidatorFieldStateValue model = new ValidatorFieldStateValue();

    /**
     * Model tests for ValidatorFieldStateValue
     */
    @Test
    public void testValidatorFieldStateValue() {
        // TODO: test ValidatorFieldStateValue
    }

    /**
     * Test the property 'sortedKey'
     */
    @Test
    public void sortedKeyTest() {
        // TODO: test sortedKey
    }

    /**
     * Test the property 'publicKey'
     */
    @Test
    public void publicKeyTest() {
        // TODO: test publicKey
    }

    /**
     * Test the property 'isRegistered'
     */
    @Test
    public void isRegisteredTest() {
        // TODO: test isRegistered
    }

    /**
     * Test the property 'acceptsDelegatedStake'
     */
    @Test
    public void acceptsDelegatedStakeTest() {
        // TODO: test acceptsDelegatedStake
    }

    /**
     * Test the property 'validatorFeeFactor'
     */
    @Test
    public void validatorFeeFactorTest() {
        // TODO: test validatorFeeFactor
    }

    /**
     * Test the property 'validatorFeeChangeRequest'
     */
    @Test
    public void validatorFeeChangeRequestTest() {
        // TODO: test validatorFeeChangeRequest
    }

    /**
     * Test the property 'stakeUnitResourceAddress'
     */
    @Test
    public void stakeUnitResourceAddressTest() {
        // TODO: test stakeUnitResourceAddress
    }

    /**
     * Test the property 'stakeXrdVault'
     */
    @Test
    public void stakeXrdVaultTest() {
        // TODO: test stakeXrdVault
    }

    /**
     * Test the property 'claimTokenResourceAddress'
     */
    @Test
    public void claimTokenResourceAddressTest() {
        // TODO: test claimTokenResourceAddress
    }

    /**
     * Test the property 'pendingXrdWithdrawVault'
     */
    @Test
    public void pendingXrdWithdrawVaultTest() {
        // TODO: test pendingXrdWithdrawVault
    }

    /**
     * Test the property 'lockedOwnerStakeUnitVault'
     */
    @Test
    public void lockedOwnerStakeUnitVaultTest() {
        // TODO: test lockedOwnerStakeUnitVault
    }

    /**
     * Test the property 'pendingOwnerStakeUnitUnlockVault'
     */
    @Test
    public void pendingOwnerStakeUnitUnlockVaultTest() {
        // TODO: test pendingOwnerStakeUnitUnlockVault
    }

    /**
     * Test the property 'pendingOwnerStakeUnitWithdrawals'
     */
    @Test
    public void pendingOwnerStakeUnitWithdrawalsTest() {
        // TODO: test pendingOwnerStakeUnitWithdrawals
    }

    /**
     * Test the property 'alreadyUnlockedOwnerStakeUnitAmount'
     */
    @Test
    public void alreadyUnlockedOwnerStakeUnitAmountTest() {
        // TODO: test alreadyUnlockedOwnerStakeUnitAmount
    }

}

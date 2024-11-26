/*
 * Radix Core API
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  The default configuration is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function. The node exposes a configuration flag which allows disabling certain endpoints which may be problematic, but monitoring is advised. This configuration parameter is `api.core.flags.enable_unbounded_endpoints` / `RADIXDLT_CORE_API_FLAGS_ENABLE_UNBOUNDED_ENDPOINTS`.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` have high guarantees of forward compatibility in future node versions. We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code.  Other endpoints may be changed with new node versions carrying protocol-updates, although any breaking changes will be flagged clearly in the corresponding release notes.  All responses may have additional fields added, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects. 
 *
 * The version of the OpenAPI document: v1.3.0
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
import live.radix.core.model.ManifestValidationRuleset;
import live.radix.core.model.MessageValidationConfig;
import live.radix.core.model.PreparationSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for TransactionValidationConfig
 */
class TransactionValidationConfigTest {
    private final TransactionValidationConfig model = new TransactionValidationConfig();

    /**
     * Model tests for TransactionValidationConfig
     */
    @Test
    void testTransactionValidationConfig() {
        // TODO: test TransactionValidationConfig
    }

    /**
     * Test the property 'maxSignerSignaturesPerIntent'
     */
    @Test
    void maxSignerSignaturesPerIntentTest() {
        // TODO: test maxSignerSignaturesPerIntent
    }

    /**
     * Test the property 'maxReferencesPerIntent'
     */
    @Test
    void maxReferencesPerIntentTest() {
        // TODO: test maxReferencesPerIntent
    }

    /**
     * Test the property 'minTipPercentage'
     */
    @Test
    void minTipPercentageTest() {
        // TODO: test minTipPercentage
    }

    /**
     * Test the property 'maxTipPercentage'
     */
    @Test
    void maxTipPercentageTest() {
        // TODO: test maxTipPercentage
    }

    /**
     * Test the property 'maxEpochRange'
     */
    @Test
    void maxEpochRangeTest() {
        // TODO: test maxEpochRange
    }

    /**
     * Test the property 'maxInstructions'
     */
    @Test
    void maxInstructionsTest() {
        // TODO: test maxInstructions
    }

    /**
     * Test the property 'messageValidation'
     */
    @Test
    void messageValidationTest() {
        // TODO: test messageValidation
    }

    /**
     * Test the property 'v1TransactionsAllowNotaryToDuplicateSigner'
     */
    @Test
    void v1TransactionsAllowNotaryToDuplicateSignerTest() {
        // TODO: test v1TransactionsAllowNotaryToDuplicateSigner
    }

    /**
     * Test the property 'preparationSettings'
     */
    @Test
    void preparationSettingsTest() {
        // TODO: test preparationSettings
    }

    /**
     * Test the property 'manifestValidation'
     */
    @Test
    void manifestValidationTest() {
        // TODO: test manifestValidation
    }

    /**
     * Test the property 'v2TransactionsAllowed'
     */
    @Test
    void v2TransactionsAllowedTest() {
        // TODO: test v2TransactionsAllowed
    }

    /**
     * Test the property 'minTipBasisPoints'
     */
    @Test
    void minTipBasisPointsTest() {
        // TODO: test minTipBasisPoints
    }

    /**
     * Test the property 'maxTipBasisPoints'
     */
    @Test
    void maxTipBasisPointsTest() {
        // TODO: test maxTipBasisPoints
    }

    /**
     * Test the property 'maxSubintentDepth'
     */
    @Test
    void maxSubintentDepthTest() {
        // TODO: test maxSubintentDepth
    }

    /**
     * Test the property 'maxTotalSignatureValidations'
     */
    @Test
    void maxTotalSignatureValidationsTest() {
        // TODO: test maxTotalSignatureValidations
    }

    /**
     * Test the property 'maxTotalReferences'
     */
    @Test
    void maxTotalReferencesTest() {
        // TODO: test maxTotalReferences
    }

}
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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for TransactionFormatOptions
 */
class TransactionFormatOptionsTest {
    private final TransactionFormatOptions model = new TransactionFormatOptions();

    /**
     * Model tests for TransactionFormatOptions
     */
    @Test
    void testTransactionFormatOptions() {
        // TODO: test TransactionFormatOptions
    }

    /**
     * Test the property 'manifest'
     */
    @Test
    void manifestTest() {
        // TODO: test manifest
    }

    /**
     * Test the property 'blobs'
     */
    @Test
    void blobsTest() {
        // TODO: test blobs
    }

    /**
     * Test the property 'message'
     */
    @Test
    void messageTest() {
        // TODO: test message
    }

    /**
     * Test the property 'balanceChanges'
     */
    @Test
    void balanceChangesTest() {
        // TODO: test balanceChanges
    }

    /**
     * Test the property 'rawSystemTransaction'
     */
    @Test
    void rawSystemTransactionTest() {
        // TODO: test rawSystemTransaction
    }

    /**
     * Test the property 'rawNotarizedTransaction'
     */
    @Test
    void rawNotarizedTransactionTest() {
        // TODO: test rawNotarizedTransaction
    }

    /**
     * Test the property 'rawLedgerTransaction'
     */
    @Test
    void rawLedgerTransactionTest() {
        // TODO: test rawLedgerTransaction
    }

}

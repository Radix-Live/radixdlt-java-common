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
import live.radix.core.model.CostingParameters;
import live.radix.core.model.Event;
import live.radix.core.model.FeeDestination;
import live.radix.core.model.FeeSource;
import live.radix.core.model.FeeSummary;
import live.radix.core.model.NextEpoch;
import live.radix.core.model.SborData;
import live.radix.core.model.StateUpdates;
import live.radix.core.model.TransactionStatus;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for TransactionReceipt
 */
public class TransactionReceiptTest {
    private final TransactionReceipt model = new TransactionReceipt();

    /**
     * Model tests for TransactionReceipt
     */
    @Test
    public void testTransactionReceipt() {
        // TODO: test TransactionReceipt
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'feeSummary'
     */
    @Test
    public void feeSummaryTest() {
        // TODO: test feeSummary
    }

    /**
     * Test the property 'costingParameters'
     */
    @Test
    public void costingParametersTest() {
        // TODO: test costingParameters
    }

    /**
     * Test the property 'feeSource'
     */
    @Test
    public void feeSourceTest() {
        // TODO: test feeSource
    }

    /**
     * Test the property 'feeDestination'
     */
    @Test
    public void feeDestinationTest() {
        // TODO: test feeDestination
    }

    /**
     * Test the property 'stateUpdates'
     */
    @Test
    public void stateUpdatesTest() {
        // TODO: test stateUpdates
    }

    /**
     * Test the property 'events'
     */
    @Test
    public void eventsTest() {
        // TODO: test events
    }

    /**
     * Test the property 'nextEpoch'
     */
    @Test
    public void nextEpochTest() {
        // TODO: test nextEpoch
    }

    /**
     * Test the property 'output'
     */
    @Test
    public void outputTest() {
        // TODO: test output
    }

    /**
     * Test the property 'errorMessage'
     */
    @Test
    public void errorMessageTest() {
        // TODO: test errorMessage
    }

}

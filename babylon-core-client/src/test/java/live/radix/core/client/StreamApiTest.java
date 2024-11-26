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


package live.radix.core.client;

import live.radix.core.ApiException;
import live.radix.core.model.StreamProofsErrorResponse;
import live.radix.core.model.StreamProofsRequest;
import live.radix.core.model.StreamProofsResponse;
import live.radix.core.model.StreamTransactionsErrorResponse;
import live.radix.core.model.StreamTransactionsRequest;
import live.radix.core.model.StreamTransactionsResponse;
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
 * API tests for StreamApi
 */
@Disabled
public class StreamApiTest {

    private final StreamApi api = new StreamApi();

    /**
     * Stream Proofs
     *
     * Returns a stream of proofs committed to the node&#39;s ledger.  NOTE: This endpoint may return different results on different nodes: * Each node may persist different subset of signatures on a given proofs, as long as enough of the validator set has signed. * Inside an epoch, different nodes may receive and persist / keep different proofs, subject to constraints on gaps between proofs.  Proofs during an epoch can also be garbage collected by the node after the fact. Therefore proofs may disappear from this stream.  Some proofs (such as during genesis and protocol update enactment) are created on a node and don&#39;t include signatures.  This stream accepts four different options in the request: * All proofs forward (from state version) * All end-of-epoch proofs (from epoch number) * All end-of-epoch proofs triggering a protocol update * All node-injected proofs enacting genesis or a protocol update (for protocol update name, from state version)  The end-of-epoch proofs can be used to \&quot;trustlessly\&quot; verify the validator set for a given epoch. By tracking the fact that validators for epoch N sign the next validator set for epoch N + 1, this chain of proofs can be used to provide proof of the current validator set from a hardcoded start.  When a validator set is known for a given epoch, this can be used to verify the various transaction hash trees in the epoch, and to prove other data.  NOTE: This endpoint was built after agreeing the new Radix convention for paged APIs. Its models therefore follow the new convention, rather than attempting to align with existing loose Core API conventions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void streamProofsPostTest() throws ApiException {
        StreamProofsRequest streamProofsRequest = null;
        StreamProofsResponse response = api.streamProofsPost(streamProofsRequest);

        // TODO: test validations
    }
    /**
     * Get Committed Transactions
     *
     * Returns the list of committed transactions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void streamTransactionsPostTest() throws ApiException {
        StreamTransactionsRequest streamTransactionsRequest = null;
        StreamTransactionsResponse response = api.streamTransactionsPost(streamTransactionsRequest);

        // TODO: test validations
    }
}

/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.gateway.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import live.radix.gateway.model.TransactionPayloadGatewayHandlingStatus;
import live.radix.gateway.model.TransactionPayloadStatus;
import live.radix.gateway.model.TransactionStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for TransactionStatusResponseKnownPayloadItem
 */
public class TransactionStatusResponseKnownPayloadItemTest {
    private final TransactionStatusResponseKnownPayloadItem model = new TransactionStatusResponseKnownPayloadItem();

    /**
     * Model tests for TransactionStatusResponseKnownPayloadItem
     */
    @Test
    public void testTransactionStatusResponseKnownPayloadItem() {
        // TODO: test TransactionStatusResponseKnownPayloadItem
    }

    /**
     * Test the property 'payloadHash'
     */
    @Test
    public void payloadHashTest() {
        // TODO: test payloadHash
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'payloadStatus'
     */
    @Test
    public void payloadStatusTest() {
        // TODO: test payloadStatus
    }

    /**
     * Test the property 'payloadStatusDescription'
     */
    @Test
    public void payloadStatusDescriptionTest() {
        // TODO: test payloadStatusDescription
    }

    /**
     * Test the property 'errorMessage'
     */
    @Test
    public void errorMessageTest() {
        // TODO: test errorMessage
    }

    /**
     * Test the property 'latestErrorMessage'
     */
    @Test
    public void latestErrorMessageTest() {
        // TODO: test latestErrorMessage
    }

    /**
     * Test the property 'handlingStatus'
     */
    @Test
    public void handlingStatusTest() {
        // TODO: test handlingStatus
    }

    /**
     * Test the property 'handlingStatusReason'
     */
    @Test
    public void handlingStatusReasonTest() {
        // TODO: test handlingStatusReason
    }

    /**
     * Test the property 'submissionError'
     */
    @Test
    public void submissionErrorTest() {
        // TODO: test submissionError
    }

}

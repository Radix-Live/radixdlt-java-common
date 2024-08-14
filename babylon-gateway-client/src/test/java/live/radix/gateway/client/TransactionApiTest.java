/*
 * Radix Gateway API - Babylon
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers, and for light queries from front-end dApps. For exchange/asset integrations, back-end dApp integrations, or simple use cases, you should consider using the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  All responses may have additional fields added at any release, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects.  When the Radix protocol is updated, new functionality may be added, and so discriminated unions returned by the API may need to be updated to have new variants added, corresponding to the updated data. Clients may need to update in advance to be able to handle these new variants when a protocol update comes out.  On the very rare occasions we need to make breaking changes to the API, these will be warned in advance with deprecation notices on previous versions. These deprecation notices will include a safe migration path. Deprecation notes or breaking changes will be flagged clearly in release notes for new versions of the Gateway.  The Gateway DB schema is not subject to any compatibility guarantees, and may be changed at any release. DB changes will be flagged in the release notes so clients doing custom DB integrations can prepare. 
 *
 * The version of the OpenAPI document: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package live.radix.gateway.client;

import live.radix.gateway.ApiException;
import live.radix.gateway.model.AccountDepositPreValidationRequest;
import live.radix.gateway.model.AccountDepositPreValidationResponse;
import live.radix.gateway.model.ErrorResponse;
import live.radix.gateway.model.TransactionCommittedDetailsRequest;
import live.radix.gateway.model.TransactionCommittedDetailsResponse;
import live.radix.gateway.model.TransactionConstructionResponse;
import live.radix.gateway.model.TransactionPreviewRequest;
import live.radix.gateway.model.TransactionPreviewResponse;
import live.radix.gateway.model.TransactionStatusRequest;
import live.radix.gateway.model.TransactionStatusResponse;
import live.radix.gateway.model.TransactionSubmitRequest;
import live.radix.gateway.model.TransactionSubmitResponse;
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
 * API tests for TransactionApi
 */
@Disabled
public class TransactionApiTest {

    private final TransactionApi api = new TransactionApi();

    /**
     * PreValidate deposit of resources to an account
     *
     * Helper endpoint that allows pre-validation if a deposit of certain resources to a given account can succeed or not. It is only meant for pre-validation usage, it does not guarantee that execution will succeed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountDepositPreValidationTest() throws ApiException {
        AccountDepositPreValidationRequest accountDepositPreValidationRequest = null;
        AccountDepositPreValidationResponse response = api.accountDepositPreValidation(accountDepositPreValidationRequest);

        // TODO: test validations
    }
    /**
     * Get Committed Transaction Details
     *
     * Returns the committed details and receipt of the transaction for a given transaction identifier. Transaction identifiers which don&#39;t correspond to a committed transaction will return a &#x60;TransactionNotFoundError&#x60;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionCommittedDetailsTest() throws ApiException {
        TransactionCommittedDetailsRequest transactionCommittedDetailsRequest = null;
        TransactionCommittedDetailsResponse response = api.transactionCommittedDetails(transactionCommittedDetailsRequest);

        // TODO: test validations
    }
    /**
     * Get Construction Metadata
     *
     * Returns information needed to construct a new transaction including current &#x60;epoch&#x60; number. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionConstructionTest() throws ApiException {
        TransactionConstructionResponse response = api.transactionConstruction();

        // TODO: test validations
    }
    /**
     * Preview Transaction
     *
     * Previews transaction against the network. This endpoint is effectively a proxy towards the Core API &#x60;/v0/transaction/preview&#x60; endpoint. See the Core API documentation for more details. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionPreviewTest() throws ApiException {
        TransactionPreviewRequest transactionPreviewRequest = null;
        TransactionPreviewResponse response = api.transactionPreview(transactionPreviewRequest);

        // TODO: test validations
    }
    /**
     * Get Transaction Status
     *
     * Returns overall transaction status and all of its known payloads based on supplied intent hash. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionStatusTest() throws ApiException {
        TransactionStatusRequest transactionStatusRequest = null;
        TransactionStatusResponse response = api.transactionStatus(transactionStatusRequest);

        // TODO: test validations
    }
    /**
     * Submit Transaction
     *
     * Submits a signed transaction payload to the network. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionSubmitTest() throws ApiException {
        TransactionSubmitRequest transactionSubmitRequest = null;
        TransactionSubmitResponse response = api.transactionSubmit(transactionSubmitRequest);

        // TODO: test validations
    }
}

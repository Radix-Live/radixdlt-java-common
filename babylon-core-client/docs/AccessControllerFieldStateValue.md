

# AccessControllerFieldStateValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**controlledVault** | [**EntityReference**](EntityReference.md) |  |  |
|**xrdFeeVault** | [**EntityReference**](EntityReference.md) | An optional helper vault storing some amount of XRD that can be used by any of the roles for locking fees.  |  [optional] |
|**timedRecoveryDelayMinutes** | **Long** | An integer between &#x60;0&#x60; and &#x60;2^32 - 1&#x60;, specifying the amount of time (in minutes) that it takes for timed recovery to be done. When not present, then timed recovery can not be performed through this access controller.  |  [optional] |
|**recoveryBadgeResourceAddress** | **String** | The Bech32m-encoded human readable version of the resource address |  |
|**isPrimaryRoleLocked** | **Boolean** | Whether the primary role is currently locked. |  |
|**primaryRoleRecoveryAttempt** | [**PrimaryRoleRecoveryAttempt**](PrimaryRoleRecoveryAttempt.md) | The current attempt to recover a primary role, if any. |  [optional] |
|**hasPrimaryRoleBadgeWithdrawAttempt** | **Boolean** | Whether the primary role badge withdraw is currently being attempted. |  |
|**recoveryRoleRecoveryAttempt** | [**RecoveryRoleRecoveryAttempt**](RecoveryRoleRecoveryAttempt.md) | The current attempt to recover a recovery role, if any. |  [optional] |
|**hasRecoveryRoleBadgeWithdrawAttempt** | **Boolean** | Whether the recovery role badge withdraw is currently being attempted. |  |




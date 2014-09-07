package org.pavanecce.common.contract;

public enum LineItemType {
	/**
	 * Calculated from other lineItems. The lineItem cannot be changed directly, and is dependent on other lineItems
	 */
	DERIVED,
	/**
	 * The requester is open to alternative proposals. 
	 */
	NEGOTIABLE,
	/**
	 * The line item cannot be changed during the negotiation process
	 */
	FIXED;
}

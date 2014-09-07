package org.pavanecce.common.contract;

public interface LineItem {
	String getName();
	LineItemType getType();
	boolean isFulfilled(Contract contract);
}

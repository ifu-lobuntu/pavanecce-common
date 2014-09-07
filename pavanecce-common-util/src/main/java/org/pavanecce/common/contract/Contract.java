package org.pavanecce.common.contract;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public interface Contract {
	String getActivityIdentifier();
	Serializable getIdentifier();
	Map<String,LineItem> getInput();
	Map<String,LineItem> getOutput();
	Date getDueDate();
	Date getStartDate();
}

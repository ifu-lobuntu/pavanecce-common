package org.pavanecce.common.contract;

import java.util.Date;
import java.util.Map;

public interface ContractService {
	PotentialContract prepareRequest(String acitivtyIdentifier, Map<String,Object> inputs,Map<String,Object> outputs, Date startDate, Date dueDate);
	void applyCounter(PotentialContract contract, Map<String,Object> inputs,Map<String,Object> outputs, Date startDate, Date dueDate);
	Contract commit(PotentialContract potentialContract);
	void consummate(Contract contract);
}

/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.reporting.cohort.definition;

import java.util.Date;
import java.util.List;

import org.openmrs.ProgramWorkflowState;
import org.openmrs.module.reporting.common.Localized;
import org.openmrs.module.reporting.definition.configuration.ConfigurationProperty;

/**
 * Query for whether the patient started or ended any of the specified states in a date range
 */
@Localized("reporting.PatientStateCohortDefinition")
public class PatientStateCohortDefinition extends BaseCohortDefinition {

    private static final long serialVersionUID = 1L;
    
	//***** PROPERTIES *****
		
	@ConfigurationProperty(required=true, group="statesGroup")
	private List<ProgramWorkflowState> states;
	
	@ConfigurationProperty(group="startedDate")
	private Date startedOnOrAfter;

	@ConfigurationProperty(group="startedDate")
	private Date startedOnOrBefore;

	@ConfigurationProperty(group="endedDate")
	private Date endedOnOrAfter;

	@ConfigurationProperty(group="endedDate")
	private Date endedOnOrBefore;

	//***** CONSTRUCTORS *****

	/**
	 * Default constructor
	 */
	public PatientStateCohortDefinition() {
		super();
	}
	
	//***** INSTANCE METHODS *****
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder ret = new StringBuilder();
		ret.append("Patients ");
		if (startedOnOrAfter != null)
			ret.append("who started on or after " + startedOnOrAfter + " ");
		if (startedOnOrBefore != null)
			ret.append("who started on or before " + startedOnOrBefore+ " ");
		if (endedOnOrAfter != null)
			ret.append("who ended on or after " + endedOnOrAfter + " ");
		if (endedOnOrBefore != null)
			ret.append("who ended on or before " + endedOnOrBefore + " ");
			
		if (states != null && states.size() > 0) {
			ret.append(" in ");
			for (ProgramWorkflowState s : states)
				ret.append(s.getName() + " ");
		}		
		return ret.toString();
	}


	//***** PROPERTY ACCESS *****
	
    /**
     * @return the states
     */
    public List<ProgramWorkflowState> getStates() {
    	return states;
    }
	
    /**
     * @param states the states to set
     */
    public void setStates(List<ProgramWorkflowState> states) {
    	this.states = states;
    }

	
    /**
     * @return the startedOnOrAfter
     */
    public Date getStartedOnOrAfter() {
    	return startedOnOrAfter;
    }
	
    /**
     * @param startedOnOrAfter the startedOnOrAfter to set
     */
    public void setStartedOnOrAfter(Date startedOnOrAfter) {
    	this.startedOnOrAfter = startedOnOrAfter;
    }
	
    /**
     * @return the startedOnOrBefore
     */
    public Date getStartedOnOrBefore() {
    	return startedOnOrBefore;
    }
	
    /**
     * @param startedOnOrBefore the startedOnOrBefore to set
     */
    public void setStartedOnOrBefore(Date startedOnOrBefore) {
    	this.startedOnOrBefore = startedOnOrBefore;
    }
	
    /**
     * @return the endedOnOrAfter
     */
    public Date getEndedOnOrAfter() {
    	return endedOnOrAfter;
    }
	
    /**
     * @param endedOnOrAfter the endedOnOrAfter to set
     */
    public void setEndedOnOrAfter(Date endedOnOrAfter) {
    	this.endedOnOrAfter = endedOnOrAfter;
    }
	
    /**
     * @return the endedOnOrBefore
     */
    public Date getEndedOnOrBefore() {
    	return endedOnOrBefore;
    }

    /**
     * @param endedOnOrBefore the endedOnOrBefore to set
     */
    public void setEndedOnOrBefore(Date endedOnOrBefore) {
    	this.endedOnOrBefore = endedOnOrBefore;
    }
    
}

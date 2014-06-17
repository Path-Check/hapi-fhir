package ca.uhn.fhir.jpa.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.TagList;

public interface IFhirSystemDao {

	void transaction(List<IResource> theResources);

	List<IResource> history(Date theDate, Integer theLimit);

	TagList getAllTags();

	Map<String, Long> getResourceCounts();

}

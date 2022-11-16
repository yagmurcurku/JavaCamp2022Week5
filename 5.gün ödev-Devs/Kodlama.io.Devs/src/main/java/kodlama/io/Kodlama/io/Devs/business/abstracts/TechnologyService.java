package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.technologiesRequests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technologiesRequests.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technologiesRequests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.technologiesResponses.GetAllTechnologyResponse;

public interface TechnologyService {

	List<GetAllTechnologyResponse> getAll();
	
	void add(CreateTechnologyRequest createTechnologyRequest);
	
	void delete(DeleteTechnologyRequest deleteTechnologyRequest);
	
	void update(int id, UpdateTechnologyRequest updateTechnologyRequest);
	

}
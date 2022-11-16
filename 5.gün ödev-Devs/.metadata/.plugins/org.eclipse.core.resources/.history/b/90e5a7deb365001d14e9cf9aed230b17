package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguagesRequests.CreateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguagesRequests.DeleteProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguagesRequests.UpdateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguagesResponses.GetAllProgrammingLanguageResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguagesResponses.GetByIdProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguageResponse> getAll();
	
	GetByIdProgrammingLanguageResponse getById(int id);
	
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	
	void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
	
	void update(int id, UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
	
}
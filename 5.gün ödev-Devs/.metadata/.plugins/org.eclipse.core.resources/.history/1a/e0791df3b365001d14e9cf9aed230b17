package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguagesRequests.CreateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguagesRequests.DeleteProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguagesRequests.UpdateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguagesResponses.GetAllProgrammingLanguageResponse;
import kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguagesResponses.GetByIdProgrammingLanguageResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	
	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> programmingLanguageResponse = new ArrayList<GetAllProgrammingLanguageResponse>();
		
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguageResponse responseItem = new GetAllProgrammingLanguageResponse();
			responseItem.setName(programmingLanguage.getName());
			
			programmingLanguageResponse.add(responseItem);
		}
		return programmingLanguageResponse;
	}
	
	
	
	
	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		if (!checkIfExits(createProgrammingLanguageRequest)) {
			
			ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
			programmingLanguage.setName(createProgrammingLanguageRequest.getName());
			
			programmingLanguageRepository.save(programmingLanguage);
		}
	}

	

	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
		programmingLanguageRepository.deleteById(deleteProgrammingLanguageRequest.getId());
		
	}
	
	

	@Override
	public void update(int id , UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		if(!updateProgrammingLanguageRequest.getName().isEmpty()) {
			ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).get();
			programmingLanguage.setName(updateProgrammingLanguageRequest.getName());
			programmingLanguageRepository.save(programmingLanguage);
		}
	}
		
	
	
	@Override
	public GetByIdProgrammingLanguageResponse getById(int id) {
		
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).get();
		
		GetByIdProgrammingLanguageResponse response = new GetByIdProgrammingLanguageResponse();
		response.setName(programmingLanguage.getName());
		
		return response;
	}


	
	
	
	public boolean checkIfExits(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
        return programmingLanguageRepository.existsByName(createProgrammingLanguageRequest.getName());
    } 




}

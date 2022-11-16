package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.technologiesRequests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technologiesRequests.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technologiesRequests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.technologiesResponses.GetAllTechnologyResponse;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService{

	private TechnologyRepository technologyRepository;
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, ProgrammingLanguageRepository programmingLanguageRepository) {
		this.technologyRepository = technologyRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	
	
	@Override
	public List<GetAllTechnologyResponse> getAll() {
		
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponse> responses = new ArrayList<>();
		
		for (Technology technology : technologies) {
			GetAllTechnologyResponse response = new GetAllTechnologyResponse();
			
			response.setName(technology.getName());
			response.setLanguageName(technology.getProgrammingLanguage().getName());
			
			responses.add(response);
		}
		
		return responses;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		Technology technology = new Technology();
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(createTechnologyRequest.getLanguageId()).get();
		
		technology.setName(createTechnologyRequest.getName());
		technology.setProgrammingLanguage(programmingLanguage);

		technologyRepository.save(technology);
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		technologyRepository.deleteById(deleteTechnologyRequest.getId());
		
	}

	@Override
	public void update(int id, UpdateTechnologyRequest updateTechnologyRequest) {
		Technology technology = technologyRepository.findById(id).get();
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(updateTechnologyRequest.getLanguageId()).get();
		
		technology.setName(updateTechnologyRequest.getName());
		technology.setProgrammingLanguage(programmingLanguage);
		
		technologyRepository.save(technology);
	}

}

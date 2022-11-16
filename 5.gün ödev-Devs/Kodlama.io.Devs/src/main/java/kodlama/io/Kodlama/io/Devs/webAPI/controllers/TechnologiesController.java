package kodlama.io.Kodlama.io.Devs.webAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.Kodlama.io.Devs.business.requests.technologiesRequests.CreateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technologiesRequests.DeleteTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.requests.technologiesRequests.UpdateTechnologyRequest;
import kodlama.io.Kodlama.io.Devs.business.responses.technologiesResponses.GetAllTechnologyResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {

	TechnologyService technologyService;
	
	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}

	
	@GetMapping("/getAll")
	public List<GetAllTechnologyResponse> getAll(){
		return this.technologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		this.technologyService.add(createTechnologyRequest);
	}
	
	
	@DeleteMapping("/delete")
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		this.technologyService.delete(deleteTechnologyRequest);
	}
	
	@PutMapping("/update")
	public void update(int id, UpdateTechnologyRequest updateTechnologyRequest) {
		this.technologyService.update(id, updateTechnologyRequest);
	}
	
}
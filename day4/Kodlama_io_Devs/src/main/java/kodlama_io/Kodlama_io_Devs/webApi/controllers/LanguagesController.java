package kodlama_io.Kodlama_io_Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama_io.Kodlama_io_Devs.business.abstracts.LanguageService;
import kodlama_io.Kodlama_io_Devs.entitities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programming-languages")
public class LanguagesController {
	private LanguageService languageService;

	
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) {
		languageService.add(programmingLanguage);
	}
	
	@PutMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage) {
		languageService.update(programmingLanguage);
	}
	
	@DeleteMapping("/delete")
	public void delete(int id) {
		languageService.delete(id);
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return languageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id) {
		return languageService.getById(id);
	}
}

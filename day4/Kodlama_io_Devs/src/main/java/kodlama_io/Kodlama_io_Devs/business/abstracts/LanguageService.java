package kodlama_io.Kodlama_io_Devs.business.abstracts;

import java.util.List;

import kodlama_io.Kodlama_io_Devs.entitities.concretes.ProgrammingLanguage;

public interface LanguageService {
	List<ProgrammingLanguage> getAll();
	
	void add(ProgrammingLanguage programmingLanguage);
	
	void update(ProgrammingLanguage programmingLanguage);
	
	void delete(int id);
	
	ProgrammingLanguage getById(int id);
}

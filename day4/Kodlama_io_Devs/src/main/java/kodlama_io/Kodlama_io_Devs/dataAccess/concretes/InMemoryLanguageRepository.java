package kodlama_io.Kodlama_io_Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama_io.Kodlama_io_Devs.dataAccess.abstracts.LanguageRepository;
import kodlama_io.Kodlama_io_Devs.entitities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<ProgrammingLanguage> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		
		languages.add(new ProgrammingLanguage(1, "C#"));
		languages.add(new ProgrammingLanguage(2, "Java"));
		languages.add(new ProgrammingLanguage(3, "Python"));
	}

	
	@Override
	public List<ProgrammingLanguage> getAll() {
		return languages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		languages.add(programmingLanguage);
	}
	
	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		for (ProgrammingLanguage language : languages) {
			if(language.getId() == programmingLanguage.getId()) {
				language.setName(programmingLanguage.getName());
			}
		}
	}

	@Override
	public void delete(int id) {
		languages.remove(getById(id));	
	}


	@Override
	public ProgrammingLanguage getById(int id) {
		return languages.get(id);
	}

}

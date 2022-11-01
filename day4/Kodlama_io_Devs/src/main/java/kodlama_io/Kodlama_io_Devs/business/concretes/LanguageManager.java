package kodlama_io.Kodlama_io_Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama_io.Kodlama_io_Devs.business.abstracts.LanguageService;
import kodlama_io.Kodlama_io_Devs.dataAccess.abstracts.LanguageRepository;
import kodlama_io.Kodlama_io_Devs.entitities.concretes.ProgrammingLanguage;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		if(programmingLanguage.getName().isBlank() || programmingLanguage.getName().isEmpty()) {
			System.out.println("Programlama dili boş geçilemez. Lütfen burayı boş bırakmayın.");
		} else {
			boolean duplicateFound = false;
			for (ProgrammingLanguage language : languageRepository.getAll()) {
				if (programmingLanguage.getName().equals(language.getName()) || programmingLanguage.getId() == language.getId()) {
					duplicateFound = true;
					System.out.println("İsimler ve ID'ler tekrar edemez. Ya aynı isimli programlama dili zaten var veya bu ID önceden kullanılmış.");
				}
			}
			if (!duplicateFound) {
				languageRepository.add(programmingLanguage);
				System.out.println("Programlama dili başarıyla eklenmiştir: " + programmingLanguage.getName());
			}
		}
	}
	

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		if(programmingLanguage.getName().isBlank() || programmingLanguage.getName().isEmpty()) {
			System.out.println("Programlama dili boş geçilemez. Lütfen burayı boş bırakmayın.");
		} else {
			boolean duplicateFound = false;
			boolean duplicateId = false;
			for (ProgrammingLanguage language : languageRepository.getAll()) {
				if (programmingLanguage.getName().equals(language.getName())) {
					duplicateFound = true;
					System.out.println("İsimler tekrar edemez. Aynı isimli programlama dili zaten var."); 
				}
				if (programmingLanguage.getId() == language.getId()) {
					duplicateId = true;
				}
			}
			if (!duplicateFound && duplicateId) {
				languageRepository.update(programmingLanguage);
				System.out.println("Programlama dili başarıyla güncellenmiştir: " + programmingLanguage.getName());
			}
			if (!duplicateId) {
				System.out.println("Bu ID önceden kullanılmadığı için güncellenemiyor. Güncellemek istediğiniz ID'nin veri tabanında bulunduğundan emin olunuz.");
			}
		}
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
		System.out.println("Programlama dili başarıyla silinmiştir.");
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return languageRepository.getById(id);
	}
}

package com.adam.languages.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import com.adam.languages.models.Languages;
import com.adam.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
    @Autowired
	private LanguageRepository languageRepo;
	
    public void create(Languages language) {
        languageRepo.save(language);
    }
	public List<Languages> getAllLanguages() {
		return this.languageRepo.findAll();
	}
	public Languages getLanguageById(long id) {
		return languageRepo.findById(id).get();
	}
	@Modifying
	public Languages update(Languages updateLanguage, Long id) {
		return languageRepo.save(updateLanguage);
	}
	public void delete(Long id) {
		languageRepo.deleteById(id);
	}
}

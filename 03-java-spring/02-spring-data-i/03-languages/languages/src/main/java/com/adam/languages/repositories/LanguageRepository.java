package com.adam.languages.repositories;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.adam.languages.models.Languages;

@Repository
public interface LanguageRepository extends CrudRepository<Languages, Long> {
    List<Languages> findAll();
    
}

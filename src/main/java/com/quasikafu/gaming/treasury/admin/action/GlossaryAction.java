package com.quasikafu.gaming.treasury.admin.action;

import com.quasikafu.gaming.treasury.admin.models.GlossaryEntry;
import com.quasikafu.gaming.treasury.admin.repositories.GlossaryRepository;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * User: kmccoy
 * Date: 10/3/2024
 * Time: 3:33 PM
 * *********************************************************************************************
 * USR            DATE        JIRA#               COMMENTS
 * xxxxxxxx       10/03/2024  BATCHJAVA-99999999  Created GlossaryAction.
 * //return glossaryRepository.findAll().stream().filter(entry->entry.term().equalsIgnoreCase(searchValue)).collect();
 * *********************************************************************************************
 */
@Component
public class GlossaryAction {
    private final GlossaryRepository glossaryRepository;
    public GlossaryAction(GlossaryRepository repo) {
        this.glossaryRepository = repo;
    }

    public List<GlossaryEntry> getAllTerms() {
        return glossaryRepository.findAll();
    }

    public GlossaryEntry getTermById(Integer id) {
        return glossaryRepository.findAll().get(id);
    }

    public List<GlossaryEntry> getTermBySearchValue(String searchValue) {
        return glossaryRepository.searchByLike(searchValue);


    }
}

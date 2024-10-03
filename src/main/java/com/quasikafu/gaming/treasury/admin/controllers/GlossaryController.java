package com.quasikafu.gaming.treasury.admin.controllers;

import com.quasikafu.gaming.treasury.admin.action.GlossaryAction;
import com.quasikafu.gaming.treasury.admin.models.GlossaryEntry;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: Keith McCoy
 * Date: 10/3/2024
 * Time: 3:17 PM
 * *********************************************************************************************
 * USR            DATE        JIRA#               COMMENTS
 * xxxxxxxx       10/03/2024  BATCHJAVA-99999999  Created GlossaryController.
 * *********************************************************************************************
 */
@RestController
@RequestMapping("/glossary")
public class GlossaryController {

    private final GlossaryAction glossaryAction;

    public GlossaryController(GlossaryAction action){
        this.glossaryAction = action;

    }

    @GetMapping("")
    public List<GlossaryEntry> getAllEntries(){
        return glossaryAction.getAllTerms();
    }

    @GetMapping("")
    public List<GlossaryEntry> getEntriesBySearch(@RequestParam(value = "search") String term){
         return glossaryAction.getTermBySearchValue(term);
    }

    @GetMapping("/{id}")
    public GlossaryEntry getAbilityById(@PathVariable Integer id){
        return glossaryAction.getTermById(id);
    }

}

package com.quasikafu.gaming.treasury.admin.repositories;

import com.quasikafu.gaming.treasury.admin.models.GlossaryEntry;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * User: kmccoy
 * Date: 10/3/2024
 * Time: 3:33 PM
 * *********************************************************************************************
 * USR            DATE        JIRA#               COMMENTS
 * xxxxxxxx       10/03/2024  BATCHJAVA-99999999  Created GlossaryRepository.
 * *********************************************************************************************
 */
public interface GlossaryRepository extends ListCrudRepository<GlossaryEntry, Integer> {
    @Query("SELECT * from admin_glossary c; ")
    List<GlossaryEntry> getAllTerms();

    @Query("    SELECT * from admin_glossary c where term LIKE %:searchValue%  OR definition LIKE %:searchValue% ")
    List<GlossaryEntry> searchByLike (@Param("searchValue") String searchValue);

 }

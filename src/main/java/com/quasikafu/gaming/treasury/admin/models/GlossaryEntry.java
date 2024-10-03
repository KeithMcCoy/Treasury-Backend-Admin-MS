package com.quasikafu.gaming.treasury.admin.models;

import org.springframework.data.annotation.Id;

/**
 * User: kmccoy
 * Date: 10/3/2024
 * Time: 3:20 PM
 * *********************************************************************************************
 * USR            DATE        JIRA#               COMMENTS
 * xxxxxxxx       10/03/2024  BATCHJAVA-99999999  Created GlossaryRecord.
 * *********************************************************************************************
 */
public record GlossaryEntry(
    @Id
    String term,
    String definition
    )
{}

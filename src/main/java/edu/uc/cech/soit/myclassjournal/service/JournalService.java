package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JournalService implements IJournalService {
    private List<JournalEntry> journalEntries = new ArrayList<>();

    /*
    * journalEntry is saved to Array
    *
    *
     */
    @Override
    public void save(JournalEntry journalEntry) {
        journalEntries.add(journalEntry);
    }

    /*
     * fetches all entries in array
     *
     *
     */
    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntries;
    }
}

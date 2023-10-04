package edu.uc.cech.soit.myclassjournal.dto;

import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class JournalEntry {
    private String notes;
    private String date;
}

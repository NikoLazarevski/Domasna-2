package com.example.project1.data;

import com.example.project1.repository.CompanyDataRepository;
import com.example.project1.repository.IssuerRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.ParseException;

@Component
@RequiredArgsConstructor
public class DataLoader {

    private final IssuerRepository issuerRepository;
    private final CompanyDataRepository companyDataRepository;

    @PostConstruct
    private void initializeData() throws IOException, ParseException {
//        long startTime = System.nanoTime();
//
//        Pipe<List<Issuer>> pipe = new Pipe<>();
//        pipe.addFilter(new Filter1(companyRepository));
//        pipe.addFilter(new Filter3(companyRepository, historicalDataRepository));
//        pipe.addFilter(new Filter2(companyRepository, historicalDataRepository));
//        pipe.runFilter(null);
//
//        long endTime = System.nanoTime();
//        long durationInMillis = (endTime - startTime) / 1_000_000;
//
//        long hours = durationInMillis / 3_600_000;
//        long minutes = (durationInMillis % 3_600_000) / 60_000;
//        long seconds = (durationInMillis % 60_000) / 1_000;
//
//        System.out.printf("Total time for all filters to complete: %02d hours, %02d minutes, %02d seconds%n", hours, minutes, seconds);
    }

}

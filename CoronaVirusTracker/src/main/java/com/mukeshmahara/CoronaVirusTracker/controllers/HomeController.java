package com.mukeshmahara.CoronaVirusTracker.controllers;

import com.mukeshmahara.CoronaVirusTracker.Services.CoronaVirusDataService;
import com.mukeshmahara.CoronaVirusTracker.models.LocationStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.IntStream;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model) {

        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getCaseChange()).sum();
        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalReportedCases",totalReportedCases );
        model.addAttribute("totalNewCases",totalNewCases );
        return "home";
    }
}

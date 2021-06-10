package com.pr.reservation.controllers;

import com.pr.reservation.domainData.EventSimple;
import com.pr.reservation.services.AppServiceClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AllEventsController {
    AppServiceClass appServiceClass;

    public AllEventsController (AppServiceClass appServiceClass) {
        this.appServiceClass = appServiceClass;
    }

    @GetMapping("/allEvents")
    public String allEvents(Model model) {
        System.out.println("allEvents");

/*        List<EventSimple> eventSimpleList = appServiceClass.getSimpleEventsList(20);
        model.addAttribute("collectionOfEventSimple", eventSimpleList);*/
        return "allEvents";
    }
}

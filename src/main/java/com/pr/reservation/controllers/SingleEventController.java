package com.pr.reservation.controllers;

import com.pr.reservation.domainData.EventSimple;
import com.pr.reservation.repository.ListEventRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SingleEventController {
    ListEventRepository listEventRepository;

    public SingleEventController(ListEventRepository listEventRepository) {
        this.listEventRepository = listEventRepository;
    }

    @GetMapping(value = "/singleEvent")
    public String singleEvent(@RequestParam("id") Integer id) {
        System.out.println("singleEvent " + id);

        EventSimple eventSimple = listEventRepository.getSingleEventSimple(id);

        return "singleEvent";
    }

}

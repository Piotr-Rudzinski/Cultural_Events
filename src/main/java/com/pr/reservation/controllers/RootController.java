package com.pr.reservation.controllers;

import com.pr.reservation.domainData.Event;
import com.pr.reservation.domainData.EventNew;
import com.pr.reservation.model.Car;
import com.pr.reservation.repository.ListEventRepository;
import com.pr.reservation.services.AppServiceClass;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class RootController {
    AppServiceClass appServiceClass;
    ListEventRepository listEventRepository;

    public RootController(AppServiceClass appServiceClass, ListEventRepository listEventRepository) {
        this.appServiceClass = appServiceClass;
        this.listEventRepository = listEventRepository;
    }

    @GetMapping("/home")
    public String home(Model model) {

        List<EventNew> eventNewList = appServiceClass.getListEventRepository(20);
        System.out.println("xxx + " + eventNewList.size());
        model.addAttribute("eventsNewKey", eventNewList);
        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("OPEL", "Astra");
        Car car3 = new Car("FORD", "Fiesta");
        Car car4 = new Car("FIAT", "Tipo");
        Car car5 = new Car("SKODA", "105");

        List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5);
        model.addAttribute("name", "Piotr");
        model.addAttribute("carKey", car1);
        model.addAttribute("carListKey", cars);

        return "home";
    }

    @PostMapping
    public String processDesign() {
        System.out.println("aa");
        return "redirect:/notes/current";
    }

    @GetMapping("/main")
    public String main(Model model) {
        System.out.println("main");
        listEventRepository.readEventsFromGsonToList();

        

        return "main";
    }

/*    @PostMapping("login")
    public String login() {
        System.out.println("login");
        return "login";
    }*/




}

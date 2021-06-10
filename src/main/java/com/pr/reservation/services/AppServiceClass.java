package com.pr.reservation.services;


import com.pr.reservation.domainData.EventNew;
import com.pr.reservation.domainData.EventSimple;
import com.pr.reservation.repository.ListEventRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppServiceClass {

    ListEventRepository listEventRepository;

    public AppServiceClass (ListEventRepository listEventRepository) {
        this.listEventRepository = listEventRepository;
    }

    public List<EventNew> getListEventRepository (Integer numberOfEvents) {
        listEventRepository.readEventsFromGsonToList();

        List<EventNew> list = listEventRepository.getEventsDB();
        List<EventNew> shortEventList = new ArrayList<>();
        System.out.println("list size = " + list.size());

        if(numberOfEvents < list.size()) {
            for(int i = 0; i < numberOfEvents; i++) {
                shortEventList.add(list.get(i));
                System.out.println("loop = " + shortEventList.size());
            }
        } else {
            shortEventList.addAll(list);
        }


        System.out.println("list length = " + shortEventList.size());
        return shortEventList;
    }

/*    public List<EventSimple> getSimpleEventsList (Integer numberOfEventsPerPage) {
        List<EventSimple> simpleEventList = listEventRepository.createEventsSimpleList();
        return simpleEventList;
    }*/


}

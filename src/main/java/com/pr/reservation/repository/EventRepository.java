package com.pr.reservation.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pr.reservation.domainData.Event;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EventRepository {
    private List<Event> eventsDB = new ArrayList<>();
    private Path path = Paths.get("src", "main", "resources", "json.json");

    public void readEventsFromGsonToList() {
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader(String.valueOf(path));
            Type listType = new TypeToken<ArrayList<Event>>(){}.getType();
            List<Event> eventsDB = new Gson().fromJson(reader, listType);
            } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Błąd odczytu pliku .json.");
        }
    }
}

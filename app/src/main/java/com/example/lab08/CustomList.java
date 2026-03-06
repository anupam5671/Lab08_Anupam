package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() { this.cities = new ArrayList<>(); }

    public void addCity(City city) { cities.add(city); }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }
    public void deleteCity(City city) {
        cities.remove(city);
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        list.addCity(calgary);
        list.addCity(edmonton);

        // This will fail initially because countCities() doesn't exist
        assertEquals(2, list.countCities());
    }

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
}
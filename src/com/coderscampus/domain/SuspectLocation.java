package com.coderscampus.domain;

import java.util.Optional;

public class SuspectLocation {

    private String name;
    private Optional<String> country = Optional.empty();

    public SuspectLocation(String[] suspectInfo){
        setCountry(suspectInfo[0]);
        setName(suspectInfo[1]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = Optional.ofNullable(country);
    }
}

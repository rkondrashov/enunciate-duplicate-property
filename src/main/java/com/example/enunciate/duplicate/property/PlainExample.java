package com.example.enunciate.duplicate.property;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlainExample {

    @JsonProperty("my_property")
    private String myProperty;

    @JsonProperty("my_property")
    public void setMyProperty(String myProperty) {
        this.myProperty = myProperty;
    }

}

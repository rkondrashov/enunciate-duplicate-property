package com.example.enunciate.duplicate.property;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Setter;

@Setter
public class LombokExample {

    @JsonProperty("my_property")
    private String myProperty;

}

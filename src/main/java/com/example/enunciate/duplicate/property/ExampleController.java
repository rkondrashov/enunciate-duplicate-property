package com.example.enunciate.duplicate.property;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/plain")
    public PlainExample getPlain() {
        return new PlainExample();
    }

    @GetMapping("/lombok")
    public LombokExample getLombok() {
        return new LombokExample();
    }

}

package com.example.aggregator.Controller;

import com.example.aggregator.Model.Entry;
import com.example.aggregator.Service.AggregatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AggregatorController {

    private static final Logger logger = LoggerFactory.getLogger(AggregatorController.class.getName());

    private AggregatorService service;

    public AggregatorController(AggregatorService service) {
        this.service = service;
    }

    @GetMapping("/getDefinitionFor/{word}")
    public Entry getDefinitionFor(@PathVariable String word)
    {
        return service.getDefinitionFor(word);
    }

    @GetMapping("/getAllPalindromes")
    public List<Entry> getAllPalindromes()
    {
        return service.getAllPalindromes();
    }

    @GetMapping("/getWordsThatContainSuccessiveLettersAndStartWith/{chars}")
    public List<Entry> getWordsThatContainSuccessiveLettersAndStartWith(@PathVariable String chars)
    {
        return service.getWordsThatContainSuccessiveLettersAndStartWith(chars);
    }



}
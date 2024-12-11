package dev.padron.suggestion.controllers;

import dev.padron.suggestion.entities.Suggestion;
import dev.padron.suggestion.repos.SuggestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.synth.SynthGraphicsUtils;
import java.util.List;

@Component
@RestController
@CrossOrigin (origins = "*")
public class SuggestionController {

    @Autowired
    SuggestionRepo suggestionRepo;

    @PostMapping ("/suggestions")
    public Suggestion createSuggestion(@RequestBody Suggestion suggestion){
        return suggestionRepo.save(suggestion);
    }
    @GetMapping ("/suggestions")
    public List<Suggestion> suggestions () {
        return suggestionRepo.findAll();
    }

}

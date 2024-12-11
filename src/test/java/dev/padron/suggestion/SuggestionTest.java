package dev.padron.suggestion;

import dev.padron.suggestion.entities.Suggestion;
import dev.padron.suggestion.repos.SuggestionRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SuggestionTest {

    @Autowired
    SuggestionRepo suggestionRepo;

    @Test
    public void createSuggestion() {
    Suggestion suggestion = new Suggestion(0, "Fix computer", 8);
    suggestionRepo.save(suggestion);
    Assertions.assertNotEquals("", suggestion.getId());
    System.out.println(suggestion);
    }
}

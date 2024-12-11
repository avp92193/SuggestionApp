package dev.padron.suggestion.repos;

import dev.padron.suggestion.entities.Suggestion;
import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface SuggestionRepo extends JpaRepository <Suggestion, Integer> {
}

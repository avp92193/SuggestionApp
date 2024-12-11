package dev.padron.suggestion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "suggestion")
public class Suggestion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    @Column(name = "s_id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column (name = "priority")
    private int priority;


}

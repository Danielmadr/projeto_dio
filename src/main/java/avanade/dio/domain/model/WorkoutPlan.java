package avanade.dio.domain.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "workout_plans")
public class WorkoutPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;

    @OneToMany(mappedBy = "workoutPlan")
    private List<Exercise> exercises;
}

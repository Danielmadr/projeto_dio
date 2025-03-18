package avanade.dio.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "members")
@Data
public class Member extends User {

    private String membershipType;
    private Date membershipStartDate;
    private Date membershipEndDate;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;

    @OneToOne
    @JoinColumn(name = "workout_plan_id")
    private WorkoutPlan workoutPlan;
}

package avanade.dio.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "trainers")
@Data
public class Trainer extends User {

    private String specialization;

    @OneToMany(mappedBy = "trainer")
    private List<Member> members;

}

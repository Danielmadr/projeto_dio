package avanade.dio.domain.repository;

import avanade.dio.domain.model.User;
import avanade.dio.domain.model.WorkoutPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutPlanRepository extends JpaRepository<WorkoutPlan, Integer> {
}

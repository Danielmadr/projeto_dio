package avanade.dio.service.impl;

import avanade.dio.domain.model.WorkoutPlan;
import avanade.dio.domain.repository.WorkoutPlanRepository;
import avanade.dio.service.UserService;
import avanade.dio.service.WorkoutPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutPlanServiceImpl implements WorkoutPlanService {

    private final WorkoutPlanRepository workoutPlanRepository;

    public WorkoutPlanServiceImpl(WorkoutPlanRepository workoutPlanRepository) {
        this.workoutPlanRepository = workoutPlanRepository;
    }

    @Override
    public List<WorkoutPlan> listAll() {
        return workoutPlanRepository.findAll();
    }
}

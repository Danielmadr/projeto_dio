package avanade.dio.service.impl;

import avanade.dio.domain.model.Exercise;
import avanade.dio.domain.repository.ExerciseRepository;
import avanade.dio.service.ExerciseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public ExerciseServiceImpl(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public List<Exercise> listAll() {
        return exerciseRepository.findAll();
    }
}

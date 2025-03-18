package avanade.dio.service.impl;

import avanade.dio.domain.model.Trainer;
import avanade.dio.domain.repository.TrainerRepository;
import avanade.dio.service.TrainerService;
import avanade.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

    private final TrainerRepository trainerRepository;

    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public List<Trainer> listAll() {
        return trainerRepository.findAll();
    }
}

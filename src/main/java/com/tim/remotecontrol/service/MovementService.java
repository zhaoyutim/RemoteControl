package com.tim.remotecontrol.service;

import com.tim.remotecontrol.entity.MovementCmd;
import com.tim.remotecontrol.repository.MovementCmdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovementService {
    @Autowired
    private MovementCmdRepository movementCmdRepository;

    public List<MovementCmd> getAllMovement(){
        return movementCmdRepository.findAll();
    }

    public void postMovement(MovementCmd movementCmd){
        movementCmdRepository.save(movementCmd);
    }

    public MovementCmd GetOneMovement(){
        return movementCmdRepository.findTopByOrderByIdDesc();
    }
}

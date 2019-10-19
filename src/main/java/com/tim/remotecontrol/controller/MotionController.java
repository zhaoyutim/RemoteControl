package com.tim.remotecontrol.controller;

import com.tim.remotecontrol.entity.MovementCmd;
import com.tim.remotecontrol.kafka.KakfaPeoducer;
import com.tim.remotecontrol.repository.MovementCmdRepository;
import com.tim.remotecontrol.service.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class MotionController {

    @Autowired
    private MovementService movementService;

    @Autowired
    private KakfaPeoducer kakfaPeoducer;

    @GetMapping(value = "/mvcmd")
    public List<MovementCmd> getAllMovement(){
        return movementService.getAllMovement();
    }

    @GetMapping(value = "/getmvcmd")
    public MovementCmd getOneMovement(){
        return movementService.GetOneMovement();
    }

    @PostMapping(value = "/mvcmd")
    public void postMovement(@RequestBody MovementCmd movementCmd){
        //kakfaPeoducer.send(movementCmd.getDirection().toString());
        movementService.postMovement(movementCmd);
    }
}

package com.tim.remotecontrol.entity;

import com.tim.remotecontrol.Enum.Direction;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MovementCmd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Direction direction;
}

package com.tim.remotecontrol.repository;

import com.tim.remotecontrol.entity.MovementCmd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovementCmdRepository extends JpaRepository<MovementCmd, Long> {
}

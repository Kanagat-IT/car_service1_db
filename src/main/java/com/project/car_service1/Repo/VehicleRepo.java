package com.project.car_service1.Repo;

import com.project.car_service1.Models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle,Integer> {
}

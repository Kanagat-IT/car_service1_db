package com.project.car_service1.Repo;

import com.project.car_service1.Models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepo extends CrudRepository<Vehicle,Integer> {
}

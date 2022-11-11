package com.project.car_service1.Repo;

import com.project.car_service1.Models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepo extends JpaRepository<Driver,Integer> {
}

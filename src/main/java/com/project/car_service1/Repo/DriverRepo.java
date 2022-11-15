package com.project.car_service1.Repo;

import com.project.car_service1.Models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DriverRepo extends CrudRepository<Driver,Integer> {
}

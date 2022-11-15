package com.project.car_service1.Controllers;

import com.project.car_service1.Models.Vehicle;
import com.project.car_service1.Repo.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private VehicleRepo vehicleRepo;

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "MainPage");
        return "home";
    }

    @GetMapping("/vehicle-list")
    public String vehicleList(Model model) {
        Iterable<Vehicle> vehicles = vehicleRepo.findAll();
        model.addAttribute("vehicles", vehicles);
        return "my_vehicle_list";
    }
}
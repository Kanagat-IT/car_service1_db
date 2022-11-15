package com.project.car_service1.Controllers;

import com.project.car_service1.Models.Vehicle;
import com.project.car_service1.Repo.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

public class VehicleController {
    @Autowired
    private VehicleRepo vehicleRepo;

    @GetMapping("/car")
    public String blog(Model model){
        Iterable<Vehicle> vehicles = vehicleRepo.findAll();
        model.addAttribute("posts", vehicles);
        return "vehicle-list";
    }

    @GetMapping("/add/vehicle")
    public String vehicleAdd(Model model) {
        return "vehicle-add";
    }

    @PostMapping("/add/vehicle")
    public String vehicleAdding(@RequestParam String nick, @RequestParam String brand, @RequestParam String type,
                            @RequestParam String number, @RequestParam int year_issue,
                            @RequestParam String category, Model model) {
        Vehicle vehicle = new Vehicle(number, nick, brand, type, year_issue, category);
        vehicleRepo.save(vehicle);
        return "redirect:/car";
    }

    @GetMapping("/car/{vin}")
    public String blogDetail (@PathVariable(value = "vin")int vin, Model model){
        Optional<Vehicle> vehicle = vehicleRepo.findById(vin);
        ArrayList<Vehicle> res = new ArrayList<>();
        vehicle.ifPresent(res::add);
        model.addAttribute("vehicle", res);
        return "car-detail";
    }

    @GetMapping("/car/{vin}/edit")
    public String blogEdit(@PathVariable(value = "vin")int vin, Model model){
        if(!vehicleRepo.existsById(vin)) {
            return "redirect:/car";
        }
        Optional<Vehicle> vehicle = vehicleRepo.findById(vin);
        ArrayList<Vehicle> res = new ArrayList<>();
        vehicle.ifPresent(res::add);
        model.addAttribute("vehicle", res);
        return "car-edit";
    }

    @PostMapping("/car/{vin}/edit")
    public String blogUpdate(@PathVariable(value = "vin") int vin, @RequestParam String number,
                             @RequestParam String category, Model model){
        Vehicle vehicle = vehicleRepo.findById(vin).orElseThrow();
        vehicle.setCategory(category);
        vehicle.setNumber(number);
        vehicleRepo.save(vehicle);
        return "redirect:/car";
    }

    @PostMapping("/car/{vin}/remove")
    public String blogDelete(@PathVariable(value = "vin")int vin){
        Vehicle vehicle = vehicleRepo.findById(vin).orElseThrow();
        vehicleRepo.delete(vehicle);
        return "redirect:/car";
    }
}

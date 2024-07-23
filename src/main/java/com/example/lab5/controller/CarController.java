package com.example.lab5.controller;

import com.example.lab5.entity.Car;
import com.example.lab5.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api")
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/car")
    public ResponseEntity<List<Car>> getALl() {
        return ResponseEntity.ok(carRepository.findAll());
    }

    @GetMapping("/car/{carID}")
    public Car getCar(@PathVariable("carID") int carID) {
        return carRepository.findById(carID).get();
    }

    @PostMapping("/car/create")
    public ResponseEntity<Car> post(@RequestBody Car car){
        return ResponseEntity.ok(carRepository.save(car));
    }

    @PutMapping("/car/update/{carID}")
    public Car put(@RequestBody Car car, @PathVariable("carID") int carId){
       return carRepository.save(car);
    }

//    @DeleteMapping("/car/delete")
//    public void delete(@PathVariable("carID") int carId){
//        ResponseEntity.ok();
//        carRepository.deleteById(carId);
//    }
    @DeleteMapping("/car/delete/{carID}")
    public ResponseEntity<?> delete(@PathVariable("carID") int carID) {
        if (!carRepository.existsById(carID)) {
            return ResponseEntity.notFound().build();
        }
        carRepository.deleteById(carID);
        return ResponseEntity.ok().build();
    }

}
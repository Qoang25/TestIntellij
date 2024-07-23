package com.example.lab5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Cars")
public class Car {
    @Id
    @Column(name = "carId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int carID;

    @Column(name = "carName", columnDefinition = "nvarchar(255)")
    String carName;

    @Column(name = "brandCar", columnDefinition = "nvarchar(255)")
    String brandCar;

    @Column(name = "country", columnDefinition = "nvarchar(255)")
    String country;

    @Column(name = "color", columnDefinition = "nvarchar(255)")
    String color;
}

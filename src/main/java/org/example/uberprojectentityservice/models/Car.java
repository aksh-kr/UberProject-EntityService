package org.example.uberprojectentityservice.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car extends BaseModel{

    @Column(unique = true, nullable = false)
    private String plateNumber;

    @ManyToOne
    private Color color;

    private String brand;

    private String model;

    @Enumerated(value = EnumType.STRING)
    private CarType carType;

    @OneToOne
    private Driver driver;
}

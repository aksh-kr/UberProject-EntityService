package org.example.uberprojectentityservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NamedLocation extends BaseModel{

    @OneToOne
    private ExactLocation exactLocation;

    private String name;

    private String zipCode;

    private String city;

    private String state;

    private String country;
}

package org.example.uberprojectentityservice.models;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExactLocation extends BaseModel{

    private Double latitude;
    private Double longitude;
}

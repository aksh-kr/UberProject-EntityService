package org.example.uberprojectentityservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DBConstant extends BaseModel{

    @Column(unique = true, nullable = false)
    private String name;

    private String value;
}

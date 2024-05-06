package org.example.uberprojectentityservice.models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OTP extends BaseModel{

    private String code;

    private String sendToNumber;

    public static OTP make(String phoneNumber) {

        Random random = new Random();

        Integer code = random.nextInt(9000)+1000;

        return OTP.builder().code(code.toString()).sendToNumber(phoneNumber).build();
    }

}

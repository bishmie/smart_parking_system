package org.example.vehiceservice.dto;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDTO {
    private UUID id;
    private String licensePlate;
    private String model;
    private String email;
}


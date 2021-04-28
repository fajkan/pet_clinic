package se.lexicon.pet_clinic.dto;

import lombok.Data;
import se.lexicon.pet_clinic.entity.Pet;

import java.time.LocalDate;

@Data
public class VisitDto {
    private String id;
    private Pet pet;
    private LocalDate visitDate;
    private String description;
}

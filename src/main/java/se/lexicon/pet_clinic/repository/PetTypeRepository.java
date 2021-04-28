package se.lexicon.pet_clinic.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.pet_clinic.entity.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, String> {


}

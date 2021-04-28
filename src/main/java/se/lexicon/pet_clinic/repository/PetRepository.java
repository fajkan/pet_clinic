package se.lexicon.pet_clinic.repository;


import org.springframework.data.repository.CrudRepository;
import se.lexicon.pet_clinic.entity.Pet;

import java.util.List;

public interface PetRepository extends CrudRepository<Pet, String> {

    List<Pet> findByNameIgnoreCase(String Name);
    List<Pet> findByPetType_NameIgnoreCase(String Name);
    List<Pet> findByOwner_FirstNameIgnoreCaseAndOwner_LastNameIgnoreCase(String firstName, String lastName);
    List<Pet> findByOwner_Telephone(String Telephone);

}

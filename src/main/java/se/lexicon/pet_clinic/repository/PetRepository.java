package se.lexicon.pet_clinic.repository;


import org.springframework.data.repository.CrudRepository;
import se.lexicon.pet_clinic.entity.Pet;

public interface PetRepository extends CrudRepository<Pet, String> {

    // todo: implement basic CRUD






    //todo: select pet by name
    //todo: select pet by pet type name
    //todo: select pet by owner first name and last name
    //todo: select pet by owner telephone
}

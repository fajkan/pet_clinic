package se.lexicon.pet_clinic.service;


import se.lexicon.pet_clinic.dto.PetDto;
import se.lexicon.pet_clinic.exception.DataNotFoundException;

import java.util.List;

public interface PetService {

    PetDto save(PetDto dto);

    PetDto update(PetDto dto) throws DataNotFoundException;

    void deleteById(String id);

    PetDto findById(String id) throws DataNotFoundException;

    PetDto findByName(String id) throws DataNotFoundException;

    List<PetDto> getAll();

    List<PetDto> findByPetTypeName(String petTypeName);

    List<PetDto> findByOwnerFirstNameAndLastName(String firstName, String lastName);

    List<PetDto> findByOwnerTelephone (String Telephone);

}

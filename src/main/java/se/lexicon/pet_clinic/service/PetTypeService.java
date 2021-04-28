package se.lexicon.pet_clinic.service;


import se.lexicon.pet_clinic.dto.PetTypeDto;
import se.lexicon.pet_clinic.exception.DataNotFoundException;

import java.util.List;

public interface PetTypeService {

    PetTypeDto save(PetTypeDto dto);

    PetTypeDto update(PetTypeDto dto) throws DataNotFoundException;

    void deleteById(String id);

    PetTypeDto findById(String id) throws DataNotFoundException;

    List<PetTypeDto> getAll();


}

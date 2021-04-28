package se.lexicon.pet_clinic.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import se.lexicon.pet_clinic.dto.PetDto;
import se.lexicon.pet_clinic.repository.PetRepository;

import java.util.List;
import java.util.stream.Collectors;

public class PetServiceImpl {

    PetRepository petRepository;
    ModelMapper modelMapper;

    @Autowired
    public void setPetRepository(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    @Autowired
    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    private List<PetDto> findByPetTypeName(String petTypeName){
        return petRepository.findByPetType_NameIgnoreCase(petTypeName).stream().map(pet -> modelMapper.map(pet,PetDto.class)).collect(Collectors.toList());
    }

    private List<PetDto> findByOwnerFirstNameAndLastName(String firstName, String lastName){
        return petRepository.findByOwner_FirstNameIgnoreCaseAndOwner_LastNameIgnoreCase(firstName,lastName).stream().map(pet -> modelMapper.map(pet, PetDto.class)).collect(Collectors.toList());
    }

    private List<PetDto> findByOwnerTelephone (String Telephone){
        return petRepository.findByOwner_Telephone(Telephone).stream().map(pet -> modelMapper.map(pet,PetDto.class)).collect(Collectors.toList());
    }

}

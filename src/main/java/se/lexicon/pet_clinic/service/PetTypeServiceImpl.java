package se.lexicon.pet_clinic.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import se.lexicon.pet_clinic.dto.PetTypeDto;
import se.lexicon.pet_clinic.entity.PetType;
import se.lexicon.pet_clinic.repository.PetTypeRepository;


public class PetTypeServiceImpl {


    PetTypeRepository petTypeRepository;
    ModelMapper modelMapper;

    @Autowired
    public void setPetTypeRepository(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Autowired
    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //@Override
    public PetTypeDto save(PetTypeDto dto){
        if (dto == null) throw new IllegalArgumentException("PetTypeDto object should not be null");
        //if (dto.getId() != null) throw new IllegalArgumentException("Id should be null");
        PetType petTypeEntity = modelMapper.map(dto, PetType.class);
        PetType savedPetTypeEntity = petTypeRepository.save(petTypeEntity);
        PetTypeDto convertEntityToDto = modelMapper.map(savedPetTypeEntity, PetTypeDto.class);
        return convertEntityToDto;
    }

}

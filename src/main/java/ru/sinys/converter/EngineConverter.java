package ru.sinys.converter;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.sinys.dto.EngineDTO;
import ru.sinys.entity.Engine;
import ru.sinys.service.TestService;

@Mapper(componentModel = "spring")
abstract class EngineConverter {
    @Autowired
    private TestService testService;

    abstract EngineDTO convertToDTO(Engine src);

    abstract Engine convertToEntity(EngineDTO src);

    @AfterMapping
    public void setPower(Engine entity, @MappingTarget EngineDTO dto) {
        dto.setPower(testService.getPower());
    }

    @AfterMapping
    public void setPower(EngineDTO dto, @MappingTarget Engine entity) {
        entity.setPower(testService.getPower());
    }
}

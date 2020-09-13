package ru.sinys.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.sinys.dto.CarDTO;
import ru.sinys.entity.Car;

@Mapper
public interface CarConverter {
    CarConverter INSTANCE = Mappers.getMapper( CarConverter.class );

    @Mapping(source = "model", target = "modelName")
    CarDTO entityToDto(Car carEntity);
    @Mapping(source = "modelName", target = "model")
    Car dtoToEntity(CarDTO carDto);
}

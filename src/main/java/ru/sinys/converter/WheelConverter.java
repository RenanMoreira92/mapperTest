package ru.sinys.converter;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.sinys.dto.WheelDTO;
import ru.sinys.entity.Wheel;

@Mapper(componentModel = "spring")
public interface WheelConverter {
    WheelConverter INSTANCE = Mappers.getMapper(WheelConverter.class);

    WheelDTO entityToDTO(Wheel src);
    Wheel dtoToEntity(WheelDTO src);
}

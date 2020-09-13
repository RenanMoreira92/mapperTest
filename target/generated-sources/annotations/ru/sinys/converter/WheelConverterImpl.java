package ru.sinys.converter;

import javax.annotation.processing.Generated;
import ru.sinys.dto.WheelDTO;
import ru.sinys.entity.Wheel;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-13T23:20:07+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
public class WheelConverterImpl implements WheelConverter {

    @Override
    public WheelDTO entityToDTO(Wheel src) {
        if ( src == null ) {
            return null;
        }

        WheelDTO wheelDTO = new WheelDTO();

        wheelDTO.setDiameter( src.getDiameter() );
        wheelDTO.setId( src.getId() );

        return wheelDTO;
    }

    @Override
    public Wheel dtoToEntity(WheelDTO src) {
        if ( src == null ) {
            return null;
        }

        Wheel wheel = new Wheel();

        wheel.setDiameter( src.getDiameter() );
        wheel.setId( src.getId() );

        return wheel;
    }
}

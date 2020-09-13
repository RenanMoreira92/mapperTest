package ru.sinys.converter;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import ru.sinys.dto.CarDTO;
import ru.sinys.dto.WheelDTO;
import ru.sinys.entity.Car;
import ru.sinys.entity.Wheel;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-13T23:20:07+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
public class CarConverterImpl implements CarConverter {

    @Override
    public CarDTO entityToDto(Car carEntity) {
        if ( carEntity == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        carDTO.setModelName( carEntity.getModel() );
        carDTO.setId( carEntity.getId() );
        carDTO.setActive( carEntity.getActive() );
        carDTO.setWheels( wheelListToWheelDTOList( carEntity.getWheels() ) );

        return carDTO;
    }

    @Override
    public Car dtoToEntity(CarDTO carDto) {
        if ( carDto == null ) {
            return null;
        }

        Car car = new Car();

        car.setModel( carDto.getModelName() );
        car.setId( carDto.getId() );
        car.setActive( carDto.getActive() );
        car.setWheels( wheelDTOListToWheelList( carDto.getWheels() ) );

        return car;
    }

    protected WheelDTO wheelToWheelDTO(Wheel wheel) {
        if ( wheel == null ) {
            return null;
        }

        WheelDTO wheelDTO = new WheelDTO();

        wheelDTO.setDiameter( wheel.getDiameter() );
        wheelDTO.setId( wheel.getId() );

        return wheelDTO;
    }

    protected List<WheelDTO> wheelListToWheelDTOList(List<Wheel> list) {
        if ( list == null ) {
            return null;
        }

        List<WheelDTO> list1 = new ArrayList<WheelDTO>( list.size() );
        for ( Wheel wheel : list ) {
            list1.add( wheelToWheelDTO( wheel ) );
        }

        return list1;
    }

    protected Wheel wheelDTOToWheel(WheelDTO wheelDTO) {
        if ( wheelDTO == null ) {
            return null;
        }

        Wheel wheel = new Wheel();

        wheel.setDiameter( wheelDTO.getDiameter() );
        wheel.setId( wheelDTO.getId() );

        return wheel;
    }

    protected List<Wheel> wheelDTOListToWheelList(List<WheelDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Wheel> list1 = new ArrayList<Wheel>( list.size() );
        for ( WheelDTO wheelDTO : list ) {
            list1.add( wheelDTOToWheel( wheelDTO ) );
        }

        return list1;
    }
}

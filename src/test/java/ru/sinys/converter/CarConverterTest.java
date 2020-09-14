package ru.sinys.converter;

import org.junit.Test;
import ru.sinys.dto.CarDTO;
import ru.sinys.dto.WheelDTO;
import ru.sinys.entity.Car;
import ru.sinys.entity.Wheel;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarConverterTest {

    @Test
    public void simpleConvertToDto() {
        Car car = new Car(23, "Oka");
        car.setActive(true);
        car.setWheels(Arrays.asList(new Wheel(10, "first"), new Wheel(10, "second")));

        CarDTO dto = CarConverter.INSTANCE.entityToDto(car);

        assertThat(dto.getId()).isEqualTo(23);
        assertThat(dto.getModelName()).isEqualTo("Oka");
        assertThat(dto.getActive()).isEqualTo(true);
        assertThat(dto.getWheels())
                .hasSize(2)
                .extracting(WheelDTO::getId).containsExactlyInAnyOrder("first", "second");
    }

    @Test
    public void simpleConvertToEntity() {
        CarDTO carDto = new CarDTO();
        carDto.setId(123);
        carDto.setModelName("Kamaz");
        carDto.setActive(true);

        Car car = CarConverter.INSTANCE.dtoToEntity(carDto);

        assertThat(car.getId()).isEqualTo(123);
        assertThat(car.getModel()).isEqualTo("Kamaz");
        assertThat(car.getActive()).isEqualTo(true);
    }

}
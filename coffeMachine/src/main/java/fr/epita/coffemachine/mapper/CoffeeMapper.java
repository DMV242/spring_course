package fr.epita.coffemachine.mapper;

import fr.epita.coffemachine.dto.CoffeeDto;
import fr.epita.coffemachine.dto.CreateCoffeeDto;
import fr.epita.coffemachine.dto.UpdateCoffeeDto;
import fr.epita.coffemachine.entity.Coffee;
import org.mapstruct.*;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface CoffeeMapper {

    CoffeeDto toDto(Coffee coffee);


    @Mapping(target = "id", ignore = true)
    Coffee toEntity(CreateCoffeeDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    void updateEntity(@MappingTarget Coffee entity, UpdateCoffeeDto dto);


}


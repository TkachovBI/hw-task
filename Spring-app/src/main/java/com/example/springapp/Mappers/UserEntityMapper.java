package com.example.springapp.Mappers;

import com.example.springapp.Models.User;
import com.example.springapp.Models.UserEntity;
import org.mapstruct.*;

/**
 * Mapper to work with a {@link UserEntity}.
 */
@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.ERROR,
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        builder = @Builder(disableBuilder = true),
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserEntityMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    User fromEntity(UserEntity userEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    UserEntity toEntity(User user);
}

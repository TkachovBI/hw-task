package com.example.springapp.Mappers;

import com.example.springapp.Models.User;
import com.example.springapp.Models.UserRequest;
import com.example.springapp.Models.UserResponse;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.ERROR,
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        builder = @Builder(disableBuilder = true),
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "name", target = "name")
    User fromRequest(UserRequest userRequest);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    UserResponse toResponse(User user);
}

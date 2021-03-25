package com.cgi.starter.service.mapper;

import com.cgi.starter.domain.User;
import com.cgi.starter.repository.UserRepository;
import com.cgi.starter.service.dto.UserDto;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    @Autowired
    private UserRepository repository;

    @Named("getAudit")
    @BeforeMapping
    protected void getThumbnail(User user, @MappingTarget UserDto dto) {
        //Do something
    }

    @BeanMapping(qualifiedByName= "getAudit", ignoreByDefault = true)
    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    @Mapping(source = "email", target = "email")

    @Mapping(source = "fullName", target = "fullName")
    @Mapping(source = "dateOfBirth", target = "dateOfBirth")
    @Mapping(source = "address", target = "address")

//    @Mapping(source = "updatedBy", target = "updatedBy")
//    @Mapping(source = "updatedAt", target = "updatedAt")
//    @Mapping(source = "createdBy", target = "createdBy")
//    @Mapping(source = "createdAt", target = "createdAt")
    public abstract UserDto toDto(User user);
}

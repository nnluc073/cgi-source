package com.cgi.starter.service;

import com.cgi.starter.service.criteria.UserCriteria;
import com.cgi.starter.service.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDto create(UserDto dto);
    UserDto update(UserDto dto);
    Page<UserDto> findAll(UserCriteria criteria, Pageable pageable);
}

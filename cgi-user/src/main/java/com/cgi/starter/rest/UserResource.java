package com.cgi.starter.rest;

import com.cgi.starter.service.UserService;
import com.cgi.starter.service.criteria.UserCriteria;
import com.cgi.starter.service.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserResource {

    private final UserService service;

    @GetMapping("/findAll")
    public ResponseEntity<Page<UserDto>> findAll(UserCriteria criteria,  Pageable pageable) {
        Page<UserDto> page = service.findAll(criteria,pageable);
        return ResponseEntity.ok(page);
    }
}

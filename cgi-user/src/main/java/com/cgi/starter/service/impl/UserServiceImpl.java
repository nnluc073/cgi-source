package com.cgi.starter.service.impl;

import com.cgi.common.service.QueryService;
import com.cgi.starter.domain.User;
import com.cgi.starter.domain.User_;
import com.cgi.starter.repository.UserRepository;
import com.cgi.starter.service.UserService;
import com.cgi.starter.service.criteria.UserCriteria;
import com.cgi.starter.service.dto.UserDto;
import com.cgi.starter.service.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl extends QueryService<User> implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserDto create(UserDto dto) {
        return null;
    }

    @Override
    public UserDto update(UserDto dto) {
        return null;
    }

    @Override
    public Page<UserDto> findAll(UserCriteria criteria, Pageable pageable) {
        final Specification<User> specification = createSpecification(criteria);
        return repository.findAll(specification, pageable)
                .map(mapper::toDto);
    }


    protected Specification<User> createSpecification(UserCriteria criteria) {
        Specification<User> specification = Specification.where(null);
        if (criteria != null) {
            if (criteria.getEmail() != null) {
                specification = specification.and(buildStringSpecification(criteria.getEmail(), User_.email));
            }
            if (criteria.getUsername() != null) {
                specification = specification.and(buildStringSpecification(criteria.getUsername(), User_.username));
            }
            if (criteria.getEmail() != null) {
                specification = specification.and(buildStringSpecification(criteria.getEmail(), User_.email));
            }
            if (criteria.getFullName() != null) {
                specification = specification.and(buildStringSpecification(criteria.getFullName(), User_.fullName));
            }
        }
        return specification;
    }
}

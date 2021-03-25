package com.cgi.starter.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
public class BaseDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private UUID createdBy;
    private Instant createdAt;
    private UUID updatedBy;
    private Instant updatedAt;
}

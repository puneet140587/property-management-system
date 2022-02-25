package com.mycompany.propertymanagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {
    private Long id;
    private String ownerName;
    @NotNull(message = "Owner Email is Mandatory")
    @NotEmpty(message = "Owner email Cannot be empty")
    @Size(min = 1, max = 50, message = "Owner email should be between 1 TO 50 Character in length")
    private String ownerEmail;
    private String phone;
    @NotNull(message = "Password Cannot be null")
    @NotEmpty(message = "Password Cannot be empty")
    private String password;
}

package com.mycompany.propertymanagement.service;

import com.mycompany.propertymanagement.dto.PropertyDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PropertyService {

     PropertyDTO saveProperty(PropertyDTO propertyDTO);

     List<PropertyDTO> getAllProperties();

     List<PropertyDTO> getAllPropertiesOfaUser(Long userId);

     PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId);

     PropertyDTO updatePropertyDescription ( PropertyDTO propertyDTO, Long propertyId);

     PropertyDTO updatePropertyPrice ( PropertyDTO propertyDTO, Long propertyId);

     void deleteProperty(Long propertyId);

}

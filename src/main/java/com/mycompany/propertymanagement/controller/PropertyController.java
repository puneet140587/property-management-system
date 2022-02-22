package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.dto.PropertyDTO;
import com.mycompany.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PropertyController {

//    @Value("${pms.dummy}")
//    private String dummy;


    @Autowired
    PropertyService propertyService;

    @PostMapping("/properties")
    public ResponseEntity<PropertyDTO>  saveProperty(@RequestBody PropertyDTO propertyDTO) {
        propertyDTO = propertyService.saveProperty(propertyDTO);
        ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.CREATED);
        return responseEntity;
    }

    @GetMapping("/allproperty")
    public  ResponseEntity<List<PropertyDTO>> getAllProperties() {
//        System.out.println(dummy);
//        System.out.println("another"+dummy);
        List<PropertyDTO> propertyList = propertyService.getAllProperties();
        ResponseEntity<List<PropertyDTO>> responseEntity = new ResponseEntity<>(propertyList, HttpStatus.OK);
        return responseEntity;
    }

    @PutMapping("/property/{propertyID}")
    public ResponseEntity<PropertyDTO>  updateProperty(@RequestBody PropertyDTO propertyDTO, @PathVariable Long propertyID) {
        propertyDTO = propertyService.updateProperty(propertyDTO, propertyID);
        ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.OK);
        return responseEntity;
    }

    @PatchMapping("/property/update-description/{propertyId}")
    public  ResponseEntity<PropertyDTO> updatePropertyDescription (@RequestBody PropertyDTO propertyDTO, @PathVariable Long propertyId) {
        propertyDTO = propertyService.updatePropertyDescription(propertyDTO, propertyId);
        ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.OK);
        return responseEntity;
    }

    @PatchMapping("/property/update-price/{propertyId}")
    public   ResponseEntity<PropertyDTO> updatePropertyPrice (@RequestBody PropertyDTO propertyDTO, @PathVariable Long propertyId) {
        propertyDTO = propertyService.updatePropertyPrice(propertyDTO, propertyId);
        ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.OK);
        return responseEntity;
    }

    @DeleteMapping("/property/{propertyId}")
    public ResponseEntity deleteProperty(@PathVariable Long propertyId) {
        propertyService.deleteProperty(propertyId);
        ResponseEntity responseEntity = new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        return responseEntity;
    }

}

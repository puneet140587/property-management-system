package com.mycompany.propertymanagement.repository;

import com.mycompany.propertymanagement.entity.AddressEntity;
import com.mycompany.propertymanagement.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressEntity, Long>  {
}

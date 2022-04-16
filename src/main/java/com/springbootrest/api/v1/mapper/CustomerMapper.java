package com.springbootrest.api.v1.mapper;

import com.springbootrest.api.v1.model.CustomerDTO;
import com.springbootrest.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(target = "customerUrl", ignore = true)
    CustomerDTO customerToCustomerDTO(Customer customer);
}

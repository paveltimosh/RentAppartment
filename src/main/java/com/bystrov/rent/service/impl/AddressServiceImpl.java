package com.bystrov.rent.service.impl;

import com.bystrov.rent.dao.AddressDAO;
import com.bystrov.rent.domain.Address;
import com.bystrov.rent.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressDAO addressDAO;

    @Autowired
    public AddressServiceImpl(AddressDAO addressDAO){ this.addressDAO = addressDAO; }

    @Override
    public Address findById(Long id) {
        return null;
    }

    @Override
    public Address saveAddress(Address address) {
        return null;
    }

    @Override
    public void update(Address address) {

    }

    @Override
    public void delete(Address address) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
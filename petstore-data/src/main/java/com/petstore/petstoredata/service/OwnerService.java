package com.petstore.petstoredata.service;

import com.petstore.petstoredata.model.Owner;

import java.util.UUID;

public interface OwnerService extends CrudService<Owner, UUID> {
    Owner FindByName(String lastname);
}
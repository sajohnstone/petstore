package com.petstore.app.service;

import com.petstore.app.model.Owner;

import java.util.UUID;

public interface OwnerService extends CrudService<Owner, UUID> {
    Owner FindByName(String lastname);
}
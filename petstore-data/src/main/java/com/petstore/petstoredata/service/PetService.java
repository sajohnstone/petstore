package com.petstore.petstoredata.service;

import com.petstore.petstoredata.model.Pet;

import java.util.Set;
import java.util.UUID;

public interface PetService extends CrudService<Pet, UUID> {
}
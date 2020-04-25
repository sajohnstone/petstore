package com.petstore.app.service;

import com.petstore.app.model.Pet;

import java.util.Set;
import java.util.UUID;

public interface PetService extends CrudService<Pet, UUID> {
}
package com.petstore.petstoredata.service.map;

import com.petstore.petstoredata.model.*;
import com.petstore.petstoredata.service.*;


import java.util.Set;
import java.util.UUID;

public class PetServiceMap extends AbstractMapService<Pet, UUID> implements CrudService<Pet, UUID> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet FindById(UUID uuid) {
        return  super.findById(uuid);
    }

    @Override
    public Pet Save(Pet object) {
        return super.save(object.getID(), object);
    }

    @Override
    public void Delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void DeleteById(UUID uuid) {
        super.deleteById(uuid);
    }
}
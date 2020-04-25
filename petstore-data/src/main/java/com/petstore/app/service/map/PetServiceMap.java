package com.petstore.app.service.map;

import com.petstore.app.model.*;
import com.petstore.app.service.*;

import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class PetServiceMap extends AbstractMapService<Pet, UUID> implements PetService {
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
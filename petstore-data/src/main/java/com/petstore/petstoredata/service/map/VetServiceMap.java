package com.petstore.petstoredata.service.map;

import com.petstore.petstoredata.model.*;
import com.petstore.petstoredata.service.*;

import java.util.Set;
import java.util.UUID;

public class VetServiceMap extends AbstractMapService<Vet, UUID> implements CrudService<Vet, UUID> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet FindById(UUID uuid) {
        return  super.findById(uuid);
    }

    @Override
    public Vet Save(Vet object) {
        return super.save(object.getID(), object);
    }

    @Override
    public void Delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void DeleteById(UUID uuid) {
        super.deleteById(uuid);
    }
}
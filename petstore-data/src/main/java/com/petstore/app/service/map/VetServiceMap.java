package com.petstore.app.service.map;

import com.petstore.app.model.*;
import com.petstore.app.service.*;

import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class VetServiceMap extends AbstractMapService<Vet, UUID> implements VetService {
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
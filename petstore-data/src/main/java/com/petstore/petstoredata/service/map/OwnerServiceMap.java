package com.petstore.petstoredata.service.map;

import com.petstore.petstoredata.model.*;
import com.petstore.petstoredata.service.*;

import java.util.Set;
import java.util.UUID;

public class OwnerServiceMap extends AbstractMapService<Owner, UUID> implements CrudService<Owner, UUID> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner FindById(final UUID uuid) {
        return super.findById(uuid);
    }

    @Override
    public Owner Save(final Owner object) {
        return super.save(object.getID(), object);
    }

    @Override
    public void Delete(final Owner object) {
        super.delete(object);
    }

    @Override
    public void DeleteById(final UUID uuid) {
        super.deleteById(uuid);
    }
}
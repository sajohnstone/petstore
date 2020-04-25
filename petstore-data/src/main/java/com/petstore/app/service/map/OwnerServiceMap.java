package com.petstore.app.service.map;

import com.petstore.app.model.*;
import com.petstore.app.service.*;

import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, UUID> implements OwnerService {

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

    @Override
    public Owner FindByName(String lastname) {
      // TODO Auto-generated method stub
      return null;
    }
}
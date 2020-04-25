package com.petstore.petstoredata.model;

import java.io.Serializable;
import java.util.UUID;

public class BaseEntity implements Serializable {
    private UUID ID;

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }
}
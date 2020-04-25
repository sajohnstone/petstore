package com.petstore.petstoreweb.bootstrap;

import java.util.UUID;

import com.petstore.petstoredata.model.*;
import com.petstore.petstoredata.service.*;
import com.petstore.petstoredata.service.map.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader(OwnerService ownerService, VetService vetService ) {
    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override
  public void run(final String... args) throws Exception {
    final Owner owner1 = new Owner();
    owner1.setID(UUID.randomUUID());
    owner1.setFirstName("Tim");
    owner1.setLastName("Smith");
    ownerService.Save(owner1);

    final Owner owner2 = new Owner();
    owner2.setID(UUID.randomUUID());
    owner2.setFirstName("Joheny");
    owner2.setLastName("Long");
    ownerService.Save(owner2);

    System.out.println("Loaded Owners...");

    final Vet vet1 = new Vet();
    vet1.setID(UUID.randomUUID());
    vet1.setFirstName("Michelle");
    vet1.setLastName("Trap");
    vetService.Save(vet1);

    final Vet vet2 = new Vet();
    vet2.setID(UUID.randomUUID());
    vet2.setFirstName("Vicky");
    vet2.setLastName("Pompkin");
    vetService.Save(vet2);

    System.out.println("Loaded Vets...");
  }

}
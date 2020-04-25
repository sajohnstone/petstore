package com.petstore.petstoreweb.bootstrap;

import com.petstore.petstoredata.model.*;
import com.petstore.petstoredata.service.*;

public class DataLoader {
  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader(OwnerService ownerService, VetService vetService) {
      this.ownerService = ownerService;
      this.vetService = vetService;
  }
}
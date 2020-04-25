package com.petstore.app.controller;

import com.petstore.app.service.VetService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {
  private final VetService vetService;

  public VetController(VetService vetService) {
    this.vetService = vetService;
  }

  @RequestMapping({"", "/vets", "index", "/index.html"})
  public String listOwners(Model model) {

    model.addAttribute("vets", vetService.findAll());

    return "vets/index";
  }
}
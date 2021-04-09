package com.gm.vp.gettinglocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gm.vp.gettinglocation.model.Location;
import com.gm.vp.gettinglocation.repository.LocationRepository;

@Controller 
@RequestMapping(path="/truck")
public class MainController {
	
	  @Autowired 
	  private LocationRepository locationRepository;
	  
	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Location> getAllLocation() {
	    // This returns a JSON or XML with the users
	    return locationRepository.findAll();	
	  }
}

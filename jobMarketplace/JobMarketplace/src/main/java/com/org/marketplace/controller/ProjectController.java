package com.org.marketplace.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.marketplace.model.Buyer;
import com.org.marketplace.model.Project;
import com.org.marketplace.repository.BuyerRepository;
import com.org.marketplace.repository.ProjectRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@EnableAutoConfiguration
public class ProjectController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProjectController.class);

	@Autowired
	private ProjectRepository projectRepository;

	@Autowired
	private BuyerRepository buyerRepository;

	@GetMapping("/projects")
	Collection<Project> projects() {
		LOGGER.info("REST: get all projects");
		return projectRepository.findAll();
	}

	@GetMapping("/buyers")
	Collection<Buyer> buyers() {
		LOGGER.info("REST: get all projects");
		return buyerRepository.findAll();
	}

	@PostMapping("/projects/{id}")
	public void createProject() {
		LOGGER.info("REST: Create Project");
	}

	@GetMapping("/projects/{id}")
	public void getProject() {
		LOGGER.info("REST: Create Project");
	}

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}

/**
 * 
 */
package com.org.marketplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.marketplace.dao.ProjectDao;
import com.org.marketplace.model.Project;

/**
 * @author gauravkahadane
 *
 */
@Service
public class ProjectService {

	@Autowired
	private ProjectDao projectDao;

	public List<Project> getAllProjects() {
		return projectDao.getAllProjects(1);
	}

	public void createNewProject(Integer id, String name, String description) {
		Project project = new Project(id, name, description);
		projectDao.save(project);
	}
}
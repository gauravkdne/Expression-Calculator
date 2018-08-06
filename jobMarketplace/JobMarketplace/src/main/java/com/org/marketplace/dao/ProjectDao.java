/**
 * 
 */
package com.org.marketplace.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.org.marketplace.model.Project;

/**
 * @author gauravkahadane
 *
 */
@Transactional
public interface ProjectDao extends JpaRepository<Project, Integer> {
	@Query("SELECT p from Project p WHERE p.id = :id")
	List<Project> getAllProjects(@Param("id") Integer id);
}
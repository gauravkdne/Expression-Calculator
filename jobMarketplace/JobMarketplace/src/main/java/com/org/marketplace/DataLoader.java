/**
 * 
 */
package com.org.marketplace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.org.marketplace.model.Buyer;
import com.org.marketplace.model.Project;
import com.org.marketplace.repository.BuyerRepository;
import com.org.marketplace.repository.ProjectRepository;

/**
 * @author gauravkahadane
 *
 */
@Component
public class DataLoader implements CommandLineRunner {
	private final Logger LOGGER = LoggerFactory.getLogger(DataLoader.class);

	@Autowired
	private ProjectRepository projectRepo;

	@Autowired
	private BuyerRepository buyerRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Loading data into Projects");
		StringBuffer sb = new StringBuffer();
		sb.append('a');
		for (int i = 0; i < 10; i++) {
			String str = sb.toString();
			char ch = str.charAt(str.length() - 1);
			sb.append(++ch);
			projectRepo.save(new Project(i, sb.toString(), "My Project Description"));
		}

		sb = new StringBuffer();
		sb.append('a');
		for (int i = 0; i < 10; i++) {
			String str = sb.toString();
			char ch = str.charAt(str.length() - 1);
			sb.append(++ch);
			buyerRepository.save(new Buyer(i, sb.toString(), "My Project Description"));
		}
	}

}

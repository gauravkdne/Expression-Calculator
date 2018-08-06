/**
 * 
 */
package com.org.marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.org.marketplace.model.Buyer;

/**
 * @author gauravkahadane
 *
 */
@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

}

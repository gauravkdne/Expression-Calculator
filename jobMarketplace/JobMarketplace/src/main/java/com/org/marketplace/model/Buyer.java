/**
 * 
 */
package com.org.marketplace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author gauravkahadane
 *
 */
@Entity
@Data
@Table(name = "buyer")
public class Buyer {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;

	public Buyer() {
		super();
	}

	public Buyer(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

}

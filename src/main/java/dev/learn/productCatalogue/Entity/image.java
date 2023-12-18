package dev.learn.productCatalogue.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class image {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;

}

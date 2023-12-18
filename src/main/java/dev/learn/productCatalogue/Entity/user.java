package dev.learn.productCatalogue.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class user {
	
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private String name;
private String email;
private String type;



	
}

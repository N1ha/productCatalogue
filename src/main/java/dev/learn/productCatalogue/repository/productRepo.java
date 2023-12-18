package dev.learn.productCatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.learn.productCatalogue.Entity.product;

@Repository

public interface productRepo extends JpaRepository<product, Integer> {

}

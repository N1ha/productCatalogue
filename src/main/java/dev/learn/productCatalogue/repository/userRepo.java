package dev.learn.productCatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.learn.productCatalogue.Entity.user;

@Repository

public interface userRepo extends JpaRepository<user, Integer>{

}

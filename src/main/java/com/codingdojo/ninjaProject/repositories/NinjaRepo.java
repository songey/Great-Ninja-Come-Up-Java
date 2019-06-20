package com.codingdojo.ninjaProject.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.ninjaProject.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{
	
	List<Ninja> findAll();
	
}

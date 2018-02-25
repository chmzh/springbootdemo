package com.example.demo;

/**
 * @auth chenmingzhou
 */
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<City, Long>{

    List<City> findByName(String name);

    City save(City city);
}

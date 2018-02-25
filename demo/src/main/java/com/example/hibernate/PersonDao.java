package com.example.demo;

/**
 * @auth chenmingzhou
 */
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<City, Long>{

    List<City> findByName(String name);

    City save(City city);
    
    @Query(value = "select * from city where id=:id" , nativeQuery = true)
    City getCity(@Param("id") Long id);

    @Query(value = "update city set name=?1 where id=?2 ", nativeQuery = true)
    @Modifying
    int updateName(String name,long id);

    @Query(value = "delete from city1 where id=?1 ", nativeQuery = true)
    @Modifying
    int deleteCity(long id);
}

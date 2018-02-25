package com.example.mapper;

/**
 * @auth chenmingzhou
 */
import com.example.domain.City;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CityMapper {

    @Select("select * from city where id = #{id}")
    City findCityById(@Param("id") String id);
}

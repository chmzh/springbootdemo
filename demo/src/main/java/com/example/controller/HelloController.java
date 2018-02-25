package com.example.controller;

/**
 * @auth chenmingzhou
 */

import com.example.domain.City;
import com.example.mapper.CityMapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
@EnableAutoConfiguration
public class HelloController {
    @Resource
    //@Autowired
    private CityMapper cityMapper;
    @RequestMapping("/findCity")
    City findCity2(@RequestParam String id){
        return cityMapper.findCityById(id);
    }
}

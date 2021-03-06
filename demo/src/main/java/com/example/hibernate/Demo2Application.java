package com.example.demo;

/**
 * @auth chenmingzhou
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Demo2Application {
    @Autowired
    PersonDao dao;

    @RequestMapping("/get")
    @Transactional
    public City getP(long id){
//        City city = new City();
//        city.setName("abc");
//        city.setProvince("abc");
//        dao.save(city);
        int i = dao.updateName("你好",2);
        dao.deleteCity(2L);
        City person = dao.getCity(id);
        return person;
    }
    @RequestMapping("/")
    public String index(){
        return "Hello Spring Boot";
    }
    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }
}

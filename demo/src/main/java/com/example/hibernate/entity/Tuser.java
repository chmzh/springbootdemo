package com.example.hibernate.entity;

import javax.persistence.*;

/**
 * @auth chenmingzhou
 */
@Entity
@Table(name = "t_user")
public class Tuser implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String passWord;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "nickname")
    private String nickName;

    // 省略getter 和 setter

}


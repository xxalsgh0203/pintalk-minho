package com.pintalk.home.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "UserMember")
@Entity
public class UserMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(name = "id")
    private String id;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "ssn")
    private int ssn;
    @Column(name = "ssn1")
    private int ssn1;

    @Column(name = "ssn2")
    private int ssn2;

    @Column(name = "phone1")
    private int phone1;

    @Column(name = "phone2")
    private int phone2;

    @Column(name = "phone3")
    private int phone3;

    @Column(name = "email")
    private String email;
    @Column(name = "gender")
    private String gender;

    @Column(name = "address1")
    private String address1;
    @Column(name = "address2")
    private String address2;

    @Column(name = "job_key")
    private String job_key;

    private String reg_date;

    private String update_date;

    @Column(name = "status")
    private String status;
    @Column(name = "erp_no")
    private String erp_no;


}

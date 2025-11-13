package com.sk.collegeErp.userManagement.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Roles implements Serializable {


    private static final long serialVersionUID=1L;


    @Id
    @GeneratedValue(strategy  =GenerationType.UUID)
    @Column(length = 36)
    private String id;

    private String name;



}
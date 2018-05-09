package com.tech.application.dictionary.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Region implements Serializable {
    private String id;

    private String code;

    private String fullname;

    private String shortname;

    private Integer level;

    private String parentCode;

    private Integer sort;

    private String spellFullname;

    private String spellAbbreviation;

    private String spellFirstCharacter;

    private Date createTime;

    private Date updateTime;

}
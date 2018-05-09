package com.tech.application.dictionary.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegionTreeVO implements Serializable{

    private static final long serialVersionUID = 2575224024969661759L;
    /**
     * 类型编码
     */
    private String value;

    /**
     * 类型编码
     */
    private String label;

    /***
     * 子类型
     */
    private List<RegionTreeVO> children;


}

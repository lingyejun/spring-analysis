package com.lingyejun.analysis.domain;

import java.io.Serializable;

/**
 * @Author: lingyejun
 * @Date: 2020/2/5
 * @Describe:
 * @Modified By:
 */
public class UserDto implements Serializable {

    private String name;

    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

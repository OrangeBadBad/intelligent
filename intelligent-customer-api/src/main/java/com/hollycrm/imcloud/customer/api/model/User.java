package com.hollycrm.imcloud.customer.api.model;

/**
 * @author pengzc
 * @Description: 用户 测试
 * @date 2018/11/2413:25
 */
public class User {

    private long id;
    private String name;
    private Integer age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

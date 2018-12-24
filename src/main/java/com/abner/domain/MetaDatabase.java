package com.abner.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author
 * @since 2018-11-28 18:49
 */
@Entity
@Table
public class MetaDatabase {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String local;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "MetaDatabase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}

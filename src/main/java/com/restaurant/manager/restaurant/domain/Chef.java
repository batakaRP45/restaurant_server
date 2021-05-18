package com.restaurant.manager.restaurant.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;
//import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="mn_chef")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Chef implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MN_CHEF_SEQ")
    @SequenceGenerator(name = "MN_CHEF_SEQ", sequenceName = "MN_CHEF_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private int sex;

    public Chef() {
        super();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the sex
     */
    public int getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", sex='" + getSex() + "'" +
            "}";
    }

}

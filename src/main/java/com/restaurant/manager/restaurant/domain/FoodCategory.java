package com.restaurant.manager.restaurant.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="mn_food_category")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class FoodCategory implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUTO_INCREMENT_SEQUENCE_3")
    @SequenceGenerator(name = "AUTO_INCREMENT_SEQUENCE_3", sequenceName = "AUTO_INCREMENT_SEQUENCE_3", allocationSize = 1)
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "created_by")
    private String created_by;

    @Column(name = "food_category_img")
    private String food_category_img;

    public FoodCategory() {
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
     * @return String return the created_by
     */
    public String getCreated_by() {
        return created_by;
    }

    /**
     * @param created_by the created_by to set
     */
    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", created_by='" + getCreated_by() + "'" +
            "}";
    }


    /**
     * @return String return the food_category_img
     */
    public String getFood_category_img() {
        return food_category_img;
    }

    /**
     * @param food_category_img the food_category_img to set
     */
    public void setFood_category_img(String food_category_img) {
        this.food_category_img = food_category_img;
    }

}

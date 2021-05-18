package com.restaurant.manager.restaurant.service.dto;

import java.io.Serializable;
import java.util.Objects;

import io.github.jhipster.service.Criteria;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;

public class FoodCriteria implements Serializable, Criteria {
private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter name;

    private LongFilter price;

    private StringFilter description;

    private FloatFilter rate;

    private StringFilter food_img;

    private LongFilter food_vote_quantity;

    private FloatFilter food_last_vote;

    // private Date created_at;

    private StringFilter created_by;

    private LongFilter food_category_id;


    public FoodCriteria() {
    }


    public FoodCriteria(FoodCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.name = other.name == null ? null : other.name.copy();
        this.price = other.price == null ? null : other.price.copy();
        this.description = other.description == null ? null : other.description.copy();
        this.rate = other.rate == null ? null : other.rate.copy();
        this.food_img = other.food_img == null ? null : other.food_img.copy();
        this.food_vote_quantity = other.food_vote_quantity == null ? null : other.food_vote_quantity.copy();
        this.food_last_vote = other.food_last_vote == null ? null : other.food_last_vote.copy();
        this.created_by = other.created_by == null ? null : other.created_by.copy();
        this.food_category_id = other.food_category_id == null ? null : other.food_category_id.copy();
    }


@Override
public FoodCriteria copy() {
    return new FoodCriteria(this);
}


    /**
     * @return LongFilter return the id
     */
    public LongFilter getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(LongFilter id) {
        this.id = id;
    }

    /**
     * @return StringFilter return the name
     */
    public StringFilter getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(StringFilter name) {
        this.name = name;
    }

    /**
     * @return StringFilter return the description
     */
    public StringFilter getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(StringFilter description) {
        this.description = description;
    }

    /**
     * @return FloatFilter return the rate
     */
    public FloatFilter getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(FloatFilter rate) {
        this.rate = rate;
    }

    /**
     * @return StringFilter return the food_img
     */
    public StringFilter getFood_img() {
        return food_img;
    }

    /**
     * @param food_img the food_img to set
     */
    public void setFood_img(StringFilter food_img) {
        this.food_img = food_img;
    }

    /**
     * @return LongFilter return the food_vote_quantity
     */
    public LongFilter getFood_vote_quantity() {
        return food_vote_quantity;
    }

    /**
     * @param food_vote_quantity the food_vote_quantity to set
     */
    public void setFood_vote_quantity(LongFilter food_vote_quantity) {
        this.food_vote_quantity = food_vote_quantity;
    }

    /**
     * @return FloatFilter return the food_last_vote
     */
    public FloatFilter getFood_last_vote() {
        return food_last_vote;
    }

    /**
     * @param food_last_vote the food_last_vote to set
     */
    public void setFood_last_vote(FloatFilter food_last_vote) {
        this.food_last_vote = food_last_vote;
    }

    /**
     * @return StringFilter return the created_by
     */
    public StringFilter getCreated_by() {
        return created_by;
    }

    /**
     * @param created_by the created_by to set
     */
    public void setCreated_by(StringFilter created_by) {
        this.created_by = created_by;
    }

    /**
     * @return LongFilter return the food_category_id
     */
    public LongFilter getFood_category_id() {
        return food_category_id;
    }

    /**
     * @param food_category_id the food_category_id to set
     */
    public void setFood_category_id(LongFilter food_category_id) {
        this.food_category_id = food_category_id;
    }


    /**
     * @return LongFilter return the price
     */
    public LongFilter getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(LongFilter price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final FoodCriteria foodCriteria = (FoodCriteria) o;
        return Objects.equals(id, foodCriteria.id) && Objects.equals(name, foodCriteria.name) && Objects.equals(price, foodCriteria.price) && Objects.equals(description, foodCriteria.description) && Objects.equals(rate, foodCriteria.rate) && Objects.equals(food_img, foodCriteria.food_img) && Objects.equals(food_vote_quantity, foodCriteria.food_vote_quantity) && Objects.equals(food_last_vote, foodCriteria.food_last_vote) && Objects.equals(created_by, foodCriteria.created_by) && Objects.equals(food_category_id, foodCriteria.food_category_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, description, rate, food_img, food_vote_quantity, food_last_vote, created_by, food_category_id);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", description='" + getDescription() + "'" +
            ", rate='" + getRate() + "'" +
            ", food_img='" + getFood_img() + "'" +
            ", food_vote_quantity='" + getFood_vote_quantity() + "'" +
            ", food_last_vote='" + getFood_last_vote() + "'" +
            ", created_by='" + getCreated_by() + "'" +
            ", food_category_id='" + getFood_category_id() + "'" +
            "}";
    }

}

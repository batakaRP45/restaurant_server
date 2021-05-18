package com.restaurant.manager.restaurant.domain;
import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Food.class)
public abstract class Food_ {
	public static volatile SingularAttribute<Food, Long> id;
    public static volatile SingularAttribute<Food, String> name;
    public static volatile SingularAttribute<Food, String> description;
    public static volatile SingularAttribute<Food, Long> price;
    public static volatile SingularAttribute<Food, Float> rate;
    public static volatile SingularAttribute<Food, String> food_img;
    public static volatile SingularAttribute<Food, Long> food_vote_quantity;
    public static volatile SingularAttribute<Food, Float> food_last_vote;
    public static volatile SingularAttribute<Food, Date> created_at;
    public static volatile SingularAttribute<Food, String> created_by;
    public static volatile SingularAttribute<Food, Long> food_category_id;

	public static final String PRICE = "price";
	public static final String RATE = "rate";
	public static final String FOOD_IMG = "food_img";
	public static final String NAME = "name";
	public static final String FOOD_VOTE_QUANTITY = "food_vote_quantity";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String CREATED_AT = "created_at";
	public static final String CREATED_BY = "created_by";
	public static final String FOOD_CATEGORY_ID = "food_category_id";

}



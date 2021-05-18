package com.restaurant.manager.restaurant.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "mn_table_origin")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TableOrigin implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MN_TABLE_ORIGIN_SEQ")
    @SequenceGenerator(name = "MN_TABLE_ORIGIN_SEQ", sequenceName = "MN_TABLE_ORIGIN_SEQ", allocationSize = 1)
    private Long id;

    @NotNull
    @Column(name = "position", nullable = false, unique = true)
    private int position;

    @NotNull
    @Column(name = "people_quantity", nullable = false, unique = true)
    private int peopleQuantity;

    @OneToMany(mappedBy = "tableOrigin")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = "tableOrigin", allowSetters = true)
    private Set<TableE> table = new HashSet<>();

    public TableOrigin() {
        super();
    }


    public TableOrigin(Long id, int position, int peopleQuantity) {
        this.id = id;
        this.position = position;
        this.peopleQuantity = peopleQuantity;
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
     * @return int return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * @return int return the peopleQuantity
     */
    public int getPeopleQuantity() {
        return peopleQuantity;
    }

    /**
     * @param peopleQuantity the peopleQuantity to set
     */
    public void setPeopleQuantity(int peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }


    /**
     * @return Set<TableE> return the table
     */
    public Set<TableE> getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(Set<TableE> table) {
        this.table = table;
    }

}

package com.restaurant.manager.restaurant.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
// import java.util.HashSet;
// import java.util.Set;
import java.sql.Date;

@Entity
@Table(name = "mn_table")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TableE implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MN_TABLE_SEQ")
    @SequenceGenerator(name = "MN_TABLE_SEQ", sequenceName = "MN_TABLE_SEQ", allocationSize = 1)
    private Long id;

    @NotNull
    @Column(name = "status", nullable = false, unique = true)
    private Boolean status;

    // @NotNull
    // @Column(name = "table_origin_id", nullable = false, unique = true)
    // private Long tableOriginId;

    @Column(name = "time_created")
    private Date timeCreated;

    @Column(name = "time_booking")
    private Date timeBooking;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonIgnoreProperties(value = "table", allowSetters = true)
    private Customer customer;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonIgnoreProperties(value = "table", allowSetters = true)
    private TableOrigin tableOrigin;

    public TableE() {
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
     * @return Customer return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return Customer return the customer
     */
    public TableOrigin getTableOrigin() {
        return tableOrigin;
    }

    /**
     * @param customer the customer to set
     */
    public void setTableOrigin(TableOrigin tableOrigin) {
        this.tableOrigin = tableOrigin;
    }

    /**
     * @return Boolean return the status
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", status='" + isStatus() + "'" + ", customer='" + getCustomer() + "'"
                + "}";
    }

    /**
     * @return Date return the timeCreated
     */
    public Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * @param timeCreated the timeCreated to set
     */
    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * @return Date return the timeBooking
     */
    public Date getTimeBooking() {
        return timeBooking;
    }

    /**
     * @param timeBooking the timeBooking to set
     */
    public void setTimeBooking(Date timeBooking) {
        this.timeBooking = timeBooking;
    }

    // /**
    //  * @return int return the tableOriginId
    //  */
    // public Long getTableOriginId() {
    //     return tableOriginId;
    // }

    // /**
    //  * @param tableOriginId the tableOriginId to set
    //  */
    // public void setTableOriginId(Long tableOriginId) {
    //     this.tableOriginId = tableOriginId;
    // }

}

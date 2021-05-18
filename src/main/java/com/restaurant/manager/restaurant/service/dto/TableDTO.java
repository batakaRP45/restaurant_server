package com.restaurant.manager.restaurant.service.dto;

import java.io.Serializable;
import java.sql.Date;

public class TableDTO implements Serializable{
    private static final long serialVersionUID = -2832800658180696417L;

    private Long id;

    private Boolean status;

    private Long customer_id;

    private String customer_name;

    private String customer_phone;

    private String customer_email;

    private String customer_address;

    private Long table_Origin_Id;

    private int table_Origin_position;

    private int table_Origin_quantity;

    private Long tableOriginId;

    private Date timeCreated;

    private Date timeBooking;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public TableDTO() {
        super();
    }



    public TableDTO(Long id, Boolean status, Long customer_id, String customer_name, String customer_phone, String customer_email, String customer_address, Long table_Origin_Id, int table_Origin_position, int table_Origin_quantity, Long tableOriginId, Date timeCreated, Date timeBooking) {
        this.id = id;
        this.status = status;
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.customer_address = customer_address;
        this.table_Origin_Id = table_Origin_Id;
        this.table_Origin_position = table_Origin_position;
        this.table_Origin_quantity = table_Origin_quantity;
        this.tableOriginId = tableOriginId;
        this.timeCreated = timeCreated;
        this.timeBooking = timeBooking;
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

    /**
     * @return Long return the customer_id
     */
    public Long getCustomer_id() {
        return customer_id;
    }

    /**
     * @param customer_id the customer_id to set
     */
    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * @return String return the customer_name
     */
    public String getCustomer_name() {
        return customer_name;
    }

    /**
     * @param customer_name the customer_name to set
     */
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    /**
     * @return String return the customer_phone
     */
    public String getCustomer_phone() {
        return customer_phone;
    }

    /**
     * @param customer_phone the customer_phone to set
     */
    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", status='" + isStatus() + "'" +
            ", customer_id='" + getCustomer_id() + "'" +
            ", customer_name='" + getCustomer_name() + "'" +
            ", customer_phone='" + getCustomer_phone() + "'" +
            "}";
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


    /**
     * @return String return the customer_email
     */
    public String getCustomer_email() {
        return customer_email;
    }

    /**
     * @param customer_email the customer_email to set
     */
    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    /**
     * @return String return the customer_address
     */
    public String getCustomer_address() {
        return customer_address;
    }

    /**
     * @param customer_address the customer_address to set
     */
    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }


    /**
     * @return Long return the table_Origin_Id
     */
    public Long getTable_Origin_Id() {
        return table_Origin_Id;
    }

    /**
     * @param table_Origin_Id the table_Origin_Id to set
     */
    public void setTable_Origin_Id(Long table_Origin_Id) {
        this.table_Origin_Id = table_Origin_Id;
    }

    /**
     * @return int return the table_Origin_position
     */
    public int getTable_Origin_position() {
        return table_Origin_position;
    }

    /**
     * @param table_Origin_position the table_Origin_position to set
     */
    public void setTable_Origin_position(int table_Origin_position) {
        this.table_Origin_position = table_Origin_position;
    }

    /**
     * @return int return the table_Origin_quantity
     */
    public int getTable_Origin_quantity() {
        return table_Origin_quantity;
    }

    /**
     * @param table_Origin_quantity the table_Origin_quantity to set
     */
    public void setTable_Origin_quantity(int table_Origin_quantity) {
        this.table_Origin_quantity = table_Origin_quantity;
    }


    /**
     * @return Long return the tableOriginId
     */
    public Long getTableOriginId() {
        return tableOriginId;
    }

    /**
     * @param tableOriginId the tableOriginId to set
     */
    public void setTableOriginId(Long tableOriginId) {
        this.tableOriginId = tableOriginId;
    }

}

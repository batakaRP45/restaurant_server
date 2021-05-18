package com.restaurant.manager.restaurant.service.dto;

public class CustomerDTO {
    private Long id;

    private String phone_number;

    private String name;

    private String email;

    private String address;

    private Long tableId;


    public CustomerDTO() {
        super();
    }


    public CustomerDTO(Long id, String phone_number, String name, String email, String address, Long tableId) {
        this.id = id;
        this.phone_number = phone_number;
        this.name = name;
        this.email = email;
        this.address = address;
        this.tableId = tableId;
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
     * @return String return the phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * @return Long return the tableId
     */
    public Long getTableId() {
        return tableId;
    }

    /**
     * @param tableId the tableId to set
     */
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

}

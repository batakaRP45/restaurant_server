package com.restaurant.manager.restaurant.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "mn_table")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TableEn implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MN_TABLE_SEQ")
    @SequenceGenerator(name = "MN_TABLE_SEQ", sequenceName = "MN_TABLE_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "time_created")
    private Date timeCreated;

    @NotNull
    @Column(name = "time_booking", nullable = false, unique = true)
    private Date timeBooking;

    @NotNull
    @Column(name = "customer_id", nullable = false, unique = true)
    private Long customId;

    @NotNull
    @Column(name = "table_origin_id", nullable = false, unique = true)
    private Long tableId;

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
     * @return Long return the customId
     */
    public Long getCustomId() {
        return customId;
    }

    /**
     * @param customId the customId to set
     */
    public void setCustomId(Long customId) {
        this.customId = customId;
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

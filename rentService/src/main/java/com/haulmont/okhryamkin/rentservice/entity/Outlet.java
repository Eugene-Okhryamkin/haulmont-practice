package com.haulmont.okhryamkin.rentservice.entity;

import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "OUTLET")
@Entity
public class Outlet {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "OUTLET_NUMBER", nullable = false, unique = true)
    @NotNull
    private String outletNumber;

    @NotNull
    @Column(name = "FLOOR_", nullable = false)
    private Integer floor;

    @NotNull
    @Column(name = "AREA_", nullable = false)
    private Double area;

    @NotNull
    @Column(name = "COST", nullable = false)
    private Integer cost;

    @DeletedBy
    @Column(name = "DELETED_BY")
    private String deletedBy;

    @DeletedDate
    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedDate;

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getArea() {
        return area;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getCost() {
        return cost;
    }

    public String getOutletNumber() {
        return outletNumber;
    }

    public void setOutletNumber(String outletNumber) {
        this.outletNumber = outletNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
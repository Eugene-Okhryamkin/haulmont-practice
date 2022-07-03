package com.haulmont.okhryamkin.rentservice.entity;

import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "CONTRACT", indexes = {
        @Index(name = "IDX_CONTRACT_CLIENT_ID", columnList = "CLIENT_ID"),
        @Index(name = "IDX_CONTRACT_OUTLET_ID", columnList = "OUTLET_ID")
})
@Entity
public class Contract {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "CLIENT_ID", nullable = false)
    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private Client client;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "DATE_OF_START", nullable = false)
    private Date dateOfStart;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "DATE_OF_END", nullable = false)
    private Date dateOfEnd;

    @JoinColumn(name = "OUTLET_ID", nullable = false)
    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private Outlet outlet;

    @DeletedBy
    @Column(name = "DELETED_BY")
    private String deletedBy;

    @DeletedDate
    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedDate;

    public void setDateOfStart(Date dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Date getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfEnd(Date dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public Date getDateOfEnd() {
        return dateOfEnd;
    }

    public Outlet getOutlet() {
        return outlet;
    }

    public void setOutlet(Outlet outlet) {
        this.outlet = outlet;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
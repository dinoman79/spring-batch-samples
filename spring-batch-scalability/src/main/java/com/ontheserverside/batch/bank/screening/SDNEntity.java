package com.ontheserverside.batch.bank.screening;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Immutable
@Table(name = "SDN_ENTITY")
public final class SDNEntity {

    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ALTERNATE_NAME")
    private String alternateName;

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getAlternateName() {
        return this.alternateName;
    }
}
package com.midhun.SpringCRUDAssignment.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    private int id;
    private String name;
    private String phone;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Address homeAddressId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Address officeAddressId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getHomeAddressId() {
        return homeAddressId;
    }

    public void setHomeAddressId(Address homeAddressId) {
        this.homeAddressId = homeAddressId;
    }

    public Address getOfficeAddressId() {
        return officeAddressId;
    }

    public void setOfficeAddressId(Address officeAddressId) {
        this.officeAddressId = officeAddressId;
    }
}

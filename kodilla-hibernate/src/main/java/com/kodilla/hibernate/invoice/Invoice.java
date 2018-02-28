package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "INVOICES")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "NUMBER")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @OneToMany(mappedBy = "invoice", fetch = FetchType.EAGER)
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

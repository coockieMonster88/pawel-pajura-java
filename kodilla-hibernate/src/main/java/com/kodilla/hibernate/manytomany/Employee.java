package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.persistence.criteria.From;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@NamedQueries({
        @NamedQuery(
                name="Employee.retrieveEmployeesWithNames",
                query = "FROM Employee WHERE lastName = :LASTNAME"
        )
})

@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private List<Company> companies = new ArrayList<>();

    public Employee() {
    }

    public Employee(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_COMPANU_EMPLOYEE_ID",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")}
    )
    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "EMPLOYEE_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstName;
    }

    @NotNull
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastName;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    private void setLastname(String lastname) {
        this.lastName = lastname;
    }
}
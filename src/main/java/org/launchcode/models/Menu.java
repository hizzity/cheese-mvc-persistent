package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Menu {

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @Id //sets as id in table
    @GeneratedValue //generated on it own
    private int id;

    @ManyToMany
    private List<Cheese> cheeses; //holds all items in menu

    public void addItem(Cheese name) { //not sure if this is complete TODO
    }

    public Menu(String name) { this.name = name; }

    public Menu(){} //empty default constructor, always needed for hybernate...I think



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCheeses(List<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }


}

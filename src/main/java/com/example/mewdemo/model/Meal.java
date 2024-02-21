package com.example.mewdemo.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "meal")
@SecondaryTable( name="allergens", pkJoinColumns = @PrimaryKeyJoinColumn(name="meal_id"))
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long id;
    String name;
    String description;
    BigDecimal price;
    Allergens allergens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Allergens getAllergens() {
        return allergens;
    }

    public void setAllergens(Allergens allergens) {
        this.allergens = allergens;
    }

}

@Embeddable
class Allergens {
    @Column(name="peanuts",table="allergens")
    boolean peanuts;
    @Column(name="milk",table="allergens")
    boolean milk;
    @Column(name="egg",table="allergens")
    boolean egg;

    public boolean isPeanuts() {
        return peanuts;
    }

    public void setPeanuts(boolean peanuts) {
        this.peanuts = peanuts;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isEgg() {
        return egg;
    }

    public void setEgg(boolean egg) {
        this.egg = egg;
    }
}

package com.product.productservice.inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="st_mentors")
@DiscriminatorValue(value="2")
public class Mentor extends User {
    String company;
}
package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
@Id
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

}

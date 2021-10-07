package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
@Entity
@Table(name="items")
public class ListItem {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;
	
	public ListItem() {
		super();
	}
	
	public ListItem(int id, String store, String item) {
		super();
		this.id = id;
		this.store = store;
		this.item = item;
	}
	
	public ListItem(String store, String item) {
		super();
		this.store = store;
		this.item = item;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	@Override
	public String toString() {
		return "ListItem [id=" + id + ", part=" + store + ", price=" + item + "]";
	}
	
	public String returnItemDetails( ) {
		return this.store + ": " + this.item;
	}
}

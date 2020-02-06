package com.rvs.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "item")
public class Item implements Serializable{
    public Item() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "team_Sequence")
    @SequenceGenerator(name = "team_Sequence", sequenceName = "TEAM_SEQ")
    private long id;
    
    @NotNull
    @Size(max = 65)
    @Column(name = "itemype")
	private String itemype;
    
    @NotNull
    @Size(max = 65)
    @Column(name = "itemname")
	private String itemName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemype() {
		return itemype;
	}

	public void setItemype(String itemype) {
		this.itemype = itemype;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Item(@NotNull @Size(max = 65) String itemype, @NotNull @Size(max = 65) String itemName) {
		super();
		this.itemype = itemype;
		this.itemName = itemName;
	}
	
	
	
}

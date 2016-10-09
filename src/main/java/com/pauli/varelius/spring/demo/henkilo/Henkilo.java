package com.pauli.varelius.spring.demo.henkilo;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Henkilo extends AbstractPersistable<Long> {

	private String nimi;
	
	public Henkilo(String nimi) {
		this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
}

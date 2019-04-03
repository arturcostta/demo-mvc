package com.example.demo.domain;

import java.io.Serializable;
import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {

	private static final long serialVersionUID = -5041243403642451756L;
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private ID Id;

	public ID getId() {
		return Id;
	}

	public void setId(ID id) {
		Id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntity<?> other = (AbstractEntity<?>) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Id=" + Id ;
	}
	
	
	
}

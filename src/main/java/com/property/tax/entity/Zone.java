package com.property.tax.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Zone {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String zoneName;
	@OneToMany
	private List<TaxValue> taxValues;

	public Zone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Zone(Long id, String zoneName, List<TaxValue> taxValues) {
		super();
		this.id = id;
		this.zoneName = zoneName;
		this.taxValues = taxValues;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZoneName() {
		return zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	public List<TaxValue> getTaxValues() {
		return taxValues;
	}

	public void setTaxValues(List<TaxValue> taxValues) {
		this.taxValues = taxValues;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((taxValues == null) ? 0 : taxValues.hashCode());
		result = prime * result + ((zoneName == null) ? 0 : zoneName.hashCode());
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
		Zone other = (Zone) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (taxValues == null) {
			if (other.taxValues != null)
				return false;
		} else if (!taxValues.equals(other.taxValues))
			return false;
		if (zoneName == null) {
			if (other.zoneName != null)
				return false;
		} else if (!zoneName.equals(other.zoneName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Zone [id=" + id + ", zoneName=" + zoneName + ", taxValues=" + taxValues + "]";
	}

}

package org.freemarker.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_gender")
public class Gender extends BaseEntity {
	private static final long serialVersionUID = -6476907949709308858L;

	@Column(name = "gender_label", nullable = false)
	private String genderLabel;

	@Column(name = "gender_value", nullable = false)
	private int genderValue;

	public String getGenderLabel() {
		return genderLabel;
	}

	public void setGenderLabel(String genderLabel) {
		this.genderLabel = genderLabel;
	}

	public int getGenderValue() {
		return genderValue;
	}

	public void setGenderValue(int genderValue) {
		this.genderValue = genderValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((genderLabel == null) ? 0 : genderLabel.hashCode());
		result = prime * result + genderValue;
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
		Gender other = (Gender) obj;
		if (genderLabel == null) {
			if (other.genderLabel != null)
				return false;
		} else if (!genderLabel.equals(other.genderLabel))
			return false;
		if (genderValue != other.genderValue)
			return false;
		return true;
	}
}

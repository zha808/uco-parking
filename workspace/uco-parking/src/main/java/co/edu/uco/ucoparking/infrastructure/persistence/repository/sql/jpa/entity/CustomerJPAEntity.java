package co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "")
public class CustomerJPAEntity {
	
	@Id
	@Column(name = "id")
	private UUID id;
	
	@ManyToOne
	@JoinColumn(name = "organization_id")
	private OrganizationJPAEntity organization;
	
	@ManyToOne
	@JoinColumn(name = "id_type")
	private IdTypeJPAEntity idType;
	
	@Column(name = "id_number")
	private String idNumber;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	

	public CustomerJPAEntity(UUID id, OrganizationJPAEntity organization, IdTypeJPAEntity idType, String idNumber,
			String fullName, String email, String phoneNumber) {
		super();
		setId(id);
		setOrganization(organization);
		setIdType(idType);
		setIdNumber(idNumber);
		setFullName(fullName);
		setEmail(email);
		setPhoneNumber(phoneNumber);
	}

	public UUID getId() {
		return id;
	}

	public OrganizationJPAEntity getOrganization() {
		return organization;
	}

	public IdTypeJPAEntity getIdType() {
		return idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	private void setId(UUID id) {
		this.id = id;
	}

	private void setOrganization(OrganizationJPAEntity organization) {
		this.organization = organization;
	}

	private void setIdType(IdTypeJPAEntity idType) {
		this.idType = idType;
	}

	private void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	private void setFullName(String fullName) {
		this.fullName = fullName;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}

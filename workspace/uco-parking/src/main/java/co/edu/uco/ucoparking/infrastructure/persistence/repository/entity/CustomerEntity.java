package co.edu.uco.ucoparking.infrastructure.persistence.repository.entity;

import java.util.UUID;

public class CustomerEntity {
	
	private UUID id;
	private OrganizationEntity organization;
	private IdTypeEntity idType;
	private String idNumber;
	private String fullName;
	private String email;
	private String phoneNumber;
	
	
	
	public CustomerEntity(UUID id, OrganizationEntity organization, IdTypeEntity idType, String idNumber,
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
	public OrganizationEntity getOrganization() {
		return organization;
	}
	public IdTypeEntity getIdType() {
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
	private void setOrganization(OrganizationEntity organization) {
		this.organization = organization;
	}
	private void setIdType(IdTypeEntity idType) {
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

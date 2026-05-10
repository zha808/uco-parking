package co.edu.uco.ucoparking.infrastructure.persistence.repository.entity;

import java.util.UUID;

import co.edu.uco.ucoparking.crosscuting.helper.TextHelper;
import co.edu.uco.ucoparking.crosscuting.helper.UUIDHelper;

public class IdTypeEntity {
	private UUID id;
	private String name;
	
	public IdTypeEntity() {
		super();
	}
	
	public IdTypeEntity(UUID id) {
		super();
		setId(id);
		setName(TextHelper.getDefault());
	}
	
	
	public IdTypeEntity(UUID id, String name) {
		super();
		setId(id);
		setName(name);
	}
	
	public UUID getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	private void setId(UUID id) {
		this.id = UUIDHelper.getUUIDHelper().getDefault(id);
	}
	private void setName(String name) {
		this.name = TextHelper.getDefault(name);
	}
	
	

}

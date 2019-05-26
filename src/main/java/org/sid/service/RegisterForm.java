package org.sid.service;

import java.util.ArrayList;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.sid.models.Poste;
import org.sid.models.Role;
import org.sid.models.Service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterForm {
	@NotEmpty
	@Size(min=4,max=10)
	private String ancienMp;
	@NotEmpty
	@Size(min=4,max=10)
	private String nouvMp;
	@NotEmpty
	@Size(min=4,max=10)
	private String confirMp;
	
	public String getAncienMp() {
		return ancienMp;
	}
	public void setAncienMp(String ancienMp) {
		this.ancienMp = ancienMp;
	}
	public String getNouvMp() {
		return nouvMp;
	}
	public void setNouvMp(String nouvMp) {
		this.nouvMp = nouvMp;
	}
	public String getConfirMp() {
		return confirMp;
	}
	public void setConfirMp(String confirMp) {
		this.confirMp = confirMp;
	}
	
	
	

}

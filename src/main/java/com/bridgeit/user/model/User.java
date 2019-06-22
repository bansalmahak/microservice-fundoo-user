package com.bridgeit.user.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
@Entity
@Table
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
	private long noteId;

	@NotEmpty(message = "enter the emailid")
	@NotNull(message = "enter the emailid")
	private String emailid;

	private String password;

	private String name;

	private String phnumber;
	private LocalDateTime registeredDate;
	private LocalDateTime modifiedDate;
	private Boolean Isverify;

//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Notes> notes;
//
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Labels> labels;
//
//	@JsonIgnore
//	@ManyToMany(cascade = CascadeType.ALL)
//	private List<Notes> notecollaborater;
//	private boolean isverify;
//
//
//	public List<Notes> getNotecollaborater() {
//		return notecollaborater;
//	}

	

	public Boolean getIsverify() {
		return Isverify;
	}

	public void setIsverify(Boolean isverify) {
		Isverify = isverify;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public long getNoteId() {
		return noteId;
	}

	public void setNoteId(long noteId) {
		this.noteId = noteId;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhnumber() {
		return phnumber;
	}

	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}

	public LocalDateTime getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(LocalDateTime registeredDate) {
		this.registeredDate = registeredDate;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}

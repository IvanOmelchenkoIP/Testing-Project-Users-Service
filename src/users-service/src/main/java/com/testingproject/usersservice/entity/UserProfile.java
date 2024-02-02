package com.testingproject.usersservice.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserProfiles")
public class UserProfile {

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@MapsId("user_id")
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "profile_picture")
	private String profilePicture;
	
	@Column(name = "country_code")
	private String countryCode;
	
	@Column(name = "locality_code")
	private String localityCode;
	
	@Column(name = "birthdate")
	private Date birthdate;
	
	@Column(name = "last_modified")
	private Date lastModified;

	@PrePersist
	private void onCreate() {
		this.lastModified = new Date();
	}
	
	@PreUpdate
	private void onUpdate() {
		this.lastModified = new Date();
	}
	
	public UserProfile() {
		super();
	}
	
	public UserProfile(User user, String firstName, String lastName) {
		super();
		this.user = user;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public UserProfile(User user, String firstName, String lastName, String profilePicture, String countryCode,
			String localityCode, Date birthdate) {
		super();
		this.user = user;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profilePicture = profilePicture;
		this.countryCode = countryCode;
		this.localityCode = localityCode;
		this.birthdate = birthdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLocalityCode() {
		return localityCode;
	}

	public void setLocalityCode(String localityCode) {
		this.localityCode = localityCode;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "UserProfile: {user=" + user + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", profilePicture=" + profilePicture + ", countryCode=" + countryCode + ", localityCode="
				+ localityCode + ", birthdate=" + birthdate + "}";
	} 	
}

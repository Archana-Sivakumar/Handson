package model;

import java.util.Arrays;

public class Registration {
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String age;
	private String gender;
	private String emailId;
	private String contactNo;
	private String[] hobbies;
	private String address;
	private String country;

	public Registration(String firstName, String lastName, String dateOfBirth, String age, String gender,
			String emailId, String contactNo, String[] hobbies, String address, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.gender = gender;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.hobbies = hobbies;
		this.address = address;
		this.country = country;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "FirstName = " + firstName + "\n" + "LastName = " + lastName + "\n" + "DateOfBirth = " + dateOfBirth
				+ "\n" + "Age = " + age + "\n" + "Gender = " + gender + "\n" + "EmailId = " + emailId + "\n"
				+ "ContactNo = " + contactNo + "\n" + "Hobbies = " + Arrays.toString(hobbies) + "\n" + "Address = "
				+ address + "\n" + "Country = " + country;

	}

}

package model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User {
	 @NotEmpty(message = "First name is required")
	    private String firstName;

	    @NotEmpty(message = "Last name is required")
	    private String lastName;

	    @NotEmpty(message = "Email is required")
	    @Email(message = "Email should be valid")
	    private String email;

	    @NotEmpty(message = "Phone number is required")
	    @Pattern(regexp = "\\d{10}", message = "Phone number should be 10 digits")
	    private String phoneNumber;

	    @NotEmpty(message = "Username is required")
	    private String username;

	    @NotEmpty(message = "Password is required")
	    @Size(min = 6, message = "Password should be at least 6 characters")
	    private String password;

	    // Getters and Setters
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

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
}

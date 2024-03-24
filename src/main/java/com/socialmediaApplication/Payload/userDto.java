package com.socialmediaApplication.Payload;

import java.util.ArrayList;
import java.util.List;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class userDto {
	
    private Integer userId;
	
    @NotBlank(message = "user name is mandatory.")
	private String userName;
	
    @Size(min = 4,max = 8, message="password must be minimum 4 character and at least 8 character")
	private String password;
	
	@Email
    private String email;
	
	@NotBlank(message="name is mandatory.")
	private String full_name;
	
	private String profilePicture;
	
	@Size(max=100,message="bio maximum 100 character")
	private String bio;
	
	private String dob;
	
	private String gender;
	
	private String location;
	
	@NotBlank(message = "contact is mandotory")
	private String contact;
	
	private List<Integer> following = new ArrayList<>();
	
	private List<Integer> followers = new ArrayList<>();
	

}

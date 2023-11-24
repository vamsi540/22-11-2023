package com.vamsi.restfullwebservices.UserDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private Long id;
	@NotEmpty
	private String firstname;
	@NotEmpty
	@Email
	private String lastname;
	

	private String email;


}

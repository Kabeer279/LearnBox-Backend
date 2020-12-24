package com.project.LearnBox.Model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClassRoom {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private String classcode;
		
	
	@OneToOne
	private User owner;
	
	
//	@ManyToOne
	@OneToMany
	private List<User>subcribedUsers;
	public void setSubUsers(User user)
	{
		this.subcribedUsers.add(user);
	}
//	private String subHeading;
	
	
	
}

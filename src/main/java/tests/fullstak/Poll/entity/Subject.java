package tests.fullstak.Poll.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	Long idsub;
	
	String title;
	
	String description;

	@ManyToMany(mappedBy="subjects")
	Set<User> users;
	

	public Subject() {
	
	}
	
	public Subject(Long idsub, String title, String description) {
		super();
		this.idsub = idsub;
		this.title = title;
		this.description = description;
	}
	
	public Long getIdsub() {
		return idsub;
	}
	public void setIdsub(Long idsub) {
		this.idsub = idsub;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

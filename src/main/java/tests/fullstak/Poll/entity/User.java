package tests.fullstak.Poll.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long iduser;

	String username;
	String fistname;
	String lastname;

	@ManyToMany
	@JoinTable(
		name="USER_SUBJECTS",
		joinColumns=@JoinColumn(name="iduser"),
		inverseJoinColumns=@JoinColumn(name="idsub")
	)
	Set<Subject> subjects;

	public User() {
	}

	public User(String username, String fistname, String lastname) {
		super();
		this.username = username;
		this.fistname = fistname;
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFistname() {
		return fistname;
	}

	public void setFistname(String fistname) {
		this.fistname = fistname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getIduser() {
		return iduser;
	}

}

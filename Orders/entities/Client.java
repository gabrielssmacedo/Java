package entities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Client {
	private String name;
	private String email;
	private LocalDate birthDate;	
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
	
	public Client() {
	}

	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name );
		sb.append(" (" + fmt.format(birthDate) + ") - " + email);  
		return sb.toString();
	}
	
	
}

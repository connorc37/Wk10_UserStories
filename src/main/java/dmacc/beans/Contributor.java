package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Mar 31, 2022
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contributor {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String username;
	@Autowired
	private Contribution contribution;

	public Contributor(String name, String username) {
		super();
		this.name = name;
		this.username = username;
	}
	
	public Contributor(String name, String username, Contribution contribution) {
		super();
		this.name = name;
		this.username = username;
		this.contribution = contribution;
	}

}

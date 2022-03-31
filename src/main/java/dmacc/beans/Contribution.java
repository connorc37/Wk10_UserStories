package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Mar 31, 2022
 */

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contribution {
	private String user;
	private String action;
	private String achievement;
	private String priority;
}

package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Contributor;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Mar 31, 2022
 */

@Repository
public interface ContributorRepository extends JpaRepository<Contributor, Integer> {

}

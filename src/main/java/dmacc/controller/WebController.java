package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Contributor;
import dmacc.repository.ContributorRepository;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Mar 31, 2022
 */

@Controller
public class WebController {
	@Autowired
	ContributorRepository cr;
	
	@GetMapping("/addContributor")
	public String addContributor(Model model) {
		Contributor c = new Contributor();
		model.addAttribute("newContributor", c);
		return "input";
	}
	
	@GetMapping("/edit/{id}")
	public String editContributor(@PathVariable("id") int id, Model model) {
		Contributor c = cr.findById(id).orElse(null);
		model.addAttribute("newContributor", c);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String updateContributor(Contributor c, Model model) {
		cr.save(c);
		return viewAllContributors(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteContributor(@PathVariable("id") int id, Model model) {
		Contributor c = cr.findById(id).orElse(null);
		cr.delete(c);
		return viewAllContributors(model);
	}
	
	@GetMapping({"/viewAllContributors" })
	public String viewAllContributors(Model model) {
		if(cr.findAll().isEmpty()) {
			return addContributor(model);
			}
		model.addAttribute("allContributors",cr.findAll());
		return "results";
	}
	
}

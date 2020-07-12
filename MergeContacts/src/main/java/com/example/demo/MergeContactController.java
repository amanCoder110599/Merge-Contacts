package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MergeContactController {
	@Autowired
	ContactRepository repo;
	
	@PostMapping("/add_contact")
	@Transactional
	public String addContact(@RequestBody @Valid Contact contact) {
		contact.setNameisd(contact.getName() +""+contact.getPhone_numbers().substring(0, contact.getPhone_numbers().length() - 10));
		List<Contact> same_names_isd = repo.findByNameisd(contact.getNameisd());
		if(same_names_isd.size() == 0) {
			repo.save(contact);
			System.out.println(contact);
			return contact.toString();
		}
		else {
			String x = contact.getPhone_numbers();
			String y = same_names_isd.get(0).getPhone_numbers();
			contact.setPhone_numbers(y + " ," +x);
			repo.deleteByNameisd(same_names_isd.get(0).getNameisd());
			repo.save(contact);
			System.out.println(contact);
			return contact.toString();
		}
	}
	
	@GetMapping("/name/{name}")
	public String getContact(@PathVariable("name") String name) {
		List<Contact> all_possible = repo.findByName(name);
		return all_possible.toString();
	}
	
	@GetMapping("/names")
	public String getAll() {
		List<Contact> all_possible = repo.findAll();
		return all_possible.toString();
	}
	
	
}

package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String>{
	List<Contact> findByNameisd(String nameisd);
	void deleteByNameisd(String nameisd);
	List<Contact> findByName(String name);
}

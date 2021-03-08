package com.nikhilb.Springbootjpalucentasg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nikhilb.Springbootjpalucentasg.dao.SubscriberDao;
import com.nikhilb.Springbootjpalucentasg.model.Subscriber;
import com.nikhilb.Springbootjpalucentasg.repository.SubscriberRepository;
import com.nikhilb.SpringbootjpalucentasgException.ResourceNotFoundException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class SubscriberController {
	
	@Autowired
	private SubscriberRepository subscriberRepository;
	
//	@RequestMapping("/")
//	public String Home()
//	{
//		System.out.println("hi");
//		return "home.jsp";
//	}	
	
// Get List of Subscriber	
	@GetMapping("/subscriber")
	public List<Subscriber> getAll() {
		
		return subscriberRepository.findAll();
	}

// Save Subscriber	
	@PostMapping("/subscriber")
	public List<Subscriber> persist(@RequestBody Subscriber subscriber) {
		
		subscriberRepository.save(subscriber);
		return subscriberRepository.findAll();
	}
	
//	Get Subscriber by ID
	@GetMapping("/subscriber/{id}")
	public ResponseEntity<Subscriber> getSubscriberById(@PathVariable (value = "id") Integer sid) 
			throws ResourceNotFoundException	{

		Subscriber subscriber = subscriberRepository.findById(sid).orElseThrow(() ->
				new ResourceNotFoundException("Subscriber Not Found with id : " + sid));
		
		return ResponseEntity.ok().body(subscriber);
	}

// Update Subscriber	
	@PutMapping("/subscriber")
	public Subscriber updateSubscriber(@RequestBody Subscriber subscriber) {
		subscriberRepository.save(subscriber);
		return subscriber;
	}

// Delete Subscriber	
	@DeleteMapping("/subscriber/{sid}")
	public String deleteSubscriber(@PathVariable (value = "sid") Integer sid) throws ResourceNotFoundException {
		
		subscriberRepository.deleteById(sid);
		return "Subscriber Deleted";		
	}

}

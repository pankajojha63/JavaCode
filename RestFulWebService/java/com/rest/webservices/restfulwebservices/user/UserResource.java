package com.rest.webservices.restfulwebservices.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService userService;

	// retrieveAllUsers
	@GetMapping(path = "/users")
	public List<User> retrieveUser() {
		return userService.findAll();
	}

	@GetMapping(path = "/users/{id}")
	public EntityModel<User> findOne(@PathVariable int id) {
		User user = userService.findOne(id);
		if (user == null)
			throw new UserNotFoundException("id : " + id);

		EntityModel<User> model = EntityModel.of(user);
		WebMvcLinkBuilder linkToUsers = linkTo(methodOn(this.getClass()).retrieveUser());
		model.add(linkToUsers.withRel("all-users"));
		return model;
	}

	// Created
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User savedUser = userService.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping(path = "/users/{id}")
	public void deleteById(@PathVariable int id) {
		User user = userService.deleteById(id);
		if (user == null)
			throw new UserNotFoundException("id : " + id);

	}

	@PutMapping(path = "/users/{id}")
	public void updateUser(@PathVariable int id, @RequestBody User user) {
		userService.updateUser(id, user);

	}

}

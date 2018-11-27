package com.saartha.security;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/resource")
public class ResourceController {

	@GetMapping
	public Principal user(Principal principal) {
		return principal;
	}
}

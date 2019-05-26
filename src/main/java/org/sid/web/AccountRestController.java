package org.sid.web;

import org.sid.models.Utilisateur;
import org.sid.service.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
	@Autowired
	private Account account;
	@PostMapping("/register")
	public Utilisateur register(@RequestBody Utilisateur u)
	{
		Utilisateur uti=account.findByMatricule(u.getMatricule());
		if(uti!=null) {
			throw new RuntimeException("this user already exist");
		}
		else {
			return account.saveUser(u);
			
		}
		
	}
}

package org.sid.security;


import java.util.List;
import javax.validation.Valid;
import org.sid.models.Poste;
import org.sid.models.Role;
import org.sid.models.Service;
import org.sid.models.Utilisateur;
import org.sid.service.Account;
import org.sid.service.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Controller
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	@Autowired
	private Account account;
	public void addViewControllers(ViewControllerRegistry registry) {

		registry.addViewController("/").setViewName("login");
		registry.addViewController("/medecin/menuMedecin").setViewName("menuMedecin");
		registry.addViewController("/admin/menuAdmin").setViewName("menuAdmin");
		registry.addViewController("/secretaire/index").setViewName("menuSecretaire");
		registry.addViewController("/addService").setViewName("ajoutservice");
		registry.addViewController("/addPoste").setViewName("ajoutPoste");
		registry.addViewController("/addRole").setViewName("ajoutRole");
		registry.addViewController("/login").setViewName("login");
	
	}
	
	
	
	
	
}
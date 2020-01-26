package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.UserLogin;

@Controller
//@RequestMapping("/account")
public class AccountController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model)
	{
		UserLogin login = new UserLogin();
		//login.setLogin("smonder@gmail.com");
		
		model.addAttribute("user", login);
		
		return "account/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String submit(@ModelAttribute("user")UserLogin user, 
      BindingResult result, ModelMap model) {
		String email=user.getLogin();
		//String password=user.getPassword();
		if(email.equals("admin@gmail.com"))
			return "account/user-profile";
		else
			return "account/login";
		//System.out.println("-----user.login------ "+ user.getLogin());
//        if (result.hasErrors()) {
//            return "error";
//        }
//        model.addAttribute("name", employee.getName());
//        model.addAttribute("contactNumber", employee.getContactNumber());
//        model.addAttribute("id", employee.getId());
        
    }
	
	
}

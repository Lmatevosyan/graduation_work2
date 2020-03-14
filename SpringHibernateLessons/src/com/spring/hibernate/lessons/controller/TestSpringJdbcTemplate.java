package com.spring.hibernate.lessons.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import com.spring.hibernate.lessons.factory.Factory;
import com.spring.hibernate.lessons.model.User;


@Controller
public class TestSpringJdbcTemplate {
	User login_user;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("home","err", null);
	}

	@RequestMapping(value="/home", method=RequestMethod.POST)
	public ModelAndView handlePost(@RequestParam String action) {
		if(action.equals("Users")){
			return new ModelAndView("redirect:users");
		}
		else if(action.equals("Registration")){
			return new ModelAndView("redirect:registration");
		} 
		return null;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet() {
		return new ModelAndView("login");
	}


	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ModelAndView showUsers() {
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("users","users",usersList );
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String usersBackHome(@RequestParam String action) {
		if(action.equals("Home")){
			return "redirect:home";
		}
		return action;
	}

	@ModelAttribute("myUser")
	public User getLoginForm() {
		return new User();
	}

	@ModelAttribute("loginUser")
	public User getLoginUser() {
		return new User();
	}

//	@RequestMapping(value = "/registration", method = RequestMethod.GET)
//	public String showForm() {
//		return "registration";
//	}
//
//	@RequestMapping(value = "/registration", method = RequestMethod.POST)
//	public String validateForm(@RequestParam String action,
//			@ModelAttribute("myUser") @Valid User myUser,
//			BindingResult result, HttpServletRequest request) {
//		if(action.equals("Home")){
//			return "redirect:home";
//		} else {
//			System.out.println(result.toString());
//			if (!result.hasErrors()) {
//				if(request.getParameter("confirmPassword").equals(myUser.getPassword())) {
//					if(Factory.getInstance().getUserDAO().isUnique(myUser)) {
//						try {
//							Factory.getInstance().getUserDAO().addUser(myUser);
//						} catch (SQLException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						return "redirect:success";
//					} else 
//						return "redirect:fail";
//				} else {
//					request.setAttribute("confirmPasswordErr", "true");
//				}
//			}
//			return "registration";
//		}
//	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showForm1() {
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String validateForm1(@RequestParam String action,
			@ModelAttribute("myUser") @Valid User myUser,
			BindingResult result, HttpServletRequest request) {
		if(action.equals("Register")){
			System.out.println(result.toString());
			if (!result.hasErrors()) {
				if(request.getParameter("fos_user_registration_form[plainPassword][second]").equals(myUser.getPassword())) {
					if(Factory.getInstance().getUserDAO().isUnique(myUser)) {
						try {
							// hash a password
//							BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//							myUser.setPassword(passwordEncoder.encode(myUser.getPassword()));
//							System.out.println(myUser.getPassword());
							
//						    StandardPasswordEncoder encoder = new StandardPasswordEncoder();
//						    myUser.setPassword(encoder.encode(myUser.getPassword())); 
//						    System.out.println(myUser.getPassword());
//							
							Factory.getInstance().getUserDAO().addUser(myUser);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return "redirect:success";
					} else 
						return "redirect:fail";
				} else {
					request.setAttribute("confirmPasswordErr", "true");
				}
			}
			return "register";
		}
		return action;
	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String showSuccess() {
		return "success";
	}

	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String successBackHome(@RequestParam String action) {
		if(action.equals("Home")){
			return "redirect:home";
		}
		return action;
	}

	@RequestMapping(value = "/fail", method = RequestMethod.GET)
	public String showFail() {
		return "fail";
	}

	@RequestMapping(value = "/fail", method = RequestMethod.POST)
	public String failBack(@RequestParam String action) {
		if(action.equals("Home")){
			return "redirect:home";
		} else if(action.equals("Try again")) {
			return "redirect:registration";
		}
		return action;
	}

	@RequestMapping(value = "/userPage", method = RequestMethod.GET) 
	public ModelAndView login(HttpServletRequest request) {
		User user = getUserBeanByEmail(request.getUserPrincipal().getName());
		System.out.println(user.getFirstName());
		HttpSession sessionObj = request.getSession();
		sessionObj.setAttribute("user", user);
		return new ModelAndView("userPage", "loginUser", user);
	}
	@RequestMapping(value = "/userPage", method = RequestMethod.POST)
	public String loginBack(@RequestParam String action) {
		if(action.equals("Information")) {
			return "redirect:userInfo";
		}else if(action.equals("Lists")){
			return "redirect:userAndPersonalLists";
		} else if(action.equals("Lesson 1")){
			return "redirect:lesson1";
		} else if(action.equals("Lesson 2")){
			return "redirect:lesson2";
		}
		return null;
	}

	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public ModelAndView showUserInfo(HttpServletRequest request) {
		HttpSession sessionObj = request.getSession();
		if(sessionObj.getAttribute("user")!=null) {
			return new ModelAndView("userInfo", "user", sessionObj.getAttribute("user"));
		}
		else 
			return new ModelAndView("home");
	}

	@RequestMapping(value = "/userInfo", method = RequestMethod.POST)
	public String userInfoBackMyPage(@RequestParam String action) {
		if(action.equals("My page")) {
			return "redirect:userPage";
		}
		return null;
	}

	@RequestMapping(value = "/lesson1", method = RequestMethod.GET)
	public ModelAndView getLesson1() {
		return new ModelAndView("lesson1");
	}

	@RequestMapping(value = "/lesson1", method = RequestMethod.POST)
	public String postLesson1(@RequestParam String action) {
		if(action.equals("Test")){
			return "redirect:test1";
		} else if(action.equals("My page")) {
			return "redirect:userPage";
		}
		return action;
	}
	@RequestMapping(value = "/lesson2", method = RequestMethod.GET)
	public ModelAndView getLesson2() {
		return new ModelAndView("lesson2");
	}

	@RequestMapping(value = "/lesson2", method = RequestMethod.POST)
	public String postLesson2(@RequestParam String action) {
		if(action.equals("Test")){
			return "redirect:test2";
		} else if(action.equals("My page")) {
			return "redirect:userPage";
		}
		return action;
	}
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public ModelAndView getTest() {
		return new ModelAndView("test1");
	}

	@RequestMapping(value = "/test1", method = RequestMethod.POST)
	public String postTest1(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("Check")) {
			String message = null;
			int count = 0;
			if(request.getParameter("qst1").equals("0")) {
				++count;
			}
			if(request.getParameter("qst2").equals("1")) {
				++count;
			}
			if(request.getParameter("qst3").equals("0")) {
				++count;
			}
			if(request.getParameter("qst4").equals("1")) {
				++count;
			}
			if(request.getParameter("qst5").equals("0")) {
				++count;
			}
			if(request.getParameter("qst6").equals("0")) {
				++count;
			}
			if(request.getParameter("qst7").equals("1")) {
				++count;
			}
			if(count==7) {
				message = "Excellent!";
			} else if(count==5 || count==6) {
				message = "Good!";
			} else {
				message = "Bad. Try again!";
			}
			System.out.println(message);
			request.setAttribute("message", message);
			return "test1";
		} else if(action.equals("My page")) {
			return "redirect:userPage";
		} else if(action.equals("Next lesson")) {
			return "redirect:lesson2";
		} else if(action.equals("Repeat lesson")) {
			return "redirect:lesson1";
		}
		return null;
	}
	
	
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public ModelAndView getTest2() {
		return new ModelAndView("test2");
	}

	@RequestMapping(value = "/test2", method = RequestMethod.POST)
	public String postTest2(@RequestParam String action) {
		if(action.equals("My page")) {
			return "redirect:userPage";
		}
		return action;
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String secure(HttpServletRequest request) {
		HttpSession sessionObj = request.getSession();
		sessionObj.removeAttribute("user");
		sessionObj.invalidate();
		return "redirect:home";
	}

	public User getUserBeanByEmail(String email) {

		User user = new User();
		try {
			user = Factory.getInstance().getUserDAO().getUserByEmail(email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}


	@RequestMapping(value = "/userAndPersonalLists", method = RequestMethod.GET)  
	public String showUserAndPersonalLists(Model model, HttpServletRequest request) {  

		ArrayList<User> userListEntries = new ArrayList<User>();
		try {
			userListEntries = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

		HttpSession sessionObj = request.getSession();
		if(sessionObj.getAttribute("user")!=null) {
			model.addAttribute("userListEntries", userListEntries);
			model.addAttribute("user",sessionObj.getAttribute("user"));
			return "userAndPersonalLists";
		}
		else 
			return "redirect:home";
	}  

	@RequestMapping(value = "/userAndPersonalLists", method = RequestMethod.POST)  
	public String userAndPersonalListsBack(@RequestParam String action) {  
		if(action.equals("My Page")) {
			return "redirect:userPage";
		}
		return null;
	}  

	@RequestMapping(value = "/userListRefresh", method = RequestMethod.GET)  
	public  String refreshUserList(Model model) {  
		System.err.println("/userListRefresh called");  

		ArrayList<User> userListEntries = new ArrayList<User>();
		try {
			userListEntries = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		model.addAttribute("userListEntries", userListEntries);  
		System.out.println(userListEntries.get(0).getFirstName());
		return "userListTable";
	}  

	@RequestMapping(value = "/personalListRefresh", method = RequestMethod.GET)  
	public  String refreshPersonalList(Model model, HttpServletRequest request) {  
		System.err.println("/personalListRefresh called");
		User user = getUserBeanByEmail(request.getUserPrincipal().getName());
		model.addAttribute("user", user);  
		return "personalTable";
	} 
	
	@RequestMapping(value = "about", method = RequestMethod.GET)
	public ModelAndView about(ModelMap model) {
		ModelAndView modelAndView = new ModelAndView("about");
		return modelAndView;
	}
	@RequestMapping(value = "contact", method = RequestMethod.GET)
	public ModelAndView contact(ModelMap model) {
		ModelAndView modelAndView = new ModelAndView("contact");
		return modelAndView;
	}
}
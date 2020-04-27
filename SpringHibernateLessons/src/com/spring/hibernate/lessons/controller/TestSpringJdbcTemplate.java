package com.n.spring.hibernate.lessons.controller;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import com.n.spring.hibernate.lessons.factory.Factory;
import com.n.spring.hibernate.lessons.model.User;
import com.sun.javafx.sg.prism.NGShape.Mode;

@Controller
public class TestSpringJdbcTemplate{
	User login_user;

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("home","err", null);
	}

	@RequestMapping(value="/home", method=RequestMethod.POST)
	public ModelAndView handlePost(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("home_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("home_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("home_arm");
		} 
		return null;
	}
	
	@RequestMapping(value="/home_en", method=RequestMethod.GET)
	public ModelAndView home_en(HttpServletRequest r) {
		return new ModelAndView("home_en","err", null);
	}

	@RequestMapping(value="/home_en", method=RequestMethod.POST)
	public ModelAndView handlePost_en(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			System.out.println("aaa");
			request.setAttribute("language", "eng");
			return new ModelAndView("home_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("home_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("home_arm");
		} 
		return null;
	}
	
	@RequestMapping(value="/home_ru", method=RequestMethod.GET)
	public ModelAndView home_ru(HttpServletRequest r) {
		return new ModelAndView("home_ru","err", null);
	}

	@RequestMapping(value="/home_ru", method=RequestMethod.POST)
	public ModelAndView handlePost_ru(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("home_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("home_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("home_arm");
		} 
		return null;
	}

	@RequestMapping(value="/home_arm", method=RequestMethod.GET)
	public ModelAndView home_arm(HttpServletRequest r) {
		return new ModelAndView("home_arm","err", null);
	}

	@RequestMapping(value="/home_arm", method=RequestMethod.POST)
	public ModelAndView handlePost_arm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("home_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("home_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("home_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet() {
		return new ModelAndView("login");
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView loginPost(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("login_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("login_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("login_arm");
		} 
		return null;
	}

	@RequestMapping(value = "/login_ru", method = RequestMethod.GET)
	public ModelAndView loginGet_ru() {
		return new ModelAndView("login_ru");
	}

	@RequestMapping(value="/login_ru", method=RequestMethod.POST)
	public ModelAndView loginPost_ru(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("login_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("login_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("login_arm");
		} 
		return null;
	}
	@RequestMapping(value = "/login_en", method = RequestMethod.GET)
	public ModelAndView loginGet_en() {
		return new ModelAndView("login_en");
	}

	@RequestMapping(value="/login_en", method=RequestMethod.POST)
	public ModelAndView loginPost_en(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("login_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("login_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("login_arm");
		} 
		return null;
	}

	@RequestMapping(value = "/login_arm", method = RequestMethod.GET)
	public ModelAndView loginGet_arm() {
		return new ModelAndView("login_arm");
	}

	@RequestMapping(value="/login_arm", method=RequestMethod.POST)
	public ModelAndView loginPost_arm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("login_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("login_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("login_arm");
		} 
		return null;
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
	
	@RequestMapping(value = "/users_en", method = RequestMethod.GET)
	public ModelAndView showUsersEn() {
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("users_en","users",usersList );
	}

	@RequestMapping(value = "/users_en", method = RequestMethod.POST)
	public ModelAndView usersBackHomeEn(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			ArrayList<User> usersList = new ArrayList<User>();
			try {
				usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new ModelAndView("users_en","users",usersList );
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			ArrayList<User> usersList = new ArrayList<User>();
			try {
				usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new ModelAndView("users_ru","users",usersList );
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			ArrayList<User> usersList = new ArrayList<User>();
			try {
				usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new ModelAndView("users_arm","users",usersList );
		} 
		return null;
	}
	
	@RequestMapping(value = "/users_ru", method = RequestMethod.GET)
	public ModelAndView showUsersRu() {
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("users_ru","users",usersList );
	}

	@RequestMapping(value = "/users_ru", method = RequestMethod.POST)
	public ModelAndView usersBackHomeRu(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			ArrayList<User> usersList = new ArrayList<User>();
			try {
				usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new ModelAndView("users_en","users",usersList );
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			ArrayList<User> usersList = new ArrayList<User>();
			try {
				usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new ModelAndView("users_ru","users",usersList );
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			ArrayList<User> usersList = new ArrayList<User>();
			try {
				usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new ModelAndView("users_arm","users",usersList );
		} 
		return null;
	}
	
	@RequestMapping(value = "/users_arm", method = RequestMethod.GET)
	public ModelAndView showUsersArm() {
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("users_arm","users",usersList );
	}

	@RequestMapping(value = "/users_arm", method = RequestMethod.POST)
	public ModelAndView usersBackHomeArm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			ArrayList<User> usersList = new ArrayList<User>();
			try {
				usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new ModelAndView("users_en","users",usersList );
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			ArrayList<User> usersList = new ArrayList<User>();
			try {
				usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new ModelAndView("users_ru","users",usersList );
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			ArrayList<User> usersList = new ArrayList<User>();
			try {
				usersList = (ArrayList<User>) Factory.getInstance().getUserDAO().getAllUsers();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new ModelAndView("users_arm","users",usersList );
		} 
		return null;
	}

	@ModelAttribute("myUser")
	public User getLoginForm() {
		return new User();
	}

	@ModelAttribute("loginUser")
	public User getLoginUser() {
		return new User();
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showForm1() {
		return "register";
	}

	 @Autowired
	  private PasswordEncoder passwordEncoder;
	 
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String validateForm1(@RequestParam String action,
			@ModelAttribute("myUser") @Valid User myUser,
			BindingResult result, HttpServletRequest request) {
		if(action.equals("OK")){
			System.out.println(result.toString());
			if (!result.hasErrors()) {
				if(request.getParameter("fos_user_registration_form[plainPassword][second]").equals(myUser.getPassword())) {
					if(Factory.getInstance().getUserDAO().isUnique(myUser)) {
						try {
							// hash a password
String encodedPassword = passwordEncoder.encodePassword(myUser.getPassword(), null);
myUser.setPassword(encodedPassword);
System.out.println(myUser.getPassword());
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
	@RequestMapping(value = "/register_en", method = RequestMethod.GET)
	public String showForm1En() {
		return "register_en";
	}
	 
	@RequestMapping(value = "/register_en", method = RequestMethod.POST)
	public String validateForm1En(@RequestParam String action,
			@ModelAttribute("myUser") @Valid User myUser,
			BindingResult result, HttpServletRequest request) {
		if(action.equals("OK")){
			System.out.println(result.toString());
			if (!result.hasErrors()) {
				if(request.getParameter("fos_user_registration_form[plainPassword][second]").equals(myUser.getPassword())) {
					if(Factory.getInstance().getUserDAO().isUnique(myUser)) {
						try {
							// hash a password
							
							String encodedPassword = passwordEncoder.encodePassword(myUser.getPassword(), null);
							myUser.setPassword(encodedPassword);
							System.out.println(myUser.getPassword());
	Factory.getInstance().getUserDAO().addUser(myUser);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return "redirect:success_en";
					} else 
						return "redirect:fail_en";
				} else {
					request.setAttribute("confirmPasswordErr", "true");
				}
			}
			return "register_en";
		}
		return action;
	}
	@RequestMapping(value = "/register_en_lang", method = RequestMethod.GET)
	public String showForm1EnLang() {
		return "register_en";
	}
	 
	@RequestMapping(value = "/register_en_lang", method = RequestMethod.POST)
	public String validateForm1EnLang(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return "redirect:register_en";
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return "redirect:register_ru";
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return "redirect:register_arm";
		} 
		return action;
	}
	
	@RequestMapping(value = "/register_ru", method = RequestMethod.GET)
	public String showForm_ru() {
		return "register_ru";
	}
	 
	@RequestMapping(value = "/register_ru", method = RequestMethod.POST)
	public String validateForm_ru(@RequestParam String action,
			@ModelAttribute("myUser") @Valid User myUser,
			BindingResult result, HttpServletRequest request) {
			if(action.equals("OK")){
			System.out.println(result.toString());
			if (!result.hasErrors()) {
				if(request.getParameter("fos_user_registration_form[plainPassword][second]").equals(myUser.getPassword())) {
					if(Factory.getInstance().getUserDAO().isUnique(myUser)) {
						try {
							// hash a password
String encodedPassword = passwordEncoder.encodePassword(myUser.getPassword(), null);
myUser.setPassword(encodedPassword);
System.out.println(myUser.getPassword());
							Factory.getInstance().getUserDAO().addUser(myUser);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return "redirect:success_ru";
					} else 
						return "redirect:fail_ru";
				} else {
					request.setAttribute("confirmPasswordErr", "true");
				}
			}
			return "register_ru";
		}
		return action;
	}
	@RequestMapping(value = "/register_ru_lang", method = RequestMethod.GET)
	public String showForm1RuLang() {
		return "register_en";
	}
	 
	@RequestMapping(value = "/register_ru_lang", method = RequestMethod.POST)
	public String validateForm1RuLang(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return "redirect:register_en";
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return "redirect:register_ru";
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return "redirect:register_arm";
		} 
		return action;
	}
	
	@RequestMapping(value = "/register_arm", method = RequestMethod.GET)
	public String showForm1Arm() {
		return "register_arm";
	}
	 
	@RequestMapping(value = "/register_arm", method = RequestMethod.POST)
	public String validateForm1Arm(@RequestParam String action,
			@ModelAttribute("myUser") @Valid User myUser,
			BindingResult result, HttpServletRequest request) {
		if(action.equals("OK")){
			System.out.println(result.toString());
			if (!result.hasErrors()) {
				if(request.getParameter("fos_user_registration_form[plainPassword][second]").equals(myUser.getPassword())) {
					if(Factory.getInstance().getUserDAO().isUnique(myUser)) {
						try {
							// hash a password
myUser.setPassword(encoder.encode(myUser.getPassword())); 
String encodedPassword = passwordEncoder.encodePassword(myUser.getPassword(), null);
myUser.setPassword(encodedPassword);
System.out.println(myUser.getPassword());
	Factory.getInstance().getUserDAO().addUser(myUser);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return "redirect:success_arm";
					} else 
						return "redirect:fail_arm";
				} else {
					request.setAttribute("confirmPasswordErr", "true");
				}
			}
			return "register_arm";
		}
		return action;
	}
	@RequestMapping(value = "/register_arm_lang", method = RequestMethod.GET)
	public String showForm1ArmLang() {
		return "register_arm";
	}
	 
	@RequestMapping(value = "/register_arm_lang", method = RequestMethod.POST)
	public String validateForm1ArmLang(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return "redirect:register_en";
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return "redirect:register_ru";
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return "redirect:register_arm";
		} 
		return action;
	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String showSuccess() {
		return "success";
	}

	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public ModelAndView successBackHome(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("success_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("success_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("success_arm");
		} 
		return null;
	}
	@RequestMapping(value = "/success_en", method = RequestMethod.GET)
	public String showSuccessEn() {
		return "success_en";
	}

	@RequestMapping(value = "/success_en", method = RequestMethod.POST)
	public ModelAndView successBackHomeEn(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("success_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("success_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("success_arm");
		} 
		return null;
	}
	@RequestMapping(value = "/success_ru", method = RequestMethod.GET)
	public String showSuccessRu() {
		return "success_ru";
	}

	@RequestMapping(value = "/success_ru", method = RequestMethod.POST)
	public ModelAndView successBackHomeRu(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("success_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("success_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("success_arm");
		} 
		return null;
	}
	@RequestMapping(value = "/success_arm", method = RequestMethod.GET)
	public String showSuccessArm() {
		return "success_arm";
	}

	@RequestMapping(value = "/success_arm", method = RequestMethod.POST)
	public String successBackHomeArm(@RequestParam String action) {
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
	public String failBack(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("Home")){
			return "redirect:home";
		} else if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return "redirect:fail_en";
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return "redirect:fail_ru";
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return "redirect:fail_arm";
		} 
		else if(action.equals("Try again")) {
			return "redirect:register";
		}
		return action;
	}
	
	@RequestMapping(value = "/fail_en", method = RequestMethod.GET)
	public String showFailEn() {
		return "fail_en";
	}

	@RequestMapping(value = "/fail_en", method = RequestMethod.POST)
	public String failBackEn(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("Home")){
			return "redirect:home";
		} else if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return "redirect:fail_en";
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return "redirect:fail_ru";
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return "redirect:fail_arm";
		} 
		else if(action.equals("Try again")) {
			return "redirect:register_en";
		}
			return action;
	}
	
	@RequestMapping(value = "/fail_ru", method = RequestMethod.GET)
	public String showFailRu() {
		return "fail_ru";
	}

	@RequestMapping(value = "/fail_ru", method = RequestMethod.POST)
	public String failBackRu(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("Home")){
			return "redirect:home";
		} else if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return "redirect:fail_en";
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return "redirect:fail_ru";
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return "redirect:fail_arm";
		} 
		else if(action.equals("Try again")) {
			return "redirect:register_ru";
		}
	
		return action;
	}
	
	@RequestMapping(value = "/fail_arm", method = RequestMethod.GET)
	public String showFailArm() {
		return "fail_arm";
	}

	@RequestMapping(value = "/fail_arm", method = RequestMethod.POST)
	public String failBackArm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("Home")){
			return "redirect:home";
		} else if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return "redirect:fail_en";
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return "redirect:fail_ru";
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return "redirect:fail_arm";
		} 
		else if(action.equals("Try again")) {
			return "redirect:register_arm";
		}
	
		return action;
	}

	@RequestMapping(value = "/userPage", method = RequestMethod.GET) 
	public ModelAndView login(HttpServletRequest request) {
		User user = getUserBeanByEmail(request.getUserPrincipal().getName());
		System.out.println(user.getFirstName());
		HttpSession sessionObj = request.getSession();
		sessionObj.setAttribute("user", user);
		request.setAttribute("message", " hi! :)");
		return new ModelAndView("userPage", "loginUser", user);
	}
	
	@RequestMapping(value = "/userPage", method = RequestMethod.POST)
	public String loginBack(@RequestParam String action) {
			if(action.equals("Lesson 1")){
			return "redirect:lesson1_en";
		} else if(action.equals("Lesson 2")){
			return "redirect:lesson2_en";
		}else if(action.equals("Lesson 3")){
			return "redirect:lesson3_en";
		} else if(action.equals("Lesson 4")){
			return "redirect:lesson4_en";
		}else if(action.equals("Lesson 5")){
			return "redirect:lesson5_en";
		} else if(action.equals("Lesson 6")){
			return "redirect:lesson6_en";
		}else if(action.equals("Lesson 7")){
			return "redirect:lesson7_en";
		} else if(action.equals("Lesson 8")){
			return "redirect:lesson8_en";
		}else if(action.equals("Lesson 9")){
			return "redirect:lesson9_en";
		}else if(action.equals("Lesson 10")){
			return "redirect:lesson10_en";
		}
		return null;
	}
	
	@RequestMapping(value = "/userPage_en", method = RequestMethod.GET) 
	public ModelAndView loginEn(HttpServletRequest request) {
		User user = getUserBeanByEmail(request.getUserPrincipal().getName());
		System.out.println(user.getFirstName());
		HttpSession sessionObj = request.getSession();
		sessionObj.setAttribute("user", user);
		request.setAttribute("message", " hi! :)");
		return new ModelAndView("userPage_en", "loginUser", user);
	}
	
	@RequestMapping(value = "/userPage_en", method = RequestMethod.POST)
	public String loginBackEn(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return "redirect:userPage_en";
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return "redirect:userPage_ru";
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return "redirect:userPage_arm";
		} 
		else if(action.equals("1")){
			return "redirect:lesson1_en";
		} else if(action.equals("2")){
			return "redirect:lesson2_en";
		}else if(action.equals("3")){
			return "redirect:lesson3_en";
		} else if(action.equals("4")){
			return "redirect:lesson4_en";
		}else if(action.equals("5")){
			return "redirect:lesson5_en";
		} else if(action.equals("6")){
			return "redirect:lesson6_en";
		}else if(action.equals("7")){
			return "redirect:lesson7_en";
		} else if(action.equals("8")){
			return "redirect:lesson8_en";
		}else if(action.equals("9")){
			return "redirect:lesson9_en";
		}else if(action.equals("10")){
			return "redirect:lesson10_en";
		}
		return null;
	}
	
	@RequestMapping(value = "/userPage_ru", method = RequestMethod.GET) 
	public ModelAndView loginRu(HttpServletRequest request) {
		User user = getUserBeanByEmail(request.getUserPrincipal().getName());
		System.out.println(user.getFirstName());
		HttpSession sessionObj = request.getSession();
		sessionObj.setAttribute("user", user);
		request.setAttribute("message", " привет! :)");
		return new ModelAndView("userPage_ru", "loginUser", user);
	}
	
	@RequestMapping(value = "/userPage_ru", method = RequestMethod.POST)
	public String loginBackRu(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return "redirect:userPage_en";
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return "redirect:userPage_ru";
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return "redirect:userPage_arm";
		} 
		else if(action.equals("1")){
			return "redirect:lesson1_ru";
		} else if(action.equals("2")){
			return "redirect:lesson2_ru";
		}else if(action.equals("3")){
			return "redirect:lesson3_ru";
		} else if(action.equals("4")){
			return "redirect:lesson4_ru";
		}else if(action.equals("5")){
			return "redirect:lesson5_ru";
		} else if(action.equals("6")){
			return "redirect:lesson6_ru";
		}else if(action.equals("7")){
			return "redirect:lesson7_ru";
		} else if(action.equals("8")){
			return "redirect:lesson8_ru";
		}else if(action.equals("9")){
			return "redirect:lesson9_ru";
		}else if(action.equals("10")){
			return "redirect:lesson10_ru";
		}
		return null;
	}

	@RequestMapping(value = "/userPage_arm", method = RequestMethod.GET) 
	public ModelAndView loginArm(HttpServletRequest request) {
		User user = getUserBeanByEmail(request.getUserPrincipal().getName());
		System.out.println(user.getFirstName());
		HttpSession sessionObj = request.getSession();
		sessionObj.setAttribute("user", user);
		request.setAttribute("message", " հի! :)");
		return new ModelAndView("userPage_arm", "loginUser", user);
	}
	
	@RequestMapping(value = "/userPage_arm", method = RequestMethod.POST)
	public String loginBackArm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return "redirect:userPage_en";
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return "redirect:userPage_ru";
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return "redirect:userPage_arm";
		} 
		else if(action.equals("1")){
			return "redirect:lesson1_arm";
		} else if(action.equals("2")){
			return "redirect:lesson2_arm";
		}else if(action.equals("3")){
			return "redirect:lesson3_arm";
		} else if(action.equals("4")){
			return "redirect:lesson4_arm";
		}else if(action.equals("5")){
			return "redirect:lesson5_arm";
		} else if(action.equals("6")){
			return "redirect:lesson6_arm";
		}else if(action.equals("7")){
			return "redirect:lesson7_arm";
		} else if(action.equals("8")){
			return "redirect:lesson8_arm";
		}else if(action.equals("9")){
			return "redirect:lesson9_arm";
		}else if(action.equals("10")){
			return "redirect:lesson10_arm";
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
	public ModelAndView postLesson1(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson1_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson1_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson1_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson1_en", method = RequestMethod.GET)
	public ModelAndView getLesson1En() {
		return new ModelAndView("lesson1_en");
	}

	@RequestMapping(value = "/lesson1_en", method = RequestMethod.POST)
	public ModelAndView postLesson1En(@RequestParam String action, HttpServletRequest request) {

		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson1_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson1_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson1_arm");
		} 
		return null;
	}
	
	
	@RequestMapping(value = "/lesson1_ru", method = RequestMethod.GET)
	public ModelAndView getLesson1Ru() {
		return new ModelAndView("lesson1_ru");
	}

	@RequestMapping(value = "/lesson1_ru", method = RequestMethod.POST)
	public ModelAndView postLesson1Ru(@RequestParam String action, HttpServletRequest request) {

		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson1_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson1_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson1_arm");
		} 
		return null;
	}
	
	
	@RequestMapping(value = "/lesson1_arm", method = RequestMethod.GET)
	public ModelAndView getLesson1Arm() {
		return new ModelAndView("lesson1_arm");
	}

	@RequestMapping(value = "/lesson1_arm", method = RequestMethod.POST)
	public ModelAndView postLesson1Arm(@RequestParam String action, HttpServletRequest request) {

		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson1_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson1_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson1_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson2", method = RequestMethod.GET)
	public ModelAndView getLesson2() {
		return new ModelAndView("lesson2");
	}

	@RequestMapping(value = "/lesson2", method = RequestMethod.POST)
	public ModelAndView postLesson2(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson2_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson2_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson2_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson2_en", method = RequestMethod.GET)
	public ModelAndView getLesson2En() {
		return new ModelAndView("lesson2_en");
	}

	@RequestMapping(value = "/lesson2_en", method = RequestMethod.POST)
	public ModelAndView postLesson2En(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson2_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson2_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson2_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson2_ru", method = RequestMethod.GET)
	public ModelAndView getLesson2Ru() {
		return new ModelAndView("lesson2_ru");
	}

	@RequestMapping(value = "/lesson2_ru", method = RequestMethod.POST)
	public ModelAndView postLesson2Ru(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson2_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson2_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson2_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson2_arm", method = RequestMethod.GET)
	public ModelAndView getLesson2Arm() {
		return new ModelAndView("lesson2_arm");
	}

	@RequestMapping(value = "/lesson2_arm", method = RequestMethod.POST)
	public ModelAndView postLesson2Arm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson2_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson2_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson2_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson3", method = RequestMethod.GET)
	public ModelAndView getLesson3() {
		return new ModelAndView("lesson3");
	}

	@RequestMapping(value = "/lesson3", method = RequestMethod.POST)
	public ModelAndView postLesson3(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson3_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson3_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson3_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson3_en", method = RequestMethod.GET)
	public ModelAndView getLesson3En() {
		return new ModelAndView("lesson3_en");
	}

	@RequestMapping(value = "/lesson3_en", method = RequestMethod.POST)
	public ModelAndView postLesson3En(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson3_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson3_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson3_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson3_ru", method = RequestMethod.GET)
	public ModelAndView getLesson3Ru() {
		return new ModelAndView("lesson3_ru");
	}

	@RequestMapping(value = "/lesson3_ru", method = RequestMethod.POST)
	public ModelAndView postLesson3Ru(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson3_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson3_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson3_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson3_arm", method = RequestMethod.GET)
	public ModelAndView getLesson3Arm() {
		return new ModelAndView("lesson3_arm");
	}

	@RequestMapping(value = "/lesson3_arm", method = RequestMethod.POST)
	public ModelAndView postLesson3Arm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson3_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson3_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson3_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson4", method = RequestMethod.GET)
	public ModelAndView getLesson4() {
		return new ModelAndView("lesson4");
	}

	@RequestMapping(value = "/lesson4", method = RequestMethod.POST)
	public ModelAndView postLesson4(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson4_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson4_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson4_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson4_en", method = RequestMethod.GET)
	public ModelAndView getLesson4En() {
		return new ModelAndView("lesson4_en");
	}

	@RequestMapping(value = "/lesson4_en", method = RequestMethod.POST)
	public ModelAndView postLesson4En(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson4_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson4_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson4_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson4_ru", method = RequestMethod.GET)
	public ModelAndView getLesson4Ru() {
		return new ModelAndView("lesson4_ru");
	}

	@RequestMapping(value = "/lesson4_ru", method = RequestMethod.POST)
	public ModelAndView postLesson4Ru(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson4_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson4_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson4_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson4_arm", method = RequestMethod.GET)
	public ModelAndView getLesson4Arm() {
		return new ModelAndView("lesson4_arm");
	}

	@RequestMapping(value = "/lesson4_arm", method = RequestMethod.POST)
	public ModelAndView postLesson4Arm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson4_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson4_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson4_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson5", method = RequestMethod.GET)
	public ModelAndView getLesson5() {
		return new ModelAndView("lesson5");
	}

	@RequestMapping(value = "/lesson5", method = RequestMethod.POST)
	public ModelAndView postLesson5(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson5_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson5_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson5_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson5_en", method = RequestMethod.GET)
	public ModelAndView getLesson5En() {
		return new ModelAndView("lesson5_en");
	}

	@RequestMapping(value = "/lesson5_en", method = RequestMethod.POST)
	public ModelAndView postLesson5En(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson5_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson5_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson5_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson5_ru", method = RequestMethod.GET)
	public ModelAndView getLesson5Ru() {
		return new ModelAndView("lesson5_ru");
	}

	@RequestMapping(value = "/lesson5_ru", method = RequestMethod.POST)
	public ModelAndView postLesson5Ru(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson5_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson5_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson5_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson5_arm", method = RequestMethod.GET)
	public ModelAndView getLesson5Arm() {
		return new ModelAndView("lesson5_arm");
	}

	@RequestMapping(value = "/lesson5_arm", method = RequestMethod.POST)
	public ModelAndView postLesson5Arm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson5_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson5_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson5_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson6", method = RequestMethod.GET)
	public ModelAndView getLesson6() {
		return new ModelAndView("lesson6");
	}

	@RequestMapping(value = "/lesson6", method = RequestMethod.POST)
	public ModelAndView postLesson6(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson6_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson6_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson6_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson6_en", method = RequestMethod.GET)
	public ModelAndView getLesson6En() {
		return new ModelAndView("lesson6_en");
	}

	@RequestMapping(value = "/lesson6_en", method = RequestMethod.POST)
	public ModelAndView postLesson6En(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson6_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson6_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson6_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson6_ru", method = RequestMethod.GET)
	public ModelAndView getLesson6Ru() {
		return new ModelAndView("lesson6_ru");
	}

	@RequestMapping(value = "/lesson6_ru", method = RequestMethod.POST)
	public ModelAndView postLesson6Ru(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson6_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson6_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson6_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson6_arm", method = RequestMethod.GET)
	public ModelAndView getLesson6Arm() {
		return new ModelAndView("lesson6_arm");
	}

	@RequestMapping(value = "/lesson6_arm", method = RequestMethod.POST)
	public ModelAndView postLesson6Arm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson6_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson6_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson6_arm");
		} 
		return null;
	}

	@RequestMapping(value = "/lesson7", method = RequestMethod.GET)
	public ModelAndView getLesson7() {
		return new ModelAndView("lesson7");
	}

	@RequestMapping(value = "/lesson7", method = RequestMethod.POST)
	public ModelAndView postLesson7(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson7_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson7_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson7_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson7_en", method = RequestMethod.GET)
	public ModelAndView getLesson7En() {
		return new ModelAndView("lesson7_en");
	}

	@RequestMapping(value = "/lesson7_en", method = RequestMethod.POST)
	public ModelAndView postLesson7En(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson7_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson7_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson7_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson7_ru", method = RequestMethod.GET)
	public ModelAndView getLesson7Ru() {
		return new ModelAndView("lesson7_ru");
	}

	@RequestMapping(value = "/lesson7_ru", method = RequestMethod.POST)
	public ModelAndView postLesson7Ru(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson7_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson7_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson7_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson7_arm", method = RequestMethod.GET)
	public ModelAndView getLesson7Arm() {
		return new ModelAndView("lesson7_arm");
	}

	@RequestMapping(value = "/lesson7_arm", method = RequestMethod.POST)
	public ModelAndView postLesson7Arm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson7_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson7_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson7_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson8", method = RequestMethod.GET)
	public ModelAndView getLesson8() {
		return new ModelAndView("lesson8");
	}

	@RequestMapping(value = "/lesson8", method = RequestMethod.POST)
	public ModelAndView postLesson8(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson8_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson8_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson8_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson8_en", method = RequestMethod.GET)
	public ModelAndView getLesson8En() {
		return new ModelAndView("lesson8_en");
	}

	@RequestMapping(value = "/lesson8_en", method = RequestMethod.POST)
	public ModelAndView postLesson8En(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson8_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson8_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson8_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson8_ru", method = RequestMethod.GET)
	public ModelAndView getLesson8Ru() {
		return new ModelAndView("lesson8_ru");
	}

	@RequestMapping(value = "/lesson8_ru", method = RequestMethod.POST)
	public ModelAndView postLesson8Ru(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson8_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson8_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson8_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson8_arm", method = RequestMethod.GET)
	public ModelAndView getLesson8Arm() {
		return new ModelAndView("lesson8_arm");
	}

	@RequestMapping(value = "/lesson8_arm", method = RequestMethod.POST)
	public ModelAndView postLesson8Arm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson8_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson8_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson8_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson9", method = RequestMethod.GET)
	public ModelAndView getLesson9() {
		return new ModelAndView("lesson9");
	}

	@RequestMapping(value = "/lesson9", method = RequestMethod.POST)
	public ModelAndView postLesson9(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson9_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson9_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson9_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson9_en", method = RequestMethod.GET)
	public ModelAndView getLesson9En() {
		return new ModelAndView("lesson9_en");
	}

	@RequestMapping(value = "/lesson9_en", method = RequestMethod.POST)
	public ModelAndView postLesson9En(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson9_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson9_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson9_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson9_ru", method = RequestMethod.GET)
	public ModelAndView getLesson9Ru() {
		return new ModelAndView("lesson9_ru");
	}

	@RequestMapping(value = "/lesson9_ru", method = RequestMethod.POST)
	public ModelAndView postLesson9Ru(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson9_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson9_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson9_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson9_arm", method = RequestMethod.GET)
	public ModelAndView getLesson9Arm() {
		return new ModelAndView("lesson9_arm");
	}

	@RequestMapping(value = "/lesson9_arm", method = RequestMethod.POST)
	public ModelAndView postLesson9Arm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson9_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson9_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson9_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson10", method = RequestMethod.GET)
	public ModelAndView getLesson10() {
		return new ModelAndView("lesson10");
	}

	@RequestMapping(value = "/lesson10", method = RequestMethod.POST)
	public ModelAndView postLesson10(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson10_en", method = RequestMethod.GET)
	public ModelAndView getLesson10En() {
		return new ModelAndView("lesson10_en");
	}

	@RequestMapping(value = "/lesson10_en", method = RequestMethod.POST)
	public ModelAndView postLesson10En(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm");
		} 
		return null;
	}
	
	@RequestMapping(value = "/lesson10_ru", method = RequestMethod.GET)
	public ModelAndView getLesson10Ru() {
		return new ModelAndView("lesson10_ru");
	}

	@RequestMapping(value = "/lesson10_ru", method = RequestMethod.POST)
	public ModelAndView postLesson10Ru(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("OK")) {
			if(request.getParameter("qst").equals("0")) {
				return new ModelAndView("lesson10_ru_answer0");
			}
			else if(request.getParameter("qst").equals("1")) {
				return new ModelAndView("lesson10_ru_answer1");
			}
			else if(request.getParameter("qst").equals("2")) {
				return new ModelAndView("lesson10_ru_answer2");
			}
			else if(request.getParameter("qst").equals("3")) {
				return new ModelAndView("lesson10_ru_answer3");
			}
		}
		return null;
	}

	@RequestMapping(value = "/lesson10_ru_lang", method = RequestMethod.GET)
	public ModelAndView getLesson10RuLang(){
		return new ModelAndView("lesson10_ru");
	}
	
	@RequestMapping(value = "/lesson10_ru_lang", method = RequestMethod.POST)
	public ModelAndView postLesson10RuLang(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm");
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_arm", method = RequestMethod.GET)
	public ModelAndView getLesson10Arm() {
		return new ModelAndView("lesson10_arm");
	}

	@RequestMapping(value = "/lesson10_arm", method = RequestMethod.POST)
	public ModelAndView postLesson10Arm(@RequestParam String action, HttpServletRequest request) {
		return null;
	}
	
	@RequestMapping(value = "/lesson10_arm_lang", method = RequestMethod.GET)
	public ModelAndView getLesson10ArmLang() {
		return new ModelAndView("lesson10_arm");
	}

	@RequestMapping(value = "/lesson10_arm_lang", method = RequestMethod.POST)
	public ModelAndView postLesson10ArmLang(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm");
		}
		return null;
	}
	
//answers RUS	
	@RequestMapping(value = "/lesson10_ru_answer0", method = RequestMethod.GET)
	public ModelAndView getLesson10RuAnswer0() {
		return new ModelAndView("lesson10_ru_answer0");
	}

	@RequestMapping(value = "/lesson10_ru_answer0", method = RequestMethod.POST)
	public ModelAndView postLesson10RuAnswer0(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en_answer0");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru_answer0");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm_answer0");
		}  
		else if(action.equals("OK")) {
			if(request.getParameter("qst").equals("0")) {
				return new ModelAndView("lesson10_ru_answer0");
			}
			else if(request.getParameter("qst").equals("1")) {
				return new ModelAndView("lesson10_ru_answer1");
			}
			else if(request.getParameter("qst").equals("2")) {
				return new ModelAndView("lesson10_ru_answer2");
			}
			else if(request.getParameter("qst").equals("3")) {
				return new ModelAndView("lesson10_ru_answer3");
			}
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_ru_answer0_lang", method = RequestMethod.GET)
	public ModelAndView getLesson10RuAnswer0Lang() {
		return new ModelAndView("lesson10_ru_answer0");
	}
	
	@RequestMapping(value = "/lesson10_ru_answer0_lang", method = RequestMethod.POST)
	public ModelAndView postLesson10RuAnswer0Lang(@RequestParam String action, HttpServletRequest request) {

		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en_answer0");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru_answer0");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm_answer0");
		}  
		return null;
	}
	
	@RequestMapping(value = "/lesson10_ru_answer1", method = RequestMethod.GET)
	public ModelAndView getLesson10RuAnswer1() {
		return new ModelAndView("lesson10_ru_answer1");
	}

	@RequestMapping(value = "/lesson10_ru_answer1", method = RequestMethod.POST)
	public ModelAndView postLesson10RuAnswer1(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("OK")) {
			if(request.getParameter("qst").equals("0")) {
				return new ModelAndView("lesson10_ru_answer0");
			}
			else if(request.getParameter("qst").equals("1")) {
				return new ModelAndView("lesson10_ru_answer1");
			}
			else if(request.getParameter("qst").equals("2")) {
				return new ModelAndView("lesson10_ru_answer2");
			}
			else if(request.getParameter("qst").equals("3")) {
				return new ModelAndView("lesson10_ru_answer3");
			}
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_ru_answer1_lang", method = RequestMethod.GET)
	public ModelAndView getLesson10RuAnswer1Lang() {
		return new ModelAndView("lesson10_ru_answer1");
	}
	
	@RequestMapping(value = "/lesson10_ru_answer1_lang", method = RequestMethod.POST)
	public ModelAndView postLesson10RuAnswer1Lang(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en_answer1");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru_answer1");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm_answer1");
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_ru_answer2", method = RequestMethod.GET)
	public ModelAndView getLesson10RuAnswer2() {
		return new ModelAndView("lesson10_ru_answer2");
	}
	@RequestMapping(value = "/lesson10_ru_answer2_lang", method = RequestMethod.GET)
	public ModelAndView getLesson10RuAnswer2Lang() {
		return new ModelAndView("lesson10_ru_answer2");
	}
	
	@RequestMapping(value = "/lesson10_ru_answer2_lang", method = RequestMethod.POST)
	public ModelAndView postLesson10RuAnswer2Lang(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en_answer2");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru_answer2");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm_answer2");
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_ru_answer2", method = RequestMethod.POST)
	public ModelAndView postLesson10RuAnswer2(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("OK")) {
			if(request.getParameter("qst").equals("0")) {
				return new ModelAndView("lesson10_ru_answer0");
			}
			else if(request.getParameter("qst").equals("1")) {
				return new ModelAndView("lesson10_ru_answer1");
			}
			else if(request.getParameter("qst").equals("2")) {
				return new ModelAndView("lesson10_ru_answer2");
			}
			else if(request.getParameter("qst").equals("3")) {
				return new ModelAndView("lesson10_ru_answer3");
			}
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_ru_answer3", method = RequestMethod.GET)
	public ModelAndView getLesson10RuAnswer3() {
		return new ModelAndView("lesson10_ru_answer3");
	}
	
	@RequestMapping(value = "/lesson10_ru_answer3_lang", method = RequestMethod.GET)
	public ModelAndView getLesson10RuAnswer3Lang() {
		return new ModelAndView("lesson10_ru_answer3");
	}
	
	@RequestMapping(value = "/lesson10_ru_answer3_lang", method = RequestMethod.POST)
	public ModelAndView postLesson10RuAnswer3Lang(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en_answer3");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru_answer3");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm_answer3");
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_ru_answer3", method = RequestMethod.POST)
	public ModelAndView postLesson10RuAnswer3(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("OK")) {
			if(request.getParameter("qst").equals("0")) {
				return new ModelAndView("lesson10_ru_answer0");
			}
			else if(request.getParameter("qst").equals("1")) {
				return new ModelAndView("lesson10_ru_answer1");
			}
			else if(request.getParameter("qst").equals("2")) {
				return new ModelAndView("lesson10_ru_answer2");
			}
			else if(request.getParameter("qst").equals("3")) {
				return new ModelAndView("lesson10_ru_answer3");
			}
		}
		return null;
	}
	
//answers ENG
	@RequestMapping(value = "/lesson10_en_answer0", method = RequestMethod.GET)
	public ModelAndView getLesson10EnAnswer0() {
		return new ModelAndView("lesson10_en_answer0");
	}
	
	@RequestMapping(value = "/lesson10_en_answer0_lang", method = RequestMethod.GET)
	public ModelAndView getLesson10EnAnswer0Lang() {
		return new ModelAndView("lesson10_en_answer0");
	}

	@RequestMapping(value = "/lesson10_en_answer0_lang", method = RequestMethod.POST)
	public ModelAndView postLesson10EnAnswer0Lang(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en_answer0");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru_answer0");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm_answer0");
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_en_answer0", method = RequestMethod.POST)
	public ModelAndView postLesson10EnAnswer0(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("OK")) {
			if(request.getParameter("qst").equals("0")) {
				return new ModelAndView("lesson10_en_answer0");
			}
			else if(request.getParameter("qst").equals("1")) {
				return new ModelAndView("lesson10_en_answer1");
			}
			else if(request.getParameter("qst").equals("2")) {
				return new ModelAndView("lesson10_en_answer2");
			}
			else if(request.getParameter("qst").equals("3")) {
				return new ModelAndView("lesson10_en_answer3");
			}
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_en_answer1", method = RequestMethod.GET)
	public ModelAndView getLesson10EnAnswer1() {
		return new ModelAndView("lesson10_en_answer1");
	}
	
	@RequestMapping(value = "/lesson10_en_answer1_lang", method = RequestMethod.GET)
	public ModelAndView getLesson10EnAnswer1Lang() {
		return new ModelAndView("lesson10_en_answer1");
	}

	@RequestMapping(value = "/lesson10_en_answer1", method = RequestMethod.POST)
	public ModelAndView postLesson10EnAnswer1(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("OK")) {
			if(request.getParameter("qst").equals("0")) {
				return new ModelAndView("lesson10_en_answer0");
			}
			else if(request.getParameter("qst").equals("1")) {
				return new ModelAndView("lesson10_en_answer1");
			}
			else if(request.getParameter("qst").equals("2")) {
				return new ModelAndView("lesson10_en_answer2");
			}
			else if(request.getParameter("qst").equals("3")) {
				return new ModelAndView("lesson10_en_answer3");
			}
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_en_answer1_lang", method = RequestMethod.POST)
	public ModelAndView postLesson10EnAnswer1Lang(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en_answer1");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru_answer1");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm_answer1");
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_en_answer2", method = RequestMethod.GET)
	public ModelAndView getLesson10EnAnswer2() {
		return new ModelAndView("lesson10_en_answer2");
	}
	
	@RequestMapping(value = "/lesson10_en_answer2_lang", method = RequestMethod.GET)
	public ModelAndView getLesson10EnAnswer2Lang() {
		return new ModelAndView("lesson10_en_answer2");
	}
	
	@RequestMapping(value = "/lesson10_en_answer2", method = RequestMethod.POST)
	public ModelAndView postLesson10EnAnswer2(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("OK")) {
			if(request.getParameter("qst").equals("0")) {
				return new ModelAndView("lesson10_en_answer0");
			}
			else if(request.getParameter("qst").equals("1")) {
				return new ModelAndView("lesson10_en_answer1");
			}
			else if(request.getParameter("qst").equals("2")) {
				return new ModelAndView("lesson10_en_answer2");
			}
			else if(request.getParameter("qst").equals("3")) {
				return new ModelAndView("lesson10_en_answer3");
			}
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_en_answer2_lang", method = RequestMethod.POST)
	public ModelAndView postLesson10EnAnswer2Lang(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en_answer2");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru_answer2");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm_answer2");
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_en_answer3", method = RequestMethod.GET)
	public ModelAndView getLesson10EnAnswer3() {
		return new ModelAndView("lesson10_en_answer3");
	}
	
	@RequestMapping(value = "/lesson10_en_answer3_lang", method = RequestMethod.GET)
	public ModelAndView getLesson10EnAnswer3Lang() {
		return new ModelAndView("lesson10_en_answer3");
	}
	
	@RequestMapping(value = "/lesson10_en_answer3", method = RequestMethod.POST)
	public ModelAndView postLesson10EnAnswer3(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("OK")) {
			if(request.getParameter("qst").equals("0")) {
				return new ModelAndView("lesson10_en_answer0");
			}
			else if(request.getParameter("qst").equals("1")) {
				return new ModelAndView("lesson10_en_answer1");
			}
			else if(request.getParameter("qst").equals("2")) {
				return new ModelAndView("lesson10_en_answer2");
			}
			else if(request.getParameter("qst").equals("3")) {
				return new ModelAndView("lesson10_en_answer3");
			}
		}
		return null;
	}
	
	@RequestMapping(value = "/lesson10_en_answer3_lang", method = RequestMethod.POST)
	public ModelAndView postLesson10EnAnswer3Lang(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("lesson10_en_answer3");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("lesson10_ru_answer3");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("lesson10_arm_answer3");
		}
		return null;
	}
	
//answers ARM
		@RequestMapping(value = "/lesson10_arm_answer0", method = RequestMethod.GET)
		public ModelAndView getLesson10ArmAnswer0() {
			return new ModelAndView("lesson10_arm_answer0");
		}
		
		@RequestMapping(value = "/lesson10_arm_answer0_lang", method = RequestMethod.GET)
		public ModelAndView getLesson10ArmAnswer0Lang() {
			return new ModelAndView("lesson10_arm_answer0");
		}

		@RequestMapping(value = "/lesson10_arm_answer0", method = RequestMethod.POST)
		public ModelAndView postLesson10ArmAnswer0(@RequestParam String action, HttpServletRequest request) {
			if(action.equals("OK")) {
				if(request.getParameter("qst").equals("0")) {
					return new ModelAndView("lesson10_arm_answer0");
				}
				else if(request.getParameter("qst").equals("1")) {
					return new ModelAndView("lesson10_arm_answer1");
				}
				else if(request.getParameter("qst").equals("2")) {
					return new ModelAndView("lesson10_arm_answer2");
				}
				else if(request.getParameter("qst").equals("3")) {
					return new ModelAndView("lesson10_arm_answer3");
				}
			}
			return null;
		}
		
		@RequestMapping(value = "/lesson10_arm_answer0_lang", method = RequestMethod.POST)
		public ModelAndView postLesson10ArmAnswer0Lang(@RequestParam String action, HttpServletRequest request) {
			if(action.equals("eng")){
				request.setAttribute("language", "eng");
				return new ModelAndView("lesson10_en_answer0");
			}
			else if(action.equals("rus")){
				request.setAttribute("language", "rus");
				return new ModelAndView("lesson10_ru_answer0");
			} 
			else if(action.equals("arm")){
				request.setAttribute("language", "arm");
				return new ModelAndView("lesson10_arm_answer0");
			}
			return null;
		}
		
		@RequestMapping(value = "/lesson10_arm_answer1", method = RequestMethod.GET)
		public ModelAndView getLesson10ArmAnswer1() {
			return new ModelAndView("lesson10_arm_answer1");
		}
		
		@RequestMapping(value = "/lesson10_arm_answer1_lang", method = RequestMethod.GET)
		public ModelAndView getLesson10ArmAnswer1Lang() {
			return new ModelAndView("lesson10_arm_answer1");
		}

		@RequestMapping(value = "/lesson10_arm_answer1", method = RequestMethod.POST)
		public ModelAndView postLesson10ArmAnswer1(@RequestParam String action, HttpServletRequest request) {
			if(action.equals("OK")) {
				if(request.getParameter("qst").equals("0")) {
					return new ModelAndView("lesson10_arm_answer0");
				}
				else if(request.getParameter("qst").equals("1")) {
					return new ModelAndView("lesson10_arm_answer1");
				}
				else if(request.getParameter("qst").equals("2")) {
					return new ModelAndView("lesson10_arm_answer2");
				}
				else if(request.getParameter("qst").equals("3")) {
					return new ModelAndView("lesson10_arm_answer3");
				}
			}
			return null;
		}
		
		@RequestMapping(value = "/lesson10_arm_answer1_lang", method = RequestMethod.POST)
		public ModelAndView postLesson10ArmAnswer1Lang(@RequestParam String action, HttpServletRequest request) {
			if(action.equals("eng")){
				request.setAttribute("language", "eng");
				return new ModelAndView("lesson10_en_answer1");
			}
			else if(action.equals("rus")){
				request.setAttribute("language", "rus");
				return new ModelAndView("lesson10_ru_answer1");
			} 
			else if(action.equals("arm")){
				request.setAttribute("language", "arm");
				return new ModelAndView("lesson10_arm_answer1");
			}
			return null;
		}
		
		@RequestMapping(value = "/lesson10_arm_answer2", method = RequestMethod.GET)
		public ModelAndView getLesson10ArmAnswer2() {
			return new ModelAndView("lesson10_arm_answer2");
		}

		@RequestMapping(value = "/lesson10_arm_answer2_lang", method = RequestMethod.GET)
		public ModelAndView getLesson10ArmAnswer2Lang() {
			return new ModelAndView("lesson10_arm_answer2");
		}
		
		@RequestMapping(value = "/lesson10_arm_answer2", method = RequestMethod.POST)
		public ModelAndView postLesson10ArmAnswer2(@RequestParam String action, HttpServletRequest request) {
			if(action.equals("OK")) {
				if(request.getParameter("qst").equals("0")) {
					return new ModelAndView("lesson10_arm_answer0");
				}
				else if(request.getParameter("qst").equals("1")) {
					return new ModelAndView("lesson10_arm_answer1");
				}
				else if(request.getParameter("qst").equals("2")) {
					return new ModelAndView("lesson10_arm_answer2");
				}
				else if(request.getParameter("qst").equals("3")) {
					return new ModelAndView("lesson10_arm_answer3");
				}
			}
			return null;
		}
		
		@RequestMapping(value = "/lesson10_arm_answer2_lang", method = RequestMethod.POST)
		public ModelAndView postLesson10ArmAnswer2Lang(@RequestParam String action, HttpServletRequest request) {
			if(action.equals("eng")){
				request.setAttribute("language", "eng");
				return new ModelAndView("lesson10_en_answer2");
			}
			else if(action.equals("rus")){
				request.setAttribute("language", "rus");
				return new ModelAndView("lesson10_ru_answer2");
			} 
			else if(action.equals("arm")){
				request.setAttribute("language", "arm");
				return new ModelAndView("lesson10_arm_answer2");
			}
			return null;
		}
		
		@RequestMapping(value = "/lesson10_arm_answer3", method = RequestMethod.GET)
		public ModelAndView getLesson10ArmAnswer3() {
			return new ModelAndView("lesson10_arm_answer3");
		}

		@RequestMapping(value = "/lesson10_arm_answer3_lang", method = RequestMethod.GET)
		public ModelAndView getLesson10ArmAnswer3Lang() {
			return new ModelAndView("lesson10_arm_answer3");
		}
		
		@RequestMapping(value = "/lesson10_arm_answer3", method = RequestMethod.POST)
		public ModelAndView postLesson10ArmAnswer3(@RequestParam String action, HttpServletRequest request) {
			if(action.equals("OK")) {
				if(request.getParameter("qst").equals("0")) {
					return new ModelAndView("lesson10_arm_answer0");
				}
				else if(request.getParameter("qst").equals("1")) {
					return new ModelAndView("lesson10_arm_answer1");
				}
				else if(request.getParameter("qst").equals("2")) {
					return new ModelAndView("lesson10_arm_answer2");
				}
				else if(request.getParameter("qst").equals("3")) {
					return new ModelAndView("lesson10_arm_answer3");
				}
			}
			return null;
		}
		
		@RequestMapping(value = "/lesson10_arm_answer3_lang", method = RequestMethod.POST)
		public ModelAndView postLesson10ArmAnswer3Lang(@RequestParam String action, HttpServletRequest request) {
			if(action.equals("eng")){
				request.setAttribute("language", "eng");
				return new ModelAndView("lesson10_en_answer3");
			}
			else if(action.equals("rus")){
				request.setAttribute("language", "rus");
				return new ModelAndView("lesson10_ru_answer3");
			} 
			else if(action.equals("arm")){
				request.setAttribute("language", "arm");
				return new ModelAndView("lesson10_arm_answer3");
			}
			return null;
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
		else return "redirect:home";
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

	@RequestMapping(value="/about", method=RequestMethod.POST)
	public ModelAndView aboutPost(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("about_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("about_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("about_arm");
		} 
		return null;
	}

	@RequestMapping(value = "about_en", method = RequestMethod.GET)
	public ModelAndView aboutEn(ModelMap model) {
		ModelAndView modelAndView = new ModelAndView("about_en");
		return modelAndView;
	}

	@RequestMapping(value="/about_en", method=RequestMethod.POST)
	public ModelAndView aboutPost_en(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("about_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("about_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("about_arm");
		} 
		return null;
	}

	@RequestMapping(value = "about_ru", method = RequestMethod.GET)
	public ModelAndView aboutRu(ModelMap model) {
		ModelAndView modelAndView = new ModelAndView("about_ru");
		return modelAndView;
	}

	@RequestMapping(value="/about_ru", method=RequestMethod.POST)
	public ModelAndView aboutPost_ru(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("about_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("about_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("about_arm");
		} 
		return null;
	}

	@RequestMapping(value = "about_arm", method = RequestMethod.GET)
	public ModelAndView aboutArm(ModelMap model) {
		ModelAndView modelAndView = new ModelAndView("about_arm");
		return modelAndView;
	}

	@RequestMapping(value="/about_arm", method=RequestMethod.POST)
	public ModelAndView aboutPost_arm(@RequestParam String action, HttpServletRequest request) {
		if(action.equals("eng")){
			request.setAttribute("language", "eng");
			return new ModelAndView("about_en");
		}
		else if(action.equals("rus")){
			request.setAttribute("language", "rus");
			return new ModelAndView("about_ru");
		} 
		else if(action.equals("arm")){
			request.setAttribute("language", "arm");
			return new ModelAndView("about_arm");
		} 
		return null;
	}

	@RequestMapping(value = "contact", method = RequestMethod.GET)
	public ModelAndView contact(ModelMap model) {
		ModelAndView modelAndView = new ModelAndView("contact");
		return modelAndView;
	}
}

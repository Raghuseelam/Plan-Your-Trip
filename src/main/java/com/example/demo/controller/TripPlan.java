 package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Packagee;
import com.example.demo.entity.PastBookings;
import com.example.demo.entity.Place;
import com.example.demo.entity.User;
import com.example.demo.entity.userlogin;
import com.example.demo.repo.PackageRepo;
import com.example.demo.repo.PastRepo;
import com.example.demo.repo.PlaceRepo;
import com.example.demo.repo.UserRepo;
import com.example.demo.repo.userloginRepo;

@Controller
public class TripPlan {
	@Autowired
	PlaceRepo prepo;
	@Autowired
	UserRepo userrepo;
	@Autowired
	PackageRepo packagerepo;
	@Autowired
	PastRepo pastrepo;
	@Autowired
	userloginRepo  loginrepo;
	private ModelAndView mv;
	@RequestMapping("/Userlogin")
	public String login()
	{
		return "Userlogin.jsp";
	}  
	@RequestMapping(value="/Userlogin",method=RequestMethod.GET)
	public String log()
	{
		return "Userlogin.jsp";
	}
	@RequestMapping(value="/Userlogin",method=RequestMethod.POST)
	public String log(@RequestParam("userName") String userName,@RequestParam("password") String password,ModelMap m)
	{
		userlogin u=loginrepo.findByUsernamePassword(userName,password);	
			if(u!=null)
			{
				String uname=u.getUserName();
				String upassword=u.getPassword();
		if(userName.equals(uname) && password.equals(upassword))
		{
			return "other.jsp";
			
		}
		else
		{
			return "Userlogin.jsp";
		}
			}
			else
			{
			  m.put("error", "Invalid Account");
				return "Userlogin.jsp";
			}
		//return "Userlogin.jsp";
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String reg()
	{
		return "register.jsp";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView reg(userlogin log)
	{
		ModelAndView mv = new ModelAndView("register.jsp");
		loginrepo.save(log);
		return mv;
		
	}
	@RequestMapping("/home1")
	public String home1() {
		return "home1.jsp";
	}
	
	@DeleteMapping("/packages/{id}")
	public String deletePackage(@PathVariable int id)
	{
		Packagee pack1=packagerepo.findById(id);
		packagerepo.delete(pack1);
		return "home1.jsp";
		
	}
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public String loginpage()
	{
		return "login.jsp";
	}
	@RequestMapping(value="/users",method=RequestMethod.POST)
	public ModelAndView loginpage(@RequestParam String userName,@RequestParam String password)
	{
		if(userName.equals("admin") && password.equals("root"))
		{
			
			ModelAndView mv = new ModelAndView("users.jsp");
			List<User> users = userrepo.findAll();
			mv.addObject("users", userrepo.findAll());
			System.out.println(users);
			return mv;
		}
		return mv;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	
	public String loginpage1()
	{
		return "login.jsp";
	
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	
	public String loginpage1(@RequestParam String userName,@RequestParam String password)
	{
		if(userName.equals("admin") && password.equals("root"))
		{
			
			return "packageeadd.jsp";
			
		}
		return "login.jsp";
	}
	@RequestMapping(value="/packageeadd",method=RequestMethod.GET)
	public String add()
	{
		return "packageeadd.jsp";
	}
	
	@RequestMapping(value="/packageeadd",method=RequestMethod.POST)
	public ModelAndView add(Packagee pack)
	{
		ModelAndView mv = new ModelAndView("packageeadd.jsp");
		packagerepo.save(pack);
		return mv;
		
	}
	public String update(@RequestParam int id)
	{
		packagerepo.deleteById(id);
		return "home1.jsp";
	}
	@RequestMapping(value = "packageadd", method = RequestMethod.DELETE)
	public String delete1(@RequestParam("id") int id,HttpRequest request)
	{
		packagerepo.deleteById(id);
		return "home1.jsp";
	}
	

	@RequestMapping(value = "/places", method = RequestMethod.GET)
	public String places() {
		return "places.jsp";
	}

	@RequestMapping(value = "/places", method = RequestMethod.POST)
	public ModelAndView places(@RequestParam String places) {
		ModelAndView mv = new ModelAndView("places.jsp");
		System.out.println(places);
		Place place = prepo.findByName(places);
		System.out.println(place);
		mv.addObject(place);
		return mv;
	}

	@RequestMapping(value = "/placess")
	public ModelAndView placess() {
		ModelAndView mv = new ModelAndView("placess.jsp");
		List<Place> places = prepo.findAll();
		mv.addObject("places", prepo.findAll());
		System.out.println(places);
		return mv;
	}

	@RequestMapping(value = "/users")
	public ModelAndView users() {
		ModelAndView mv = new ModelAndView("users.jsp");
		//List<User> users = userrepo.findAll();
		mv.addObject("users", userrepo.findAll());
		//System.out.println(users);
		return mv;
	}

	@RequestMapping(value = "/packages")
	public ModelAndView packages() {
		ModelAndView mv = new ModelAndView("packages.jsp");
		List<Packagee> packages = packagerepo.findAll();
		mv.addObject("packages", packagerepo.findAll());
		System.out.println(packages);
		return mv;
	}
	@RequestMapping(value = "/packages info")
	public ModelAndView packages1() {
		ModelAndView mv = new ModelAndView("packages info.jsp");
		List<Packagee> packages = packagerepo.findAll();
		mv.addObject("packages", packagerepo.findAll());
		System.out.println(packages);
		return mv;
	}
	@RequestMapping(value = "/pay", method = RequestMethod.GET)
	public String pay() {
		return "pay.jsp";
	}

	@RequestMapping(value = "/pay", method = RequestMethod.POST)
	public ModelAndView pay(@RequestParam String pays) {
		ModelAndView mv = new ModelAndView("pay.jsp");
		System.out.println(pays);
		Packagee packagee = packagerepo.findByName(pays);
		System.out.println(packagee);
		mv.addObject(packagee);
		return mv;
	}

	@RequestMapping(value = "/pastbookings", method = RequestMethod.GET)
	public String pastbookings1() {
		return "pastbookings.jsp";
	}

	@RequestMapping(value = "/pastbookings", method = RequestMethod.POST)
	public ModelAndView pastbookings(@RequestParam String emailId) {
		ModelAndView mv = new ModelAndView("pastbookings.jsp");
		System.out.println(emailId);
		if (emailId.equals("All")) {
			System.out.println("all");
			List<PastBookings> bookings = pastrepo.findAll();
			mv.addObject("pastbookings", pastrepo.findAll());
			System.out.println(bookings);
		} else {
			System.out.println("id");
			List<PastBookings> bookings = pastrepo.findByemailId(emailId);
			mv.addObject("pastbookings", pastrepo.findByemailId(emailId));
			System.out.println(bookings);
		}
		return mv;
	}

	@RequestMapping(value = "/other", method = RequestMethod.GET)
	public String book() {
		return "other.jsp";
	}

	@RequestMapping(value = "/other", method = RequestMethod.POST)
	public ModelAndView book(PastBookings bookings) {
		ModelAndView mv = new ModelAndView("other.jsp");
		String packageName = bookings.getPackagename();
		System.out.println(bookings);
		System.out.println(packageName);
		Packagee pack = packagerepo.findByName(packageName);
		bookings.setDays(pack.getDays());
		bookings.setInclusion(pack.getInclusion());
		bookings.setPrice(pack.getPrice());
		System.out.println(bookings);
		pastrepo.save(bookings);
		User user = new User();
		user.setEmailId(bookings.getEmailId());
		user.setUserName(bookings.getUserName());
		user.setPhnNum(bookings.getPhnNum());
		userrepo.save(user);
		return mv;   
	}
	@RequestMapping("/")
	public String home() {
		return "home1.jsp";
	}

}

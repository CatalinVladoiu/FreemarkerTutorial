package org.freemarker.web.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.freemarker.core.model.Contact;
import org.freemarker.core.model.Gender;
import org.freemarker.web.custom.CustomHttpServlet;
import org.springframework.stereotype.Controller;

@Controller
public class ContactAddController extends CustomHttpServlet {
	private static final long serialVersionUID = -4559740868178370249L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		List<Gender> genders = genderService.findAll();
		req.setAttribute("genders", genders);

		req.getRequestDispatcher("views/contact/add.ftl").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String telephone = req.getParameter("telephone");
		String email = req.getParameter("email");
		String birthdate = req.getParameter("birthdate");
		String genderValue = req.getParameter("gender");

		Contact c = new Contact();
		c.setFirstname(firstname);
		c.setLastname(lastname);
		c.setEmail(email);
		c.setTelephone(telephone);
		c.setGender(genderService.findOne(Long.parseLong(genderValue)));
		c.setBirthdate(createBirthDate(birthdate));

		contactService.save(c);

		List<Contact> users = contactService.findAll();

		req.setAttribute("users", users);
		req.getRequestDispatcher("views/contact/list.ftl").forward(req, resp);
	}

	private Date createBirthDate(String bDateAsString) {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		Date t = null;
		try {
			t = ft.parse(bDateAsString);
			System.out.println(t);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
		}
		return t;
	}
}

package org.freemarker.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.freemarker.core.model.Contact;
import org.freemarker.web.custom.CustomHttpServlet;
import org.springframework.stereotype.Controller;

@Controller
public class ContactListController extends CustomHttpServlet {

	private static final long serialVersionUID = -7807099068182746651L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		List<Contact> users = contactService.findAll();
		req.setAttribute("users", users);

		req.getRequestDispatcher("views/contact/list.ftl").forward(req, resp);
	}
}
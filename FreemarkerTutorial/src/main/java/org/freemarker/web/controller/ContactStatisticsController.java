package org.freemarker.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.freemarker.web.custom.CustomHttpServlet;
import org.springframework.stereotype.Controller;

@Controller
public class ContactStatisticsController extends CustomHttpServlet {

	private static final long serialVersionUID = -2079230563384623669L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("views/contact/statistics.ftl").forward(req,
				resp);
	}
}

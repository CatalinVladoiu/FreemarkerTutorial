package org.freemarker.web.custom;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.freemarker.core.service.ContactService;
import org.freemarker.core.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

public abstract class CustomHttpServlet extends HttpServlet {
	private static final long serialVersionUID = -7189912196784360629L;

	@Autowired
	protected ContactService contactService;

	@Autowired
	protected GenderService genderService;

	public void init(ServletConfig config) throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
				config.getServletContext());
		super.init(config);
	}
}

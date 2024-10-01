package com.jslhrd.exmvc.service.guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exmvc.model.guest.GuestDAO;
import com.jslhrd.exmvc.model.guest.GuestDTO;
import com.jslhrd.exmvc.service.Action;

public class GuestModifyAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));

		GuestDAO dao = GuestDAO.getInstance();

		GuestDTO dto = dao.guestSelect(idx);

		request.setAttribute("dto", dto);

		RequestDispatcher rd = request.getRequestDispatcher("Guest/guest_modify.jsp");
		rd.forward(request, response);

	}

}

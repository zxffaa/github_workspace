package com.jslhrd.exmvc.service.guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exmvc.model.guest.GuestDAO;
import com.jslhrd.exmvc.model.guest.GuestDTO;
import com.jslhrd.exmvc.service.Action;

public class GuestModifyProAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		GuestDTO dto = new GuestDTO();

		dto.setIdx(Integer.parseInt(request.getParameter("idx")));
		dto.setSubject(request.getParameter("subject"));
		dto.setContents(request.getParameter("contents"));
		dto.setPass(request.getParameter("pass"));

		GuestDAO dao = GuestDAO.getInstance();

		int row = dao.guestModify(dto);

		request.setAttribute("row", row);

		RequestDispatcher rd = request.getRequestDispatcher("Guest/guest_modify_pro.jsp");
		rd.forward(request, response);

	}

}

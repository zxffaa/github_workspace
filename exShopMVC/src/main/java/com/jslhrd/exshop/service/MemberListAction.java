package com.jslhrd.exshop.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exshop.model.MemberCityDTO;
import com.jslhrd.exshop.model.ShopDAO;

public class MemberListAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShopDAO dao=ShopDAO.getInstance();
		List<MemberCityDTO>list=dao.memList();
		request.setAttribute("list", list);
		RequestDispatcher rd=request.getRequestDispatcher("memList.jsp");
		rd.forward(request, response);
	}

}

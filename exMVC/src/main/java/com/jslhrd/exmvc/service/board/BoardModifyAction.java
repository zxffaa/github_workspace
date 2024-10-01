package com.jslhrd.exmvc.service.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exmvc.model.board.BoardDAO;
import com.jslhrd.exmvc.model.board.BoardDTO;
import com.jslhrd.exmvc.service.Action;


public class BoardModifyAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		int nowpage = Integer.parseInt(request.getParameter("page"));
		
		BoardDAO dao=BoardDAO.getInstance();
		BoardDTO bod=dao.boardSelect(idx);
		request.setAttribute("bod", bod);
		request.setAttribute("page", nowpage);
		RequestDispatcher l = 
				request.getRequestDispatcher("Board/board_modify.jsp");
		l.forward(request, response);

	}

}

package com.jslhrd.exmvc.service.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exmvc.model.board.BoardDAO;
import com.jslhrd.exmvc.service.Action;


public class BoardDeleteProAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		int nowpage=Integer.parseInt(request.getParameter("page"));
		String pass = request.getParameter("pass");
		
		BoardDAO DAO = BoardDAO.getInstance();
		
	
		int row = DAO.boardDelete(idx, pass);
		if(row==1) {//성공
			request.setAttribute("row", 1);
			request.setAttribute("page", nowpage);
		}else {//실패
			request.setAttribute("row", 0);
		}

		RequestDispatcher rd = 
				request.getRequestDispatcher("Board/board_delete_pro.jsp");
		rd.forward(request, response);
	}

}

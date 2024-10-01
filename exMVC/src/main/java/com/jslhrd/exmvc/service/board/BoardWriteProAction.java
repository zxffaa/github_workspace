package com.jslhrd.exmvc.service.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exmvc.model.board.BoardDAO;
import com.jslhrd.exmvc.model.board.BoardDTO;
import com.jslhrd.exmvc.service.Action;

public class BoardWriteProAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		int nowpage = Integer.parseInt(request.getParameter("page"));

		BoardDAO dao = BoardDAO.getInstance();
		BoardDTO dto = new BoardDTO();

		dto.setName(request.getParameter("name"));
		dto.setEmail(request.getParameter("email"));
		dto.setSubject(request.getParameter("subject"));
		dto.setContents(request.getParameter("contents"));
		dto.setPass(request.getParameter("pass"));
		// 테스트
		// out.print(dto.getName());

		int row = dao.boardWrite(dto);
		/*
		 * if(row==1) response.sendRedirect("board_list"); else
		 * response.sendRedirect("board_write");
		 */
		request.setAttribute("row", row);
		request.setAttribute("page", nowpage);

		RequestDispatcher rd = request.getRequestDispatcher("Board/board_write_pro.jsp");
		rd.forward(request, response);

	}

}

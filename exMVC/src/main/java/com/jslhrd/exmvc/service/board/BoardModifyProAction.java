package com.jslhrd.exmvc.service.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exmvc.model.board.BoardDAO;
import com.jslhrd.exmvc.model.board.BoardDTO;
import com.jslhrd.exmvc.service.Action;


public class BoardModifyProAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		int nowpage=Integer.parseInt(request.getParameter("page"));
		BoardDTO dto = new BoardDTO();
		
		dto.setIdx(Integer.parseInt(request.getParameter("idx")));
		dto.setSubject(request.getParameter("subject"));
		dto.setContents(request.getParameter("contents"));
		dto.setPass(request.getParameter("pass"));
		
		BoardDAO dao = BoardDAO.getInstance();
		
		int row = dao.boardModify(dto);
		if(row==1) {//성공
			request.setAttribute("row", 1);
			request.setAttribute("page", nowpage);
		}else {//실패
			request.setAttribute("row", 0);
		}
		
		
		RequestDispatcher rd =
				request.getRequestDispatcher("Board/board_modify_pro.jsp");
		rd.forward(request, response);

	}

}

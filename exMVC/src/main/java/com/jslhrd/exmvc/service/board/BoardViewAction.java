package com.jslhrd.exmvc.service.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exmvc.model.board.BoardDAO;
import com.jslhrd.exmvc.model.board.BoardDTO;
import com.jslhrd.exmvc.service.Action;


public class BoardViewAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx=Integer.parseInt(request.getParameter("idx"));
		int nowpage=Integer.parseInt(request.getParameter("page"));
		
		BoardDAO dao=BoardDAO.getInstance();
		boolean found=false;
		Cookie info=null;
		Cookie[] cookies=request.getCookies();
		
		for(int i=0;i<cookies.length;i++) {
			info=cookies[i];
			if(info.getName().equals("boardCookie"+idx)) {
				found=true;
				break;
			}
		}
		
		String newValue=""+System.currentTimeMillis();
		
		if(!found) {
			info=new Cookie("boardCookie"+idx,newValue);
			response.addCookie(info);
			dao.boardHits(idx);
		}
		BoardDTO bod=dao.boardSelect(idx);
		
		request.setAttribute("board", bod);
		request.setAttribute("page", nowpage);
		
		RequestDispatcher k = request.getRequestDispatcher("Board/board_view.jsp");
		k.forward(request, response);

	}

}

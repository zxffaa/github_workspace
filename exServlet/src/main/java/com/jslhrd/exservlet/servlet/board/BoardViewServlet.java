package com.jslhrd.exservlet.servlet.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.board.*;
import com.jslhrd.exservlet.model.guest.GuestDTO;

/**
 * Servlet implementation class BoardViewServlet
 */
@WebServlet("/board_view")
public class BoardViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx=Integer.parseInt(request.getParameter("idx"));
		BoardDAO dao=BoardDAO.getInstance();
		
		boolean bool=false;
		Cookie info=null;
		Cookie[] cookies=request.getCookies();
		for(int i=0;i<cookies.length;i++) {
			info=cookies[i];
			if(info.getName().equals(cookies)) {
				bool=true;
				break;
			}
		}
		String newValue=""+System.currentTimeMillis();
		if(!bool) {
		info=new Cookie("exServletBoard"+idx,newValue);	
		info.setMaxAge(60*60);
		response.addCookie(info);
		}
		BoardDTO dto=dao.boardSelect(idx);
		dto.setContents(dto.getContents().replace("\n", "<br>"));
		request.setAttribute("dto", dto);
		RequestDispatcher rd=request.getRequestDispatcher("Board/board_view.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

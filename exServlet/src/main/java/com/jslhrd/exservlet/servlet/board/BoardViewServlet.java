package com.jslhrd.exservlet.servlet.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.board.BoardDAO;
import com.jslhrd.exservlet.model.board.BoardDTO;

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
		
		request.setAttribute("bod", bod);
		request.setAttribute("page", nowpage);
		
		RequestDispatcher k = request.getRequestDispatcher("Board/board_view.jsp");
		k.forward(request, response);
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

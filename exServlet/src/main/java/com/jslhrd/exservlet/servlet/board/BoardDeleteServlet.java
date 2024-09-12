package com.jslhrd.exservlet.servlet.board;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.board.*;



/**
 * Servlet implementation class BoardDeleteServlet
 */
@WebServlet("/board_delete")
public class BoardDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		int nowpage = Integer.parseInt(request.getParameter("page"));
		request.setAttribute("idx", idx);
		request.setAttribute("page", nowpage);
		RequestDispatcher rd = request.getRequestDispatcher("/Board/board_delete.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

package com.jslhrd.exservletjstl.servlet.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservletjstl.model.board.BoardDAO;
import com.jslhrd.exservletjstl.model.board.BoardDTO;


/**
 * Servlet implementation class BoardModifyServlet
 */
@WebServlet("/board_modify.do")
public class BoardModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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

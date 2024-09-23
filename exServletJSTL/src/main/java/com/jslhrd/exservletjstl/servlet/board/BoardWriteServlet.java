package com.jslhrd.exservletjstl.servlet.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservletjstl.model.board.BoardDAO;
import com.jslhrd.exservletjstl.model.board.BoardDTO;

/**
 * Servlet implementation class BoardWriteServlet
 */
@WebServlet("/board_write.do")
public class BoardWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		RequestDispatcher rd = 
				request.getRequestDispatcher("Board/board_write.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		BoardDAO dao = BoardDAO.getInstance();
		BoardDTO dto = new BoardDTO();
		
		dto.setName(request.getParameter("name"));
		dto.setEmail(request.getParameter("email"));
		dto.setSubject(request.getParameter("subject"));
		dto.setContents(request.getParameter("contents"));
		dto.setPass(request.getParameter("pass"));
		//테스트
		//out.print(dto.getName());
		
		int row = dao.boardWrite(dto);
/*	
		if(row==1)
			response.sendRedirect("board_list");
		else
			response.sendRedirect("board_write");
*/			

		
		request.setAttribute("row", row);
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("Board/board_write_pro.jsp");
		rd.forward(request, response);

	}

}

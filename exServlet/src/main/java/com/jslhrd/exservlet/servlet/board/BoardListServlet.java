package com.jslhrd.exservlet.servlet.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.board.BoardDAO;
import com.jslhrd.exservlet.model.board.BoardDTO;


/**
 * Servlet implementation class BoardListServlet
 */
@WebServlet("/board_list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = BoardDAO.getInstance();
		//총게시글 수
		String url = "pds_list";
		String search = "", key = "";
		int totcount = 0;  
		//검색 조건이 포함될경우
		if(request.getParameter("key") != null && !request.getParameter("key").equals("")) {
			search = request.getParameter("search");
			key = request.getParameter("key");
			totcount = dao.boardCount(search, key);// 총 글수 추출
		}else {
			totcount = dao.boardCount();   // 총 글수 추출
		}


		List<BoardDTO> BoardList = null;
		if(key.equals("")) {
			BoardList = dao.boardList();
		}else {
			BoardList = dao.boardList(search, key);
		}
		

		request.setAttribute("totcount", totcount);
		request.setAttribute("list", BoardList);
		request.setAttribute("search", search);
		request.setAttribute("key", key);
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("Board/board_list.jsp");
		dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}

package com.jslhrd.exservlet.servlet.guest;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.guest.GuestDAO;
import com.jslhrd.exservlet.model.guest.GuestDTO;

/**
 * Servlet implementation class GuestListServlet
 */
@WebServlet("/guest_list")
public class GuestListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DB 연결
		GuestDAO dao = GuestDAO.getInstance();
		
		String search="", key="";
		int totcount = 0;
		List<GuestDTO> list = null;
		
		if(request.getParameter("key") != null) {
			search = request.getParameter("search");
			key= request.getParameter("key");
			
			totcount = dao.guestCount(search, key);
			list = dao.guestList(search, key);
		}else {
			//총게시글수
			totcount = dao.guestCount();
			list = dao.guestList();
		}
		//총게시글수
		//int totcount = dao.guestCount();
		
		//전체글 목록
		//List<GuestDTO> list = dao.guestList();
		
		//request 내장 객체에 정보 담기 request.setAttribute()
		request.setAttribute("totcount", totcount);
		request.setAttribute("list", list);
		request.setAttribute("search", search);
		request.setAttribute("key", key);
		//request.setAttribute("name", "홍길동");
	
		RequestDispatcher rd = 
				request.getRequestDispatcher("Guest/guest_list.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
		
		
	}

}

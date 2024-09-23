package com.jslhrd.exservletjstl.servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservletjstl.model.user.UserDAO;

/**
 * Servlet implementation class UserIdCheckServlet
 */
//아이디중복체크
@WebServlet("/user_id_check")
public class UserIdCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserIdCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd = 
				request.getRequestDispatcher("User/user_id_check.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userid = request.getParameter("userid");
		
		UserDAO dao = UserDAO.getInstance();
		
		int row = dao.userIdCheck(userid);
		//row=1 => 중복된 id, row=0 => 사용가능한 id
		request.setAttribute("row", row);
		request.setAttribute("userid", userid);
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("User/user_id_check.jsp");
		rd.forward(request, response);
		
	
	
	}

}

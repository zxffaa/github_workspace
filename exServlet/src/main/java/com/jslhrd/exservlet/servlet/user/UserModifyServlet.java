package com.jslhrd.exservlet.servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.guest.GuestDAO;
import com.jslhrd.exservlet.model.guest.GuestDTO;
import com.jslhrd.exservlet.model.user.*;

/**
 * Servlet implementation class UserModifyServlet
 */
@WebServlet("/user_modify")
public class UserModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  userid=request.getParameter("userid");
		UserDAO dao = UserDAO.getInstance();
		UserDTO dto = dao.userSelect(userid);
		request.setAttribute("dto", dto);
		
		RequestDispatcher rd=request.getRequestDispatcher("User/user_modify.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserDTO dto = new UserDTO();

		dto.setPasswd(request.getParameter("passwd"));
		dto.setTel(request.getParameter("tel"));
		dto.setLast_time(request.getParameter("last_time"));
		
		UserDAO dao = UserDAO.getInstance();

		int row = dao.userModify(dto);

		request.setAttribute("row", row);

		RequestDispatcher rd = request.getRequestDispatcher("User/user_modify_pro.jsp");
		rd.forward(request, response);
	}

}

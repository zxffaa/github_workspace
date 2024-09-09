package com.jslhrd.exservlet.servlet.pds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.pds.PdsDAO;
import com.jslhrd.exservlet.model.pds.PdsDTO;

/**
 * Servlet implementation class PdsModifyServlet
 */
@WebServlet("/pds_modify")
public class PdsModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdsModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx=Integer.parseInt(request.getParameter("idx"));
		PdsDAO dao=PdsDAO.getinstance();
		PdsDTO dto=dao.PdsSelect(idx);
		request.setAttribute("dto", dto);
		RequestDispatcher rd = request.getRequestDispatcher("Pds/pds_modify.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		PdsDTO dto=new PdsDTO();
		
		dto.setIdx(Integer.parseInt(request.getParameter("idx")));
		dto.setSubject(request.getParameter("subject"));
		dto.setContents(request.getParameter("contents"));
		dto.setEmail(request.getParameter("email"));
		dto.setFilename(request.getParameter("filename"));
		dto.setPass(request.getParameter("pass"));
		
		
		PdsDAO dao=PdsDAO.getinstance();
		
		int row=dao.pdsModify(dto);
		
		
		request.setAttribute("row",row);
		RequestDispatcher rd=request.getRequestDispatcher("Pds/pds_modify_pro.jsp")
		
		
		doGet(request, response);
	}

}

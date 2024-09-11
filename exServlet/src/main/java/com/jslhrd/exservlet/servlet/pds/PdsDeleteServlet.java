package com.jslhrd.exservlet.servlet.pds;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.pds.PdsDAO;

/**
 * Servlet implementation class PdsDeleteServlet
 */
@WebServlet("/pds_delete")
public class PdsDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdsDeleteServlet() {
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
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_delete.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		String pass = request.getParameter("pass");
		
		PdsDAO DAO = PdsDAO.getInstance();
		
		String filename = DAO.pdsFileSearch(idx);
		int row = DAO.pdsDelete(idx, pass); //
		if(row==1) {//성공
			// 파일 삭제
			ServletContext context = getServletContext();
			String path = context.getRealPath("Pds/upload/");// 파일 저장 경로
			File file = new File(path+filename);
			if(file.exists()) {
				file.delete();
			}

			request.setAttribute("sw", 1);
		}else {//실패
			request.setAttribute("sw", 0);
		}

		RequestDispatcher rd = 
				request.getRequestDispatcher("Pds/pds_delete_pro.jsp");
		rd.forward(request, response);
	}

}

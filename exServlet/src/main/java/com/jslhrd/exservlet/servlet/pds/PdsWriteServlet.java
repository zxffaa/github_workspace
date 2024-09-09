package com.jslhrd.exservlet.servlet.pds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.pds.PdsDAO;
import com.jslhrd.exservlet.model.pds.PdsDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class PdsWriteServlet
 */
@WebServlet("/pds_write")
public class PdsWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdsWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/Pds/pds_write.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		PdsDAO dao=PdsDAO.getinstance();
		PdsDTO dto=new PdsDTO();
		
		
		ServletContext context=getServletContext();
		//파일저장경로
		String path=context.getRealPath("Pds/upload");
		String encType="UTF-8";
		int maxSize=5*1024*1024;//저장용량(2M)
		
		int row=0;
	
		//기본 지정
		MultipartRequest multi=new MultipartRequest(request,path,maxSize,encType,new DefaultFileRenamePolicy());
		//파일 중복시 이름을 바꿔서 추가해준다
		//new DefaultFileRenamePolicy()
		dto.setName(multi.getParameter("name"));
		dto.setEmail(multi.getParameter("email"));
		dto.setSubject(multi.getParameter("subject"));
		dto.setContents(multi.getParameter("contents"));
		dto.setFilename(multi.getFilesystemName("filename"));
		dto.setPass(multi.getParameter("pass"));
		String o_file_name=multi.getOriginalFileName("filename");		
		row=dao.pdsWrite(dto);
		request.setAttribute("row",row);
		RequestDispatcher rd = 
				request.getRequestDispatcher("Pds/pds_write_pro.jsp");
		rd.forward(request, response);
			
	}

}

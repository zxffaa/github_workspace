package com.jslhrd.exservletjstl.servlet.pds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservletjstl.model.pds.PdsDAO;
import com.jslhrd.exservletjstl.model.pds.PdsDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class PdsWrite
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

		
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_write.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//서버상의 실제 경로 찾기
		ServletContext context = getServletContext();
		String path = context.getRealPath("Pds/upload");
		//System.out.println("서버상의 실제 경로 : " + path);//
		
		String encType = "UTF-8";
		int sizeLimit = 2 * 1024 * 1024;//최대 2MB
		MultipartRequest multi = new MultipartRequest(request, path, sizeLimit,
				encType, new DefaultFileRenamePolicy());
		//new DefaultFileRenamePolicy()파일중복처리(a.bm 중복시-> a1.bmp)

		String name = multi.getParameter("name");
		String pass = multi.getParameter("pass");
		String subject = multi.getParameter("subject");
		String contents = multi.getParameter("contents");
		String filename = multi.getFilesystemName("filename");
		
		PdsDTO pVo = new PdsDTO();
		pVo.setName(name);
		pVo.setPass(pass);
		pVo.setSubject(subject);
		pVo.setContents(contents);
		pVo.setFilename(filename);
		
		PdsDAO pDao = PdsDAO.getInstance();
		int row = pDao.pdsWrite(pVo);
		
		if(row==1) {//성공
			request.setAttribute("row", 1);
		}else {//실패
			request.setAttribute("row", 0);
		}

		RequestDispatcher d = request.getRequestDispatcher("Pds/pds_write_pro.jsp");
		d.forward(request, response);
	}

}

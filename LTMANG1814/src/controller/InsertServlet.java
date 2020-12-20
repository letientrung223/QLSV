package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.AccountBO;
import model.BO.StudentBO;
import model.bean.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//CODE TRONG NAY
		String _masv =request.getParameter("textmasv");
		String _hoten = request.getParameter("texthoten");
		String _khoa = request.getParameter("textKhoa");
		String _namsinh = request.getParameter("textNamsinh");
		if (_masv ==""||_hoten==""||_khoa==""||_namsinh=="")
		{
			
		}
		else
		{	
		Student st = new Student(_masv,_hoten,_khoa,_namsinh);
		StudentBO.InsertStudent(st);
		}
		response.sendRedirect("insertStudent.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

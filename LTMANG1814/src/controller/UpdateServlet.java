package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.StudentBO;
import model.bean.Student;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Code o day
		String _masv =request.getParameter("textmasv");
		String _hoten = request.getParameter("texthoten");
		String _khoa = request.getParameter("textKhoa");
		String _namsinh = request.getParameter("textNamsinh");
		if (_masv ==""||_hoten==""||_khoa==""||_namsinh=="")
		{
			response.sendRedirect("updateStudent.jsp");
		}
		else
		{	
		Student st = new Student(_masv,_hoten,_khoa,_namsinh);
		StudentBO.UpdateStudent(st);
		}
		response.sendRedirect("updateStudent.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

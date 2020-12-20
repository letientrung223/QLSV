package model.BO;

import java.util.List;

import model.DAO.StudentDAO;
import model.bean.Student;

public class StudentBO {
	public static List<Student> getAllStudent() 
	{
		return StudentDAO.getAllStudent();
	}
	public static Student getStudent(String id) 
	{
		return StudentDAO.getStudent(id);
	}
	public static void InsertStudent(Student sv)
	{
		StudentDAO.InsertStudent(sv);
	}
	public static void UpdateStudent(Student sv) 
	{
		StudentDAO.UpdateStudent(sv);
	}
	public static void DeleteStudent(String MSSV) 
	{
		StudentDAO.DeleteStudent(MSSV);
	}

}

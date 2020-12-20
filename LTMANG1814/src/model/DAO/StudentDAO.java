package model.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.bean.*;
public class StudentDAO 
{
	//Xem thong tin danh sach sinh vien
	public static List<Student> getAllStudent() 
	{
        List<Student> svList = new ArrayList<>();
       
		Connection connection = JDBCConnection.getJDBCConnection();
		 
			Statement stm;
			try {
				stm = connection.createStatement();
			
			String sql ="Select * from student";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next())
			{
				
				String _masv  = rs.getString("masv");
				String _hoten= rs.getString("hoten");
				String _khoa= rs.getString("khoa");
				String _namsinh= rs.getString("namsinh");
				Student std = new Student(_masv,_hoten,_khoa,_namsinh);
				svList.add(std);
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return svList;     
	}
	// Xem thong tin sinh vien
	public static Student getStudent(String id) 
	{
        
		List<Student> stdList = new ArrayList<>();
		 Connection connection = JDBCConnection.getJDBCConnection();
		 try {
			Statement stm = connection.createStatement();
			String sql ="Select * from student";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next())
			{
				
				String _masv  = rs.getString("masv");
				String _hoten = rs.getString("hoten");
				String _khoa  = rs.getString("khoa");
				String _namsinh= rs.getString("namsinh");
				Student std = new Student(_masv,_hoten,_khoa,_namsinh);
				stdList.add(std);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 for (Student a : stdList)
		 {
			 if ((a.getMasv().equals(id)))
			 {return a;}
		 }
		return null;    
	}
	//Chen thong tin sinh vien
	public static void InsertStudent(Student sv) 
	{
		Connection connection = JDBCConnection.getJDBCConnection();
		PreparedStatement stm;
		try {
		 String sql = "INSERT INTO student (masv,hoten,khoa,namsinh) VALUES (?,?,?,?)";
		 stm = connection.prepareCall(sql);
			stm.setString(1,sv.getMasv());
			stm.setString(2,sv.getHoten());
			stm.setString(3,sv.getKhoa());
			stm.setString(4,sv.getNamsinh());	
			stm.execute();
		} catch (SQLException e ) {e.printStackTrace();}
		
	}
	//Sua thong tin sinh vien
	public static void UpdateStudent(Student sv) {
		Connection connection = JDBCConnection.getJDBCConnection();
		PreparedStatement stm;
		try {
		 String sql = "UPDATE student SET masv=?,hoten=?,khoa=?,namsinh=? WHERE masv =?";
		 stm = connection.prepareCall(sql);
			stm.setString(1,sv.getMasv());
			stm.setString(2,sv.getHoten());
			stm.setString(3,sv.getKhoa());
			stm.setString(4,sv.getNamsinh());
			stm.setString(5,sv.getMasv());
			stm.execute();
		} catch (SQLException e ) {e.printStackTrace();}
		
	}
	//Xoa thong tin sinh vien
	public static void DeleteStudent(String MSSV) {
		Connection connection = JDBCConnection.getJDBCConnection();
		PreparedStatement stm;
		try {
			String sql = "delete from student where masv = ?";
            stm = connection.prepareCall(sql);
            
            stm.setString(1, MSSV);
            
            stm.execute();
		}catch(SQLException e) {e.printStackTrace();}
	}
}

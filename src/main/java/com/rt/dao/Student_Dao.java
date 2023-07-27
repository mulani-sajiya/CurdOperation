package com.rt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rt.Entity.Student;

@Repository
public class Student_Dao {
	@Autowired
	JdbcTemplate template;
//register operation
	public boolean register(Student s) {
		try{
			Object[] args = {s.getName(),s.EmailId(),s.getMobile(),s.getAddress(),s.getState(),s.getCity()};
			int a= template.update(
					"insert into student_biodata(`name`,`emailId`,`mobile`,`address`,`city`,`state`) values(?,?,?,?,?,?)",
					args);

			if(a==1)
			{
				return true;
			}else
			{
				return false;
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	
	
//update operation
public boolean  update(Student s) {
		try{
			Object[] args = {s.getName(),s.EmailId(),s.getMobile(),s.getAddress(),s.getCity(),s.getState()};
			int a= template.update(
									"update into student_biodata set  name=?,emailId=?, mobile=?,address=?,state=?, city=?,where id=? ",args);
			if(a==1)
			{
				return true;
			}else
			{
				return false;
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
		
		
	}

//delete operation
	public boolean delete( int id){
		try{
		Object[] args={id};
		int a= template.update(
				"delete from student_boidata where id=?",args);
		if(a==1)
		{
			return true;
		}
		else {
			return false;
		}
	}catch(Exception e)
		{
		System.out.println(e);
		}
		return false;
	}
	
//select operation	
public Student selectStudentById(int id)
	{
		Student s =null;
		try{
			
			Object[] args ={ id };
			s=template.queryForObject("select * from student_biodata where id =?",args,
					new RowMapper<Student>() {
				public Student mapRow(ResultSet rs,int rowNum) throws SQLException{
					return new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				}
											});
				
				}catch(Exception e)
		{
					System.out.println(e);		
		}
		return s;
	}

//select all operation	
public List<Student>selectAllStudent() {
		List<Student>List = null;
		try{
			List =template.query("select * from student_biodata",
					new RowMapper<Student>() {
				public Student mapRow(ResultSet rs,int rowNum) throws SQLException{
					return new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				}
											});
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return List;
	}

		

}

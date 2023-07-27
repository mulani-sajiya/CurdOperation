package com.rt.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dao.Student_Dao;
import com.rt.Entity.Student;

@Service
public class Student_service {
	
	

		@Autowired
		Student_Dao studDao;
		
		public boolean register(Student s){
			return studDao.register(s);
		}

		public boolean update(Student s){
			return studDao.update(s);
		}
		public boolean delete( int id){
			return studDao.delete(id);
		}
		public Student selectStudentById(int id) {
			 return studDao.selectStudentById(id);
			
		}

		public List<Student> selectAllStudent() {
			 return studDao.selectAllStudent();
		}
		
}


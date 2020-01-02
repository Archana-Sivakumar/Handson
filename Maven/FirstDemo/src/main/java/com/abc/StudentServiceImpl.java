package com.abc;

import org.springframework.beans.factory.annotation.Autowired;


public class StudentServiceImpl implements StudentService{
    @Autowired 
    
    StudentDao studentDao;
    
	public void add() {
		// TODO Auto-generated method stub
		 studentDao.add();
	}

	public void fetch() {
		// TODO Auto-generated method stub
		 studentDao.fetch();
	}

	public void delete() {
		// TODO Auto-generated method stub
		 studentDao.delete();
	}

	public void update() {
		// TODO Auto-generated method stub
		 studentDao.update();
	}
	

}

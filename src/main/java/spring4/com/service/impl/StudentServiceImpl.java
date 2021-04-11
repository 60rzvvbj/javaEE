package spring4.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring4.com.dao.StudentDao;
import spring4.com.po.Student;
import spring4.com.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    @Transactional
    public void exchangeMajor(int sno1, int sno2) {
        Student student1 = studentDao.selectStudentBySno(sno1);
        Student student2 = studentDao.selectStudentBySno(sno2);
        int t = student1.getMno();
        student1.setMno(student2.getMno());
        student2.setMno(t);
        studentDao.updateStudent(student1);
        t = 1 / 0;
        studentDao.updateStudent(student2);
    }
}

package mybatis1.com.mapper;

import mybatis1.com.po.Teacher;

import java.util.List;

public interface TeacherMapper {
    public Teacher selectTeacherByTno(Integer tno);

    public List<Teacher> selectTeacherByTname(String tname);

    public int insertTeacher(Teacher teacher);

    public int deleteTeacher(Integer tno);

    public int updateTeacher(Teacher teacher);

//    实验六
    public int deleteTeacherByTno(int i);
}

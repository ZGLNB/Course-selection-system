package com.service;

import com.mapper.CourseMapper;
import com.pojo.Course;
import com.pojo.PageBean;
import com.pojo.User;
import com.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class SelectService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();



    public PageBean<Course> selectCourse(int currentPage, int pageSize, Course course){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        //��������
        int begin = (currentPage - 1)*pageSize;
        int size = pageSize ;
        //��ѯ��ҳ
        List<Course> rows = mapper.selectCourse(begin,size,course);
        int totalCount = mapper.selectTotalCountCourse(course);
        //��װPageBean����
        PageBean<Course> pageBean = new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);
        sqlSession.close();
        return pageBean;
    }

    public PageBean<User> selectTeacher(int currentPage, int pageSize, User user){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        //��������
        int begin = (currentPage - 1)*pageSize;
        int size = pageSize ;
        //��ѯ��ҳ
        List<User> rows = mapper.selectTeacher(begin,size,user);
        int totalCount = mapper.selectTotalCountTeacher(user);
        //��װPageBean����
        PageBean<User> pageBean = new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);
        sqlSession.close();
        return pageBean;
    }
    public PageBean<User> selectStudent(int currentPage, int pageSize, User user){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        //��������
        int begin = (currentPage - 1)*pageSize;
        int size = pageSize ;
        //��ѯ��ҳ
        List<User> rows = mapper.selectStudent(begin,size,user);
        int totalCount = mapper.selectTotalCountStudent(user);
        //��װPageBean����
        PageBean<User> pageBean = new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);
        sqlSession.close();
        return pageBean;
    }
    //�����γ�
    public void addCourse(Course course){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        mapper.addCourse(course);
        sqlSession.commit();
        sqlSession.close();
    }
    //������ʦ
    public void addTeacher(User user){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        mapper.addTeacher(user);
        sqlSession.commit();
        sqlSession.close();
    }
    //����ѧ��
    public void addStudent(User user){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        mapper.addStudent(user);
        sqlSession.commit();
        sqlSession.close();
    }
    
    //ɾ���γ�
    public void deleteCourseById(int id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        mapper.deleteCourseById(id);
        sqlSession.commit();
        sqlSession.close();
    }
    //ɾ����ʦ
    public void deleteTeacherById(int id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        mapper.deleteTeacherById(id);
        sqlSession.commit();
        sqlSession.close();
    }
    //ɾ��ѧ��
    public void deleteStudentById(int id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        mapper.deleteStudentById(id);
        sqlSession.commit();
        sqlSession.close();
    }
    
    //�޸Ŀγ���Ϣ
    public void upDateCourse(Course course){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        mapper.upDateCourse(course);
        sqlSession.commit();
        sqlSession.close();
    }
    //�޸Ŀγ���Ϣ
    public void upDateTeacher(User user){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        mapper.upDateTeacher(user);
        sqlSession.commit();
        sqlSession.close();
    }
    //�޸Ŀγ���Ϣ
    public void upDateStudent(User user){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        mapper.upDateStudent(user);
        sqlSession.commit();
        sqlSession.close();
    }

    //ѧ���鿴��ѡ�γ�
    public PageBean<Course> selectCourse_Optional(int currentPage, int pageSize, Course course,int id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        //��������
        int begin = (currentPage - 1)*pageSize;
        int size = pageSize ;
        //��ѯ��ҳ
        List<Course> rows = mapper.selectCourse_Optional(begin,size,course,id);
        int totalCount = mapper.selectTotalCountCourse_Optional(course,id);
        //��װPageBean����
        PageBean<Course> pageBean = new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);
        sqlSession.close();
        return pageBean;
    }

    //ѧ���鿴��ѡ�γ�
    public PageBean<Course> selectCourse_Selected(int currentPage, int pageSize, Course course,int id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        //��������
        int begin = (currentPage - 1)*pageSize;
        int size = pageSize ;
        //��ѯ��ҳ
        List<Course> rows = mapper.selectCourse_Selected(begin,size,course,id);
        int totalCount = mapper.selectTotalCountCourse_Selected(course,id);
        //��װPageBean����
        PageBean<Course> pageBean = new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);
        sqlSession.close();
        return pageBean;
    }

    //ѡ��
    public void takeCourse(int id,int courseId){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        mapper.takeCourse(id,courseId);
        sqlSession.commit();
        sqlSession.close();
    }
    //��ѡ
    public void deselectCourse(int id,int courseId){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        mapper.deselectCourse(id,courseId);
        sqlSession.commit();
        sqlSession.close();
    }

    //��ʦ�鿴�Լ��Ŀγ�
    public PageBean<Course> selectMyCourse(int currentPage, int pageSize, Course course,String name){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        //��������
        int begin = (currentPage - 1)*pageSize;
        int size = pageSize ;
        //��ѯ��ҳ
        List<Course> rows = mapper.selectMyCourse(begin,size,course,name);
        int totalCount = mapper.selectTotalCountMyCourse(course,name);
        //��װPageBean����
        PageBean<Course> pageBean = new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);
        sqlSession.close();
        return pageBean;
    }

    public List<User> showNameList(int id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        List<User> users = mapper.showNameList(id);
        sqlSession.close();
        return users;
    }

}

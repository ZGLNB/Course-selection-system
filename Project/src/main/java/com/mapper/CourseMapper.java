package com.mapper;

import com.pojo.Course;
import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
    //��ҳ������ѯ---�γ̲�ѯ
    List<Course> selectCourse(@Param("begin")int begin , @Param("size")int size, @Param("course")Course course);
    //��ѯ�ܼ�¼��---�γ̲�ѯ
    int selectTotalCountCourse(Course course);
    //��ʦ�˻���ѯ
    List<User> selectTeacher(@Param("begin")int begin,@Param("size")int size,@Param("user") User user);
    //��ʦ�˻���¼��
    int selectTotalCountTeacher(User user);
    //��ʦ�˻���ѯ
    List<User> selectStudent(@Param("begin")int begin,@Param("size")int size,@Param("user") User user);
    //��ʦ�˻���¼��
    int selectTotalCountStudent(User user);
    //�����γ�
    void addCourse(Course course);
    //������ʦ
    void addTeacher(User user);
    //����ѧ��
    void addStudent(User user);
    //ɾ���γ�
    void deleteCourseById(int id);
    //ɾ����ʦ
    void deleteTeacherById(int id);
    //ɾ��ѧ��
    void deleteStudentById(int id);
    //�޸Ŀγ�
    void upDateCourse(Course course);
    //�޸Ľ�ʦ
    void upDateTeacher(User user);
    //�޸�ѧ��
    void upDateStudent(User user);
    //ѧ���鿴��ѡ�γ�
    List<Course> selectCourse_Optional(@Param("begin")int begin , @Param("size")int size, @Param("course")Course course,@Param("id")int id);
    //��ѯ�ܼ�¼��---ѧ���鿴��ѡ�γ�
    int selectTotalCountCourse_Optional(@Param("course") Course course,@Param("id") int id);
    //ѧ���鿴��ѡ�γ�
    List<Course> selectCourse_Selected(@Param("begin")int begin , @Param("size")int size, @Param("course")Course course,@Param("id")int id);
    //��ѯ�ܼ�¼��---ѧ���鿴��ѡ�γ�
    int selectTotalCountCourse_Selected(@Param("course") Course course,@Param("id") int id);
    //ѧ��ѡ��
    void takeCourse(@Param("id") int id,@Param("courseId") int courseId);
    //��ѡ
    void deselectCourse(@Param("id") int id,@Param("courseId") int courseId);
    //��ʦ�鿴�Լ��Ŀγ�
    List<Course> selectMyCourse(@Param("begin")int begin , @Param("size")int size, @Param("course")Course course,@Param("name")String name);
    //��ѯ�ܼ�¼��--��ʦ�鿴�γ�
    int selectTotalCountMyCourse(@Param("course") Course course,@Param("name") String name);
    //�鿴ĳ�ڿε�ѧ������
    List<User> showNameList(int id);

}

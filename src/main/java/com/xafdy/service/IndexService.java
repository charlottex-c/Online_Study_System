
package com.xafdy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xafdy.mapper.AdminMapper;
import com.xafdy.mapper.CollegeMapper;
import com.xafdy.mapper.CourseFileMapper;
import com.xafdy.mapper.CourseMapper;
import com.xafdy.mapper.CourseVideoMapper;
import com.xafdy.mapper.DiscussMapper;
import com.xafdy.mapper.DiscussPostMapper;
import com.xafdy.mapper.NoticeMapper;
import com.xafdy.mapper.StudentFileMapper;
import com.xafdy.mapper.StudentMapper;
import com.xafdy.mapper.StudentTaskMapper;
import com.xafdy.mapper.TaskMapper;
import com.xafdy.mapper.TaskQuestionMapper;
import com.xafdy.mapper.TeacherMapper;
import com.xafdy.model.Admin;
import com.xafdy.model.College;
import com.xafdy.model.Course;
import com.xafdy.model.CourseFile;
import com.xafdy.model.CourseVideo;
import com.xafdy.model.Discuss;
import com.xafdy.model.DiscussPost;
import com.xafdy.model.Notice;
import com.xafdy.model.Student;
import com.xafdy.model.StudentFile;
import com.xafdy.model.StudentTask;
import com.xafdy.model.Task;
import com.xafdy.model.TaskQuestion;
import com.xafdy.model.Teacher;

@Service
public class IndexService {
	@Autowired
	private CollegeMapper collegeMapper;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private TeacherMapper teacherMapper;
	
	@Autowired
	private CourseMapper courseMapper;
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Autowired
	private CourseVideoMapper collegeVideoMapper;
	
	@Autowired
	private CourseFileMapper courseFileMapper;
	
	@Autowired
	private DiscussMapper discussMapper;
	
	@Autowired
	private TaskMapper taskMapper;
	
	@Autowired
	private TaskQuestionMapper taskQuestionMapper;
	
	@Autowired
	private DiscussPostMapper discussPostMapper;
	
	@Autowired
	private StudentTaskMapper studentTaskMapper;
	
	@Autowired
	private StudentFileMapper studentFileMapper;
	
	@Autowired
	private AdminMapper adminMapper;

	private int id;
	
	public void saveCollege(College college) {
		collegeMapper.saveColege(college);
	}
	
	public void saveStudent(Student student) {
		studentMapper.saveEntity(student);
	}
	
	public List<Student> searchStudent() {
		return studentMapper.searchEntity();
	}
	
	public void deleteStudent(Integer id) {
		
		studentMapper.deleteEntity(id);
		
	}
	
	public void deleteStudents(String id) {
		
		String [] a1=id.split(",");
		for(int i=0;i<a1.length;i++){
		
		studentMapper.deleteEntitys(a1[i]);
		}
		
		
	}
	
	
	public void updateStudent(Student student) {
		studentMapper.updateEntity(student);
	}
	
	public Student getStudentById(Integer id) {
		return studentMapper.getEntityById(id);
	}
	
	public List<College> searchCollege() {
		return collegeMapper.searchCollege();
	}
	
	public College getCollegeById(Integer id) {
		return collegeMapper.getCollegeById(id);
	}
	
	public void deleteColege(Integer id) {
		collegeMapper.deleteCollege(id);
	}
	
	public void updateColege(College college) {
		collegeMapper.updateCollege(college);
	}
	
	public void saveTeacher(Teacher teacher) {
		teacherMapper.saveEntity(teacher);
	}
	
	public List<Teacher> searchTeacher() {
		return teacherMapper.searchEntity();
	}
	
	public void deleteTeacher(Integer id) {
		teacherMapper.deleteEntity(id);
	}
	
	public void updateTeacher(Teacher teacher) {
		teacherMapper.updateEntity(teacher);
	}
	
	public Teacher getTeacherById(Integer id) {
		return teacherMapper.getEntityById(id);
	}
	
	public void saveCourse(Course course) {
		courseMapper.saveEntity(course);
	}
	
	public List<Course> searchCourse() {
		return courseMapper.searchEntity();
	}
	public List<Student> sousuo(String uname) {
		return studentMapper.sousuo(uname);
	}
	
	public void deleteCourse(Integer id) {
		courseMapper.deleteEntity(id);
	}
	
	public void updateCourse(Course course) {
		courseMapper.updateEntity(course);
	}
	
	public Course getCourseById(Integer id) {
		return courseMapper.getEntityById(id);
	}
	
	public void saveNotice(Notice notice) {
		noticeMapper.saveEntity(notice);
	}
	
	public List<Notice> searchNotice() {
		return noticeMapper.searchEntity();
	}
	
	public void deleteNotice(Integer id) {
		noticeMapper.deleteEntity(id);
	}
	
	public void updateNotice(Notice notice) {
		noticeMapper.updateEntity(notice);
	}
	
	public Notice getNoticeById(Integer id) {
		return noticeMapper.getEntityById(id);
	}
	
	public void saveCollegeVideo(CourseVideo collegeVideo) {
		collegeVideoMapper.saveEntity(collegeVideo);
	}
	
	public List<CourseVideo> searchCollegeVideo(int id) {
		return collegeVideoMapper.searchEntity(id);
	}
	
	public List<CourseVideo> searchAllCollegeVideo() {
		return collegeVideoMapper.searchAllEntity();
	}
	
	public List<CourseFile> searchAllCollegeFile() {
		return courseFileMapper.searchAllEntity();
	}
	public List<StudentFile> searchAllStduntFile(Integer id) {
		return studentFileMapper.searchAllEntity(id);
	}
	public CourseVideo getCourseVideoById(Integer id) {
		return collegeVideoMapper.getEntityById(id);
	}
	
	public CourseFile getCourseFileById(Integer id) {
		return courseFileMapper.searchEntityById(id);
	}
	
	public StudentFile getStudentFileById(Integer id) {
		return studentFileMapper.searchEntityById(id);
	}
	
	public void deleteCollegeVideo(Integer id) {
		collegeVideoMapper.deleteEntity(id);
	}
	
	public void saveCollegeFile(CourseFile collegeFile) {
		courseFileMapper.saveEntity(collegeFile);
	}
	
	public void saveStudentFile(StudentFile studentfile ) {
		studentFileMapper.saveEntity(studentfile);
	}
	
	public List<CourseFile> searchCollegeFile(int id) {
		return courseFileMapper.searchEntity(id);
	}
	
	public void deleteCollegeFile(Integer id) {
		courseFileMapper.deleteEntity(id);
	}
	
	public void deleteStudengtFile(Integer id) {
		studentFileMapper.deleteEntity(id);
		
	}
	
	public void saveDiscuss(Discuss discuss) {
		discussMapper.saveEntity(discuss);
	}
	
	public List<Discuss> searchDiscuss() {
		return discussMapper.searchEntity();
	}
	
	public void deleteDiscuss(Integer id) {
		discussMapper.deleteEntity(id);
	}
	
	public void updateDiscuss(Discuss discuss) {
		discussMapper.updateEntity(discuss);
	}
	
	public Discuss getDiscussById(Integer id) {
		return discussMapper.getEntityById(id);
	}
	
	
	public void saveTask(Task task) {
		taskMapper.saveEntity(task);
	}
	
	public List<Task> searchTask() {
		return taskMapper.searchEntity();
	}
	
	public void deleteTask(Integer id) {
		taskMapper.deleteEntity(id);
	}
	
	public void updateTask(Task task) {
		taskMapper.updateEntity(task);
	}
	
	public Task getTaskById(Integer id) {
		return taskMapper.getEntityById(id);
	}
	
	
	public void saveTaskQuestion(TaskQuestion taskQuestion) {
		taskQuestionMapper.saveEntity(taskQuestion);
	}
	
	public List<TaskQuestion> searchTaskQuestion(Integer taskId) {
		return taskQuestionMapper.searchEntity(taskId);
	}
	
	public void deleteTaskQuestion(Integer id) {
		taskQuestionMapper.deleteEntity(id);
	}
	
	public void updateTaskQuestion(TaskQuestion taskQuestion) {
		taskQuestionMapper.updateEntity(taskQuestion);
	}
	
	public TaskQuestion getTaskQuestionById(Integer id) {
		return taskQuestionMapper.getEntityById(id);
	}
	
	public void saveDiscussPost(DiscussPost discussPost) {
		discussPostMapper.saveEntity(discussPost);
	}
	
	public List<DiscussPost> searchDiscussPost(Integer id) {
		return discussPostMapper.searchEntity(id);
	}
	
	public void saveStudentTask(StudentTask studentTask) {
		studentTaskMapper.saveEntity(studentTask);
	}
	
	public List<StudentTask> searchStudentTask() {
		return studentTaskMapper.searchEntity();
	}
	

	
	
	
	public List<StudentTask> searchStudentTaskByStuId(Integer stuId) {
		return studentTaskMapper.searchEntityByStuId(stuId);
	}
	
	public List<StudentFile> searchStudentFile(Integer id) {
		return studentFileMapper.searchEntity(id);
	}
	
	public Admin adminLogon(Map<String, String> map) {
		return adminMapper.searchEntityByAccount(map);
	}
	
	public Student studentLogon(Map<String, String> map) {
		return studentMapper.searchEntityByAccount(map);
	}
	
	public Teacher teacherLogon(Map<String, String> map) {
		return teacherMapper.searchEntityByAccount(map);
	}
}

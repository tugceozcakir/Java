package service;

import java.util.List;

import model.Branch;
import model.Instructor;
import model.Lecture;
import model.LectureScheduleTime;
import model.Student;


public class LectureService {
     /*    
     private String name;
     private Instructor instructor;
     private Branch branch;
     private int capacity;
     private List<LectureScheduleTime> lectureScheduleTimeList;
     private List<Student> studentList; 
     */
    public Lecture createLecture(String name, Instructor instructor, Branch branch, Integer capacity,
    List<LectureScheduleTime> lectureScheduleTimeList, List<Student> students){
        Lecture lecture = new Lecture();
        lecture.setName(name);
        lecture.setInstructor(instructor);
        lecture.setBranch(branch);
        lecture.setCapacity(capacity);
        lecture.setLectureScheduleTimeList(lectureScheduleTimeList);
        lecture.setStudentList(students);
        return lecture;
    }
}

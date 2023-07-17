package service;

import java.util.HashSet;
import java.util.Set;

import model.Branch;
import model.Instructor;
import model.Lecture;
import model.LectureScheduleTime;
import model.RepeatedTime;
import model.Student;

public class LectureService {

    public Lecture createLecture(String name, Branch branch, int capacity) {
        Lecture lecture = new Lecture();
        lecture.setName(name);
        lecture.setBranch(branch);
        lecture.setCapacity(capacity);
        return lecture;
    }

    public void addInstructorToLecture(Lecture lecture, Instructor instructor) {
        lecture.setInstructor(instructor);
    }

    public void addScheduleTimeToLecture(Lecture lecture, Set<LectureScheduleTime> lectureScheduleTimeSet) {
        if (lecture.getLectureScheduleTimeSet()!=null) {
            lecture.getLectureScheduleTimeSet().addAll(lectureScheduleTimeSet);
        } else {
            lecture.setLectureScheduleTimeSet(lectureScheduleTimeSet);
        }
    }

    public void autoGenerateScheduleTimeForLecture(Lecture lecture, RepeatedTime repeatedTime, String time) {

    }

    public boolean enrollStudentToLecture(Lecture lecture, Student student) {
        if (lecture.getStudentsEnrolled() == null) {
            lecture.setStudentsEnrolled(new HashSet<>());
        }

        if (lecture.getStudentsEnrolled().size() >= lecture.getCapacity()) {
            System.out.println("Ders kapasitesi dolu, öğrenci eklenemiyor.");
            return false;
        }

        if (lecture.getStudentsEnrolled().contains(student)) {
            System.out.println("Öğrenci zaten bu ders kayıtlı.");
            return false;
        }

        lecture.getStudentsEnrolled().add(student);
        return true;
    }

    
}
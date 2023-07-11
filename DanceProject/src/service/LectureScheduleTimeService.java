package service;

import model.Day;
import model.LectureScheduleTime;

public class LectureScheduleTimeService {
     /*
     private Day dayOfWeek;
     private String time;
      */

     public LectureScheduleTime createLectureScheduleTime(Day dayOfWeeek, String time){
            LectureScheduleTime lectureScheduleTime = new LectureScheduleTime();
            lectureScheduleTime.setDayOfWeek(dayOfWeeek);
            lectureScheduleTime.setTime(time);
            return lectureScheduleTime;
     }
}

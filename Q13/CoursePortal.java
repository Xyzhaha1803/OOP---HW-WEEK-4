/* Class Course: fields title, duration, instructor, method getCourseInfo()
Subclasses:
LiveCourse: add scheduleTime
RecordedCourse: add videoCount
Use encapsulation and method overriding
File: CoursePortal.java */

class Course {
    public String title;
    public String duration;
    public String instructor;

    public void getCourseInfo(){
        System.out.println("--------------------");
        System.out.println("Course Title: " + title);
        System.out.println("Course Duration:  " + duration);
        System.out.println("Course Instructor: " + instructor);
    }
}

class LiveCourse extends Course {
    private String scheduleTime;

    public void setscheduleTime(String sT){
        this.scheduleTime = sT;
    }

    public String getscheduleTime(){
        return scheduleTime;
    }

    public LiveCourse(String t, String d, String i){
        this.title = t;
        this.duration = d;
        this.instructor = i;
    }

    @Override
    public void getCourseInfo(){
        System.out.println("--------------------");
        System.out.println("Course Title: " + title);
        System.out.println("Course Duration: " + duration);
        System.out.println("Course Instructor: " + instructor);
        System.out.println("Scheduled Time: " + getscheduleTime());
    }
}

class RecordedCourse extends Course {
    private int videoCount;

    public void setvideoCount(int vC){
        this.videoCount = vC;
    }

    public int getvideoCount(){
        return videoCount;
    }

    public RecordedCourse(String t, String d, String i){
        this.title = t;
        this.duration = d;
        this.instructor = i;
    }

    public void getCourseInfo(){
        System.out.println("--------------------");
        System.out.println("Course Title: " + title);
        System.out.println("Course Duration: " + duration);
        System.out.println("Course Instructor: " + instructor);
        System.out.println("Course Video Count: " + getvideoCount());
    }
}

public class CoursePortal {
    public static void main(String[] args) {
        LiveCourse live = new LiveCourse("BBA", "3 years", "Ngim");
        RecordedCourse record = new RecordedCourse("Maths", "2 years", "Kul");

        live.setscheduleTime("6.30AM");
        record.setvideoCount(54);

        live.getCourseInfo();
        record.getCourseInfo();
    }
}

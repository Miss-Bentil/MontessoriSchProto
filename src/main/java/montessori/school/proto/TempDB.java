package montessori.school.proto;

import com.grpcdemo.Project;
import com.grpcdemo.Student;

import java.util.ArrayList;
import java.util.List;

public class TempDB {

    public static List<Student> getStudentsFromTempDb() {
        return new ArrayList<Student>() {
            {
                add(Student.newBuilder().setStudentId(1).setProjectId(1).setFirstName("Kwame").setLastName("Appiah").setLevel("beginner").build());
                add(Student.newBuilder().setStudentId(2).setFirstName("Efua").setLastName("Zealand").setLevel("intermediate").build());
                add(Student.newBuilder().setStudentId(3).setFirstName("James").setLastName("Ampofo").setLevel("beginner").build());
                add(Student.newBuilder().setStudentId(4).setFirstName("Queensland").setLastName("Wright").setLevel("advanced").build());
            }
        };
    }

    public static List<Project> getProjectsFromTempDb() {
        return new ArrayList<Project>() {
            {
                add(Project.newBuilder().setProjectId(1).setStudentId(1).setName("Project one").setLevelOfDifficulty("level one").setDuration("3 months").build());
                add(Project.newBuilder().setProjectId(2).setStudentId(1).setName("Project two").setLevelOfDifficulty("level one").setDuration("3 months").build());
                add(Project.newBuilder().setProjectId(3).setStudentId(2).setName("Project three").setLevelOfDifficulty("level two").setDuration("3 months").build());
                add(Project.newBuilder().setProjectId(4).setStudentId(3).setName("Project four").setLevelOfDifficulty("level three").setDuration("3 months").build());
                add(Project.newBuilder().setProjectId(5).setStudentId(3).setName("Project five").setLevelOfDifficulty("level four").setDuration("3 months").build());
                add(Project.newBuilder().setProjectId(6).setStudentId(4).setName("Project six").setLevelOfDifficulty("level three").setDuration("3 months").build());
            }
        };
    }


}

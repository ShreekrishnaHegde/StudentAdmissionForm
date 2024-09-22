package net.firstProject.saf.mapper;

import net.firstProject.saf.dto.StudentDto;
import net.firstProject.saf.entity.Student;

public class StudentMapper {

        public static StudentDto mapToStudentDto(Student student){
            return new StudentDto(
                    student.getId(),
                    student.getFirstName(),
                    student.getLastName(),
                    student.getEmail(),
                    student.getPu_percentage(),
                    student.getAddress()
            );
        }

       public static Student mapToStudent(StudentDto studentDto){
            return new Student(
                    studentDto.getId(),
                    studentDto.getFirstName(),
                    studentDto.getLastName(),
                    studentDto.getEmail(),
                    studentDto.getPu_percentage(),
                    studentDto.getAddress()
            );
       }
}

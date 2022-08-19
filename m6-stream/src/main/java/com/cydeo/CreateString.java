package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateString {
    public static void main(String[] args) {

        //creating stream from array

        String[] course = {"Java","Spring","Agile"};

        Stream<String> courseSteam=Arrays.stream(course);

        //Creating Stream from Collection

        List<String> courseList = Arrays.asList("Java","Spring","Agile");


        Stream<String> courseStream2 = courseList.stream();

        List<Course> mycourses = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("MS",102));

        Stream<Course> myCourseStream = mycourses.stream();

        //creating stream values
        Stream<Integer> stream = Stream.of(1,2,3,4);









    }
}

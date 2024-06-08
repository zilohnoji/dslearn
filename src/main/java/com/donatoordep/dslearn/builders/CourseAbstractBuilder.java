package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.Course;

public interface CourseAbstractBuilder extends Builder<Course> {

    CourseAbstractBuilder id(Long id);

    CourseAbstractBuilder name(String name);

    CourseAbstractBuilder imgUri(String imgUri);

    CourseAbstractBuilder imgGrayUri(String imgGrayUri);
}
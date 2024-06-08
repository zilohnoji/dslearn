package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.Section;
import com.donatoordep.dslearn.entities.Task;

import java.time.Instant;

public interface TaskAbstractBuilder extends Builder<Task> {

    TaskAbstractBuilder id(Long id);

    TaskAbstractBuilder description(String description);

    TaskAbstractBuilder questionCount(Integer questionCount);

    TaskAbstractBuilder approvalCount(Integer approvalCount);

    TaskAbstractBuilder weight(Double weight);

    TaskAbstractBuilder dueDate(Instant dueDate);

    TaskAbstractBuilder lessonTitle(String title);

    TaskAbstractBuilder lessonPosition(Integer position);

    TaskAbstractBuilder lessonSection(Section section);
}
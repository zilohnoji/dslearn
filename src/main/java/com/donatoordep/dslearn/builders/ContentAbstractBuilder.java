package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.Content;
import com.donatoordep.dslearn.entities.Section;

public interface ContentAbstractBuilder extends Builder<Content> {

    ContentAbstractBuilder id(Long id);

    ContentAbstractBuilder textContent(String textContent);

    ContentAbstractBuilder videoUri(String videoUri);

    ContentAbstractBuilder lessonTitle(String title);

    ContentAbstractBuilder lessonPosition(Integer position);

    ContentAbstractBuilder lessonSection(Section section);
}
package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.Resource;
import com.donatoordep.dslearn.entities.Section;

public interface SectionAbstractBuilder extends Builder<Section> {

    SectionAbstractBuilder id(Long id);

    SectionAbstractBuilder title(String title);

    SectionAbstractBuilder description(String description);

    SectionAbstractBuilder position(Integer position);

    SectionAbstractBuilder resource(Resource resource);

    SectionAbstractBuilder prerequisite(Section prerequisite);
}
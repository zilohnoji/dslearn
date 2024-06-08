package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.Offer;
import com.donatoordep.dslearn.entities.Resource;
import com.donatoordep.dslearn.enums.ResourceType;

public interface ResourceAbstractBuilder extends Builder<Resource> {

    ResourceAbstractBuilder id(Long id);

    ResourceAbstractBuilder title(String title);

    ResourceAbstractBuilder description(String description);

    ResourceAbstractBuilder position(String position);

    ResourceAbstractBuilder imgUri(String imgUri);

    ResourceAbstractBuilder type(ResourceType type);

    ResourceAbstractBuilder offer(Offer offer);
}
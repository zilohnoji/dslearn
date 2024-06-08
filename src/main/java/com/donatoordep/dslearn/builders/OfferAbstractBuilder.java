package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.Offer;

import java.time.Instant;

public interface OfferAbstractBuilder extends Builder<Offer> {

    OfferAbstractBuilder id(Long id);

    OfferAbstractBuilder edition(String edition);

    OfferAbstractBuilder startMoment(Instant startMoment);

    OfferAbstractBuilder endMoment(Instant endMoment);
}
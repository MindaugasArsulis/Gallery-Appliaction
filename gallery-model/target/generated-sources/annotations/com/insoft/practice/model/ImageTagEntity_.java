package com.insoft.practice.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ImageTagEntity.class)
public abstract class ImageTagEntity_ {

	public static volatile SetAttribute<ImageTagEntity, ImageEntity> image;
	public static volatile SingularAttribute<ImageTagEntity, Long> id;
	public static volatile SingularAttribute<ImageTagEntity, String> tagName;

	public static final String IMAGE = "image";
	public static final String ID = "id";
	public static final String TAG_NAME = "tagName";

}


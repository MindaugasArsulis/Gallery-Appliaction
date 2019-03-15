package com.insoft.practice.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ImageEntity.class)
public abstract class ImageEntity_ {

	public static volatile SingularAttribute<ImageEntity, byte[]> image;
	public static volatile SingularAttribute<ImageEntity, Long> imageId;
	public static volatile SingularAttribute<ImageEntity, String> imageName;
	public static volatile SingularAttribute<ImageEntity, String> imageSize;
	public static volatile SingularAttribute<ImageEntity, String> imageType;
	public static volatile SetAttribute<ImageEntity, ImageTagEntity> tags;

	public static final String IMAGE = "image";
	public static final String IMAGE_ID = "imageId";
	public static final String IMAGE_NAME = "imageName";
	public static final String IMAGE_SIZE = "imageSize";
	public static final String IMAGE_TYPE = "imageType";
	public static final String TAGS = "tags";

}


package com.vmware.ics.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ImageTagLinkKey implements Serializable {
    @Column(name = "image_id")
    private Long imageId;

    @Column(name = "tag_id")
    private Long tagId;

    public ImageTagLinkKey(Long imageId, Long tagId) {
        this.imageId = imageId;
        this.tagId = tagId;
    }

    public ImageTagLinkKey() {

    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}
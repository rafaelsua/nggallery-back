package com.dhaker.nggallery.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Image {

    @Id @GeneratedValue
    private Long id;
    private @NonNull String title;
    private String description;
    private String thumbnail;
    private String imageLink;

    public Image(String title, String description, String thumbnail, String imageLink) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.imageLink = imageLink;
    }
}

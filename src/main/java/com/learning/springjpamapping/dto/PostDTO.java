package com.learning.springjpamapping.dto;

import com.learning.springjpamapping.entity.Posts;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PostDTO {

    private Posts posts;

}

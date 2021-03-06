package life.coder.community.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private  Long gmtCreate;
    private  Long gmtModified;
    private  String title;
    private  String description;
    private  String tag;
}

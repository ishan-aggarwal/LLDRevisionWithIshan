package structural.adapter.q3.external;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TwitterTweet {
    private String id;
    private String tweet;
    private Long userId;
}
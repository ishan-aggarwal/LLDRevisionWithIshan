package structural.adapter.q3;

import java.util.List;

public interface SocialMediaAdapter {

    List<SocialMediaPost> getPosts(Long userId, Long timestamp);

    void post(Long userId, String message);
}

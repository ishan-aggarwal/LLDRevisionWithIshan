package structural.adapter.q3;

import structural.adapter.q3.external.FacebookApi;
import structural.adapter.q3.external.FacebookPost;

import java.util.List;

public class FacebookAdapter implements SocialMediaAdapter {
    private FacebookApi facebookApi = new FacebookApi();

    @Override
    public List<SocialMediaPost> getPosts(Long userId, Long timestamp) {
        return facebookApi.fetchFacebookPosts(userId, timestamp).stream().map(FacebookAdapter::to).toList();
    }

    private static SocialMediaPost to(FacebookPost post) {
        return new SocialMediaPost(post.getId(), post.getStatus(), post.getUserId(), post.getTimestamp());
    }

    @Override
    public void post(Long userId, String message) {
        facebookApi.postFacebookStatus(userId, message);
    }
}

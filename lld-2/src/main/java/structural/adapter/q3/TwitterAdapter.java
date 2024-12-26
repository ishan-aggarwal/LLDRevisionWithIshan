package structural.adapter.q3;

import structural.adapter.q3.external.TwitterApi;
import structural.adapter.q3.external.TwitterTweet;

import java.util.List;

public class TwitterAdapter implements SocialMediaAdapter {
    private TwitterApi twitterApi = new TwitterApi();

    @Override
    public List<SocialMediaPost> getPosts(Long userId, Long timestamp) {
        return twitterApi.getTweets(userId).stream().map(TwitterAdapter::to).toList();
    }

    private static SocialMediaPost to(TwitterTweet tweet) {
        return new SocialMediaPost(tweet.getId(), tweet.getTweet(), tweet.getUserId(), null);
    }

    @Override
    public void post(Long userId, String message) {
        twitterApi.tweet(userId, message);
    }
}

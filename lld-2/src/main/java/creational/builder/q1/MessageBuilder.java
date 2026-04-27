package creational.builder.q1;

@WithBuilder
public class MessageBuilder {

    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;


    private MessageBuilder(Builder builder) {
        this.messageType = builder.messageType;
        this.content = builder.content;
        this.sender = builder.sender;
        this.recipient = builder.recipient;
        this.isDelivered = builder.isDelivered;
        this.timestamp = builder.timestamp;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public Builder setMessageType(MessageType messageType) {
            this.messageType = messageType;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public Builder setIsDelivered(boolean isDelivered) {
            this.isDelivered = isDelivered;
            return this;
        }

        public Builder setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public MessageBuilder build() {
            return new MessageBuilder(this);
        }
    }

    public static void main(String[] args) {
        MessageBuilder messageBuilder = MessageBuilder.getBuilder().setContent("abc").setIsDelivered(true).build();
    }
}

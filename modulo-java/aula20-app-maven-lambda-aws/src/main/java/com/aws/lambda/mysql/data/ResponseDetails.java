package com.aws.lambda.mysql.data;

public class ResponseDetails {
    private String messageID;
    private String messageReason;
    public String getMessageID() {
        return messageID;
    }
    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }
    public String getMessageReason() {
        return messageReason;
    }
    public void setMessageReason(String messageReason) {
        this.messageReason = messageReason;
    }
}

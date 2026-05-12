package com.example.demo.chat.message;

public class ChatMessage {

    private String message;

    private Long roomId;

    private Long teamId;

    private Long playerId;

    public ChatMessage() {
    }

    public ChatMessage(String message, Long roomId, Long teamId, Long playerId) {
        this.message = message;
        this.roomId = roomId;
        this.teamId = teamId;
        this.playerId = playerId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }
}
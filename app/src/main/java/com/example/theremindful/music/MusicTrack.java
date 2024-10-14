package com.example.theremindful.music;

public class MusicTrack {
    private String trackName;
    private String artist;
    private String trackUrl;

    public MusicTrack(String trackName, String artist, String trackUrl) {
        this.trackName = trackName;
        this.artist = artist;
        this.trackUrl = trackUrl;
    }

    // Getters and setters
    public String getTrackName() { return trackName; }
    public void setTrackName(String trackName) { this.trackName = trackName; }

    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }

    public String getTrackUrl() { return trackUrl; }
    public void setTrackUrl(String trackUrl) { this.trackUrl = trackUrl; }
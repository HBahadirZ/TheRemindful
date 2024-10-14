package com.example.theremindful.images;

public class MemoryImage {
    private String imageUrl;
    private String description;
    private String date;

    public MemoryImage(String imageUrl, String description, String date) {
        this.imageUrl = imageUrl;
        this.description = description;
        this.date = date;
    }

    // Getters and setters
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}
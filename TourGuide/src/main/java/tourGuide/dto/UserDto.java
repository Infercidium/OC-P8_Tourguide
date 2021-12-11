package tourGuide.dto;

import tourGuide.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
    private String userName;
    private double latitude;
    private double longitude;
    private List<AttractionDto> attractions = new ArrayList<>();

    public UserDto(User user) {
        this.userName = user.getUserName();
        this.latitude = user.getLastVisitedLocation().location.latitude;
        this.longitude = user.getLastVisitedLocation().location.longitude;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<AttractionDto> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<AttractionDto> attractions) {
        this.attractions = attractions;
    }

    public void addAttractionDto(AttractionDto attractionDto) {
        attractions.add(attractionDto);
    }
}
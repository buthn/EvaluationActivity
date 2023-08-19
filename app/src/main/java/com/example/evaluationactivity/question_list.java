package com.example.evaluationactivity;

public class question_list {

    String userName;
    String UserID;

    String Quetions;
    float rating;
    String yourOpinion;

    public question_list(String userName, String userID, String quetions, float rating, String yourOpinion) {
        this.userName = userName;
        UserID = userID;
        Quetions = quetions;
        this.rating = rating;
        this.yourOpinion = yourOpinion;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getQuetions() {
        return Quetions;
    }

    public void setQuetions(String quetions) {
        Quetions = quetions;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getYourOpinion() {
        return yourOpinion;
    }

    public void setYourOpinion(String yourOpinion) {
        this.yourOpinion = yourOpinion;
    }
}

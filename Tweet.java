/***************************************************************************
* Assignment3, BIS 335, Business Application Development, Spring 2023
*
* Author: Adam Walters
* Date: April 17, 2023
*
* This program is about making reading and processing and including objects with it
* 
***************************************************************************/
package Assignment6;

/**
 *
 * @author adwal
 */
//blueprint class
public class Tweet {
    private String date, text, url, username,userCreated;
    private boolean userVerified;
    private int userFollowers, userFriends, retweets, likes;
    private String location, userDescription;
    private static int numTweets = 0;
    
    //constructor method
    public Tweet(String inDate,String inText,String inUrl,String inUsername,String inUserCreated,
            boolean inUserVerified,int inUserFollowers,int inUserFriends,int inRetweets, int inLikes,
            String inLocation,String inUserDescription)
    {
        date = inDate;
        text = inText;
        url = inUrl; 
        username = inUsername;
        userCreated = inUserCreated;
        userVerified = inUserVerified;
        userFollowers = inUserFollowers; 
        userFriends = inUserFriends; 
        retweets = inRetweets; 
        location = inLocation; 
        userDescription = inUserDescription;
        likes = inLikes;
        
        numTweets++;
    }
    
    //set methods
    public void setDate(String inDate) {
        date = inDate;
    }

    public void setTweet(String inText) {
        text = inText;
    }

    public void setUrl(String inUrl) {
        url = inUrl;
    }

    public void setUser(String inUsername) {
        username = inUsername;
    }

    public void setUserCreated(String inUserCreated) {
        userCreated = inUserCreated;
    }

    public void setUserVerified(boolean inUserVerified) {
        userVerified = inUserVerified;
    }

    public void setUserFollowers(int inUserFollowers) {
        userFollowers = inUserFollowers;
    }

    public void setUserFriends(int InUserFriends) {
        userFriends = InUserFriends;
    }

    public void setRetweets(int inRetweets) {
        retweets = inRetweets;
    }

    public void setLikes(int inLikes) {
        likes = inLikes;
    }

    public void setLocation(String inLocation) {
        location = inLocation;
    }

    public void setUserDescription(String inUserDescription) {
        userDescription = inUserDescription;
    }
    

    //get methods
    public String getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return username;
    }

    public String getUserCreated() {
        return userCreated;
    }

    public boolean isUserVerified() {
        return userVerified;
    }

    public int getUserFollowers() {
        return userFollowers;
    }

    public int getUserFriends() {
        return userFriends;
    }

    public int getRetweets() {
        return retweets;
    }

    public int getLikes() {
        return likes;
    }

    public String getLocation() {
        return location;
    }

    public String getUserDescription() 
    {
        return userDescription;
    }
    
    //toString methods
    public String getMonthDateString(String dateString) {
        String[] parts = dateString.split("-");
        String year = parts[0];
        String month = "";
        switch (parts[1]) {
            case "01" -> month = "January";
            case "02" -> month = "February";
            case "03" -> month = "March";
            case "04" -> month = "April";
            case "05" -> month = "May";
            case "06" -> month = "June";
            case "07" -> month = "July";
            case "08" -> month = "August";
            case "09" -> month = "September";
            case "10" -> month = "October";
            case "11" -> month = "November";
            case "12" -> month = "December";
        }
        return month + " " + year;
    }

    public String socialAnalyzer(int followers) {
        if (followers >= 1000000) {
            return "Extreme";
        } else if (followers >= 100000) {
            return "High";
        } else if (followers >= 1000) {
            return "Medium";
        } else {
            return "Low Income";
        }
    }
    
    @Override
    public String toString() {
        return "Date: " + getMonthDateString(date) + "\n" +
                "Tweet: " + text + "\n" +
                "URL: " + url + "\n" +
                "User: " + username + "\n" +
                "User Created: " + userCreated + "\n" +
                "User Verified: " + userVerified + "\n" +
                "User Followers: " + userFollowers + " (" + socialAnalyzer(userFollowers) + ")\n" +
                "User Friends: " + userFriends + " (" + socialAnalyzer(userFriends) + ")\n" +
                "Retweets: " + retweets + "\n" +
                "Likes: " + likes + "\n" +
                "Location: " + location + "\n" +
                "User Description: " + userDescription + "\n";
    }

    public static void printTotal() {
        System.out.println("Currently there are " + numTweets + " objects created.");
    }
    
}
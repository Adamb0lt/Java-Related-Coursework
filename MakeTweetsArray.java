/***************************************************************************
* Assignment3, BIS 335, Business Application Development, Spring 2023
*
* Author: Adam Walters
* Date: April 17, 2023
*
* This program is about utilizing objects with reading and processing files
* along with using blueprint classes, instance variables and different methods like 
* constructors, set and get, and toString and calling them in

***************************************************************************/
package Assignment6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author adwal
 */
public class MakeTweetsArray {
    public static ArrayList<Tweet> TweetObjects = new ArrayList<Tweet>();
    
    public MakeTweetsArray(String filename, ArrayList<Tweet> tweets, String[] tStr) {
        readFile(filename, tweets, tStr);
    }
    
    public void readFile(String filename, ArrayList<Tweet> tweets, String[] tStr) {
        int index = 0;
        int rowTotal, invRowTotal, vRowTotal, verifTweets, followerTotal, friendTotal;
        rowTotal = invRowTotal = vRowTotal = verifTweets = followerTotal = friendTotal = 0;
        try {
            File f = new File(filename);
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while(scan.hasNextLine()) {
                rowTotal++;
                String[] tokens = scan.nextLine().split(",");
                if(tokens.length == 13) {
                    vRowTotal++;
                    index++;
                    String date = tokens[0];
                    String text = tokens[1];
                    String url = tokens[2];
                    String username = tokens[3];
                    String userCreated = tokens[4];
                    boolean userVerified;
                    if(tokens[5].equals("TRUE")) {
                        userVerified = true;
                        verifTweets++;
                    }
                    else {
                        userVerified = false;
                    }
                    int userFollowers = Integer.parseInt(tokens[6]);
                    followerTotal += userFollowers;
                    int userFriends = Integer.parseInt(tokens[7]);
                    friendTotal += userFriends;
                    int retweets = Integer.parseInt(tokens[8]);
                    int likes = Integer.parseInt(tokens[9]);
                    String location = tokens[10];
                    String userDescription = tokens[11];
                    Tweet newTweet = new Tweet(date, text, url, username, userCreated, userVerified, userFollowers, userFriends, retweets, likes, location, userDescription);
                    TweetObjects.add(newTweet);
                }
                else {
                    invRowTotal++;
                    scan.nextLine();
                }
            }
            int followerAvg = followerTotal / 13;
            int friendAvg = friendTotal / 13;
            System.out.printf("Total rows processed: \t%,5d\n", rowTotal);
            System.out.printf("Rows with errors: \t%,5d\n", invRowTotal);
            System.out.printf("Rows without errors: \t%,5d\n", rowTotal - invRowTotal);
            System.out.printf("Average followers: \t%,5d\n", followerAvg);
            System.out.printf("Average friends: \t%,5d\n", friendAvg);            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            // too tired and stressed to do user input for tweet, sorry
        }
    }
}

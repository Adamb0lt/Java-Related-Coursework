/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment6;

import java.util.ArrayList;

/**
 *
 * @author adwal
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Tweet> TweetObjects = new ArrayList<Tweet>();
        String[] TweetString = new String[5000];
        MakeTweetsArray mta = new MakeTweetsArray("C:\\Users\\adwal\\OneDrive\\Desktop\\Business Classes\\BIS\\BIS 335(Java Computational Thinking and Data Analysis)\\BIS335FL22_aaw223_Walters\\BIS335_Walters\\src\\Assignment6\\shortchatgpt.txt", TweetObjects, TweetString);
    }
}

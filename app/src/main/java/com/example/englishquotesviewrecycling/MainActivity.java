package com.example.englishquotesviewrecycling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> quotes = new ArrayList<String>();

        //Add elements to the ArrayList
        quotes.add("Be yourself; everyone else is already taken. ― Oscar Wilde");
        quotes.add("I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best. ― Marilyn Monroe");
        quotes.add("Two things are infinite: the universe and human stupidity; and I'm not sure about the universe. ― Albert Einstein");
        quotes.add("A room without books is like a body without a soul. ― Marcus Tullius Cicero");
        quotes.add("Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind. ― Bernard M. Baruch");
        quotes.add("“You've gotta dance like there's nobody watching,\n" +
                "Love like you'll never be hurt,\n" +
                "Sing like there's nobody listening,\n" +
                "And live like it's heaven on earth.”\n" +
                "― William W. Purkey");
        quotes.add("“You know you're in love when you can't fall asleep because reality is finally better than your dreams.”\n" +
                "― Dr. Seuss");
        quotes.add("“You only live once, but if you do it right, once is enough.”\n" +
                "― Mae West");
        quotes.add("“Be the change that you wish to see in the world.”\n" +
                "― Mahatma Gandhi");
        quotes.add("“In three words I can sum up everything I've learned about life: it goes on.”\n" +
                "― Robert Frost");
        quotes.add("“If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.”\n" +
                "― J.K. Rowling, Harry Potter and the Goblet of Fire");
        quotes.add("“Don’t walk in front of me… I may not follow\n" +
                "Don’t walk behind me… I may not lead\n" +
                "Walk beside me… just be my friend”\n" +
                "― Albert Camus");
        quotes.add("“If you tell the truth, you don't have to remember anything.”\n" +
                "― Mark Twain");
        quotes.add("“Friendship ... is born at the moment when one man says to another \"What! You too? I thought that no one but myself . . .”\n" +
                "― C.S. Lewis, The Four Loves");
        quotes.add("“I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.”\n" +
                "― Maya Angelou");
        quotes.add("“A friend is someone who knows all about you and still loves you.”\n" +
                "― Elbert Hubbard");
        quotes.add("“To live is the rarest thing in the world. Most people exist, that is all.”\n" +
                "― Oscar Wilde");
        quotes.add("“Always forgive your enemies; nothing annoys them so much.”\n" +
                "― Oscar Wilde");
        quotes.add("“Live as if you were to die tomorrow. Learn as if you were to live forever.”\n" +
                "― Mahatma Gandhi");
        quotes.add("“Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that.”\n" +
                "― Martin Luther King Jr., A Testament of Hope: The Essential Writings and Speeches");

        ArrayAdapter<String> quotesAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, quotes);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(quotesAdapter);
    }
}
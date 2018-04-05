package com.example.rgathergood.rockpaperscissorslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton rockButton;
    ImageButton paperButton;
    ImageButton scissorsButton;
    TextView answerTextView;
    Game game = new Game();
    TextView userScore;
    TextView computerScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rockButton = (ImageButton)findViewById(R.id.rockButton);
        paperButton = (ImageButton)findViewById(R.id.paperButton);
        scissorsButton = (ImageButton)findViewById(R.id.scissorsButton);
        answerTextView= (TextView)findViewById(R.id.answerTextView);
        userScore = (TextView)findViewById(R.id.userScore);
        computerScore = (TextView)findViewById(R.id.computerScore);
        showUserScore();
        showComputerScore();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if(menuItem.getItemId() == R.id.howToPlay) {
            Intent intent = new Intent(this, InfoActivity.class);
            startActivity(intent);
        }
        if (menuItem.getItemId() == R.id.reset)
            game.resetScores();
            showUserScore();
            showComputerScore();
        return true;
    }

    private void showUserScore() {
        userScore.setText("User: " + game.getUserScore());
    }

    private void showComputerScore() {
        computerScore.setText("Computer " + game.getComputerScore());
    }


    public void onRockButtonClicked(View button) {
        Game.Choice userChoice = Game.Choice.ROCK;
        answerTextView.setText(game.play(userChoice));
        showComputerScore();
        showUserScore();
    }

    public void onPaperButtonClicked(View button) {
        Game.Choice userChoice = Game.Choice.PAPER;
        answerTextView.setText(game.play(userChoice));
        showComputerScore();
        showUserScore();
    }

    public void onScissorsButtonClicked(View button) {
        Game.Choice userChoice = Game.Choice.SCISSORS;
        answerTextView.setText(game.play(userChoice));
        showComputerScore();
        showUserScore();
    }

//    public void onButtonClicked(View button) {
//        Game game = new Game();
//        Game.Choice userChoice = ;
//
//        switch (button.getId()) {
//            case R.id.rockButton:
//                userChoice = Game.Choice.ROCK;
//                break;
//            case R.id.paperButton:
//                userChoice = Game.Choice.PAPER;
//                break;
//            case R.id.scissorsButton:
//                userChoice = Game.Choice.SCISSORS;
//                break;
//        }
//
//        String result = game.play(userChoice);
//        answerTextView.setText(result);
//    }



//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if(item.getItemId() == R.id.)
//    }


}

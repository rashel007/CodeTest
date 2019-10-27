
##Coding Test

### Task 1

> For task 1 i use a function functionCheckAnagram . This function will take two string and return true false.
In this function i first check if the string length is similar or not. if not then these string are not anagram. Else first split the string into array of character and then
short in alphabetic order using another private function shortedChar. For shorting i use Insertion short algorithm. 

> Also i have written some test case for testing if my function is working properly or not. I assume that we will always pass valid string, so did not check for null. 


### Task 2

> For Task 2 i use Factory design pattern to make Car and Plane class. Factory design pattern in used to abstract the object creation part from Client. 

> Also i use Builder design pattern to solve this problem. 


### Task 3 

#### For task 3 i use Singleton pattern and Command Pattern. 


PseudoCode for Task 3

```
// First we have to create our VideoPlayer class . VideoPlayer class is created using Singleton Pattern using enum .  

 enum VideoPlayer {
    INSTANCE;

     void play() {
        
    }

     void forward() {
       
    }

     void rewind() {
     
    }
}

// Then create an interface ActionListenerCommand

 interface ActionListenerCommand {
     void execute();
}

// And for play , forward and rewind funcionality we create 3 concrete class which implement ActionListenerCommand

 class ActionPlay implements ActionListenerCommand {
    private VideoPlayer player;

    public ActionPlay(VideoPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}


 class ActionRewind implements ActionListenerCommand {
    private VideoPlayer player;

    public ActionRewind(VideoPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.rewind();
    }
}

 class ActionForward implements ActionListenerCommand {
    private VideoPlayer player;

    public ActionForward(VideoPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.forward();
    }
}


// And then we make our Video Player in Simulate class
public class Simulate {

    public static void main(String[] args) {

        VideoPlayer player = VideoPlayer.INSTANCE;

        ActionListenerCommand actionPlay = new ActionPlay(player);
        ActionListenerCommand actionForward = new ActionForward(player);
        ActionListenerCommand actionRewind = new ActionRewind(player);

        actionPlay.execute();
        actionForward.execute();
        actionRewind.execute();
    }
}

```


So here Singleton Pattern is used so that we can use only one VideoPlayer instance. And Command Pattern is used to add play , forward and rewind function with additional requirement in these 3 class and encapsulate the request from the actual VideoPlayer . 
We can add more functionality in our video player class easily without affecting current functionality. 


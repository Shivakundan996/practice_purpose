package looseCoupling;

/**
 * @LooseCoupling can be achieved throught the interfaces.
 */

interface GamingConsole{
    void up();
    void down();
    void left();
    void right();
}

class MarioGame implements GamingConsole{

    public MarioGame(){
        System.out.println("MarioGame started...");
    }
    public void up(){
        System.out.println("jumping....");
    }
    public void down(){
        System.out.println("getting into hole...");
    }
    public void left(){
        System.out.println("moving forward...");
    }
    public void right(){
        System.out.println("moving backward...");
    }
}

class SuperContraGame implements GamingConsole{
    public SuperContraGame(){
        System.out.println("SuperContraGame started....");
    }
    public void up(){
        System.out.println("up....");
    }
    public void down(){
        System.out.println("sit down...");
    }
    public void left(){
        System.out.println("Shoot a bullet...");
    }
    public void right(){
        System.out.println("Go back...");
    }

    void damp(){
        System.out.println("damp");
    }

}

class GameRunner{

//    private MarioGame game;
    private GamingConsole game;

    /**
     * here in construction parameter is tightly coupled as everytime class should be chnaged to SuperContarGame and MarioGame,
     * to achieve loose Coupling Interface should be And implemnetd to  class SuperContarGame MarioGame.
     */
   /* public GameRunner(MarioGame game){
        this.game = game;
    }*/

    public GameRunner(GamingConsole game){
        this.game = game;
    }

    void run(){
        System.out.println("Running game:"+game);
        game.down();
        game.up();
        game.left();
        game.right();
        SuperContraGame game1 = (SuperContraGame) game;

        game1.damp();

    }
}


public class AppGamingBasicJava {

    public static void main(String[] args) {
//      MarioGame game = new MarioGame();
//      var game = new MarioGame(); we can us "var" instead of class name ,but it should be instantiated to the required class
        SuperContraGame game = new SuperContraGame();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();


    }
}

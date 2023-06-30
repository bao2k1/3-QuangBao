package Day3.Bai3;

// Lớp Game đại diện cho trò chơi đua xe
class Game {
    private Car playerCar;
    private Car computerCar;
    private Player player;

    public Game(String playerName) {
        playerCar = new Car("Player Car");
        computerCar = new Car("Computer Car");
        player = new Player(playerName);
    }

    public void play() {
        System.out.println("Game starts!");
        int i=0;
        while (true) {
            i++;
            playerCar.speedUp();
            computerCar.speedUp();
            playerCar.speedDown();
            computerCar.speedDown();
            if (playerCar.getSpeed() >= 100 || computerCar.getSpeed() >= 100) {
                break;
            }


        }
        System.out.println("Total changed speed: "+i);
        System.out.println(playerCar.getSpeed());
        System.out.println(computerCar.getSpeed());

        if (playerCar.getSpeed() >= 100) {
            player.increaseScore();
            System.out.println(player.getName()+" win!");
        } else {
            System.out.println(player.getName()+" lose!");
        }

        System.out.println("Your score: " + player.getScore());
    }
}

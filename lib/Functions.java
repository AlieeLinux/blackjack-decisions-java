package lib;

public class Functions {
    public int dealer, player;
    public Functions(int playerr, int dealerr) {
        this.dealer = dealerr;
        this.player = playerr;
    }

    public int NewCard(int Newcard) {
        if (Newcard >= 22) {
            System.out.println("Bust!!");
            this.player = 0;
            return 0;
        }

        System.out.println(Newcard);
        System.out.println(this.player);

        int newtotal = this.player + Newcard;
        return newtotal;
    }

    // HArd Recommendation
    public String Recommendation() {
        // hit or stands 
        if (this.dealer >= 7 && this.player <= 16) {
            return "Surrender or Hit but risky hit";
        }
        if (4 <= this.dealer && this.dealer <= 6 && this.player >= 12 && 21 >= this.player) {
            return "Stand";
        }
        if (this.player >= 17) {
            return "Hit";
        }
        if (this.player >= 22) {
            return "U busted lol";
        }

        // doubles 
        if (this.player == 11) {
            return "Double it";
        }
        if (this.dealer <= 9 && this.player == 10) {
            return "double it";
        }
        return "none";

    }
}








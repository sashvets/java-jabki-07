import payment.CreditCardPayment;
import playable.Playable;
import playable.Rated;
import playable.Song;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment payment = new CreditCardPayment(BigDecimal.TEN);
        payment.validate();
        payment.process();
        payment.complete();

        Song song = new Song("Песня про лето!");
        song.play();
        song.appreciated();

        Playable playable = new Song("Песня про весну!");
        playable.play();
        if (playable instanceof Rated) {
            ((Rated) playable).appreciated();
        }
    }
}
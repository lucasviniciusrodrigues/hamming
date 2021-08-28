import java.util.stream.IntStream;

public class Hamming {

    char[] leftStrand;
    char[] rightStrand;

    public Hamming(String leftStrand, String rightStrand) {

        if(!leftStrand.isEmpty() || !rightStrand.isEmpty()){

            if(leftStrand.isEmpty())
                throw new IllegalArgumentException("left strand must not be empty.");

            if(rightStrand.isEmpty())
                throw new IllegalArgumentException("right strand must not be empty.");

            if(leftStrand.length() != rightStrand.length())
                throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        }

        this.leftStrand = leftStrand.toCharArray();
        this.rightStrand = rightStrand.toCharArray();
    }

    public int getHammingDistance() {

        return (int) IntStream.range(0, leftStrand.length)
                .filter( i -> leftStrand[i] != rightStrand[i])
                .count();

    }
}

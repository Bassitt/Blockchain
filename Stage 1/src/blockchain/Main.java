package blockchain;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();
        IntStream.range(0, 5).forEach(i -> blockchain.generateNewBlock());
        System.out.println(blockchain);
    }
}
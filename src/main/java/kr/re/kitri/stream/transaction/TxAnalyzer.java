package kr.re.kitri.stream.transaction;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class TxAnalyzer {
    public static void main(String[] args) {
        List<Transaction> transaction = Transaction.getTransaction();

        // 1단 groupingBY
        Map<Currency,Double> collect1 = transaction.stream()    // Stream<Transaction>
                .collect(groupingBy(item -> item.getCurrency(), summingDouble(item -> item.getValue())));

        // 2단 groupingBy
        Map<Currency, Map<Boolean, Double>> collect2 = transaction.stream()
                .collect(groupingBy(item -> item.getCurrency(), // 통화료 분류 하고
                        partitioningBy(item -> item.getValue() >= 5000, averagingDouble(item -> item.getValue()))));// 5000 이상인 것만

        System.out.println(transaction);
        System.out.println(collect2);
    }
}

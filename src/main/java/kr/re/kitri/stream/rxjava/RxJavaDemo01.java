package kr.re.kitri.stream.rxjava;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import kr.re.kitri.apple.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RxJavaDemo01 {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(150, "red"),
                new Apple(130, "blue"),
                new Apple(180, "red"),
                new Apple(150, "red"),
                new Apple(160, "blue"),
                new Apple(120, "red"),
                new Apple(140, "red"),
                new Apple(170, "red")
        );
        // 1. Observable 생성
        Observable.fromIterable(apples)    // Observable<Apple>
                .filter(item -> item.getWeight() >= 150)
                .map(item -> item.getColor() + "[" + item.getWeight() + "]")   // Observable<String>
                .subscribe(item -> System.out.println(item));

        // 2. Flowable 생성
        Flowable.fromIterable(apples)    // Observable<Apple>
                .filter(item -> item.getWeight() >= 150)
                .map(item -> item.getColor() + "[" + item.getWeight() + "]")   // Observable<String>
                .subscribe(item -> System.out.println(item));
    }
}

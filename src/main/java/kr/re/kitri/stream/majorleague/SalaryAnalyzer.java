package kr.re.kitri.stream.majorleague;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SalaryAnalyzer {
    public static void main(String[] args) throws IOException {

        Path file = Paths.get("D:\\GithubStudy\\kitri\\src\\main\\resources\\Salaries.csv");
//        Stream<String> lines = Files.lines(file);

        // 2010년 이후 아메리칸 리그의 상위 연봉자 5명의 연봉 평균
        // null safety
        OptionalDouble average = Files.lines(file)
                .skip(1)
                .map(item -> {
                    String[] s = item.split(",");
                    return new Salary(Integer.parseInt(s[0]),
                            s[1], s[2], s[3], Long.parseLong(s[4]));
                })
                .filter(item -> item.getYear() >= 2010)
                .filter(item -> item.getLeague().equals("AL"))
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))    // 연봉을 역순으로 정렬
                .limit(5)   // Stream<Salary> -> Stream<Long> -> LongStream
                .mapToLong(item -> item.getSalary())  // Stream<Long> -> LongStream
                .average();
        System.out.println(average);

        double a = average.orElse(0.0);     // 데이터가 없으면 0.0을 반환해라
        System.out.println(a);

        long b = (long) average.orElse(0.0);
        System.out.println(b);

        Files.lines(file)   // Stream<String>
                .skip(1)
                .map(item -> {
                    String[] s = item.split(",");
                    return new Salary(Integer.parseInt(s[0]),
                            s[1], s[2], s[3], Long.parseLong(s[4]));
                })  // Stream<Salary>
                .distinct()
                .filter(item -> item.getLeague().equals("NL"))
//                .filter(item -> item.getSalary() >= 20_000_000)
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))    // 연봉을 역순으로 정렬
                .limit(5)   ;// 5개의 데이터만 출력
//                .forEach(item -> System.out.println(item));
    }
}

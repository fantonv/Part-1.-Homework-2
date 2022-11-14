public class Main {
    public static void main(String[] args) {
        //task 1
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i++;
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            // в задании не указан какой процент накопелний, я поставил 12 процентов годовых.
        }
        //task 2
        int u = 0;
        while (u < 10){
            u = u +1;
            System.out.print(u + " ");
        }
        System.out.println();
        for (int y = 10; y > 0; y = y - 1){
            System.out.print(y + " ");
        }
        System.out.println();

        //task 3
        int totalHuman = 12_000_000;
        for (int t = 1; t <= 10; t++){
            int totalDied = totalHuman / 1000 * 8;
            int totalBorn = totalHuman / 1000 * 17;
            totalHuman = totalHuman - totalDied + totalBorn;
            System.out.println("Год " + t + " численность населения составляет " + totalHuman);
        }

        //task 4 - 6
        int totalVas = 15000;
        for (int r = 1; r <= 102; r++){
                totalVas = totalVas / 100 * 7 + totalVas;
                if (r % 6 == 0) {
                    System.out.println("Месяц " + r + " сумма накоплений " + totalVas);
                }
        }

        // task 7
        int friday = 4;
        for (; friday <= 31; friday = friday + 7){
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет");
        }

        // task 8
        int year = 79;
        int ourYear = 2022;
        int pastYears = ourYear - 200;
        int futureYears = ourYear + 100;
        for (; year <= futureYears; year = year + 79){
            if (year >= pastYears){
                System.out.println(year);
            }
        }

        //task 9
        int firstNbr = 2;
        int secondNbr = 1;
        for (;secondNbr <= 10;secondNbr++){
            int thirdNbr = firstNbr * secondNbr;
            System.out.println(firstNbr + "*" + secondNbr + "=" + thirdNbr);
        }
    }
}
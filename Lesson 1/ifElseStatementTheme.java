public class ifElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean male = true;
        if (!male) {
            System.out.println("Добрый день, мадам");
        } else {
            System.out.println("Добрый день, месье!");
        }

        int age = 19;
        if (age > 18) {
            System.out.println("Проходи.");
        } else {
            System.out.println("Извини, малыш, мероприятие только для взрослых.");
        }

        float height = 1.81F;
        if (height < 1.8) {
            System.out.println("Рост ниже 1,8 метров.");
        } else {
            System.out.println("Рост больше или равен 1,8 метров.");
        }

        char nameFirstLetter = 'A';
        if (nameFirstLetter == 'M') {
            System.out.println("Имя начинается на букву M.");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Имя начинается на букву M.");
        } else {
            System.out.println("Имя начинается не на буквы M или I.");
        }

        System.out.println("\n2.Поиск большего числа");
        int number1 = 9;
        int number2 = 3;
        if (number1 > number2) {
            System.out.println("Число " + number1 + " больше числа " + number2);
        } else if (number2 > number1) {
            System.out.println("Число " + number2 + " больше числа " + number1);
        } else {
            System.out.println("Числа " + number1 + " и " + number2 + " равны.");
        }

        System.out.println("\n3. Проверка числа");
        int number = 13;
        if (number == 0) {
            System.out.println("Число равно 0.");
        } else {
            if (number > 0) {
                System.out.print(number + " является положительным и ");
            } else {
                System.out.print(number + " является отрицательным и ");
            }
            if (number % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("нечетным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number41 = 123;
        int number42 = 223;
        if ((number41 / 100 == number42 / 100) || ((number41 % 100) / 10 == (number42 % 100) / 10) ||
                (number41 % 10 == number42 % 10)) {
            System.out.println("В числах " + number41 + " и " + number42 + " имеются следующие одинаковые цифры:");
            if (number41 / 100 == number42 / 100) {
                System.out.println("\tЦифра " + number41 / 100 + " в разряде сотен.");
            }
            if ((number41 % 100) / 10 == (number42 % 100) / 10) {
                System.out.println("\tЦифра " + (number41 % 100) / 10 + " в разряде десятков.");
            }
            if (number41 % 10 == number42 % 10) {
                System.out.println("\tЦифра " + number41 % 10 + " в разряде единиц.");
            }
        } else {
            System.out.println("Равных цифр в одних и тех же разрядах нет.");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является маленькой буквой.");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является большой буквой.");
        } else if (symbol >= '1' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой.");
        } else {
            System.out.println("Символ " + symbol + " не является буквой или цифрой.");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301_000;
        System.out.println("Сумма вклада: " + deposit);
        int depositRate;
        if (deposit < 100_000) {
            depositRate = 5;
        } else if (deposit <= 300_000) {
            depositRate = 7;
        } else {
            depositRate = 10;
        }
        float accuredInterest = deposit * depositRate / 100;
        System.out.println("Сумма начисленного процента: " + accuredInterest);
        System.out.println("Итоговая сумма с %: " + (deposit + accuredInterest));

        System.out.println("\n7. Определение оценки по предметам");
        int historyRating = 59;
        byte historyMark;
        if (historyRating <= 60) {
            historyMark = 2;
        } else if (historyRating <= 73) {
            historyMark = 3;
        } else if (historyRating <= 91) {
            historyMark = 4;
        } else {
            historyMark = 5;
        }
        System.out.println("Оценка по истории: " + historyMark);

        int programmingRating = 92;
        byte programmingMark;
        if (programmingRating <= 60) {
            programmingMark = 2;
        } else if (programmingRating <= 73) {
            programmingMark = 3;
        } else if (programmingRating <= 91) {
            programmingMark = 4;
        } else {
            programmingMark = 5;
        }
        System.out.println("Оценка по программированию: " + programmingMark);
        float avarageMark = (float)(historyMark + programmingMark) / 2;
        System.out.println("Средний балл оценок по предметам: " + avarageMark);
        double avarageRating = (historyRating + programmingRating) / 2.0;
        System.out.println("Средний % по предметам: " + avarageRating);

        System.out.println("\n8. Расчет годовой прибыли");
        int revenuePerMonth = 13000;
        int roomRentPerMonth = 4000;
        int costPricePerMonth = 9000;
        int annualProfit = (revenuePerMonth - roomRentPerMonth - costPricePerMonth) * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: + " + annualProfit+ " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit+ " руб.");
        }

    }
}

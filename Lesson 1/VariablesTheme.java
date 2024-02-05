public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte cores = 4;
        float coreSpeed = 2.8F;
        short vram = 2;
        int ddrMemory = 8;
        char modeleName = 0x019B;
        long storageCapacity = 500L;
        double maxNetworkSpeed = 99.999999;
        boolean isForGame = false;
        System.out.println("Количество ядер процессора: " + cores);
        System.out.println("Частота процессора: " + coreSpeed);
        System.out.println("Объём графической памяти: " + vram);
        System.out.println("Объём оперативной памяти: " + ddrMemory);
        System.out.println("Название модели: " + modeleName);
        System.out.println("Объём постоянной памяти: " + storageCapacity);
        System.out.println("Максимальная скорость сетевого адаптера: " + maxNetworkSpeed);
        System.out.println("Предназначен для игр?: " + isForGame);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        double discount = 0.11;
        int totalSum = penPrice + bookPrice;
        double discountSum = totalSum * discount;
        double discountPrice = totalSum - discountSum;
        System.out.println("общая стоимость товаров без скидки: " + totalSum);
        System.out.println("сумма скидки: " + discountSum);
        System.out.println("общая стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteNumber = 127;
        System.out.println("Переменная типа byte");
        System.out.println("\tначальное значение " + byteNumber);
        System.out.println("\tзначение после инкремента на единицу " + ++byteNumber);
        System.out.println("\tзначение после декремента на единицу " + --byteNumber);
        short shortNumber = 32767;
        System.out.println("Переменная типа short");
        System.out.println("\tначальное значение " + shortNumber);
        System.out.println("\tзначение после инкремента на единицу " + ++shortNumber);
        System.out.println("\tзначение после декремента на единицу " + --shortNumber);
        int intNumber = 2_147_483_647;
        System.out.println("Переменная типа int");
        System.out.println("\tначальное значение " + intNumber);
        System.out.println("\tзначение после инкремента на единицу " + ++intNumber);
        System.out.println("\tзначение после декремента на единицу " + --intNumber);
        long longNumber = 9_223_372_036_854_775_807L;
        System.out.println("Переменная типа long");
        System.out.println("\tначальное значение " + longNumber);
        System.out.println("\tзначение после инкремента на единицу " + ++longNumber);
        System.out.println("\tзначение после декремента на единицу " + --longNumber);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("с помощью третьей переменной");
        System.out.println("\tисходные значения переменных: a = " + a + ", b = " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("\tновые значения переменных: a = " + a + ", b = " + b);

        System.out.println("с помощью арифметических операций");
        System.out.println("\tисходные значения переменных: a = " + a + ", b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("\tновые значения переменных: a = " + a + ", b = " + b);

        System.out.println("с помощью побитовой операции ^");
        System.out.println("\tисходные значения переменных: a = " + a + ", b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("\tновые значения переменных: a = " + a + ", b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int) dollar + " - " + dollar);
        System.out.println((int) asterisk + " - " + asterisk);
        System.out.println((int) atSign + " - " + atSign);
        System.out.println((int) verticalBar + " - " + verticalBar);
        System.out.println((int) tilde + " - " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underline = '_';
        char openBracket = '(';
        char closeBracket = ')';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underline + openBracket + " " + closeBracket + 
                backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underline + underline + underline + underline + 
                slash + backSlash + underline + underline + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int originNumber = 123;
        int hundreds = originNumber / 100;
        int tens = (originNumber % 100) / 10;
        int ones = originNumber % 10;
        int sumOfDigits = hundreds + tens + ones;
        int productOfDigits = hundreds * tens * ones;
        System.out.println("Число " + originNumber + " содержит:");
        System.out.println("\tсотен - " + hundreds);
        System.out.println("\tдесятков - " + tens);
        System.out.println("\tединиц - " + ones);
        System.out.println("Сумма его цифр = " + sumOfDigits);
        System.out.println("Произведение = " + productOfDigits);

        System.out.println("\n9. Вывод времени");
        int secondsSum = 86399;
        int hours = secondsSum / 3600;
        int minutes = (secondsSum % 3600) / 60;
        int seconds = secondsSum % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

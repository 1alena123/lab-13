public class Main {

    public static void main(String args[]) {
        String text =
                    "ЗТЕФТИ ЧЦФТ!\n" +
                    "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.\n" +
                    "БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.\n" +
                    "ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.\n";

        System.err.print("ТЕКСТ:\n" + text);

        Caesar ceasar = new Caesar();
        String[] str = text.split("\n");

        System.out.println("\n" + ceasar.decode( str[0],-4));
        System.out.println("\n" + ceasar.decode( str[1],8));

        for (int i = 0; i < 32; i++) {
            System.out.println("\n" + ceasar.decode( str[2], i));
        }

        String[] words = str[3].split(" ");

        for (int k = 0; k < words.length; k++) {
            System.out.println("\nВарианты " + (k+1) + " слова:");

            for (int j = 0; j < 33; j++) {
                System.out.print(j + "-" + ceasar.decode( words[k],j) + "\n");
            }
        }


    }
}

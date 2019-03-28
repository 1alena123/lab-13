public class Caesar {

    private String abc = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public boolean isLetter(String smbl) {
        return abc.contains(smbl);
    }

    public String decode( String str, int sign) {
        String[] symbols = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (String smbl : symbols) {
            if (isLetter(smbl)) {

                int a = sign + abc.indexOf(smbl);

                if (a < 0) {
                    a = a + 33;
                }

                if (a > 32) {
                   a = a - 33;
                }
                stringBuilder.append(abc.charAt(a));
            }
            else stringBuilder.append(smbl);
        }
        return stringBuilder.toString();
    }
}

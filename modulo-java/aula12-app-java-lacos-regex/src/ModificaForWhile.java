import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModificaForWhile {
    public static void main(String[] args) {

        //For util se conhece o tamanho do array
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Consegui: " + i);
        }

        //while para quando queremos
        String example = "2021.10.10";
        Pattern pattern = Pattern.compile("(\\d{4})[.](\\d{2})[.](\\d{2})");
        Matcher matcher = pattern.matcher(example);
        //verifies full match
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        //while para quando queremos
        Pattern pattern2 = Pattern.compile("\\d+");
        Matcher matcher2 = pattern2.matcher("hello1234goodboy789very2345");
        //verifies full match
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }

        String text = "John speak and John writes about that,\" + \" and John think 2021.10.10 about everything. ";
        String nominho = "(John)";
        Pattern patternNominho = Pattern.compile(nominho);
        Matcher matcherNominho = patternNominho.matcher(text);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcherNominho.find()) {
            System.out.println("Found: " + matcherNominho.group(0));
        }

        //Prepare the regular expression
        String regex = "\\b(\\d{2})(\\d{5})(\\d{4})\\b";
        String replacementText = "($1) $2-$3";
        String source = "11992887722, 1234567, and 1234567890";

        String formattedSource = source.replaceAll(regex, replacementText);
        System.out.println(formattedSource);

        Pattern tel = Pattern.compile("\\b(\\d{2})[.](\\d{5})(\\d{4})\\b");
        Matcher mTel = tel.matcher("11.992887722 1199288772 ");
        while (mTel.find()) {
            System.out.println(mTel.group());
        }

        //Prepare the regular expression
        String regex2 = "\\b(\\d{2})(\\d{5})(\\d{4})\\b";
        String replacementText2 = "($1) $2-$3";
        String source2 = "11992887722, 1234567, and 1234567890";
        String formattedSourc2 = source2.replaceAll(regex2, replacementText2);
        System.out.println(formattedSourc2);
        Pattern tel2 = Pattern.compile("\\b(\\d{2})[.](\\d{5})(\\d{4})\\b");
        Matcher mTel2 = tel2.matcher("11.992887722 1199288772 ");
        while (mTel2.find()) {
            System.out.println(mTel2.group());
        }
        //---------------------------------------------------------------
        System.out.println("-------------------");
        Pattern p = Pattern.compile("(\\d{4})[.](\\d{2})[.](\\d{2})");
        Matcher m = p.matcher("luiza 2021.01.10jjjj 2021.01.10");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

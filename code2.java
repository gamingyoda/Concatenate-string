import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.text.MessageFormat;
import java.util.regex.*;
import java.util.*;
import java.net.*;
import java.io.*;
import java.nio.*;

public class code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Before connection");
        System.out.print("str1: ");
        String str1 = scanner.next();

        System.out.print("str2: ");
        String str2 = scanner.next();

        //////////////////////////////////////////////////
        System.out.println("\nAfter connection");

        String strA = str1 + str2;
        System.out.println("strA: " + strA);

        String strB = str1.concat(str2);
        System.out.println("strB: " + strB);

        StringBuilder strC = new StringBuilder(str1);
        strC.append(str2);
        System.out.println("strC: " + strC.toString());

        StringBuffer strD = new StringBuffer(str1);
        strD.append(str2);
        System.out.println("strD: " + strD.toString());

        StringJoiner strE = new StringJoiner("");
        strE.add(str1);
        strE.add(str2);
        System.out.println("strE: " + strE.toString());

        String strF = String.join("", str1, str2);
        System.out.println("strF: " + strF);

        String strG = String.format("%s%s", str1, str2);
        System.out.println("strG: " + strG);

        String[] strH = {str1, str2};
        System.out.println("strH: " + String.join("",strH));

        List<String> strI = Arrays.asList(str1, str2);
        System.out.println("strI: " + strI.stream().collect(Collectors.joining("")));

        String[] strJ = {str1, str2};
        System.out.println("strJ: " + String.valueOf(strJ[0]) + String.valueOf(strJ[1]));

        String strK = "{0}{1}";
        System.out.println("strK: " + MessageFormat.format(strK, str1, str2));

        System.out.println("strL: " + Stream.of(str1, str2).collect(Collectors.joining("")));

        CharBuffer strM = CharBuffer.allocate(str1.length() + str2.length());
        strM.put(str1);
        strM.put(str2);
        strM.flip();
        System.out.println("strM: " + strM.toString());

        System.out.println("strN: " + Optional.ofNullable(str1).orElse("") + Optional.ofNullable(str2).orElse(""));
        StringWriter strO = new StringWriter();
        PrintWriter strO_1 = new PrintWriter(strO);
        strO_1.print(str1);
        strO_1.print(str2);
        System.out.println("strO: " + strO.toString());

        String[] strP = {str1, str2};
        System.out.print("strP: ");
        for (String str : strP) {
            System.out.print(str);
        }
        System.out.println();

        String strQ = Stream.of(str1, str2).reduce("", String::concat);
        System.out.println("strQ: " + strQ);
        StringTokenizer strR = new StringTokenizer(str1 + str2);
        StringBuilder strR_1 = new StringBuilder();
        while (strR.hasMoreTokens()) {
            strR_1.append(strR.nextToken());
        }
        System.out.println("strR: " + strR_1.toString());

        String[] strS = {str1, str2};
        String strS_1 = Pattern.compile("").splitAsStream(String.join("", strS)).collect(Collectors.joining());
        System.out.println("strS: " + strS_1);

        String[] strT = {str1, str2};
        Arrays.parallelPrefix(strT, String::concat);
        System.out.println("strT: " + strT[strT.length - 1]);

        Formatter strU = new Formatter();
        strU.format("%s%s", str1, str2);
        String strU_1 = strU.toString();
        System.out.println("strU: " + strU_1);
        strU.close();
        
        CharArrayWriter strV = new CharArrayWriter();
        strV.write(str1, 0, str1.length());
        strV.write(str2, 0, str1.length());
        System.out.println("strV: " + strV.toString());

        ByteArrayOutputStream strW = new ByteArrayOutputStream();
        strW.writeBytes(str1.getBytes());
        strW.writeBytes(str2.getBytes());
        System.out.println("strW: " + strW.toString());

        ArrayDeque<String> strX = new ArrayDeque<>();
        strX.add(str1);
        strX.add(str2);
        System.out.println("strX: " + String.join("", strX));

        ByteBuffer strY = ByteBuffer.allocate(str1.length() + str2.length());
        strY.put(str1.getBytes());
        strY.put(str2.getBytes());
        String strY_1 = new String(strY.array());
        System.out.println("strY: " + strY_1);

        try {
            FileWriter writer = new FileWriter("temp.txt");
            writer.write(str1);
            writer.write(str2);
            writer.close();
            Scanner fileScanner = new Scanner(new File("temp.txt"));
            String strAQ = fileScanner.nextLine();
            fileScanner.close();
            System.out.println("strZ: " + strAQ);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

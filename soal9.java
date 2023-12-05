import java.util.Stack;
public class soal9 {
        public static void main(String[] args) {
            String[] ekspresi = {"5+(5*7)-3/4", "6+((1+13)*2)(/2", "2+((1+1)*8)/(9-8)"};
                System.out.println("ekspresi matematika yang dipakai :");
                for (int i = 0; i < ekspresi.length; i++) {
                    System.out.println(ekspresi[i]);
                }
                System.out.println("");
            for (String expr : ekspresi) {
                if (cekUrutanKurung(expr)) {
                    System.out.println("Ekspresi matematika \"" + expr + "\" memiliki urutan kurung yang benar.");
                } else {
                    System.out.println("Ekspresi matematika \"" + expr + "\" memiliki urutan kurung yang salah.");
                }
            }
        }
    
        public static boolean cekUrutanKurung(String ekspresi) {
            Stack<Character> stack = new Stack<>();
    
            for (char c : ekspresi.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
    
            return stack.isEmpty();
        }
    }


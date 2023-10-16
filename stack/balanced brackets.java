import java.util.*;
class game {
Stack<Character> st = new Stack<>();
    public  boolean isBalanced(String s) {
        for(int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else if(c == ')' || c == '}' || c == ']') {
                if(st.isEmpty()) return false;
                char top = st.pop();
                if(!(check(top,c))) {
                    return false;
                }
            }
            else {
                continue;
            }
        }
        return st.isEmpty();
    }
    public boolean check(char opening, char closing) {
        return (opening == '(' && closing == ')') || (opening == '{' && closing == '}') || (opening == '[' && closing ==']');
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = "";
    System.out.print("Enter the brackets --> ");
    s = sc.nextLine();
    game g = new game();
    if(g.isBalanced(s)){
        System.out.println("balanced brackets");
    }
    else {
        System.out.println("Unbalanced brackets");
    }
}
}

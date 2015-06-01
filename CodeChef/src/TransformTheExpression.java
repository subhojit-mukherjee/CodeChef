import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CustomStack {
	private final StringBuilder sb = new StringBuilder();

	public void push(char ch) {
		sb.append(ch);
	}

	public char pop() {
		int last = sb.length() - 1;
		char ch = sb.charAt(last);
		sb.setLength(last);
		return ch;
	}

	public int size() {
		return sb.length();
	}
	
	public char peek()
	{
		return sb.charAt(sb.length()-1);
	}
}


public class TransformTheExpression {
	
	public void handleOperator(CustomStack cs,StringBuilder sb,char opr,int priority)
	{
		char topOfStack;
		if(cs.size()>0)
			topOfStack=cs.peek();
	}
	
	public void gotOpenBrace(CustomStack cs,StringBuilder sb)
	{
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		String[] s = new String[line];
		for (int i = 0; i < line; i++) {
			s[i] = br.readLine();
		}

		for (int i = 0; i < line; i++) {
			CustomStack symbol = new CustomStack();
			StringBuilder posExp = new StringBuilder();
			TransformTheExpression tx=new TransformTheExpression();
			char[] expArray = s[i].toCharArray();
			for (int j = 0; j < expArray.length; j++) 
			{
			   
			   char ch=expArray[j];
               switch(ch)
               {
               case '+':
               case '-':
            	   tx.handleOperator(symbol, posExp,ch, 1);
            	   break;
               
               case '*':
               case '/':
            	   tx.handleOperator(symbol,posExp, ch, 2);
            	   break;
               
               case '^':
                   tx.handleOperator(symbol, posExp,ch, 0);
            	   break;
               case '(':
            	   symbol.push(ch);
            	   break;
               case ')':
            	   tx.gotOpenBrace(symbol, posExp);
            	   break;
               default:
            	   posExp.append(ch);
            	   
            	   
               }
               
			}
		}
	}
}

import java.util.Scanner;

public class E1_7
{
	public static void main(String[] args)
	{
		String a = ".-", b = "-...", c = "-.-.", d = "-..", e = ".", f = "..-.", g = "--.", h = "....", i = "..", j = ".---", k = "-.-", l = " .-..", m = "--", n = "-.", o = "---", p = ".--.", q = "--.-", r = ".-.", s = "...", t = "-", u = "..-", v = "...-", w = ".--", x = "-..-", y = "-.--", z = "--..";
		Scanner input = new Scanner(System.in);

		System.out.print("Type your name: ");
		String name = input.nextLine();
		name = name.toLowerCase();
		name = name.replace("", " ").trim();
		name = name.replace("a",a).trim();
		name = name.replace("b",b).trim();
		name = name.replace("c",c).trim();
		name = name.replace("d",d).trim();
		name = name.replace("e",e).trim();
		name = name.replace("f",f).trim();
		name = name.replace("g",g).trim();
		name = name.replace("h",h).trim();
		name = name.replace("i",i).trim();
		name = name.replace("j",j).trim();
		name = name.replace("k",k).trim();
		name = name.replace("l",l).trim();
		name = name.replace("m",m).trim();
		name = name.replace("n",n).trim();
		name = name.replace("o",o).trim();
		name = name.replace("p",p).trim();
		name = name.replace("q",q).trim();
		name = name.replace("r",r).trim();
		name = name.replace("s",s).trim();
		name = name.replace("t",t).trim();
		name = name.replace("u",u).trim();
		name = name.replace("v",v).trim();
		name = name.replace("w",w).trim();
		name = name.replace("x",x).trim();
		name = name.replace("y",y).trim();
		name = name.replace("z",z).trim();
		System.out.println(name);

	}
}
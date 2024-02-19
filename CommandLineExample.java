public class CommandLineExample {
public static void main(String args[]){

int i = Integer.parseInt(args[0]);
int j = Integer.ParseInt(args[1]);
int sum = i+j;

String name= args[2];
float f = Float.parseFloat(args[3]);
boolean b= Boolean.parseBoolean(args[4]);

Systam.out.println("addition of two numbers:" + sum);
Systam.out.println("name is:" + name);
Systam.out.println("float is:" + f);
Systam.out.println("boolean value is:" + b);

}
}
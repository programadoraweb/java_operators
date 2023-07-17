public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! test");

//Operators 
// perform operations on variables
// Arithmetic Operators - perform common mathematical operations


int a, b; //test
a = 9; 
b = 3;
System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
// Modulus - returns the division remainder
System.out.println(a % b);
// Increment by 1
System.out.println(++a);
// Decrement by 1
System.out.println(--b);


// Assignment Operator, = used to assign value to a variable 
int c = 30;
System.out.println("C "+ c);

//Addition Assignment Operator, += adds a value to a variable
int d,e ;
d = 5; 
e = 3;
System.out.println(d += e);// means: d + e =
System.out.println(d -= e);// means: d - e = 
System.out.println(d *= e);// means: d * e =
System.out.println(d /= e);
System.out.println(d %= e);
System.out.println(d &= e);// Bitwise And Operator. Result to the left operand.
System.out.println(d |= e);// Bitwise Or Operator. Result to the left operand.
System.out.println(d ^= e); // Bitwise exclusive OR Operator. Result to the left operand.
System.out.println(d >>= e);// Bitwise SHIFT RIGHT Operator. Result to the left operand.
System.out.println(d <<= e);// Bitwise SHIFT LEFT Operator. Result to the left operand.


// Comparison Operators - compare two variables. 
// They are boolean, will retirn either True or False.
int f, g; 
f = 5;
g =3;
System.out.println(f == g);
System.out.println(f != g);
System.out.println(f > g);
System.out.println(f < g);
System.out.println(f >= g);
System.out.println(f <= g);


// Logical Operators 
// They are boolean
// Check if the logic between variables are true or false
int h; 
h= 7;
System.out.println(h> 3 && h < 10); // And 
System.out.println(h> 3 || h < 10); // OrS 
System.out.println(!(h> 3 || h < 10)); //  Reverse the result 


// Bitwise Operators

    }
}

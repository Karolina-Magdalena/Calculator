public class Calculator {
  //this program is my simple calculator
public Calculator() {

}
public int add(int a,int b){
int sum;
sum=a+b;
return sum;
} 
public int subtract(int a,int b){
int difference=0;
difference=a-b;
return difference; 
}
public int multiply(int a,int b){
int product=0;
product=a*b;
return product;
}
public int divide(int a,int b){
int quotient=0;
quotient=a/b;
return quotient; 
} 
public int modulo(int a,int b){
int quotientM=0;
quotientM=a%b;
return quotientM; 
}
public static void main(String[] args) {
Calculator myCalculator = new Calculator(); 
System.out.println(myCalculator.add(5,7)); 
System.out.println(myCalculator.subtract(45,11)); 
}
}

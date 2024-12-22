package exercise;

public class Rectangle {
    int weight;
    int height;

void calculateArea(){
    System.out.println("The area of the rectangle is "+weight*height);

}
void calculatePerimeter(){
    System.out.println("The perimeter of the rectangle is "+(weight+height)*2);
}
void isSquare(){
    boolean square=true;
    if(weight==height)
        square=true;
    else
        square=false;
    System.out.println("정사갹형 여부:" +square);
}
}

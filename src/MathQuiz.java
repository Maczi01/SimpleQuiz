import java.util.Scanner;

public class MathQuiz {

    Scanner scanner = new Scanner(System.in);
    int answer;
    int score = 0;
    boolean question1(){
        System.out.println("Jaki jest wynik dzialania 3 x 5 = ?");
        answer = scanner.nextInt();
        return answer == 15;
    }

    boolean question2(){
        System.out.println("Jakie jest pole kwadratu o boku 12 ? ");
        answer = scanner.nextInt();
        return answer == 144;
    }

    boolean question3(){
        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129");
        answer = scanner.nextInt();
        return answer == 123;
    }

    void yourScore(){
        if(question1()){
            addPoint();
        }
        if(question2()){
            addPoint();
        }
        if (question3()){
            addPoint();
        }
        System.out.println("Twój wynik to: " + score+"/3");
    }

    void addPoint(){
        score++;
    }
}

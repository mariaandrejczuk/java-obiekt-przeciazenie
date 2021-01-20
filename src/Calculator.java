public class Calculator {
    int add(int... values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return sum;
    }

    /*
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    int add(int a, int b, int c, int d, int e){   ///przeciązenie metody dodającej  i nastpęnych
        return a+b+c+d+e;
    */
    int sub(int... values) {
        int sub = values[0];          //nie może być int sub = 0; powinna być pierwsza wartośc w tablicy i zastosować FOR (nie foreach)
        for (int i = 1; i < values.length; i++) {
            sub -= values[i];
        }
        return sub;
    }

    /*
    }
    int sub(int a, int b){
        return a-b;
    }
    int sub (int a, int b, int c){
        return a-b-c;
    }
    int sub(int a, int b, int c, int d){
        return a-b-c-d;
    }
    int sub(int a, int b, int c, int d, int e){
        return a-b-c-d-e;
    }
    */
    double div(int... values) {
        double div = (double) values[0];
        for (int i = 1; i < values.length; i++) {
            div /= values[i];
        }
        return div;
    }

    /*
    double div(int a, int b){  //przy dzieleniu int-ów końcówki są odcinane, więc zmieniono na double,
        // dodatkowo chociaż jeden element działania musi być typu double
        return (double)a/b;
    }
    double div(int a, int b, int c){
        return (double)a/b/c;
    }
    double div(int a, int b, int c, int d){
        return (double)a/b/c/d;
    }
    double div(int a, int b, int c, int d, int e){
        return (double)a/b/c/d/e;
    }
    */
    int multi(int... values) {
        int multi = 1;
        for (int v : values) {
            multi *= v;
        }
        return multi;
    }
    /*
    int multi(int a, int b){
        return a*b;
    }
    int multi(int a, int b, int c){
        return a*b*c;
    }
    int multi(int a, int b, int c, int d){
        return a*b*c*d;
    }
    int multi(int a, int b, int c, int d, int e){
        return a*b*c*d*e;
    }
    */
}

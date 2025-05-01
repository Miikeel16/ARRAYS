package ARRAYS;

public class ARRAYS{
    public int  numPequeño(int numeros[]){
        int min=9999999;
        for (int i : numeros) {
            if(min > i){
                min=i;
            }
        }
        return min;
    }
    public int suma(int numeros[]){
        int suma=0;
        for (int i : numeros) {
            suma+=i;
        }
        return suma;
    }
    public int sumaPares(int numeros[]){
        int suma=0;
        for (int i : numeros) {
            if (i%2==0){
                suma+=i;
            }
        }
        return suma;
    }
    public int sumaDivisores(int numeros[]){
        int suma=0;
        for (int i : numeros) {
            for(int num=0; num<i;num++){
                if(num%i==0){
                    suma+=i;
                }
            }
        }
        return suma;
    }
    public int devolverGrande(int numeros[]){
        int grande=0;
        for (int i : numeros) {
            if(i>grande){
                grande=i;
            }
        }
        return grande;
    }
    public int devolverIndice(int numeros[]){
        int grande=0;
        int posicion=0;
        for (int i : numeros) {
            if(i>grande){
                grande=i;
                posicion=numeros[i];
            }
        }
        return posicion;
    }
    public int[] fibonacci(){
        int numeros[]=new int[10];
        int num1=0, num2=1, fibonacci=0;
        for(int i=0;i<10;i++){
        numeros[i]=fibonacci;
         fibonacci=num1+num2;
         num1=num2;
         num2=fibonacci;
        }
        return numeros;
    }
    public int contarFinalesEnCuatro(int numeros[]) {
        int cont = 0;
        for (int i : numeros) {
            if (i % 10 == 4) { 
                cont++;
            }
        }
        return cont;
    }
    public int contarRepetidos(int numeros[]) {
        int grande = 0, cont = 0;

        for (int i : numeros) {
            if (i > grande) {
                grande = i;
            } else if (i == grande) {
                cont++;
            }
        }
        return cont;
    }
    public double mediaArray(int numeros[]){
        int media=0;
        int cont=0;
        for (int i : numeros) {
            media+=numeros[i];
            cont++;
        }
        return media/cont;
    }
    public int maxDigit(int nums[]){
        int cont = 0;
        int maxDigit = 0;
        int posicion = 0;
        for (int i : nums){
            int num = nums[i];
            while ( i > 0){
                i = i / 10;
                cont++;
            }
            if (cont > maxDigit){
                maxDigit = cont;
                posicion = num;
            }
            cont = 0;
        }
        return posicion;
    }

    public int sumDigit(int nums[]){
        int digito = 0, suma = 0, mayorSuma = 0;
        for ( int i = 0; i < nums.length ; i++){
            int num = nums[i];
            while (num > 0) {
                digito %=  10;
                num /= 10;
                suma += digito;
            }
            if (suma > mayorSuma){
                mayorSuma = suma;
            }
            suma = 0;
        }
        return mayorSuma;
    }
}
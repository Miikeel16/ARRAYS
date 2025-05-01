package ARRAYS;

public class ejercicios {
    
    public static int ejercicio1(int[] numeros){

        int max=0;

        for (int i=0; i<numeros.length; i++){
            if (numeros[i]>max){
                max= numeros[i];
            }
        }
        return max;
    }

    public static int ejercicio2(int[] array){
        int max=0;
        int cont=0;

        for (int i=0; i<array.length; i++){
            if (array[i]>max){
                max=array[i];
                cont= i;
            }
        }
        return cont;
    }

    public static int[] ejercicio3(){
        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;

        for (int i=0; i<10; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int ejercicio4(int[] array){
        int cont=0;

        for(int i=0; i<array.length; i++){
            if(array[i]%10==4){
                cont++;
            }
        }
        return cont;
    }

    public static int ejercicio5(int []nums){
        int max=0;
        int cont=0;

        for (int i=0; i<nums.length; i++){
            if (nums[i]>max){
                max=nums[i];

                if(nums[i]==max){
                    cont++;
                }
            }
        }
        return cont;
    }

    public static double ejercicio6(int []nums){
        int acum=0;
        int cont=0;

        for(int i=0; i<nums.length; i++){
            acum+=nums[i];
        }
        
        if(cont==0){
            return 0;
        }else{
            return acum/nums.length;
        }

    }

    //public int calcularDigitos(int x){
    //  int dig=0;
    //  while(x>0){
    //      dig++;
    //        x=x/10;
    //    }
    //    return dig;
    //}

    public static int ejercicio7(int []nums){
        int max=0;
        int cont=0;
        int indice=0;

        for(int i=0; i<nums.length; i++){

            while (nums[i]>0){
                nums[i]=nums[i]/10;
                cont++;
            }
            if(cont>max){
                max=cont;
                indice=i;
            }
            cont=0;
        }

        return indice;
    }

    public static int ejercicio8 (int []nums){
        int maxSuma=0;
        
        for (int i=0; i<nums.length; i++){
            int suma=0;

            while(nums[i]>0){
                nums[i]=nums[i]/10;
                suma+=nums[i]%10;
            }

            if(suma>maxSuma){
                maxSuma=i;
            }
        }
        return maxSuma;
    }
    
    //ARRAYS 2 (OTRA PÁGINA)

    public static int ejercicio9 (int[] nums){
        int min=1000000;
        int max=0;

        for(int i=0; i<nums.length; i++){

            if(nums[i]>max){
                max=nums[i];
            }

            if(nums[i]<min){
                min=nums[i];
            }
        }
        return max-min;
    }

    public static int[] ejercicio10 (int[]nums){
        int [] res={};
        int cont=0;
        for (int i = nums.length-1; i >=0; i--) {
            res[cont]=nums[i];
           cont++;
        }
        return res;
    }

    public static int[] ejercicio11 (int[]nums){
        int impares[] = {};
        int j=0;

        for (int i=0; i<nums.length; i++){
            if (nums[i]%2!=0){
               impares[j]=nums[i];
               j++;
            }
        }
        return impares;
    }

    public static int[] ejercicio12(int[]nums){
        int pares[] = {};
        int j=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]%2==0){
                pares[j]=nums[i];
                j++;
            }
        }
        return pares;
    }

    public static int ejercicio13(int[]nums, int num){
        int cont=0;
        for (int i=0; i<nums.length;i++){
            if (num==nums[i]){
                cont++;
            }
        }
        return cont;
    }

    public static int[] ejercicio14(int[]nums){
        int repes[]=new int [nums.length]; 
        int n=0;
        boolean txibato=false;

        for(int i=0;i<nums.length;i++){
            for(int j=0; j<repes.length;j++){
                if(repes[j]==nums[i]){
                    txibato=true;
                    break;
                }
            }
            if(!txibato){
                repes[n]=nums[i];
                n++;
            }
        }
        return repes;
    }

    public static int ejercicio15(int[]nums){
        int cont=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==cont){
                cont++;
            }else{
                break;
            }
        }
        return cont;
    }
    /// 
    public static double ejercicio16(int[]nums){
        int acum=0;
        int cont=0;
        
        for(int i=0; i<nums.length;i++){
            acum+=nums[i];
            cont=i;
        }

        if(cont==0){
            return 0;
        }else{
            return acum/cont; // nums.lenght
        }
    }

    public static int[] ejercicio17(int[]nums, int[] nums2){
        int compuesto[]= new int[nums.length + nums2.length];
        int cont=0;

        for(int i=0; i<nums.length;i++){
            compuesto[i]=nums[i];
            cont=i;
        }
        for(int i=cont+1; i<=nums2.length + cont; i++){
            compuesto[i]=nums2[i];
        }
        return compuesto;
    }

    public static int[] ejercicio18(int[]nums, int num){
        for(int i=0; i<nums.length;i++){
            if (nums[i]==num){
                nums[i]=0;
            }
        }
        return nums;
    }

    public static boolean ejercicio19(int[]nums){
        
        for(int i=0, j=nums.length-1; i<nums.length; i++, j--){
            if(nums[i] != nums[j]){
                return false;
            }
        }
        return true;
    }

    public static int[] ejercicio20(int[]nums, int num1, int num2){
        int aux=0;
        //TODO
        //Se le pasa también como parámetro dos números enteros y tiene que posicionar el 
        //primer número en el índice del segundo, moviendo el resto a la izquierda.

        return nums;
    }

    //MIRAR DE NUEVO
    public static int[] ejercicio21(int[]nums){
        int menor;

        for(int i = 0; i < 10; i++){
            menor = nums[0];

            if (nums[i] < menor){
                menor = nums[i];
            }
            else{
                if (nums[i] > menor){
                menor = menor;
                }      
            }
        }
        return nums;
    }

    //ARRAYS 3 (OTRA PÁGINA)

    //MIRAR DE OTRA FORMA
    public static String ejercicio22(String[]pal){

        String resultado = String.join(" ", pal);

        return resultado;
    }

    public String ejercicioAnterior (String [] pal){
        String palabra="";

        for(int i=0; i<pal.length; i++){
            palabra+= pal[i]+ " ";
        }
        return palabra;
    }

    public static boolean ejercicio23(String []pal, String palabra){

        for(int i=0;i<pal.length;i++){
            if (pal[i]==palabra){
                return true;
            }
        }
        return false;
    }

    //NOS QUEDAMOS AQUI
    public static int ejercicio24(String[]pal, String palabra){
        int cont=0;

        for (int i=0; i<pal.length;i++){
            if (pal[i]==palabra){
                cont++;
            }
        }
        return cont;
    }

    public static String[] ejercicio25(String[]pal){
        for(int i=0;i<pal.length;i++){
            pal[i]=pal[i].toUpperCase();
        }
        return pal;
    }

    public static String[] ejercicio26(String[]pal){
        String[] nuevo={};

        //Devuelve un array sin Strings repetidos.
        for(int i=0; i<pal.length; i++){
            for (int j=0; j<nuevo.length;j++){
                if (pal[i]!=nuevo[j]){
                    nuevo[j]=pal[i];
                }
            }
        }
        return nuevo;
    }

    //HACER CON STRINGS
    public static int ejercicio27 (String[]vocal){
        int cont=0;
        for (int i=0;i<vocal.length;i++){
            if(vocal[i]=="a" || vocal[i]=="e" || vocal[i]=="i" || vocal[i]=="o" || vocal[i]=="u"){
                cont++;
            }
        }
        return cont;
    }

    public static String[] ejercicio28 (String[]pal){
        String[] nuevo={};

        int j=0;
        for(int i=pal.length; i>=0; i--){
            nuevo[j]=pal[i];
        }
        return nuevo;
    }

    /// ARRAYS 2 Mikel
    
    public int diferencia (int[]nums){
        int max=0;
        int min=99999;
        int diferencia=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]>max){
                max=nums[i];
            }else if(nums[i]<min){
                min=nums[i];
            }
        }   
        diferencia=max-min;
        return diferencia;
    }

    public int[] invertido (int[]nums){
        int[] res = new int[nums.length];
        int cont = 0;
        for(int i =nums.length - 1; i>=0; i--){
            res[cont]= nums[i];
            cont++;
        }
        return res;
    }
    public int[] impares (int[]nums){
        int[] res = new int[nums.length];
        int cont =0;
        for(int i=0; i<nums.length;i++){
            if (nums[i]%2!=0){
                res[cont]=nums[i];
                cont++;
            }
        }
        return res;
    }
    public int[] pares (int[]nums){
        int[] res = new int[nums.length];
        int cont =0;
        for(int i=0; i<nums.length;i++){
            if (nums[i]%2=0){
                res[cont]=nums[i];
                cont++;
            }
        }
        return res;
    }
    public int entero (int[] nums, int entero){
        int cont=0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==entero){
                cont++;
            }
        }
        return cont;
    }








}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int ay,gun;
	Scanner intscanner = new Scanner(System.in);

	System.out.print("Doğduğunuz ayı giriniz: ");
	ay = intscanner.nextInt();
	System.out.println("Doğduğunuz günü giriniz: ");
	gun=intscanner.nextInt();

	if(ay==1){
	    if(1<=gun&&gun<=21){System.out.println("Oğlak");}
	    else if(22<=gun&&31>=gun){System.out.println("Kova");}
	    else{System.out.println("Geçersiz bir değer girdiniz.");}
    }
	else if(ay==2){
	    if(1<=gun&&gun<=19){System.out.println("Kova");}
	    else if(20<=gun&&gun<=29){System.out.println("Balık");}
	    else {System.out.println("Geçersiz bir değer girdiniz.");}
    }
	else if(ay==3){
	    if(1<=gun&&gun<=20){System.out.println("Balık");}
	    else if(21<=gun&&gun<=31){System.out.println("Koç");}
	    else{System.out.println("Geçersiz bir değer girdiniz.");}
    }
	else if(ay==4){
	    if(1<=gun&&gun>=20){System.out.println("Koç");}
	    else if(21<=gun&&gun<=30){System.out.println("Boğa");}
	    else{System.out.println("Geçersiz bir değer girdiniz.");}
    }
    else if(ay==5){
        if(1<=gun&&gun<=21){System.out.println("Boğa");}
        else if(22<=gun&&gun<=31){System.out.println("İkizler");}
        else{System.out.println("Geçersiz bir değer girdiniz.");}
    }
    else if(ay==6){
        if(1<=gun&&gun<=22){System.out.println("İkizler");}
        else if(23<=gun&&gun<=30){System.out.println("Yengeç");}
        else{System.out.println("Geçersiz bir değer girdiniz.");}
    }
    else if(ay==7){
        if(1<=gun&&gun<=22){System.out.println("Yengeç");}
        else if(23<=gun&&gun<=31){System.out.println("Aslan");}
        else{System.out.println("Geçersiz bir değer girdiniz.");}
    }
    else if(ay==8){
        if(1<=gun&&gun<=22){System.out.println("Aslan");}
        else if(23<=gun&&gun<=31){System.out.println("Başak");}
        else{System.out.println("Geçersiz bir değer girdiniz.");}
    }
    else if(ay==9){
        if(1<=gun&&gun<=22){System.out.println("Başak");}
        else if(23<=gun&&gun<=30){System.out.println("Terazi");}
        else{System.out.println("Geçersiz bir değer girdiniz.");}
    }
    else if(ay==10){
        if(1<=gun&&gun<=22){System.out.println("Terazi");}
        else if(23<=gun&&gun<=31){System.out.println("Akrep");}
        else{System.out.println("Geçersiz bir değer girdiniz.");}
    }
    else if(ay==11){
        if(1<=gun&&gun<=21){System.out.println("Akrep");}
        else if(22<=gun&&gun<=30){System.out.println("Yay");}
        else{System.out.println("Geçersiz bir değer girdiniz.");}
    }
    else if(ay==12){
        if(1<=gun&&gun<=21){System.out.println("Yay");}
        else if(22<=gun&&gun<=31){System.out.println("Oğlak");}
        else{System.out.println("Geçersiz bir değer girdiniz.");}
    }
    else{System.out.println("Geçersiz bir değer girdiniz");}




    }
}

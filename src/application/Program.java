package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do seu personagem: ");
        String nome = sc.nextLine();
        System.out.print("Digite a quantidade de XP do  seu personagem: ");
        int xp = sc.nextInt();
        String nivel = "";

        if (xp < 1000) {
            nivel = "Ferro";
        } else if (xp > 1000 && xp < 2000) {
            nivel = "Bronze";
        } else if (xp > 2000 && xp < 5000) {
            nivel = "Prata";
        } else if (xp > 5000 && xp < 7000) {
            nivel = "Ouro";
        } else if (xp > 7000 && xp < 8000) {
            nivel = "Platina";
        } else if (xp > 8000 && xp < 9000) {
            nivel = "Ascendente";
        } else if (xp > 9000 && xp < 10000) {
            nivel = "Imortal";
        } else {
            nivel = "Radiante";
        }

        System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);

        sc.close();
    }
}

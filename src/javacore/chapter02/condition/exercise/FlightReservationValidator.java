package javacore.chapter02.condition.exercise;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FlightReservationValidator {

    public static void main( String[] args){

                boolean isLoggedIn = true;//user est il co?

                int age = 18;

                int seatAvailable = 10;//nombre de place dispo

                boolean isPremiumMember = true;//utilisateur Vip?

                boolean isVipMember = true;//vol réservé au Vip?

                //le -1901 n'est clairement pas clean mais sinon je n'arrivais pas à trouver l'astuce pour comparer une date à aujourd'hui
                Date visaValidity = new Date(2024-1901,12,25);

                LocalDate visaDateValidity = LocalDate.from(visaValidity.toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDateTime());

                LocalDate today = LocalDate.now();

                if(isLoggedIn && age > 17 && seatAvailable > 0 && (!isPremiumMember || isVipMember) && !visaDateValidity.isBefore(today)){

                    System.out.println("réservation faite");
                }
                else if(age < 18){

                    System.out.println("Désolé vous n'êtes pas majeur");
                } else if (isVipMember && !isPremiumMember) {

                    System.out.println("désolé mais vous essayez de vous enregistrer sur un vol VIP alors que vous n'en n'avez pas le statut");
                } else if (seatAvailable < 1 ) {

                    System.out.println("nous sommes désolé mais le vol que vous essayez de réserver est complet");
                } else if (visaDateValidity.isBefore(today)) {

                    System.out.println("désolé mais votre visa à expiré");
                }
    }
}

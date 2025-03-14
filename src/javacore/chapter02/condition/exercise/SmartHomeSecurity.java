package javacore.chapter02.condition.exercise;

public class SmartHomeSecurity {
    public static void main(String[] args) {

        boolean isHouseEmpty = true;
        boolean isOwnerAsleep = true;
        boolean areAllDoorsAndWindowsClosed = true;
        boolean isAlarmActivated = false;
        boolean  isSafeModeActivated = (isHouseEmpty || isOwnerAsleep) && areAllDoorsAndWindowsClosed && isAlarmActivated;

        if(isSafeModeActivated) {
            System.out.println("mode securisé activé");
        }
        else{

            System.out.println("mode non sécurisé");
        }
    }
}

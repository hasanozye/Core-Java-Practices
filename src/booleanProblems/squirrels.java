package booleanProblems;

public class squirrels {
    public boolean squirrelPlay(int temperature, boolean isSummer) {
        if(isSummer) {
            return (temperature >= 60 && temperature <= 100);
        } else {
            return (temperature >= 60 && temperature <= 90);
        }
    }


}


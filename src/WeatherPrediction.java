public class WeatherPrediction {

    String CityName;
    int Speed;
    int RainPerc;
    boolean Rain;
    boolean Cloudy;
    boolean Sunny;

    Boolean ShouldIStroll;


    public void set(
            String NewCityName,
            int NewSpeed,
            int NewPerc,
            boolean NewCloudy,
            boolean NewSunny)
    {
        CityName = NewCityName;
        Speed = NewSpeed;
        RainPerc = NewPerc;

        if(RainPerc > 0) {
            Rain = true;
        } else{
            Rain = false;
        }
        Cloudy = NewCloudy;
        Sunny = NewSunny;
    }

    public void get(){
        System.out.println("City Name: " + CityName);
        if(Rain == true) {
            System.out.println("Is it Gonna Rain?: " + Rain);
            System.out.println("Rain%: " + RainPerc);
        }else {
            System.out.println("Is It Gonna Be Cloudy? " + Cloudy);
            System.out.println("Is It Gonna Be Sunny: " + RainPerc);
        }

    }

    public void Stroll(){
        if(Rain == false && Sunny == true){
            ShouldIStroll = true;
            System.out.println("it's a really good weather for a walk");
        }
        if(Rain == false && Cloudy == true){
            ShouldIStroll = null;
            System.out.println("it's a normal weather for a walk");
        }
        if(Rain == true){
            ShouldIStroll = false;
            System.out.println("it is not a time for a walk");
        }
    }

}

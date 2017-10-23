public class HelloPlanets {
    public static void main(String[] args){
        String[] planets={
                "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"
        };

        for( int i = 0; i < planets.length; i++ ){
            System.out.println( "Hello " + planets[i] + "!" );
        }

        for ( String plnt:planets ) {
            System.out.println( "Hello you " + plnt + "!" );
        }
    }
}

public class TestFile {

    public static void main(String[] args){

		ICartesian cart = new Cartesian(3,3);
        IPolar polar = new Polar(3*Math.sqrt(2),45*Math.PI/180);
        PToCAdapter adapter = new PToCAdapter(polar);

        System.out.println(cart);
        System.out.println(polar);
        System.out.println(adapter);

	}


}

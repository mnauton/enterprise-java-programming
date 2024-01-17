import java.util.Optional;

public class OptionalDemo {

	// Populate Bike with Optional<Wheels>
    private static Bike colnagoBike = new Bike(Optional.of(new Wheels("mavic", 32)), "colnago");
    
    // Dont do this - use a Optional.ofNullable
    private static Bike nullBike = new Bike(null, "nowheels");

    // Use a Optional.ofNullable
    private static Bike ofNullableBike = new Bike(Optional.ofNullable(null), "nowheels");
    
	public static void main(String[] args) {
		// Empty Optional - empty container with no object
        Optional<Bike> optionalEmptyBike = Optional.empty();
        
        // call get() on empty object throws NoSuchElementException
        try {
            Bike emptyBike = optionalEmptyBike.get();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("get() on empty Optional throws java.util.NoSuchElementException " + e.getMessage());
        }
	
        // isPresent - check if object is empty - but not much advantage over !=
        // null checks
        if (!optionalEmptyBike.isPresent()) {
            System.out.println("isPresent() - ok - but not much improvement on != null");
        }
	
        // Better Alternatives -
        // orElse - returns a default object if none set
        Bike orElseBike = optionalEmptyBike.orElse(colnagoBike);
        System.out.println("orElse - Optional is empty so return colnagoBike " + orElseBike.getBrand());
        
        // ifPresent(Consumer<? extends Bike>) - this prints nothing as Optional
        // is empty
        optionalEmptyBike.ifPresent(bike -> System.out.println("ifPresent(Consumer) returns " + bike.getBrand()));

        // orElseThrow - Throw Exception
        try {
            Bike orElseThrowBike = optionalEmptyBike.orElseThrow(NoBikeException::new);
        } catch (NoBikeException nbe) {
            System.out.println("orElseThrow NoBikeException");
        }
        
        // of - Populate with null object - Throws Exception
        try {
            Optional<Bike> optionalNullBike = Optional.of(null);
        } catch (java.lang.NullPointerException nfe) {
            System.out.println("Cant call Optional.of(null) - " + nfe.getMessage());
        }
	
        // ofNullable - allows null
        System.out.println("We can pass a null with ofNullable");
        Optional<Bike> optionalOfNullableBike = Optional.ofNullable(null);
        System.out.println("optionalOfNullableBike.isPresent() returns " + optionalOfNullableBike.isPresent());
	}

}

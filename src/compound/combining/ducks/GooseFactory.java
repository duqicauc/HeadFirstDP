package compound.combining.ducks;

public class GooseFactory extends AbstractGooseFactory {

	@Override
	public Quackable createGooseDuck() {
		return new GooseAdapter(new Goose());
	}

}

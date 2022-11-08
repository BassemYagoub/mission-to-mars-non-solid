package mars;

import java.util.stream.IntStream;

public class Helicoptere extends ModuleMartienVolant {

	public Helicoptere(Direction direction, Position position) {
		super(direction, position);
	}

	@Override
	public void monter() {
		position = new Position(position.getX(), position.getY(), position.getZ() + 1);
	}

	@Override
	public void descendre() {
		position = new Position(position.getX(), position.getY(), position.getZ() - 1);
	}

	@Override
	protected void sePoser() {
		int altitude = this.getPosition().getZ();
		this.atterir(altitude);
	}

	@Override
	protected void atterir(int altitude) {
		IntStream.range(0, altitude)
				.forEach((i -> this.descendre()));
	}
}
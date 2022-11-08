package mars;

import lombok.Getter;

public abstract class ModuleMartien {
	@Getter
	protected boolean pretPourRecuperation = false;

	@Getter
	protected Position position;

	private Direction direction;

	public ModuleMartien(Direction direction, Position position) {
		this.direction = direction;
		this.position = position;
	}

	public void avancer() {
		switch (direction) {
			case NORD:
				position = new Position(position.getX(), position.getY() + 1, position.getZ());
				break;
			case SUD:
				position = new Position(position.getX(), position.getY() - 1, position.getZ());
				break;
			case OUEST:
				position = new Position(position.getX() - 1, position.getY(), position.getZ());
				break;
			default:
				position = new Position(position.getX() + 1, position.getY(), position.getZ());
		}
	}

	public void reculer() {
		switch (direction) {
			case NORD:
				position = new Position(position.getX(), position.getY() - 1, position.getZ());
				break;
			case SUD:
				position = new Position(position.getX(), position.getY() + 1, position.getZ());
				break;
			case OUEST:
				position = new Position(position.getX() + 1, position.getY(), position.getZ());
				break;
			default:
				position = new Position(position.getX() - 1, position.getY(), position.getZ());
		}
	}

	public void activerRecuperation() {
		pretPourRecuperation = true;
	}
}
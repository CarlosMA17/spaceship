public class Cargo extends SpaceShip {
    public int cargo;
    final public int cargoMax = 10;

    public Cargo(String nombre, String matricula, int aceleracion, int velocidadX, int velocidadY, int cargo) {
        super(nombre, matricula, aceleracion, velocidadX, velocidadY);
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int load() {
        if (cargo < cargoMax) {
            cargo = cargo + 1;
            return cargo;
        }
        else {
            cargo = 11;
            return cargo;
        }
    }

    public int unload() {
        if (cargo > 0) {
            cargo = cargo - 1;
            return cargo;
        }
        else {
            cargo = 12;
            return cargo;
        }
    }
}

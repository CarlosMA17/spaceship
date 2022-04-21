public class SpaceShip {
    public String nombre;
    public String matricula;
    public float aceleracion;
    public int velocidadX = 1;
    public int velocidadY = 0;
    public float coordenadaX = 0.0f;
    public float coordenadaY = 0.0f;
    public int direccionX = 1;
    public int direccionY = 0;

    public SpaceShip(String nombre, String matricula, float aceleracion, int velocidadX, int velocidadY) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.aceleracion = aceleracion;
        this.velocidadX = velocidadX;
        this.velocidadY = velocidadY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }

    public float getVelocidadX() {
        return velocidadX;
    }

    public void setVelocidadX(int velocidadX) {
        this.velocidadX = velocidadX;
    }

    public float getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadY(int velocidadY) {
        this.velocidadY = velocidadY;
    }

    public int speedUp() {

        velocidadX = velocidadX+1;
        return velocidadX;
    }

    public int brake() {
        velocidadX = velocidadX-1;
        return velocidadX;
    }

    public int emergencyStop() {
        velocidadX = 0;
        return velocidadX;
    }

    public String toString() {

        return "       !\n" +
                "       !\n" +
                "       ^\n" +
                "      / \\\n" +
                "     /___\\\n" +
                "    |=   =|\n" +
                "    |     |\n" +
                "    |     |\n" +
                "    |     |\n" +
                "    |     |\n" +
                "    |     |\n" +
                "    |     |\n" +
                "    |     |\n" +
                "    |     |\n" +
                "    |     |\n" +
                "   /|##!##|\\\n" +
                "  / |##!##| \\\n" +
                " /  |##!##|  \\\n" +
                "|  / ^ | ^ \\  |\n" +
                "| /  ( | )  \\ |\n" +
                "|/   ( | )   \\|\n" +
                "    ((   ))\n" +
                "   ((  :  ))\n" +
                "   ((  :  ))\n" +
                "    ((   ))\n" +
                "     (( ))\n" +
                "      ( )\n" +
                "       .\n" +
                "       .\n" +
                "       .";
    }

}

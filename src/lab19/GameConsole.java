package lab19;

public class GameConsole implements Powered {

        private Brand brand = Brand.MICROSOFT;
        private Models model = Models.XBOX_360;
        private String serial = "XC123QeWR";
        private boolean isOn;
        private Object firstGamepad;
        private Object secondGamepad;
        private Game activeGame;

    {
        if (isOn)
        {
            this.isOn = true;
            System.out.println("On");
        } else {
            this.isOn = false;
            System.out.println("Off");
        }
    }

        public GameConsole (Brand brand, String serial)
        {
            this.brand = brand;
            this.serial = serial;
        }

        @Override
        public void powerOn() {
            System.out.println("Console's running.");
        }
        @Override
        public void powerOff() {
            System.out.println("Console's powered off.");
        }

        public void loadGame (Game game) {
        System.out.printf ("Игра %s загружается\n", game.getName());
        this.activeGame = game;
    }

        public void playGame(){
        System.out.println ("Play " + this.activeGame.getName() + ".");

        if (((Gamepad) this.firstGamepad).isOn){
            ((Gamepad) this.firstGamepad).chargeLevel -=10;
            System.out.printf("Заряд батареи firstGamepad - %.1f\n",((Gamepad) this.firstGamepad).chargeLevel);
            if(((Gamepad) this.firstGamepad).chargeLevel == 0){
                ((Gamepad) this.firstGamepad).powerOff();
            }
        }
        if (((Gamepad) this.secondGamepad).isOn){
            ((Gamepad) this.secondGamepad).chargeLevel -=10;
            System.out.printf("Заряд батареи secondGamepad - %.1f\n",((Gamepad) this.secondGamepad).chargeLevel);
            if(((Gamepad) this.secondGamepad).chargeLevel == 0) {
                ((Gamepad) this.secondGamepad).powerOff();
            }
        }
        System.out.println();
    }

        private void checkConnectedNumber() {

        if (!((Gamepad) this.firstGamepad).isOn) {
            if (((Gamepad) this.secondGamepad).isOn) {
                ((Gamepad) this.secondGamepad).connectedNumber = 1;
            } else {

            }
        } else {
            ((Gamepad) this.secondGamepad).connectedNumber = 2;
        }
    }

        public Object getFirstGamepad() {
        return firstGamepad; }

        public Object getSecondGamepad() {
        return secondGamepad; }

    class Gamepad implements Powered {
        private Brand brand;
        private String consoleSerial;
        private int connectedNumber;
        private Color color;
        private double chargeLevel = 100.0;
        private boolean isOn;

        {
            if (isOn) {
                this.isOn = true;
                System.out.println("On");
            } else {
                this.isOn = false;
                System.out.println("Off");
            }
        }


        public Gamepad(Brand brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            consoleSerial = serial;
            Gamepad firstGamepad = new Gamepad(brand, 1);
            Gamepad secondGamepad = new Gamepad(brand, 2);


        }

        public int getConnectedNumber() {
            return connectedNumber;
        }

        public Brand getBrand() {
            return brand;
        }

        public void setBrand(Brand brand) {
            this.brand = brand;
        }

        public String getConsoleSerial() {
            return consoleSerial;
        }

        public void setConsoleSerial(String consoleSerial) {
            this.consoleSerial = consoleSerial;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public double getChargeLevel() {
            return chargeLevel;
        }

        public void setChargeLevel(double chargeLevel) {
            this.chargeLevel = chargeLevel;
        }

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            isOn = on;
        }

        @Override
        public void powerOff() {
            this.isOn = true;
            GameConsole.this.checkConnectedNumber();
            System.out.printf("Джойстик %d включается.\n", this.connectedNumber);
            Gamepad.this.powerOn();
            System.out.printf("Заряд батареи %.1f%% .\n\n", this.chargeLevel);
        }

        @Override
        public void powerOn() {
            this.isOn = false;
            System.out.printf("Джойстик %d выключается.\n\n", this.connectedNumber);
            GameConsole.this.checkConnectedNumber();
        }
    }
}

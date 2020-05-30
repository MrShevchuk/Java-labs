package lab19;

public class GameConsole {

        private Brand brand = Brand.MICROSOFT;
        private Models model = Models.XBOX_360;
        private String serial = "XC123QeWR";
        private boolean isOn;

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

    class Gamepad {
        private Brand brand = Brand.MICROSOFT;
        private String consoleSerial;
        private final int connectedNumber;
        private Color color = Color.GREEN;
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
            Gamepad firstGamepad = new Gamepad(brand,1);
            Gamepad secondGamepad = new Gamepad(brand,2);
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
    }
}

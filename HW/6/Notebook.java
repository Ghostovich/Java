public class Notebook {
        private Integer operativeMemory;
        private Integer hddSize;
        private String operatingSystem;
        private String colour;
        private String manufacturer;
        private Float speedCPU;
        private String model;

        public Notebook(Integer operativeMemory, Integer hddSize, String operatingSystem,
                        String colour, String manufacturer, Float speedCPU, String model) {
                this.operativeMemory = operativeMemory;
                this.hddSize = hddSize;
                this.operatingSystem = operatingSystem;
                this.colour = colour;
                this.manufacturer = manufacturer;
                this.speedCPU = speedCPU;
                this.model = model;
        }

        @Override
        public String toString() {
                return "Производитель = " + manufacturer + " \n" + "Модель = " + model + " \n" + "Цвет = "
                                + colour + " \n" + "Операционная система = " + operatingSystem + " \n"
                                + "Оперативная память = " + operativeMemory + "гб \n" + "Объём жесткого диска = "
                                + hddSize + "гб \n" + "Частота процессора = " + speedCPU + "гц \n";
        }

        public Integer getOperativeMemory() {
                return operativeMemory;
        }

        public void setOperativeMemory(Integer operativeMemory) {
                this.operativeMemory = operativeMemory;
        }

        public Integer getHddSize() {
                return hddSize;
        }

        public void setHddSize(Integer hddSize) {
                this.hddSize = hddSize;
        }

        public String getOperatingSystem() {
                return operatingSystem;
        }

        public void setOperatingSystem(String operatingSystem) {
                this.operatingSystem = operatingSystem;
        }

        public String getColour() {
                return colour;
        }

        public void setColour(String colour) {
                this.colour = colour;
        }

        public String getManufacturer() {
                return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
        }

        public Float getSpeedCPU() {
                return speedCPU;
        }

        public void setSpeedCPU(Float speedCPU) {
                this.speedCPU = speedCPU;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

}

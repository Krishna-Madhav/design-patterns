package builder_design_pattern;

public class Phone {

        private String os;
        private int ram;
        private String processor;
        private String company;
        private int battery;

        public Phone(String os, int ram, String processor, String company, int battery) {
            this.os = os;
            this.ram = ram;
            this.processor = processor;
            this.company = company;
            this.battery = battery;
        }

        @Override
        public String toString() {
            return "Phone{" +
                    "os='" + os + '\'' +
                    ", ram=" + ram +
                    ", processor='" + processor + '\'' +
                    ", company='" + company + '\'' +
                    ", battery=" + battery +
                    '}';
        }
    }



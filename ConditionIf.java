public class ConditionIf {
    public static void main(String[] args) {
        System.out.println("Latihan Nested If");
        System.out.println("Masukan nilai : ");
        int input = Integer.parseInt(System.console().readLine());
        if (input > 8) {
            System.out.println("Baik");
            int rata = 0;
            System.out.println("Masukan kelas : ");
            String input2 = System.console().readLine();
            if (input2.equals("A")) {
                rata = 60;
            } else if (input2.equals("B")) {
                rata = 65;
            } else if (input2.equals("C")) {
                rata = 80;
            }
            System.out.println("Nilai rata2 kelas : " + rata);

        } else if (input <= 8 && input > 6) {
            System.out.println("Cukup");
            int rata = 0;
            System.out.println("Masukan kelas : ");
            String input2 = System.console().readLine();
            switch(input2){
                case "A":
                    rata = 60;
                    break;
                case "B":
                    rata = 60;
                    break;
                case "C":
                    rata = 60;
                    break;
                case "D":
                case "E":
                    rata = 90;
                    break;
                default:
                    rata = -1;
                    break;
            }
            System.out.println("Nilai rata2 kelas : " + rata);
        } else if (input <= 6 && input > 4) {
            System.out.println("Buruk");
        } else if (input <= 4 && input > 0) {
            System.out.println("Menghawatirkan");
        } else {
            System.out.println("Input tidak valid");
        }
    }
}
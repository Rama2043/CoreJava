package Arrays;

public class StringArray {
    public static void main(String[] args) {
        String name[] = {"Apple","Orange","Watermelon"};
        String[][] multi = {{"Rishi","Apple"},{"Hruthik","Orange"},{"Rama", "Pomegranate"}};
        for(int i = 0;i<name.length;i++)
            System.out.println(name[i]);
        for(int i = 0;i < multi.length;i++){
            for(int j = 0;j<multi[i].length;j
                    ++){
                System.out.println(multi[i][j]);
            }
        }
    }
}

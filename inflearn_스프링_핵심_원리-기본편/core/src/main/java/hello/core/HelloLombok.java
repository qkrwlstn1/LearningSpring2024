package hello.core;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("박진수", 27);

        System.out.println("helloLombok.toString() = " + helloLombok.toString());
    }

}

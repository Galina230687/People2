public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("����")
                .setSurname("�����")
                .setAge(35)
                .setAddress("������")
                .build();
        Person son = mom.newChildBuilder()
                .setName("�������")
                .setSurname("�������")
                .setAge(5)
                .build();
        System.out.println("� " + mom + " ���� ���, " + son);

        try {
            // �� ������� ������������ �����
            new PersonBuilder().setSurname(null).build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // ������� ������������
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
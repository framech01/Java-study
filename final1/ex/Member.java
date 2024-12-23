package final1.ex;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //id가 final 변수이기 때문에 수정 불가능
    public void changeData(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(id + " " + name);
    }
}


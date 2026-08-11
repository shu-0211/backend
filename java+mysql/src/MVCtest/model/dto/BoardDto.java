package MVCtest.model.dto;



public class BoardDto {
    private String phone;
    private int people;

    public BoardDto(){};
    public BoardDto(String phone , int people){
        this.phone = phone;
        this.people = people;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPeople() {
        return people;
    }
    public void setPeople(int people) {
        this.people = people;
    }

   @Override
    public String toString() {
        return "BoardDto [전화번호 = " + phone + ", 인원수 = " + people + "]";
    }
    
}// class end

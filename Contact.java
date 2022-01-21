public class Contact {
    private String name;
    private int month;
    private int day;

    public Contact(String name, int month, int day) throws InvalidInputException {
        if(month > 12){
            InvalidInputException e = new InvalidInputException("Invalid month");
            throw e;
        }
        this.name = name;
        this.month = month;
        this.day = day;
    }

    public String toString(){
        return name = "\t" + month + "\\" + day;
    }
}

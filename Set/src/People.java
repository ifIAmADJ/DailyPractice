public class People{

    private String name;
    private String id;

    People(String name,String id){

        this.name=name;
        this.id=id;
    }

    public String getName(){

        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean islegalID(){

        String text=id;

        if(text.matches("\\p{Digit}{8}"))
        {
            return true;
        }else
            return false;
    }





}

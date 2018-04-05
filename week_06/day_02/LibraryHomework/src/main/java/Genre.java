public enum Genre {
    Horror("Scary"),
    Romance("Soppy"),
    Fantasy("Bloody"),
    SciFi("Awesome"),
    Historic("Bloody Awesome");

    private String description;

    Genre(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

}

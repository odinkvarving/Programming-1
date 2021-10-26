class NyString {

private String tekst;
private char bokstav;

    public NyString(String tekst){

        this.tekst = tekst;
    }

    public String getForkortetTekst(){

        String ord[] = tekst.split(" ");

        String nystring ="";

        for(int i = 0; i < ord.length; i++){

            nystring += ord[i].charAt(0);
        }
        return nystring;
    }

    public String getTegnFjernet(String bokstav) {

        String forkortet = "";

        forkortet += tekst.replace(bokstav, "");

    return forkortet;
    }
}

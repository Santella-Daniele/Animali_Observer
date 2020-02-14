class Main {
    public static void main (String[] args){
        Cane cane = new Cane();
        Gatto gatto = new Gatto();
        
        cane.abbaia();
        cane.attach(gatto);
        cane.abbaia();
        cane.detach(gatto);
        cane.abbaia();
    }
}

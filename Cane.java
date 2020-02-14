class Cane extends Subject {
    
    public Cane (){
        
    }
    
    public void abbaia(){
        System.out.println("Woof");
         for (Observer gatto : super.getOsservatori()){
                gatto.update();
    
         }
        }
    
}
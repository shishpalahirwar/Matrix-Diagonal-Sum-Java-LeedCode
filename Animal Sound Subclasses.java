class animal {
    public void makeSound() {
    }
}
class dog extends animal{
    @Override
    public void makeSound(){
        System.out.println("sound made by dog :");
    }
}
class cat extends animal{
    @Override
    public void makeSound(){
        System.out.println("sound made by cat :");
    }
    
}
class cow extends animal{
    @Override
    public void makeSound(){
        System.out.println("sound made by cow :");
    }
}
class Main{
    public static void main (String[] args){
        animal a=new dog();
        a.makeSound();
        animal b=new cat();
        b.makeSound();
        animal c=new cow();
        c.makeSound();
    }  
}

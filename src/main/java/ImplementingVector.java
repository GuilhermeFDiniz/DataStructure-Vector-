import java.util.Arrays;

public class ImplementingVector {

    private GenericObjects[] genericObject = new GenericObjects[100];
    private int totalObjects = 0;


    //The method searches for the last position of the object and then add the new object
    public void addObject (GenericObjects object){
        for(int i = 0; i<this.genericObject.length; i++) {
            if (this.genericObject[i] == null) {
                this.genericObject[i] = object;
                this.totalObjects++;
                break;
            }
        }
    }

    //The method verifies if the position is valid, then move to the right all the objects after the position,
    //Then adds the new object into the position and increments totalObjects by 1
    public void addObject (int position, GenericObjects object) {
        if(!this.verifyPosition(position)){
            throw new IllegalArgumentException("Invalid Position Number");}
        for(int i=this.totalObjects;i<position;i--){
            this.genericObject[i+1]=this.genericObject[i];
        }
        this.genericObject[position]=object;
        this.totalObjects++;
    }


    //The method verifies if the position is a true statement.
    public boolean verifyPosition(int position){
        return position > 0 && position <this.totalObjects;
    }

    // The Method verifies if the position number exists, if so return the object, if not it throws an Exception.
    public GenericObjects getPosition(int position) {
        if(!this.verifyPosition(position)){
            throw new IllegalArgumentException("Invalid Position Number");
        }
        return this.genericObject[position];
    }

    //The method verifies if the position is valid, then move to the left all the objects after the position,
    //so it turns the last object into null and decrements totalObjects by 1
    public void removeObject(int position){
        if(!this.verifyPosition(position)){
            throw new IllegalArgumentException("Invalid Position Number");
        }
        for (int i=position;i<totalObjects-1;i++){
            this.genericObject[i]=this.genericObject[i+1];
        }
        totalObjects--;
    }

    // The method compares each object to the argument, then return true or false.
    public boolean contains(GenericObjects object){
        for(int i = 0; i<this.genericObject.length; i++) {
            if (this.genericObject[i] == object){
                return true;
            }
        }
        return false;
    }


    //The method objectLength returns the total number of the objects.
    public int objectLength(){
         return this.totalObjects;
    }

    @Override
    public String toString() {
        if(this.totalObjects==0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i=0;i<this.totalObjects-1;i++){
            builder.append(this.genericObject[i]);
            builder.append(", ");
        }
        builder.append(this.genericObject[totalObjects-1]);
        builder.append("]");

        return builder.toString();
    }
}

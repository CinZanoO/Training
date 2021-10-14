package Tasks;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* 
Externalizable для апартаментов
*/

public class Task10_11 {

    public static class Apartment implements Externalizable{

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }
        
        public void writeExternal(ObjectOutput out) {
            try 
            {
                out.writeObject(address);
                out.writeInt(year);
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        
        public void readExternal(ObjectInput in) {
            try 
            {
                address = (String) in.readObject();
                year = in.readInt();
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }
        }
        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }
    }

    public static void main(String[] args) {

    }
}


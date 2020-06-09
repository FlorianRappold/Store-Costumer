package SaveCostumer;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class ListModel extends AbstractListModel<Entity> {


        private static final long serialVersionUID = 1L;
        private ArrayList<Entity> al = new ArrayList<>();

        @Override
        public Entity getElementAt(int index) {
            return	al.get(index);
        }

        @Override
        public int getSize() {
            return al.size();
        }

        public void addElement(Entity e) {
            al.add(e);
        }


        public void showElement(int index){
            System.out.println(al.get(index));
        }


        public void save() {
		try {
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("datenbank.txt" ,true), "UTF-8"));
            for(int i = 0; i < getSize(); i++){
                Entity e = al.get(i);
                out.write(e.firstname + "\t" + e.lastname +"\t"+ e.customernum);
                out.newLine();
            }out.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
        }
    }


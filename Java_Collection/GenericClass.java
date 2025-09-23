/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionExample;

/**
 *
 * @author A-2
 */
public class GenericClass {
    public class Box <F> {
        private F value;

        public F get() {
            return value;
        }

        public void set(F value) {
            this.value = value;
        }
    
    }
}

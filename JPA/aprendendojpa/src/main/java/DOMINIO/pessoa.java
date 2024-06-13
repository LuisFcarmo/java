package DOMINIO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
    


    @Entity
    public class pessoa  implements Serializable{
        @Column(name="nomecompleto")
        private String name;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        public pessoa () {
    
        }
        
        public pessoa(String name, Integer id) {
            this.name = name;
            this.id = id;
        }
    
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Integer GetId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        @Override
        public String toString() {
            return "pessoa [name=" + name + ", idade=" + id + "]";
        }
    }
 

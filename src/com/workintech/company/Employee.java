package com.workintech.company;

import java.util.LinkedList;

public class Employee {

        private int id;
        private String firstname;
        private String lastname;

        public Employee(int id, String firstname, String lastname) {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public int getId() {
            return id;
        }

        public String getFullName() {
            return firstname + " " + lastname;
        }
    }

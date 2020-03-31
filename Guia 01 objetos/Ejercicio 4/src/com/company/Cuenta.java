package com.company;

public class Cuenta {

        private int id;
        private String nombre;
        private double balance;

        public void crearCuenta(int id,String nombre,double balance){
            setBalance(balance);
            setId(id);
            setNombre(nombre);
        }
        public void verCuenta()
        {
            System.out.println("-------------------------");
            System.out.printf("Nombre:%s\n",this.nombre);
            System.out.printf("ID::%d\n",this.id);
            System.out.printf("Balance::%.2f\n",this.balance);
            System.out.println("-------------------------\n");

        }

        public double credito(double deposito) {
            this.balance += deposito;
            return this.balance;
        }
        public double debito(double debitar)
        {
            if (debitar > this.balance)
            {
                System.out.println("Saldo insuficiente\n");
            }
            else
            {
                this.balance -= debitar;
            }
            return this.balance;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public int getId() {
            return this.id;
        }

        public String getNombre() {
            return this.nombre;
        }

        public double getBalance() {
            return this.balance;
        }

}

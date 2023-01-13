package org.example.Template_method;

public class BrickHouse extends HouseTemplate {
        @Override
        protected void buildFoundation() {
                System.out.println("BrickHouse buildFoundation");
        }
        @Override
        protected void buildWalls() {
                System.out.println("BrickHouse buildWalls");
        }
        @Override
        protected void makeRoof() {
                System.out.println("BrickHouse makeRoof");
        }
        @Override
        protected void insertWindows() {
                System.out.println("BrickHouse insertWindows");
        }
}
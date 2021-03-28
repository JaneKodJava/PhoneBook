package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Processor processor = new Processor();
        RAMmemory raMmemory = new RAMmemory();
        HardDrive hardDrive = new HardDrive();
        Screen screen = new Screen();
        Keyboard keyboard = new Keyboard();

        Computer computer = new Computer(processor, raMmemory, hardDrive, screen, keyboard);
        System.out.println("Вес компьютера: "+ computer.getCompWeight());
        computer.print();

        Laptop laptop1 = new Laptop("lenovo / Трансформер ThinkPad X1 Yoga Core i7", 14.0, " Intel Core i7 8565U",
                4, 1800, "LPDDR3", 16, "SSD", 2048,
                "Без подсветки", 2000);
        laptop1.printLaptop();

        Laptop laptop2 = new Laptop("Echips / Ноутбук Power Intel Core i5-5257U/8GB/SSD256GB/15,6\"FHD/Intel HD 6000/Win10Pro",
                15.6, "Intel Core i5 5257U", 2, 3100, "LPDDR3",
                8, "SSD M.2", 256, "Без подсветки", 2200);
        laptop2.printLaptop();

        Laptop laptop3 = new Laptop("HP / Ноутбук Omen 15-dh1034ur Intel Core i9-10885H/32GB/SSD1024GB/15.6\"FHD/GeForce RTX 2080 Super/Win10",
                15.6, "Intel Core i9-10885H", 8, 2400, "DDR4", 32,
                "SSD", 1024, "Без подсветки", 2650);
        laptop3.printLaptop();

    }

}

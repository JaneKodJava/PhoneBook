package ru.skillbox;

public class Computer {
    private static Processor processor;
    private static RAMmemory raMmemory;
    private static HardDrive hardDrive;
    private static Screen screen;
    private static Keyboard keyboard;
    private static final String VENDOR_COMPUTER = "Apple";
    private static final String NAME = "Mac Mini i5/8GB/SSD512Gb/Intel UHD 630/macOS (2020) (MXNG2RU/A)";
    private static int compWeight;

    public Computer(Processor processor, RAMmemory raMmemory, HardDrive hardDrive, Screen screen, Keyboard keyboard){
        this.processor = processor;
        this.raMmemory = raMmemory;
        this.hardDrive = hardDrive;
        this.screen = screen;
        this.keyboard = keyboard;
    }


    public void calculCompWeight(){
        compWeight = Processor.getWEIGHT() + RAMmemory.getWEIGHT() + HardDrive.getWEIGHT() + Screen.getWEIGHT() + Keyboard.getWEIGHT();
    }

    public int getCompWeight(){
        calculCompWeight();
        return compWeight;
    }

    public String toString(){
        return "Процессор: " + "\nЧастота" +Processor.getFREQUENCY() + " МГц"
                + "\nКоличество ядер: " +Processor.getNumberOfCores()
                + "\nПроизводитель: " +Processor.getVENDOR() + "\nВес: " +Processor.getWEIGHT() +" г\n"
                + "\nОперативная память:" + "\nТип: " +RAMmemory.getTYPE() + "\nОбъем: " + RAMmemory.getAmountOfRam()
                + "\nВес: " +RAMmemory.getWEIGHT() + " г\n"
                + "\nЖесткий диск:" + "\nТип: " + HardDrive.getTYPE() + "\nОбъем: " + HardDrive.getSPACE()
                + "\nВес: " + HardDrive.getWEIGHT() +" г\n" + "\nМонитор:" + "\nДиагональ: " +Screen.getDIAGONAL() +" дюймов"
                + "\nТип: " +Screen.getTYPE() +"\nВес: " +Screen.getWEIGHT() +" г\n"
                + "\nКлавиатура:" + "\nТип: " +Keyboard.getTYPE() + "\nПодсветка: " +Keyboard.getBACKLIT()
                + "\nВес: " +Keyboard.getWEIGHT() +" г";
    }

    public void print(){
        System.out.println("\nНазвание компьютера: " +NAME);
        System.out.println("Производитель: " +VENDOR_COMPUTER +"\n");
        String info = toString();
        System.out.println(info);
    }
}

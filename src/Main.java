public class Main {

    public static void main(String[] args) {
        ModuloApproach moduloApproach = new ModuloApproach();
        int[] data = new int[17];
        data[0] = 3235235;
        data[1] = 14235235;
        data[2] = 523523;
        data[3] = 23235235;
        data[4] = 453423452;
        data[5] = 42352466;
        data[6] = 456345;
        data[7] = 45645465;
        data[8] = 2352236;
        data[9] = 124114;
        data[10] = 32423;
        data[11] = 235235;
        data[12] = 234234532;
        data[13] = 235235;
        data[14] = 23523;
        data[15] = 346363;
        data[16] = 45645645;

        int servers = 10;

        moduloApproach.server(servers, data);
    }
}

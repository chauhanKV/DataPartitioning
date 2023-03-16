public class ModuloApproach {

    public void server(int noOfServers, int[] data) {
        int server = 0;
        for (int i = 0; i < data.length; i++) {
            server = data[i] % noOfServers;
            System.out.println("Data " + data[i] + " will be placed in Server " + server + "");
        }
    }
}

public class ConcreteFactory extends AbstractFactory{

    @Override
    public void printScreen() {
        System.out.println("Hello World");
    }

    @Override
    public void printFile() {
        Path path1 = Paths.get("teste1.txt");
        // defaultCharset retorna a codificação padrão de textos (usualmente UTF-8)
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path1, Charset.defaultCharset())))
        {
            writer.println("Hello World");
        }catch (IOException e) {
            System.err.format("Erro de E/S: %s%n", e);
        }
    }
}
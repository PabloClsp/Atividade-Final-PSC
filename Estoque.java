import java.io.*;
import java.util.ArrayList;

public class Estoque implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    // Métodos adicionados, listar, buscar, remover, etc.

    public void salvarEstoque() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("estoque.dat"))) {
            oos.writeObject(produtos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void carregarEstoque() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("estoque.dat"))) {
            produtos = (List<Produto>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

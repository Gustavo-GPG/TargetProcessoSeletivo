public class Questão4 {

  // O esquema do banco de dados está no arquivo EsquemaTabelas.png

  // Ao roda o programa no consele irá aparecer a query
  public static void main(String[] args) {
    String query = "SELECT \n"
        + "    c.id_cliente,\n"
        + "    c.razao_social,\n"
        + "    t.numero AS telefone\n"
        + "FROM \n"
        + "    Cliente c\n"
        + "JOIN \n"
        + "    Telefone t ON c.id_cliente = t.cliente_id\n"
        + "JOIN \n"
        + "    Estado e ON c.estado_id = e.id_estado\n"
        + "WHERE \n"
        + "    e.uf = 'SP'";

    // Query:
    //SELECT
    //    c.id_cliente,
    //    c.razao_social,
    //    t.numero AS telefone
    //FROM
    //    Cliente c
    //JOIN
    //    Telefone t ON c.id_cliente = t.cliente_id
    //JOIN
    //    Estado e ON c.estado_id = e.id_estado
    //WHERE
    //    e.uf = 'SP';


    System.out.println(query);
  }


}

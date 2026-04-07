import entities.peoples;

void main() {
  Scanner sc = new Scanner(System.in);
  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  System.out.println("Enter your name: ");
  String name = sc.nextLine();

  System.out.println("Enter today's date: ");
  LocalDate today = LocalDate.parse(sc.nextLine(), dtf);

  System.out.println("Enter your birth date: ");
  LocalDate birthDate = LocalDate.parse(sc.next(), dtf);

  peoples p = new peoples(name, birthDate, today);

  System.out.println(p.toString());

  sc.close();
}
package hierarchy;
// Создайте иерархию учебных предметов
// (Subject -> Natural sciences/exact sciences/humanities -> Biology,
// Chemistry / Physics, Mathematics / Literature, Philology).
// Напишите класс Student, параметризируемый предметом.
// Создайте классы студентов по каждому из направлений
// (Natural sciences/exact sciences/humanities),
// укажите в наследуемом параметре конкретный тип направления.
public class Main {

    public static class NaturalsStudents extends Student<Naturals> {
        public NaturalsStudents(String firstName, String lastName, Naturals subject) {
            super(firstName, lastName, subject);
        }
    }
    public static class ExactStudents extends Student<Exact> {
        public ExactStudents(String firstName, String lastName, Exact subject) {
            super(firstName, lastName, subject);
        }
    }
    public static class HumanitiesStudent extends Student<Humanities> {
        public HumanitiesStudent(String firstName, String lastName, Humanities subject) {
            super(firstName, lastName, subject);
        }
    }

    public static void main(String[] args) {
        NaturalsStudents naturalsStudent1 = new NaturalsStudents("Alice", "Baufeld", new Biology());
        NaturalsStudents naturalsStudent2 = new NaturalsStudents("Bob", "Brown", new Biology());
        NaturalsStudents naturalsStudent3 = new NaturalsStudents("Katy", "White", new Chemistry());
        NaturalsStudents naturalsStudent4 = new NaturalsStudents("Chris", "Smith", new Chemistry());

        ExactStudents exactStudent1 = new ExactStudents("George", "Johnson", new Mathematics());
        ExactStudents exactStudent2 = new ExactStudents("Louis", "Williams", new Mathematics());
        ExactStudents exactStudent3 = new ExactStudents("Emily", "Johnson", new Physics());
        ExactStudents exactStudent4 = new ExactStudents("David", "Williams", new Physics());

        HumanitiesStudent humanitiesStudent1 = new HumanitiesStudent("Michael","Jones", new Literature());
        HumanitiesStudent humanitiesStudent2 = new HumanitiesStudent("Sarah","Brown", new Literature());
        HumanitiesStudent humanitiesStudent3 = new HumanitiesStudent("Olivia","Davis", new Philology());
        HumanitiesStudent humanitiesStudent4 = new HumanitiesStudent("James","Wilson", new Philology());


    }
}

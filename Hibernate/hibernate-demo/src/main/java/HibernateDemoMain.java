import org.hibernate.Session;

public class HibernateDemoMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();

        try {
            UserClassHibernate user = new UserClassHibernate(null, "Sierra");
            session.beginTransaction();
            session.persist(user);
            session.getTransaction().commit();
            System.out.println("User Saved Done : " + user.getId());
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.close();
        }
    }
}


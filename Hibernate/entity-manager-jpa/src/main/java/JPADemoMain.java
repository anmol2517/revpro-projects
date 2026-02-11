import jakarta.persistence.EntityManager;

public class JPADemoMain {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            UserClassHibernate user = new UserClassHibernate(null, "Ganpta Rao Apte");
            em.persist(user);
            em.getTransaction().commit();

            System.out.println("User Saved Done: " + user.getId());
            UserClassHibernate foundUser = em.find(UserClassHibernate.class, user.getId());
            System.out.println("Fetched Database User : " + foundUser.getName());

        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            JPAUtil.close();
        }
    }
}


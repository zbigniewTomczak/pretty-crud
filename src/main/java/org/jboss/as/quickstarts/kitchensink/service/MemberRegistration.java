package org.jboss.as.quickstarts.kitchensink.service;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.jboss.as.quickstarts.kitchensink.model.Member;

@Stateless
public class MemberRegistration {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    public void register(Member member) throws Exception {
        log.info("Registering " + member.getName());
        em.persist(member);
    }

    public void save(Member member) throws Exception {
        log.info("Updating " + member.getName());
        em.merge(member);
    }
}

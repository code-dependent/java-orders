package local.jlwilliams.orders.services;

import local.jlwilliams.orders.models.Agent;
import local.jlwilliams.orders.repositories.AgentRepository;
import local.jlwilliams.orders.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "agentService")
public class AgentServiceImpl implements AgentServices
{
    @Autowired
    private AgentRepository agentrepos;

    @Override
    public Agent save(Agent agent)
    {
        return agentrepos.save(agent);
    }
}

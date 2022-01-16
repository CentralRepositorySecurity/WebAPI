package club.owefsad.CentralRepository.WebAPI.service;

public interface IScanProcessService {

    int counts();

    int countByState(String state);
}

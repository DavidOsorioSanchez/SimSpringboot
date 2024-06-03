package riwi.simulacro_filtro.infraestructure.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import lombok.AllArgsConstructor;
import riwi.simulacro_filtro.api.dto.request.UsersRequest;
import riwi.simulacro_filtro.api.dto.response.UsersResponse;
import riwi.simulacro_filtro.domain.entities.Users;
import riwi.simulacro_filtro.domain.repositories.UserRepository;
import riwi.simulacro_filtro.infraestructure.CrudAbstract.IUser;
import riwi.simulacro_filtro.util.exception.BadRequestException;
import riwi.simulacro_filtro.util.messages.messageError;

@AllArgsConstructor
public class UsersService implements IUser {

  @Autowired
  private final UserRepository userRepository;

  @Override
  public UsersResponse create(UsersRequest request) {
    Users users = this.requestToEntity(request);
    users.setEnrollers(new ArrayList<>());
    users.setSubmissions(new ArrayList<>());
    return this.entityToResponseUser(this.userRepository.save(users));
  }

  @Override
  public UsersResponse get(Long id) {
    return this.entityToResponseUser(this.find(id));
  }

  @Override
  public UsersResponse update(UsersRequest request, Long id) {

    Users users = this.requestToEntity(request);

    users.setId(id);

    return this.entityToResponseUser(this.userRepository.save(users));
  }

  @Override
  public void delete(Long id) {
    Users users = this.find(id);
    this.userRepository.delete(users);
  }

  @Override
  public Page<UsersResponse> getAll(int page, int size) {
    if (page < 0) {
      page = 0;
    }
    PageRequest pagination = PageRequest.of(page, size);
    return this.userRepository.findAll(pagination).map(this::entityToResponseUser);
  }
  
  private Users find(Long id) {
    return this.userRepository.findById(id)
        .orElseThrow(() -> new BadRequestException(messageError.idNotFound("user")));
  }

  private Users requestToEntity(UsersRequest request) {
    return Users.builder()
        .userName(request.getUserName())
        .password(request.getPassword())
        .email(request.getEmail())
        .fullName(request.getFullName())
        .role(request.getRole())
        .build();
  }

  private UsersResponse entityToResponseUser(Users entity) {

    return UsersResponse.builder()
            .id(entity.getId())
            .userName(entity.getUserName())
            .email(entity.getEmail())
            .fullName(entity.getFullName())
            .role(entity.getRole())
            .build();
  }
}

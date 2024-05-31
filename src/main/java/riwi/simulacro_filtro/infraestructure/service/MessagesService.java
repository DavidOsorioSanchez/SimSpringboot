package riwi.simulacro_filtro.infraestructure.service;

import java.util.List;

import org.aspectj.bridge.IMessage;
import org.aspectj.bridge.ISourceLocation;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import riwi.simulacro_filtro.api.dto.request.MessagesRequest;
import riwi.simulacro_filtro.api.dto.response.MessagesResponse;
import riwi.simulacro_filtro.domain.entities.Messages;
import riwi.simulacro_filtro.domain.entities.Users;
import riwi.simulacro_filtro.domain.repositories.MessagesRepository;
import riwi.simulacro_filtro.util.enums.Role;
import riwi.simulacro_filtro.util.exception.BadRequestException;
import riwi.simulacro_filtro.util.messages.messageError;

@AllArgsConstructor
public class MessagesService implements IMessage{

  @Autowired
  private final MessagesRepository messagesRepository;

  @Override
  public boolean getDeclared() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getDeclared'");
  }

  @Override
  public String getDetails() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getDetails'");
  }

  @Override
  public List<ISourceLocation> getExtraSourceLocations() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getExtraSourceLocations'");
  }

  @Override
  public int getID() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getID'");
  }

  @Override
  public Kind getKind() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getKind'");
  }

  @Override
  public String getMessage() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getMessage'");
  }

  @Override
  public int getSourceEnd() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getSourceEnd'");
  }

  @Override
  public ISourceLocation getSourceLocation() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getSourceLocation'");
  }

  @Override
  public int getSourceStart() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getSourceStart'");
  }

  @Override
  public Throwable getThrown() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getThrown'");
  }

  @Override
  public boolean isAbort() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isAbort'");
  }

  @Override
  public boolean isDebug() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isDebug'");
  }

  @Override
  public boolean isError() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isError'");
  }

  @Override
  public boolean isFailed() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isFailed'");
  }

  @Override
  public boolean isInfo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isInfo'");
  }

  @Override
  public boolean isTaskTag() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isTaskTag'");
  }

  @Override
  public boolean isUsage() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isUsage'");
  }

  @Override
  public boolean isWarning() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isWarning'");
  }
  
  private Messages find(Long id) {
    return this.messagesRepository.findById(id)
        .orElseThrow(() -> new BadRequestException(messageError.idNotFound("messages")));
  }

  // private Messages requestToEntity(MessagesRequest request) {
  //   if (Role.TEACHER == this.Users.getRole() ) {
      
  //   }
  //   return Messages.builder()
  //       .menssageContent(request.getMenssageContent())
  //       .sentMessage(request.getSentMessage())
        
  //       .build();
  // }

  // private MessagesResponse entityToResponseMessages(Messages entity) {

  //   return MessagesResponse.builder()
  //       .id(entity.getId())
  //       .userName(entity.getUserName())
  //       .email(entity.getEmail())
  //       .fullName(entity.getFullName())
  //       .role(entity.getRole())
  //       .build();
  // }
}

package bs.service.layer;

import bs.domain.MediaType;
import bs.domain.repository.MediaTypeRepository;
import bs.service.annotations.Service;
import bs.service.annotations.ServiceData;
import bs.service.annotations.ServiceDataHandler;
import bs.service.annotations.ServiceRequest;
import bs.service.annotations.ServiceResponse;
import bs.service.requests.MediaSaveRequest;
import bs.service.responses.MediaSaveResponse;

@Service
@ServiceDataHandler(source = MediaTypeRepository.class)
public interface MediaService {
	@ServiceRequest(type = MediaSaveRequest.class)
	@ServiceResponse(type = MediaSaveResponse.class)
	public void save(@ServiceData MediaType media);
}

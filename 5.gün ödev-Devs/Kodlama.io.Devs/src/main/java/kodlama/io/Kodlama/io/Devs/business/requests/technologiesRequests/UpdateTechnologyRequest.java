package kodlama.io.Kodlama.io.Devs.business.requests.technologiesRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTechnologyRequest {

	private String name;
	private int LanguageId;
}

package net.samjna.mall.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CmsSubjectProductRelation {
	private int id;
	private int productId;
	private int subjectId;

}

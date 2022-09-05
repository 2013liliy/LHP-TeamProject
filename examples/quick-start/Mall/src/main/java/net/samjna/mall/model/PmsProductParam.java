package net.samjna.mall.model;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PmsProductParam {
	private String albumPics;
	private int brandId;
	private String brandName;
	private int deleteSatus;
	private String description;
	private String detailDesc;
	private String detailHtml;
	private String detailMobileHtml;
	private String detailTitle;
	private  int feightTemplateId;  
	private int giftGrowth;
	private int giftPoint;
	private int id;
	private String keywords;
	private int lowStock;
	private List<PmsMemberPrice> memberPriceList;
	private String name;
	private int newStatus;
	private String note;
	private Number originalPrice;
	private String  pic;
	private List<CmsPrefrenceAreaProductRelation>prefrenceAreaProductRelationList;
	private int previewStatus;
	private Number price;
	private int productAttributeCategoryId;
	private List<PmsProductFullReduction> productFullReductionLis;
	private List<PmsProductLadder> productLadderList;
	private String productSn;
	private String promotionEndTime;
	private int promotionPerLimit;
	private Number promotionPrice;
	private String promotionStartTime;
	private int promotionType;
	private int publishStatus;
	private int recommandStatus;
	private int sale;
	private String serviceIds;
	private List<PmsSkuStock>skuStockList;
	private int sort;
	private int stock;
	private String subTitle;
	private List<CmsSubjectProductRelation> subjectProductRelationList;
	private String unit;
	private int usePointLimit;
	private int verifyStatus;
	private Number weight;
}

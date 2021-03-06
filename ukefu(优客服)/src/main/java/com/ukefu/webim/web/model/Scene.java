package com.ukefu.webim.web.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.ukefu.util.UKTools;


/**
 * 
 */
@Entity
@Table(name = "uk_xiaoe_scene")
@org.hibernate.annotations.Proxy(lazy = false)
public class Scene implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	private String id  = UKTools.getUUID();
	
	private String sessionid ;
	
	private String title ;		//标题
	private String content ;	//内容
	private float price ;		//问题价格
	private String keyword ;	//关键词
	private String summary ;	//摘要
	private boolean anonymous ;		//是否匿名提问
	
	private Date begintime ;		//有效期开始
	private Date endtime ;			//有效期结束
	
	private boolean top ;		//是否置顶
	private boolean essence ;	//是否精华
	private boolean accept ;	//是否已采纳最佳答案
	private boolean finish	;	//结贴
	
	private String replaytype ;	//回复方式 ， random ; order
	private boolean allowask ;	//允许AI自动询问用户
	
	private String inputcon ;	//输入条件
	private String outputcon ;	//输出条件
	
	private String userinput ;	//用户输入的提问 首条
	private String aireply ;	//AI回复的 首条
	
	private int answers ;		//回答数量
	private int views ;			//阅读数量
	private int followers ;		//关注数量
	private int collections;	//收藏数量
	private int comments ;		//评论数量
	private boolean mobile ;	//是否移动端提问
	private String status ;	//	状态	
	private String tptype;	//主题类型		问答:分享:讨论
	private String cate ;	//主题 栏目 
		
	private String username ;
	private String orgi ;
	private String creater;
	private Date createtime = new Date();
	private Date updatetime = new Date();
	private String memo;
	private String organ;
	
	
	/**
	 * @return the id
	 */
	@Id
	@Column(length = 32)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "assigned")	
	public String getId() {
		return id;
	}

	@Transient
	public String getSessionid() {
		return sessionid;
	}


	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public boolean isAnonymous() {
		return anonymous;
	}

	public void setAnonymous(boolean anonymous) {
		this.anonymous = anonymous;
	}

	public String getTptype() {
		return tptype;
	}

	public void setTptype(String tptype) {
		this.tptype = tptype;
	}

	public int getAnswers() {
		return answers;
	}

	public void setAnswers(int answers) {
		this.answers = answers;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getCollections() {
		return collections;
	}

	public void setCollections(int collections) {
		this.collections = collections;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public boolean isMobile() {
		return mobile;
	}

	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOrgi() {
		return orgi;
	}

	public void setOrgi(String orgi) {
		this.orgi = orgi;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrgan() {
		return organ;
	}

	public void setOrgan(String organ) {
		this.organ = organ;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getCate() {
		return cate;
	}

	public void setCate(String cate) {
		this.cate = cate;
	}

	public boolean isTop() {
		return top;
	}

	public void setTop(boolean top) {
		this.top = top;
	}

	public boolean isEssence() {
		return essence;
	}

	public void setEssence(boolean essence) {
		this.essence = essence;
	}

	public boolean isAccept() {
		return accept;
	}

	public void setAccept(boolean accept) {
		this.accept = accept;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	public Date getBegintime() {
		return begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getReplaytype() {
		return replaytype;
	}

	public void setReplaytype(String replaytype) {
		this.replaytype = replaytype;
	}

	public boolean isAllowask() {
		return allowask;
	}

	public void setAllowask(boolean allowask) {
		this.allowask = allowask;
	}

	public String getInputcon() {
		return inputcon;
	}

	public void setInputcon(String inputcon) {
		this.inputcon = inputcon;
	}

	public String getOutputcon() {
		return outputcon;
	}

	public void setOutputcon(String outputcon) {
		this.outputcon = outputcon;
	}

	public String getUserinput() {
		return userinput;
	}

	public void setUserinput(String userinput) {
		this.userinput = userinput;
	}

	public String getAireply() {
		return aireply;
	}

	public void setAireply(String aireply) {
		this.aireply = aireply;
	}
}

package at.metalab.m68k.soup.resource;

/**
 * https://github.com/soup/clients/tree/master/v1.1#return-value
 * 
 * @author m68k
 * 
 */
public class PostResult {

	private Long id;
	private Long blogId;
	private String createdAt;
	private String updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

}

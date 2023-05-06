package com.example.demo.api.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName article
 */
@TableName(value ="article")
@Data
public class Article implements Serializable {
    /**
     * 物品编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 物品名称
     */
    private String articleName;

    /**
     * 物品所属类别
     */
    private Integer articleType;

    /**
     * 物品图片路径
     */
    private String articlePath;

    /**
     * 物品联系方式
     */
    private String linkPhone;

    /**
     * 物品来源 1失物 2拾物
     */
    private Integer articleFrom;

    /**
     * 物品备注
     */
    private String articleText;

    /**
     * 物品时间
     */
    private Date articleDay;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Article other = (Article) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getArticleName() == null ? other.getArticleName() == null : this.getArticleName().equals(other.getArticleName()))
            && (this.getArticleType() == null ? other.getArticleType() == null : this.getArticleType().equals(other.getArticleType()))
            && (this.getArticlePath() == null ? other.getArticlePath() == null : this.getArticlePath().equals(other.getArticlePath()))
            && (this.getLinkPhone() == null ? other.getLinkPhone() == null : this.getLinkPhone().equals(other.getLinkPhone()))
            && (this.getArticleFrom() == null ? other.getArticleFrom() == null : this.getArticleFrom().equals(other.getArticleFrom()))
            && (this.getArticleText() == null ? other.getArticleText() == null : this.getArticleText().equals(other.getArticleText()))
            && (this.getArticleDay() == null ? other.getArticleDay() == null : this.getArticleDay().equals(other.getArticleDay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getArticleName() == null) ? 0 : getArticleName().hashCode());
        result = prime * result + ((getArticleType() == null) ? 0 : getArticleType().hashCode());
        result = prime * result + ((getArticlePath() == null) ? 0 : getArticlePath().hashCode());
        result = prime * result + ((getLinkPhone() == null) ? 0 : getLinkPhone().hashCode());
        result = prime * result + ((getArticleFrom() == null) ? 0 : getArticleFrom().hashCode());
        result = prime * result + ((getArticleText() == null) ? 0 : getArticleText().hashCode());
        result = prime * result + ((getArticleDay() == null) ? 0 : getArticleDay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", articleName=").append(articleName);
        sb.append(", articleType=").append(articleType);
        sb.append(", articlePath=").append(articlePath);
        sb.append(", linkPhone=").append(linkPhone);
        sb.append(", articleFrom=").append(articleFrom);
        sb.append(", articleText=").append(articleText);
        sb.append(", articleDay=").append(articleDay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
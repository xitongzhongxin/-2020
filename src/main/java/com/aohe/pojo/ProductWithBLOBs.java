package com.aohe.pojo;

public class ProductWithBLOBs extends Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_product.sub_image
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private String subImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column aohe_product.detail
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    private String detail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_product.sub_image
     *
     * @return the value of aohe_product.sub_image
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public String getSubImage() {
        return subImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_product.sub_image
     *
     * @param subImage the value for aohe_product.sub_image
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setSubImage(String subImage) {
        this.subImage = subImage == null ? null : subImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column aohe_product.detail
     *
     * @return the value of aohe_product.detail
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column aohe_product.detail
     *
     * @param detail the value for aohe_product.detail
     *
     * @mbg.generated Thu May 14 14:37:23 CST 2020
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}
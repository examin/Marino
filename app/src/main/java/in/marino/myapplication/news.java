package in.marino.myapplication;

public class News
{
    private String m_Headline;
    private String m_UploadDate;

    private int m_ImageId;

    public News (String headline, String uploadDate)
    {
        m_Headline = headline;
        m_UploadDate = uploadDate;
    }

    public News (String headline, String uploadDate, int imageId)
    {
        m_Headline = headline;
        m_UploadDate = uploadDate;
        m_ImageId = imageId;
    }

    public String getHeadline ()
    {
        return m_Headline;
    }

    public String getUploadDate ()
    {
        return m_UploadDate;
    }

    public int getImageId ()
    {
        return m_ImageId;
    }
}

package in.marino.myapplication;

public class Species
{
    private String m_SpeciesName;
    private String m_SpeciesBiology;
    private String m_SpeciesClass;
    private String m_SpeciesFamily;
    private String m_SpeciesOrder;

    private int m_ImageId;

    public Species (String speciesName, int imageId)
    {
        m_SpeciesName = speciesName;

        m_ImageId = imageId;
    }

    public String get_SpeciesName ()
    {
        return m_SpeciesName;
    }

    public String getSpeciesBiology ()
    {
        return m_SpeciesBiology;
    }

    public String getSpeciesClass ()
    {
        return m_SpeciesClass;
    }

    public String getSpeciesFamily ()
    {
        return m_SpeciesFamily;
    }

    public int getImageId ()
    {
        return m_ImageId;
    }
}

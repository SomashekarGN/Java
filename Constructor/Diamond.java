//Diamond: Add 46 properites

class Diamond
{
	double caratWeight;               // Carat weight in carats
    String colorGrade;                // Color grade (e.g., D, E, F)
    String clarityGrade;              // Clarity grade (e.g., IF, VVS1)
    String cutGrade;                  // Cut grade (e.g., Excellent, Very Good)
    double price;                     // Price in USD
    double hardness;                  // Hardness on the Mohs scale (usually 10)
    String shape;                     // Shape of the diamond (e.g., Round, Princess)
    double density;                   // Density in g/cm³
    double refractiveIndex;           // Refractive index (typically 2.42)
    double dispersion;  
	
	
	 // Optical properties
    double brilliance;                // Brilliance (measured by light return)
    double fire;                      // Fire (light dispersion)
    double scintillation;             // Scintillation (sparkle when moved)
    boolean isFluorescent;            // Fluorescence presence
    String fluorescenceColor;         // Color of fluorescence (if any)
    double transparency;              // Transparency percentage
    double polishQuality;             // Polish grade (1-10 scale)

    // Chemical properties
    String chemicalComposition;       // Chemical formula (typically C)
    double thermalConductivity;       // Thermal conductivity in W/mK
    boolean isNatural;                // Whether the diamond is natural or synthetic
    double carbonPurity;              // Purity of carbon in percentage
    boolean hasImpurities;            // Presence of impurities
    String impurityTypes;             // Types of impurities if present
    boolean isTreated;                // Whether the diamond has been treated
    String treatmentType;             // Type of treatment (if any)

    // Geographical properties
    String originCountry;             // Country where diamond was mined
    double miningDepth;               // Depth at which diamond was mined (in meters)
    String miningMethod;              // Mining method (e.g., open-pit, underground)
    
    // Mechanical properties
    double fractureToughness;         // Resistance to fracture (MPa·m1/2)
    double elasticModulus;            // Elastic modulus (in GPa)
    double shearModulus;              // Shear modulus (in GPa)
    double tensileStrength;           // Tensile strength in MPa
    double bulkModulus;               // Bulk modulus (in GPa)
    
    // Commercial properties
    boolean isCertified;              // Certification presence
    String certificationAgency;       // Certifying agency (e.g., GIA, IGI)
    int certificationNumber;          // Unique certification number
    
    // Aesthetic properties
    String brillianceType;            // Type of brilliance (e.g., sharp, diffuse)
    String symmetryGrade;             // Symmetry grade (e.g., Excellent, Good)
    double facetSize;                 // Size of facets in mm
    int numberOfFacets;               // Number of facets on the diamond
    boolean isFancyColor;             // Whether diamond has a fancy color
    String fancyColorDescription;     // Description of the fancy color

    // Environmental and ethical properties
    boolean isConflictFree;           // Conflict-free status
    boolean isEcoFriendly;            // Eco-friendliness status
    boolean isRecycled;               // Recycled diamond status
    String miningCertification;       // Certification for ethical mining

    // Market properties
    String resaleValueGrade;          // Grade of resale value (e.g., Excellent, Fair)
    double annualAppreciationRate;    // Annual appreciation rate in percentage
    boolean isPartOfCollection; 
	
	
}
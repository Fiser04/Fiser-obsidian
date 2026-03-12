using AutoMapper;
using WebApplication1.Models;
using WebApplication1.Repository;
using WebApplication1.ViewModels.Category;
using WebApplication1.ViewModels.Products;
using WebApplication1.ViewModels.Supplier;

namespace WebApplication1.Services;

public class ProductServiceWithDTO : IProductServiceWithDTO
{
    private readonly IProductRepository repo;
    private readonly IMapper _mapper;

    public ProductServiceWithDTO(IProductRepository productRepository, IMapper mapper)
    {
        this.repo = productRepository;
        this._mapper = mapper;
    }

    public IEnumerable<ProductListDTO> GetAllWithDetails()
        => _mapper.Map<IEnumerable<ProductListDTO>>(repo.GetAllWithDetails());

    public ProductDetailDto? GetByIdWithDetails(int id)
    {
        var product = repo.GetByIdWithDetails(id);
        return product is null ? null : _mapper.Map<ProductDetailDto>(product);
    }

    public IEnumerable<ProductListDTO> GetByCategory(int categoryId)
        => _mapper.Map<IEnumerable<ProductListDTO>>(repo.GetByCategory(categoryId));

    public IEnumerable<ProductListDTO> GetBySupplier(int supplierId)
        => _mapper.Map<IEnumerable<ProductListDTO>>(repo.GetBySupplier(supplierId));

    // ── Commands ──────────────────────────────────────────────────────────

    public ProductDetailDto Create(ProductCreateDto dto)
    {
        var entity = _mapper.Map<Product>(dto);
        repo.Add(entity);
        // Reload with navigation props so the returned DTO is fully populated
        return _mapper.Map<ProductDetailDto>(repo.GetByIdWithDetails(entity.Id)!);
    }

    public void Update(int id, ProductUpdateDto dto)
    {
        var entity = repo.GetById(id)
                     ?? throw new KeyNotFoundException($"Product {id} not found.");

        _mapper.Map(dto, entity); // maps onto the tracked entity — preserves Id, InternalNote, RowVersion
        repo.Update(entity);
    }

    public void Delete(int id)
        => repo.Delete(id);

    public bool Exists(int id)
        => repo.Exists(id);


public class ProductProfile : Profile
    {
        public ProductProfile()
        {
            CreateMap<Product, ProductListDTO>()
                .ForMember(dest => dest.CategoryName, opt => opt.MapFrom(src => src.Category.Name)) // Map the CategoryName property from the Category navigation property
                .ForMember(dest => dest.SupplierName, opt => opt.MapFrom(src => src.Supplier.Name));

            // Product → ProductDetailDto  (nested DTOs)
            CreateMap<Product, ProductDetailDto>()
                .ForCtorParam("Category", opt => opt.MapFrom(src => src.Category))
                .ForCtorParam("Supplier", opt => opt.MapFrom(src => src.Supplier));

            // Navigation entities → nested DTOs  (resolved via convention)
            CreateMap<Category, CategoryDto>();
            CreateMap<Supplier, SupplierDto>();

            // ProductCreateDto → Product  (new entity)
            CreateMap<ProductCreateDto, Product>()
                .ForMember(d => d.Id, o => o.Ignore())
                .ForMember(d => d.Category, o => o.Ignore())
                .ForMember(d => d.Supplier, o => o.Ignore());

            // ProductUpdateDto → Product  (map onto existing entity)
            CreateMap<ProductUpdateDto, Product>()
                .ForMember(d => d.Id,           o => o.Ignore())
                .ForMember(d => d.Category,     o => o.Ignore())
                .ForMember(d => d.Supplier,     o => o.Ignore());
        
        }
    }
}
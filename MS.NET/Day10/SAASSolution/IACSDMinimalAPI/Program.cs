var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

var app = builder.Build();

// Configure the HTTP request pipeline.

var summaries = new[]
{
    "Freezing", "Bracing", "Chilly", "Cool", "Mild", "Warm", "Balmy", "Hot", "Sweltering", "Scorching"
};

app.MapGet("/weatherforecast", () =>
{
    var forecast = Enumerable.Range(1, 5).Select(index =>
        new WeatherForecast
        (
            DateOnly.FromDateTime(DateTime.Now.AddDays(index)),
            Random.Shared.Next(-20, 55),
            summaries[Random.Shared.Next(summaries.Length)]
        ))
        .ToArray();
    return forecast;
});

app.MapGet("/api/products", () =>
{
    List<string> products = new List<string>();
    products.Add("Gerbera");
    products.Add("Rose");
    products.Add("Marigold");
    return products;

});

app.MapPost("/api/products", ( ) =>
{
    Console.WriteLine("new product is being inserted......"); 
});

app.MapPut("/api/products", () =>
{
    Console.WriteLine("new product is being updated......");
});


app.MapDelete("/api/products", () =>
{
    Console.WriteLine("new product is being deleted......");
});




app.Run();

internal record WeatherForecast(DateOnly Date, int TemperatureC, string? Summary)
{
    public int TemperatureF => 32 + (int)(TemperatureC / 0.5556);
}

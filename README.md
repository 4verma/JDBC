# Java8
Java 8 introduced a new feature called method references, which provide a concise way to refer to methods without invoking them. Method references can be seen as syntactic sugar for lambdas, allowing you to pass behavior as arguments to methods in a more readable and concise manner. This feature is particularly useful when working with functional interfaces and lambda expressions.

There are four types of method references in Java 8:

Reference to a static method: This type of method reference refers to a static method of a class or an interface. It is denoted by ClassName::staticMethodName. For example, Math::max refers to the static method max in the Math class.

Reference to an instance method of a particular object: This type of method reference refers to an instance method of a specific object. It is denoted by object::instanceMethodName. For example, System.out::println refers to the println method of the out object in the System class.

Reference to an instance method of an arbitrary object of a particular type: This type of method reference refers to an instance method of any object of a given type. It is denoted by ClassName::instanceMethodName. For example, String::length refers to the length method of the String class.

Reference to a constructor: This type of method reference refers to a constructor. It is denoted by ClassName::new. For example, ArrayList::new refers to the constructor of the ArrayList class.
Method references can be used in various contexts, such as when working with functional interfaces, streams, and lambda expressions. Here are a few examples of how method references can be used:

Using method references with functional interfaces
#java8_Code
// Example with Predicate functional interface and static method reference
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.removeIf(StringUtils::isBlank);

Using method references with streams:
#java8_Code
// Example with reference to an instance method of a particular object
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream()
       .forEach(System.out::println);

#java8_Code
Using method references with lambda expressions:
// Example with Comparator functional interface and reference to an instance method of an arbitrary object
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.sort(String::compareToIgnoreCase);

#java8_code
Using method references with constructors:
// Example with Supplier functional interface and reference to a constructor
Supplier<List<String>> listSupplier = ArrayList::new;
List<String> newList = listSupplier.get();

Method references provide a concise and readable way to refer to methods in Java 8. They are especially useful when working with functional interfaces and lambda expressions, reducing the verbosity of code and making it more expressive. By understanding the different types of method references and their syntax, you can leverage this feature to write more elegant and efficient code.

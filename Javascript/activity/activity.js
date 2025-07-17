// Wait for the DOM to load completely
document.addEventListener("DOMContentLoaded", function () {
    // Selecting input elements
    const form = document.querySelector("form");
    const fullName = document.querySelector('input[name="first_name"]');
    const email = document.querySelector('input[name="email"]');
    const password = document.querySelector('input[name="password"]');
    const message = document.getElementById("msg");
    const submitBtn = document.querySelector('input[type="submit"]');
    const resetBtn = document.querySelector('input[type="reset"]');
    const countrySelect = document.getElementById("country");

    // Highlight input when focused
    const inputs = document.querySelectorAll("input, textarea, select");
    inputs.forEach((input) => {
        input.addEventListener("focus", () => {
            input.style.backgroundColor = "#e8f0fe";
        });
        input.addEventListener("blur", () => {
            input.style.backgroundColor = "";
        });
    });

    // Event listener on country selection
    countrySelect.addEventListener("change", () => {
        alert(`You selected: ${countrySelect.options[countrySelect.selectedIndex].text}`);
    });

    // Form submission event
    form.addEventListener("submit", (e) => {
        e.preventDefault(); // Prevent actual form submission
        const nameValue = fullName.value.trim();
        const emailValue = email.value.trim();
        const passwordValue = password.value.trim();
        const messageValue = message.value.trim();

        if (!nameValue || !emailValue || !passwordValue || !messageValue) {
            alert("Please fill all required fields before submitting!");
            return;
        }

        alert(`Thank you, ${nameValue}! Your form has been submitted.`);
        form.reset();
    });

    // Reset button event
    resetBtn.addEventListener("click", () => {
        alert("Form reset!");
    });
});

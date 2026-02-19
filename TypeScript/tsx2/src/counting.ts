function Timer(target: any, keys: string, desc?: PropertyDescriptor) {
    const funny = desc?.value;

    if (!desc || !funny) return;

    desc.value = function (...args: any[]) {
        const sunaay = performance.now();
        const boundary = funny.apply(this, args);
        const khatam = performance.now();

        console.log(`Execution time for ${keys} is ${khatam - sunaay} milliseconds`);
        return boundary;
    }
}

class MathUtils {
    @Timer
    squared(arr: number[]) {
        return arr.map(n => n * n);
    }
}

const utils = new MathUtils();
console.log("My Output I say only Mine Not All : ", utils.squared([2, 4, 6, 8, 10]));

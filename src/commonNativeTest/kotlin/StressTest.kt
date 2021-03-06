import org.objectweb.asm.ClassReader
import kotlin.test.*

class StressTest {
    @Test
    fun reRead() {
        val classReader = ClassReader(
            byteArrayOf(
                -54,
                -2,
                -70,
                -66,
                0,
                0,
                0,
                52,
                0,
                57,
                10,
                0,
                10,
                0,
                33,
                10,
                0,
                34,
                0,
                35,
                7,
                0,
                36,
                8,
                0,
                37,
                11,
                0,
                38,
                0,
                39,
                10,
                0,
                40,
                0,
                41,
                7,
                0,
                42,
                10,
                0,
                7,
                0,
                43,
                7,
                0,
                44,
                7,
                0,
                45,
                7,
                0,
                46,
                1,
                0,
                6,
                60,
                105,
                110,
                105,
                116,
                62,
                1,
                0,
                3,
                40,
                41,
                86,
                1,
                0,
                4,
                67,
                111,
                100,
                101,
                1,
                0,
                15,
                76,
                105,
                110,
                101,
                78,
                117,
                109,
                98,
                101,
                114,
                84,
                97,
                98,
                108,
                101,
                1,
                0,
                18,
                76,
                111,
                99,
                97,
                108,
                86,
                97,
                114,
                105,
                97,
                98,
                108,
                101,
                84,
                97,
                98,
                108,
                101,
                1,
                0,
                4,
                116,
                104,
                105,
                115,
                1,
                0,
                54,
                76,
                111,
                114,
                103,
                47,
                97,
                112,
                97,
                99,
                104,
                101,
                47,
                116,
                111,
                109,
                99,
                97,
                116,
                47,
                119,
                101,
                98,
                115,
                111,
                99,
                107,
                101,
                116,
                47,
                115,
                101,
                114,
                118,
                101,
                114,
                47,
                87,
                115,
                67,
                111,
                110,
                116,
                101,
                120,
                116,
                76,
                105,
                115,
                116,
                101,
                110,
                101,
                114,
                59,
                1,
                0,
                18,
                99,
                111,
                110,
                116,
                101,
                120,
                116,
                73,
                110,
                105,
                116,
                105,
                97,
                108,
                105,
                122,
                101,
                100,
                1,
                0,
                38,
                40,
                76,
                106,
                97,
                118,
                97,
                120,
                47,
                115,
                101,
                114,
                118,
                108,
                101,
                116,
                47,
                83,
                101,
                114,
                118,
                108,
                101,
                116,
                67,
                111,
                110,
                116,
                101,
                120,
                116,
                69,
                118,
                101,
                110,
                116,
                59,
                41,
                86,
                1,
                0,
                3,
                115,
                99,
                101,
                1,
                0,
                35,
                76,
                106,
                97,
                118,
                97,
                120,
                47,
                115,
                101,
                114,
                118,
                108,
                101,
                116,
                47,
                83,
                101,
                114,
                118,
                108,
                101,
                116,
                67,
                111,
                110,
                116,
                101,
                120,
                116,
                69,
                118,
                101,
                110,
                116,
                59,
                1,
                0,
                2,
                115,
                99,
                1,
                0,
                30,
                76,
                106,
                97,
                118,
                97,
                120,
                47,
                115,
                101,
                114,
                118,
                108,
                101,
                116,
                47,
                83,
                101,
                114,
                118,
                108,
                101,
                116,
                67,
                111,
                110,
                116,
                101,
                120,
                116,
                59,
                1,
                0,
                13,
                83,
                116,
                97,
                99,
                107,
                77,
                97,
                112,
                84,
                97,
                98,
                108,
                101,
                7,
                0,
                47,
                1,
                0,
                16,
                99,
                111,
                110,
                116,
                101,
                120,
                116,
                68,
                101,
                115,
                116,
                114,
                111,
                121,
                101,
                100,
                1,
                0,
                3,
                111,
                98,
                106,
                1,
                0,
                18,
                76,
                106,
                97,
                118,
                97,
                47,
                108,
                97,
                110,
                103,
                47,
                79,
                98,
                106,
                101,
                99,
                116,
                59,
                7,
                0,
                45,
                1,
                0,
                10,
                83,
                111,
                117,
                114,
                99,
                101,
                70,
                105,
                108,
                101,
                1,
                0,
                22,
                87,
                115,
                67,
                111,
                110,
                116,
                101,
                120,
                116,
                76,
                105,
                115,
                116,
                101,
                110,
                101,
                114,
                46,
                106,
                97,
                118,
                97,
                12,
                0,
                12,
                0,
                13,
                7,
                0,
                48,
                12,
                0,
                49,
                0,
                50,
                1,
                0,
                44,
                111,
                114,
                103,
                47,
                97,
                112,
                97,
                99,
                104,
                101,
                47,
                116,
                111,
                109,
                99,
                97,
                116,
                47,
                119,
                101,
                98,
                115,
                111,
                99,
                107,
                101,
                116,
                47,
                115,
                101,
                114,
                118,
                101,
                114,
                47,
                67,
                111,
                110,
                115,
                116,
                97,
                110,
                116,
                115,
                1,
                0,
                38,
                106,
                97,
                118,
                97,
                120,
                46,
                119,
                101,
                98,
                115,
                111,
                99,
                107,
                101,
                116,
                46,
                115,
                101,
                114,
                118,
                101,
                114,
                46,
                83,
                101,
                114,
                118,
                101,
                114,
                67,
                111,
                110,
                116,
                97,
                105,
                110,
                101,
                114,
                7,
                0,
                47,
                12,
                0,
                51,
                0,
                52,
                7,
                0,
                53,
                12,
                0,
                54,
                0,
                55,
                1,
                0,
                52,
                111,
                114,
                103,
                47,
                97,
                112,
                97,
                99,
                104,
                101,
                47,
                116,
                111,
                109,
                99,
                97,
                116,
                47,
                119,
                101,
                98,
                115,
                111,
                99,
                107,
                101,
                116,
                47,
                115,
                101,
                114,
                118,
                101,
                114,
                47,
                87,
                115,
                83,
                101,
                114,
                118,
                101,
                114,
                67,
                111,
                110,
                116,
                97,
                105,
                110,
                101,
                114,
                12,
                0,
                56,
                0,
                13,
                1,
                0,
                52,
                111,
                114,
                103,
                47,
                97,
                112,
                97,
                99,
                104,
                101,
                47,
                116,
                111,
                109,
                99,
                97,
                116,
                47,
                119,
                101,
                98,
                115,
                111,
                99,
                107,
                101,
                116,
                47,
                115,
                101,
                114,
                118,
                101,
                114,
                47,
                87,
                115,
                67,
                111,
                110,
                116,
                101,
                120,
                116,
                76,
                105,
                115,
                116,
                101,
                110,
                101,
                114,
                1,
                0,
                16,
                106,
                97,
                118,
                97,
                47,
                108,
                97,
                110,
                103,
                47,
                79,
                98,
                106,
                101,
                99,
                116,
                1,
                0,
                36,
                106,
                97,
                118,
                97,
                120,
                47,
                115,
                101,
                114,
                118,
                108,
                101,
                116,
                47,
                83,
                101,
                114,
                118,
                108,
                101,
                116,
                67,
                111,
                110,
                116,
                101,
                120,
                116,
                76,
                105,
                115,
                116,
                101,
                110,
                101,
                114,
                1,
                0,
                28,
                106,
                97,
                118,
                97,
                120,
                47,
                115,
                101,
                114,
                118,
                108,
                101,
                116,
                47,
                83,
                101,
                114,
                118,
                108,
                101,
                116,
                67,
                111,
                110,
                116,
                101,
                120,
                116,
                1,
                0,
                33,
                106,
                97,
                118,
                97,
                120,
                47,
                115,
                101,
                114,
                118,
                108,
                101,
                116,
                47,
                83,
                101,
                114,
                118,
                108,
                101,
                116,
                67,
                111,
                110,
                116,
                101,
                120,
                116,
                69,
                118,
                101,
                110,
                116,
                1,
                0,
                17,
                103,
                101,
                116,
                83,
                101,
                114,
                118,
                108,
                101,
                116,
                67,
                111,
                110,
                116,
                101,
                120,
                116,
                1,
                0,
                32,
                40,
                41,
                76,
                106,
                97,
                118,
                97,
                120,
                47,
                115,
                101,
                114,
                118,
                108,
                101,
                116,
                47,
                83,
                101,
                114,
                118,
                108,
                101,
                116,
                67,
                111,
                110,
                116,
                101,
                120,
                116,
                59,
                1,
                0,
                12,
                103,
                101,
                116,
                65,
                116,
                116,
                114,
                105,
                98,
                117,
                116,
                101,
                1,
                0,
                38,
                40,
                76,
                106,
                97,
                118,
                97,
                47,
                108,
                97,
                110,
                103,
                47,
                83,
                116,
                114,
                105,
                110,
                103,
                59,
                41,
                76,
                106,
                97,
                118,
                97,
                47,
                108,
                97,
                110,
                103,
                47,
                79,
                98,
                106,
                101,
                99,
                116,
                59,
                1,
                0,
                40,
                111,
                114,
                103,
                47,
                97,
                112,
                97,
                99,
                104,
                101,
                47,
                116,
                111,
                109,
                99,
                97,
                116,
                47,
                119,
                101,
                98,
                115,
                111,
                99,
                107,
                101,
                116,
                47,
                115,
                101,
                114,
                118,
                101,
                114,
                47,
                87,
                115,
                83,
                99,
                105,
                1,
                0,
                4,
                105,
                110,
                105,
                116,
                1,
                0,
                87,
                40,
                76,
                106,
                97,
                118,
                97,
                120,
                47,
                115,
                101,
                114,
                118,
                108,
                101,
                116,
                47,
                83,
                101,
                114,
                118,
                108,
                101,
                116,
                67,
                111,
                110,
                116,
                101,
                120,
                116,
                59,
                90,
                41,
                76,
                111,
                114,
                103,
                47,
                97,
                112,
                97,
                99,
                104,
                101,
                47,
                116,
                111,
                109,
                99,
                97,
                116,
                47,
                119,
                101,
                98,
                115,
                111,
                99,
                107,
                101,
                116,
                47,
                115,
                101,
                114,
                118,
                101,
                114,
                47,
                87,
                115,
                83,
                101,
                114,
                118,
                101,
                114,
                67,
                111,
                110,
                116,
                97,
                105,
                110,
                101,
                114,
                59,
                1,
                0,
                7,
                100,
                101,
                115,
                116,
                114,
                111,
                121,
                0,
                33,
                0,
                9,
                0,
                10,
                0,
                1,
                0,
                11,
                0,
                0,
                0,
                3,
                0,
                1,
                0,
                12,
                0,
                13,
                0,
                1,
                0,
                14,
                0,
                0,
                0,
                47,
                0,
                1,
                0,
                1,
                0,
                0,
                0,
                5,
                42,
                -73,
                0,
                1,
                -79,
                0,
                0,
                0,
                2,
                0,
                15,
                0,
                0,
                0,
                6,
                0,
                1,
                0,
                0,
                0,
                31,
                0,
                16,
                0,
                0,
                0,
                12,
                0,
                1,
                0,
                0,
                0,
                5,
                0,
                17,
                0,
                18,
                0,
                0,
                0,
                1,
                0,
                19,
                0,
                20,
                0,
                1,
                0,
                14,
                0,
                0,
                0,
                114,
                0,
                2,
                0,
                3,
                0,
                0,
                0,
                26,
                43,
                -74,
                0,
                2,
                77,
                44,
                18,
                4,
                -71,
                0,
                5,
                2,
                0,
                -57,
                0,
                12,
                43,
                -74,
                0,
                2,
                3,
                -72,
                0,
                6,
                87,
                -79,
                0,
                0,
                0,
                3,
                0,
                15,
                0,
                0,
                0,
                18,
                0,
                4,
                0,
                0,
                0,
                35,
                0,
                5,
                0,
                38,
                0,
                16,
                0,
                39,
                0,
                25,
                0,
                41,
                0,
                16,
                0,
                0,
                0,
                32,
                0,
                3,
                0,
                0,
                0,
                26,
                0,
                17,
                0,
                18,
                0,
                0,
                0,
                0,
                0,
                26,
                0,
                21,
                0,
                22,
                0,
                1,
                0,
                5,
                0,
                21,
                0,
                23,
                0,
                24,
                0,
                2,
                0,
                25,
                0,
                0,
                0,
                8,
                0,
                1,
                -4,
                0,
                25,
                7,
                0,
                26,
                0,
                1,
                0,
                27,
                0,
                20,
                0,
                1,
                0,
                14,
                0,
                0,
                0,
                -122,
                0,
                2,
                0,
                4,
                0,
                0,
                0,
                29,
                43,
                -74,
                0,
                2,
                77,
                44,
                18,
                4,
                -71,
                0,
                5,
                2,
                0,
                78,
                45,
                -63,
                0,
                7,
                -103,
                0,
                10,
                45,
                -64,
                0,
                7,
                -74,
                0,
                8,
                -79,
                0,
                0,
                0,
                3,
                0,
                15,
                0,
                0,
                0,
                22,
                0,
                5,
                0,
                0,
                0,
                45,
                0,
                5,
                0,
                46,
                0,
                14,
                0,
                47,
                0,
                21,
                0,
                48,
                0,
                28,
                0,
                50,
                0,
                16,
                0,
                0,
                0,
                42,
                0,
                4,
                0,
                0,
                0,
                29,
                0,
                17,
                0,
                18,
                0,
                0,
                0,
                0,
                0,
                29,
                0,
                21,
                0,
                22,
                0,
                1,
                0,
                5,
                0,
                24,
                0,
                23,
                0,
                24,
                0,
                2,
                0,
                14,
                0,
                15,
                0,
                28,
                0,
                29,
                0,
                3,
                0,
                25,
                0,
                0,
                0,
                11,
                0,
                1,
                -3,
                0,
                28,
                7,
                0,
                26,
                7,
                0,
                30,
                0,
                1,
                0,
                31,
                0,
                0,
                0,
                2,
                0,
                32
            )
        )
        assertEquals("javax/servlet/ServletContextListener", classReader.interfaces.first())
    }
}

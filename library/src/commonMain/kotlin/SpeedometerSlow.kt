package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SpeedometerSlow: ImageVector
    get() {
        if (_SpeedometerSlow != null) {
            return _SpeedometerSlow!!
        }
        _SpeedometerSlow = ImageVector.Builder(
            name = "SpeedometerSlow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                curveTo(13.66f, 16f, 15f, 14.66f, 15f, 13f)
                curveTo(15f, 11.88f, 14.39f, 10.9f, 13.5f, 10.39f)
                lineTo(3.79f, 4.77f)
                lineTo(9.32f, 14.35f)
                curveTo(9.82f, 15.33f, 10.83f, 16f, 12f, 16f)
                moveTo(12f, 3f)
                curveTo(10.19f, 3f, 8.5f, 3.5f, 7.03f, 4.32f)
                lineTo(9.13f, 5.53f)
                curveTo(10f, 5.19f, 11f, 5f, 12f, 5f)
                curveTo(16.42f, 5f, 20f, 8.58f, 20f, 13f)
                curveTo(20f, 15.21f, 19.11f, 17.21f, 17.66f, 18.65f)
                horizontalLineTo(17.65f)
                curveTo(17.26f, 19.04f, 17.26f, 19.67f, 17.65f, 20.06f)
                curveTo(18.04f, 20.45f, 18.68f, 20.45f, 19.07f, 20.07f)
                curveTo(20.88f, 18.26f, 22f, 15.76f, 22f, 13f)
                curveTo(22f, 7.5f, 17.5f, 3f, 12f, 3f)
                moveTo(2f, 13f)
                curveTo(2f, 15.76f, 3.12f, 18.26f, 4.93f, 20.07f)
                curveTo(5.32f, 20.45f, 5.95f, 20.45f, 6.34f, 20.06f)
                curveTo(6.73f, 19.67f, 6.73f, 19.04f, 6.34f, 18.65f)
                curveTo(4.89f, 17.2f, 4f, 15.21f, 4f, 13f)
                curveTo(4f, 12f, 4.19f, 11f, 4.54f, 10.1f)
                lineTo(3.33f, 8f)
                curveTo(2.5f, 9.5f, 2f, 11.18f, 2f, 13f)
                close()
            }
        }.build()

        return _SpeedometerSlow!!
    }

@Suppress("ObjectPropertyName")
private var _SpeedometerSlow: ImageVector? = null

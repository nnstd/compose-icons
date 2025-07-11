package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SpeedometerMedium: ImageVector
    get() {
        if (_SpeedometerMedium != null) {
            return _SpeedometerMedium!!
        }
        _SpeedometerMedium = ImageVector.Builder(
            name = "SpeedometerMedium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.38f)
                lineTo(9.14f, 12.06f)
                curveTo(8.8f, 13.1f, 9.04f, 14.29f, 9.86f, 15.12f)
                curveTo(11.04f, 16.29f, 12.94f, 16.29f, 14.11f, 15.12f)
                curveTo(14.9f, 14.33f, 15.16f, 13.2f, 14.89f, 12.21f)
                moveTo(14.6f, 3.35f)
                lineTo(15.22f, 5.68f)
                curveTo(18.04f, 6.92f, 20f, 9.73f, 20f, 13f)
                curveTo(20f, 15.21f, 19.11f, 17.21f, 17.66f, 18.65f)
                horizontalLineTo(17.65f)
                curveTo(17.26f, 19.04f, 17.26f, 19.67f, 17.65f, 20.06f)
                curveTo(18.04f, 20.45f, 18.68f, 20.45f, 19.07f, 20.07f)
                curveTo(20.88f, 18.26f, 22f, 15.76f, 22f, 13f)
                curveTo(22f, 8.38f, 18.86f, 4.5f, 14.6f, 3.35f)
                moveTo(9.4f, 3.36f)
                curveTo(5.15f, 4.5f, 2f, 8.4f, 2f, 13f)
                curveTo(2f, 15.76f, 3.12f, 18.26f, 4.93f, 20.07f)
                curveTo(5.32f, 20.45f, 5.95f, 20.45f, 6.34f, 20.06f)
                curveTo(6.73f, 19.67f, 6.73f, 19.04f, 6.34f, 18.65f)
                curveTo(4.89f, 17.2f, 4f, 15.21f, 4f, 13f)
                curveTo(4f, 9.65f, 5.94f, 6.86f, 8.79f, 5.65f)
            }
        }.build()

        return _SpeedometerMedium!!
    }

@Suppress("ObjectPropertyName")
private var _SpeedometerMedium: ImageVector? = null

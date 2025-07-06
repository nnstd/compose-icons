package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SunThermometerOutline: ImageVector
    get() {
        if (_SunThermometerOutline != null) {
            return _SunThermometerOutline!!
        }
        _SunThermometerOutline = ImageVector.Builder(
            name = "SunThermometerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                lineTo(7.6f, 5.4f)
                curveTo(8.4f, 5.2f, 9.2f, 5f, 10f, 5f)
                reflectiveCurveTo(11.6f, 5.2f, 12.4f, 5.4f)
                lineTo(10f, 2f)
                moveTo(21f, 13.8f)
                verticalLineTo(7f)
                curveTo(21f, 5.9f, 20.1f, 5f, 19f, 5f)
                reflectiveCurveTo(17f, 5.9f, 17f, 7f)
                verticalLineTo(13.8f)
                curveTo(16.4f, 14.4f, 16f, 15.2f, 16f, 16f)
                curveTo(16f, 17.7f, 17.3f, 19f, 19f, 19f)
                reflectiveCurveTo(22f, 17.7f, 22f, 16f)
                curveTo(22f, 15.1f, 21.6f, 14.3f, 21f, 13.8f)
                moveTo(20f, 8f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                curveTo(18f, 6.4f, 18.4f, 6f, 19f, 6f)
                reflectiveCurveTo(20f, 6.4f, 20f, 7f)
                verticalLineTo(8f)
                moveTo(5.5f, 6.7f)
                lineTo(1.3f, 7f)
                lineTo(3.1f, 10.8f)
                curveTo(3.2f, 10f, 3.5f, 9.2f, 3.9f, 8.5f)
                curveTo(4.4f, 7.8f, 4.9f, 7.2f, 5.5f, 6.7f)
                moveTo(10f, 7f)
                curveTo(7.2f, 7f, 5f, 9.2f, 5f, 12f)
                reflectiveCurveTo(7.2f, 17f, 10f, 17f)
                reflectiveCurveTo(15f, 14.8f, 15f, 12f)
                reflectiveCurveTo(12.8f, 7f, 10f, 7f)
                moveTo(10f, 15f)
                curveTo(8.3f, 15f, 7f, 13.7f, 7f, 12f)
                reflectiveCurveTo(8.3f, 9f, 10f, 9f)
                reflectiveCurveTo(13f, 10.3f, 13f, 12f)
                reflectiveCurveTo(11.7f, 15f, 10f, 15f)
                moveTo(3.2f, 13.2f)
                lineTo(1.4f, 17f)
                lineTo(5.5f, 17.4f)
                curveTo(5f, 16.9f, 4.4f, 16.2f, 4f, 15.5f)
                curveTo(3.5f, 14.8f, 3.3f, 14f, 3.2f, 13.2f)
                moveTo(7.6f, 18.6f)
                lineTo(10f, 22f)
                lineTo(12.4f, 18.6f)
                curveTo(11.6f, 18.8f, 10.8f, 19f, 10f, 19f)
                curveTo(9.1f, 19f, 8.3f, 18.8f, 7.6f, 18.6f)
                close()
            }
        }.build()

        return _SunThermometerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SunThermometerOutline: ImageVector? = null

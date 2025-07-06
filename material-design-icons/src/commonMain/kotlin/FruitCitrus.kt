package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FruitCitrus: ImageVector
    get() {
        if (_FruitCitrus != null) {
            return _FruitCitrus!!
        }
        _FruitCitrus = ImageVector.Builder(
            name = "FruitCitrus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 15.9f)
                curveTo(6.9f, 15.7f, 5.1f, 14.9f, 4f, 13.6f)
                curveTo(3.2f, 13.6f, 2.4f, 13.1f, 2.1f, 12.3f)
                curveTo(1.8f, 11.5f, 2.1f, 10.7f, 2.8f, 10.2f)
                curveTo(2.9f, 7.2f, 5.6f, 4.1f, 9.7f, 2.7f)
                curveTo(13.8f, 1.3f, 18f, 2.1f, 20f, 4.4f)
                curveTo(20.8f, 4.4f, 21.6f, 4.9f, 21.9f, 5.7f)
                curveTo(22.2f, 6.5f, 21.9f, 7.3f, 21.2f, 7.8f)
                curveTo(21.2f, 8.6f, 21f, 9.4f, 20.6f, 10.2f)
                curveTo(19.4f, 9.5f, 18f, 9f, 16.5f, 9f)
                curveTo(12.6f, 9f, 9.3f, 12f, 9f, 15.9f)
                moveTo(22f, 16.5f)
                curveTo(22f, 19.5f, 19.5f, 22f, 16.5f, 22f)
                reflectiveCurveTo(11f, 19.5f, 11f, 16.5f)
                reflectiveCurveTo(13.5f, 11f, 16.5f, 11f)
                reflectiveCurveTo(22f, 13.5f, 22f, 16.5f)
                moveTo(13.3f, 18f)
                lineTo(15.6f, 16.5f)
                lineTo(13.3f, 15f)
                curveTo(13.1f, 15.5f, 13f, 16f, 13f, 16.5f)
                reflectiveCurveTo(13.1f, 17.5f, 13.3f, 18f)
                moveTo(16f, 17.4f)
                lineTo(13.9f, 18.8f)
                curveTo(14.4f, 19.4f, 15.2f, 19.8f, 16f, 20f)
                verticalLineTo(17.4f)
                moveTo(16f, 13.1f)
                curveTo(15.2f, 13.2f, 14.4f, 13.6f, 13.9f, 14.3f)
                lineTo(16f, 15.7f)
                verticalLineTo(13.1f)
                moveTo(17f, 15.6f)
                lineTo(19.1f, 14.2f)
                curveTo(18.6f, 13.6f, 17.8f, 13.2f, 17f, 13f)
                verticalLineTo(15.6f)
                moveTo(19.1f, 18.8f)
                lineTo(17f, 17.4f)
                verticalLineTo(19.9f)
                curveTo(17.8f, 19.8f, 18.6f, 19.4f, 19.1f, 18.8f)
                moveTo(20f, 16.5f)
                curveTo(20f, 16f, 19.9f, 15.5f, 19.7f, 15f)
                lineTo(17.4f, 16.5f)
                lineTo(19.7f, 18f)
                curveTo(19.9f, 17.5f, 20f, 17f, 20f, 16.5f)
                close()
            }
        }.build()

        return _FruitCitrus!!
    }

@Suppress("ObjectPropertyName")
private var _FruitCitrus: ImageVector? = null

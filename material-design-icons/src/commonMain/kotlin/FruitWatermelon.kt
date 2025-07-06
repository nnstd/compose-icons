package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FruitWatermelon: ImageVector
    get() {
        if (_FruitWatermelon != null) {
            return _FruitWatermelon!!
        }
        _FruitWatermelon = ImageVector.Builder(
            name = "FruitWatermelon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.4f, 16.4f)
                curveTo(19.8f, 13f, 19.8f, 7.5f, 16.4f, 4.2f)
                lineTo(4.2f, 16.4f)
                curveTo(7.5f, 19.8f, 13f, 19.8f, 16.4f, 16.4f)
                moveTo(16f, 7f)
                curveTo(16.6f, 7f, 17f, 7.4f, 17f, 8f)
                curveTo(17f, 8.6f, 16.6f, 9f, 16f, 9f)
                reflectiveCurveTo(15f, 8.6f, 15f, 8f)
                curveTo(15f, 7.4f, 15.4f, 7f, 16f, 7f)
                moveTo(16f, 11f)
                curveTo(16.6f, 11f, 17f, 11.4f, 17f, 12f)
                curveTo(17f, 12.6f, 16.6f, 13f, 16f, 13f)
                reflectiveCurveTo(15f, 12.6f, 15f, 12f)
                curveTo(15f, 11.4f, 15.4f, 11f, 16f, 11f)
                moveTo(12f, 11f)
                curveTo(12.6f, 11f, 13f, 11.4f, 13f, 12f)
                curveTo(13f, 12.6f, 12.6f, 13f, 12f, 13f)
                reflectiveCurveTo(11f, 12.6f, 11f, 12f)
                curveTo(11f, 11.4f, 11.4f, 11f, 12f, 11f)
                moveTo(12f, 15f)
                curveTo(12.6f, 15f, 13f, 15.4f, 13f, 16f)
                curveTo(13f, 16.6f, 12.6f, 17f, 12f, 17f)
                reflectiveCurveTo(11f, 16.6f, 11f, 16f)
                curveTo(11f, 15.4f, 11.4f, 15f, 12f, 15f)
                moveTo(8f, 17f)
                curveTo(7.4f, 17f, 7f, 16.6f, 7f, 16f)
                curveTo(7f, 15.4f, 7.4f, 15f, 8f, 15f)
                reflectiveCurveTo(9f, 15.4f, 9f, 16f)
                curveTo(9f, 16.6f, 8.6f, 17f, 8f, 17f)
                moveTo(18.6f, 18.6f)
                curveTo(14f, 23.2f, 6.6f, 23.2f, 2f, 18.6f)
                lineTo(3.4f, 17.2f)
                curveTo(7.2f, 21f, 13.3f, 21f, 17.1f, 17.2f)
                curveTo(20.9f, 13.4f, 20.9f, 7.3f, 17.1f, 3.5f)
                lineTo(18.6f, 2f)
                curveTo(23.1f, 6.6f, 23.1f, 14f, 18.6f, 18.6f)
                close()
            }
        }.build()

        return _FruitWatermelon!!
    }

@Suppress("ObjectPropertyName")
private var _FruitWatermelon: ImageVector? = null

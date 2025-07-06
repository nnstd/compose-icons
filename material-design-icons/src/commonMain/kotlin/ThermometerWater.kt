package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermometerWater: ImageVector
    get() {
        if (_ThermometerWater != null) {
            return _ThermometerWater!!
        }
        _ThermometerWater = ImageVector.Builder(
            name = "ThermometerWater",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 13f)
                verticalLineTo(5f)
                curveTo(10f, 3.34f, 8.66f, 2f, 7f, 2f)
                reflectiveCurveTo(4f, 3.34f, 4f, 5f)
                verticalLineTo(13f)
                curveTo(1.79f, 14.66f, 1.34f, 17.79f, 3f, 20f)
                reflectiveCurveTo(7.79f, 22.66f, 10f, 21f)
                reflectiveCurveTo(12.66f, 16.21f, 11f, 14f)
                curveTo(10.72f, 13.62f, 10.38f, 13.28f, 10f, 13f)
                moveTo(7f, 4f)
                curveTo(7.55f, 4f, 8f, 4.45f, 8f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                curveTo(6f, 4.45f, 6.45f, 4f, 7f, 4f)
                moveTo(18f, 7f)
                curveTo(18f, 7f, 14f, 11.34f, 14f, 14.07f)
                curveTo(14f, 19.31f, 22f, 19.31f, 22f, 14.07f)
                curveTo(22f, 11.34f, 18f, 7f, 18f, 7f)
                close()
            }
        }.build()

        return _ThermometerWater!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerWater: ImageVector? = null

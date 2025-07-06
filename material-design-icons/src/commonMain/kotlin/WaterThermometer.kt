package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterThermometer: ImageVector
    get() {
        if (_WaterThermometer != null) {
            return _WaterThermometer!!
        }
        _WaterThermometer = ImageVector.Builder(
            name = "WaterThermometer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                curveTo(17.89f, 5f, 17f, 5.89f, 17f, 7f)
                verticalLineTo(13.76f)
                curveTo(16.36f, 14.33f, 16f, 15.15f, 16f, 16f)
                curveTo(16f, 17.66f, 17.34f, 19f, 19f, 19f)
                reflectiveCurveTo(22f, 17.66f, 22f, 16f)
                curveTo(22f, 15.15f, 21.64f, 14.33f, 21f, 13.77f)
                verticalLineTo(7f)
                curveTo(21f, 5.89f, 20.11f, 5f, 19f, 5f)
                moveTo(19f, 6f)
                curveTo(19.55f, 6f, 20f, 6.45f, 20f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                curveTo(18f, 6.45f, 18.45f, 6f, 19f, 6f)
                moveTo(8f, 20f)
                curveTo(4.69f, 20f, 2f, 17.31f, 2f, 14f)
                curveTo(2f, 10f, 8f, 3.25f, 8f, 3.25f)
                reflectiveCurveTo(14f, 10f, 14f, 14f)
                curveTo(14f, 17.31f, 11.31f, 20f, 8f, 20f)
                close()
            }
        }.build()

        return _WaterThermometer!!
    }

@Suppress("ObjectPropertyName")
private var _WaterThermometer: ImageVector? = null

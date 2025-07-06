package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterThermometerOutline: ImageVector
    get() {
        if (_WaterThermometerOutline != null) {
            return _WaterThermometerOutline!!
        }
        _WaterThermometerOutline = ImageVector.Builder(
            name = "WaterThermometerOutline",
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
                moveTo(8f, 3.54f)
                lineTo(7.25f, 4.38f)
                curveTo(7.25f, 4.38f, 5.97f, 5.83f, 4.68f, 7.71f)
                reflectiveCurveTo(2f, 11.84f, 2f, 14f)
                curveTo(2f, 17.31f, 4.69f, 20f, 8f, 20f)
                reflectiveCurveTo(14f, 17.31f, 14f, 14f)
                curveTo(14f, 11.84f, 12.61f, 9.59f, 11.32f, 7.71f)
                reflectiveCurveTo(8.75f, 4.38f, 8.75f, 4.38f)
                lineTo(8f, 3.54f)
                moveTo(8f, 6.67f)
                curveTo(8.44f, 7.19f, 8.84f, 7.62f, 9.68f, 8.84f)
                curveTo(10.89f, 10.6f, 12f, 12.84f, 12f, 14f)
                curveTo(12f, 16.22f, 10.22f, 18f, 8f, 18f)
                reflectiveCurveTo(4f, 16.22f, 4f, 14f)
                curveTo(4f, 12.84f, 5.11f, 10.6f, 6.32f, 8.84f)
                curveTo(7.16f, 7.62f, 7.56f, 7.19f, 8f, 6.67f)
                close()
            }
        }.build()

        return _WaterThermometerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WaterThermometerOutline: ImageVector? = null

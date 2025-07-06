package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShakerOutline: ImageVector
    get() {
        if (_ShakerOutline != null) {
            return _ShakerOutline!!
        }
        _ShakerOutline = ImageVector.Builder(
            name = "ShakerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.88f, 4f)
                lineTo(16.88f, 4f)
                lineTo(19.03f, 6.1f)
                lineTo(13.5f, 10.5f)
                lineTo(12.5f, 9.5f)
                lineTo(16.87f, 4f)
                lineTo(16.88f, 4f)
                moveTo(16.88f, 2f)
                curveTo(16.3f, 2f, 15.73f, 2.24f, 15.33f, 2.72f)
                lineTo(9.8f, 9.65f)
                lineTo(13.34f, 13.19f)
                lineTo(20.28f, 7.67f)
                curveTo(21.18f, 6.91f, 21.25f, 5.54f, 20.41f, 4.7f)
                lineTo(18.3f, 2.59f)
                curveTo(17.9f, 2.19f, 17.39f, 2f, 16.88f, 2f)
                moveTo(9.1f, 10.36f)
                lineTo(8.39f, 11.07f)
                curveTo(8f, 11.46f, 8f, 12.09f, 8.39f, 12.5f)
                lineTo(10.5f, 14.6f)
                curveTo(10.71f, 14.8f, 10.96f, 14.89f, 11.22f, 14.89f)
                reflectiveCurveTo(11.73f, 14.8f, 11.93f, 14.6f)
                lineTo(12.63f, 13.9f)
                lineTo(9.1f, 10.36f)
                moveTo(6f, 15f)
                curveTo(5.45f, 15f, 5f, 15.45f, 5f, 16f)
                curveTo(5f, 16.55f, 5.45f, 17f, 6f, 17f)
                curveTo(6.55f, 17f, 7f, 16.55f, 7f, 16f)
                curveTo(7f, 15.45f, 6.55f, 15f, 6f, 15f)
                moveTo(9f, 16f)
                curveTo(8.45f, 16f, 8f, 16.45f, 8f, 17f)
                reflectiveCurveTo(8.45f, 18f, 9f, 18f)
                curveTo(9.55f, 18f, 10f, 17.55f, 10f, 17f)
                reflectiveCurveTo(9.55f, 16f, 9f, 16f)
                moveTo(4f, 18f)
                curveTo(3.45f, 18f, 3f, 18.45f, 3f, 19f)
                reflectiveCurveTo(3.45f, 20f, 4f, 20f)
                curveTo(4.55f, 20f, 5f, 19.55f, 5f, 19f)
                reflectiveCurveTo(4.55f, 18f, 4f, 18f)
                moveTo(7f, 19f)
                curveTo(6.45f, 19f, 6f, 19.45f, 6f, 20f)
                reflectiveCurveTo(6.45f, 21f, 7f, 21f)
                curveTo(7.55f, 21f, 8f, 20.55f, 8f, 20f)
                reflectiveCurveTo(7.55f, 19f, 7f, 19f)
                close()
            }
        }.build()

        return _ShakerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShakerOutline: ImageVector? = null

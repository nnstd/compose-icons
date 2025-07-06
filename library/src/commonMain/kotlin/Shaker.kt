package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Shaker: ImageVector
    get() {
        if (_Shaker != null) {
            return _Shaker!!
        }
        _Shaker = ImageVector.Builder(
            name = "Shaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 16f)
                curveTo(7f, 16.55f, 6.55f, 17f, 6f, 17f)
                reflectiveCurveTo(5f, 16.55f, 5f, 16f)
                curveTo(5f, 15.45f, 5.45f, 15f, 6f, 15f)
                reflectiveCurveTo(7f, 15.45f, 7f, 16f)
                moveTo(9f, 16f)
                curveTo(8.45f, 16f, 8f, 16.45f, 8f, 17f)
                reflectiveCurveTo(8.45f, 18f, 9f, 18f)
                reflectiveCurveTo(10f, 17.55f, 10f, 17f)
                reflectiveCurveTo(9.55f, 16f, 9f, 16f)
                moveTo(4f, 18f)
                curveTo(3.45f, 18f, 3f, 18.45f, 3f, 19f)
                reflectiveCurveTo(3.45f, 20f, 4f, 20f)
                reflectiveCurveTo(5f, 19.55f, 5f, 19f)
                reflectiveCurveTo(4.55f, 18f, 4f, 18f)
                moveTo(7f, 19f)
                curveTo(6.45f, 19f, 6f, 19.45f, 6f, 20f)
                reflectiveCurveTo(6.45f, 21f, 7f, 21f)
                reflectiveCurveTo(8f, 20.55f, 8f, 20f)
                reflectiveCurveTo(7.55f, 19f, 7f, 19f)
                moveTo(15.33f, 2.72f)
                lineTo(9.8f, 9.65f)
                lineTo(13.34f, 13.19f)
                lineTo(20.28f, 7.67f)
                curveTo(21.18f, 6.91f, 21.25f, 5.54f, 20.41f, 4.7f)
                lineTo(18.3f, 2.59f)
                curveTo(17.46f, 1.75f, 16.09f, 1.82f, 15.33f, 2.72f)
                moveTo(8.39f, 12.5f)
                lineTo(10.5f, 14.6f)
                curveTo(10.9f, 15f, 11.54f, 15f, 11.93f, 14.6f)
                lineTo(12.63f, 13.9f)
                lineTo(9.1f, 10.36f)
                lineTo(8.39f, 11.07f)
                curveTo(8f, 11.46f, 8f, 12.09f, 8.39f, 12.5f)
                close()
            }
        }.build()

        return _Shaker!!
    }

@Suppress("ObjectPropertyName")
private var _Shaker: ImageVector? = null

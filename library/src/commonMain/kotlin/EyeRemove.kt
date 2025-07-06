package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeRemove: ImageVector
    get() {
        if (_EyeRemove != null) {
            return _EyeRemove!!
        }
        _EyeRemove = ImageVector.Builder(
            name = "EyeRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.54f, 16.88f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.47f, 21.12f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 16.88f)
                lineTo(16.88f, 15.47f)
                lineTo(19f, 17.59f)
                lineTo(21.12f, 15.47f)
                lineTo(22.54f, 16.88f)
                moveTo(12f, 9f)
                curveTo(10.34f, 9f, 9f, 10.34f, 9f, 12f)
                reflectiveCurveTo(10.34f, 15f, 12f, 15f)
                reflectiveCurveTo(15f, 13.66f, 15f, 12f)
                reflectiveCurveTo(13.66f, 9f, 12f, 9f)
                moveTo(12f, 17f)
                curveTo(9.24f, 17f, 7f, 14.76f, 7f, 12f)
                reflectiveCurveTo(9.24f, 7f, 12f, 7f)
                reflectiveCurveTo(17f, 9.24f, 17f, 12f)
                curveTo(17f, 12.5f, 16.9f, 13f, 16.77f, 13.43f)
                curveTo(17.46f, 13.16f, 18.21f, 13f, 19f, 13f)
                curveTo(20.12f, 13f, 21.17f, 13.32f, 22.07f, 13.85f)
                curveTo(22.43f, 13.27f, 22.74f, 12.65f, 23f, 12f)
                curveTo(21.27f, 7.61f, 17f, 4.5f, 12f, 4.5f)
                reflectiveCurveTo(2.73f, 7.61f, 1f, 12f)
                curveTo(2.73f, 16.39f, 7f, 19.5f, 12f, 19.5f)
                curveTo(12.35f, 19.5f, 12.69f, 19.5f, 13.03f, 19.45f)
                curveTo(13f, 19.3f, 13f, 19.15f, 13f, 19f)
                curveTo(13f, 18.21f, 13.16f, 17.46f, 13.43f, 16.77f)
                curveTo(13f, 16.9f, 12.5f, 17f, 12f, 17f)
                close()
            }
        }.build()

        return _EyeRemove!!
    }

@Suppress("ObjectPropertyName")
private var _EyeRemove: ImageVector? = null

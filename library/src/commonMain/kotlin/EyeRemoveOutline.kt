package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeRemoveOutline: ImageVector
    get() {
        if (_EyeRemoveOutline != null) {
            return _EyeRemoveOutline!!
        }
        _EyeRemoveOutline = ImageVector.Builder(
            name = "EyeRemoveOutline",
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
                moveTo(12f, 17.5f)
                curveTo(8.24f, 17.5f, 4.83f, 15.36f, 3.18f, 12f)
                curveTo(4.83f, 8.64f, 8.24f, 6.5f, 12f, 6.5f)
                reflectiveCurveTo(19.17f, 8.64f, 20.82f, 12f)
                curveTo(20.63f, 12.39f, 20.41f, 12.77f, 20.17f, 13.13f)
                curveTo(20.85f, 13.26f, 21.5f, 13.5f, 22.07f, 13.85f)
                curveTo(22.43f, 13.27f, 22.74f, 12.65f, 23f, 12f)
                curveTo(21.27f, 7.61f, 17f, 4.5f, 12f, 4.5f)
                reflectiveCurveTo(2.73f, 7.61f, 1f, 12f)
                curveTo(2.73f, 16.39f, 7f, 19.5f, 12f, 19.5f)
                curveTo(12.35f, 19.5f, 12.69f, 19.5f, 13.03f, 19.45f)
                curveTo(13f, 19.3f, 13f, 19.15f, 13f, 19f)
                curveTo(13f, 18.45f, 13.08f, 17.92f, 13.22f, 17.41f)
                curveTo(12.82f, 17.46f, 12.41f, 17.5f, 12f, 17.5f)
                close()
            }
        }.build()

        return _EyeRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EyeRemoveOutline: ImageVector? = null

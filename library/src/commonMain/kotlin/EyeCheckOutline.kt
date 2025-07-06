package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeCheckOutline: ImageVector
    get() {
        if (_EyeCheckOutline != null) {
            return _EyeCheckOutline!!
        }
        _EyeCheckOutline = ImageVector.Builder(
            name = "EyeCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 17f)
                lineTo(18.5f, 22f)
                lineTo(15f, 18.5f)
                lineTo(16.5f, 17f)
                lineTo(18.5f, 19f)
                lineTo(22f, 15.5f)
                lineTo(23.5f, 17f)
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                moveTo(12f, 4.5f)
                curveTo(17f, 4.5f, 21.27f, 7.61f, 23f, 12f)
                curveTo(22.75f, 12.65f, 22.44f, 13.26f, 22.08f, 13.85f)
                curveTo(21.5f, 13.5f, 20.86f, 13.25f, 20.18f, 13.12f)
                lineTo(20.82f, 12f)
                curveTo(19.17f, 8.64f, 15.76f, 6.5f, 12f, 6.5f)
                curveTo(8.24f, 6.5f, 4.83f, 8.64f, 3.18f, 12f)
                curveTo(4.83f, 15.36f, 8.24f, 17.5f, 12f, 17.5f)
                lineTo(13.21f, 17.43f)
                curveTo(13.07f, 17.93f, 13f, 18.46f, 13f, 19f)
                verticalLineTo(19.46f)
                lineTo(12f, 19.5f)
                curveTo(7f, 19.5f, 2.73f, 16.39f, 1f, 12f)
                curveTo(2.73f, 7.61f, 7f, 4.5f, 12f, 4.5f)
                close()
            }
        }.build()

        return _EyeCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EyeCheckOutline: ImageVector? = null

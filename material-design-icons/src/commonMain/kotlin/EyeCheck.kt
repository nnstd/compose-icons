package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeCheck: ImageVector
    get() {
        if (_EyeCheck != null) {
            return _EyeCheck!!
        }
        _EyeCheck = ImageVector.Builder(
            name = "EyeCheck",
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
                moveTo(12f, 17f)
                curveTo(12.5f, 17f, 12.97f, 16.93f, 13.42f, 16.79f)
                curveTo(13.15f, 17.5f, 13f, 18.22f, 13f, 19f)
                verticalLineTo(19.45f)
                lineTo(12f, 19.5f)
                curveTo(7f, 19.5f, 2.73f, 16.39f, 1f, 12f)
                curveTo(2.73f, 7.61f, 7f, 4.5f, 12f, 4.5f)
                curveTo(17f, 4.5f, 21.27f, 7.61f, 23f, 12f)
                curveTo(22.75f, 12.64f, 22.44f, 13.26f, 22.08f, 13.85f)
                curveTo(21.18f, 13.31f, 20.12f, 13f, 19f, 13f)
                curveTo(18.22f, 13f, 17.5f, 13.15f, 16.79f, 13.42f)
                curveTo(16.93f, 12.97f, 17f, 12.5f, 17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                close()
            }
        }.build()

        return _EyeCheck!!
    }

@Suppress("ObjectPropertyName")
private var _EyeCheck: ImageVector? = null

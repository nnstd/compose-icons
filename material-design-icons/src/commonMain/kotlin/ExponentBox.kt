package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ExponentBox: ImageVector
    get() {
        if (_ExponentBox != null) {
            return _ExponentBox!!
        }
        _ExponentBox = ImageVector.Builder(
            name = "ExponentBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                horizontalLineTo(5f)
                moveTo(13.76f, 6f)
                horizontalLineTo(15.39f)
                lineTo(16.5f, 8.6f)
                lineTo(17.59f, 6f)
                horizontalLineTo(19.24f)
                curveTo(19.24f, 6f, 17.5f, 10.57f, 16.46f, 12.32f)
                curveTo(16.08f, 12.89f, 15.35f, 13.27f, 14.5f, 13.25f)
                verticalLineTo(11.75f)
                curveTo(14.96f, 11.76f, 15.25f, 11.5f, 15.5f, 11.13f)
                curveTo(15.61f, 11f, 15.68f, 10.8f, 15.74f, 10.64f)
                lineTo(13.76f, 6f)
                moveTo(6.41f, 9.59f)
                lineTo(9.21f, 12.38f)
                lineTo(12f, 9.59f)
                lineTo(13.41f, 11f)
                lineTo(10.62f, 13.79f)
                lineTo(13.41f, 16.59f)
                lineTo(12f, 18f)
                lineTo(9.21f, 15.21f)
                lineTo(6.41f, 18f)
                lineTo(5f, 16.59f)
                lineTo(7.79f, 13.79f)
                lineTo(5f, 11f)
                lineTo(6.41f, 9.59f)
                close()
            }
        }.build()

        return _ExponentBox!!
    }

@Suppress("ObjectPropertyName")
private var _ExponentBox: ImageVector? = null

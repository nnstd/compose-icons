package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Wallpaper: ImageVector
    get() {
        if (_Wallpaper != null) {
            return _Wallpaper!!
        }
        _Wallpaper = ImageVector.Builder(
            name = "Wallpaper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(10f, 13f)
                lineTo(6f, 18f)
                horizontalLineTo(18f)
                lineTo(15f, 14f)
                lineTo(12.97f, 16.71f)
                lineTo(10f, 13f)
                moveTo(17f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 7f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 8.5f)
                moveTo(20f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                moveTo(20f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                moveTo(4f, 13f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Wallpaper!!
    }

@Suppress("ObjectPropertyName")
private var _Wallpaper: ImageVector? = null

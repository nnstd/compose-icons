package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ConsoleNetwork: ImageVector
    get() {
        if (_ConsoleNetwork != null) {
            return _ConsoleNetwork!!
        }
        _ConsoleNetwork = ImageVector.Builder(
            name = "ConsoleNetwork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 23f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3f)
                horizontalLineTo(17f)
                moveTo(7f, 7f)
                lineTo(11f, 11f)
                lineTo(7f, 15f)
                horizontalLineTo(9.85f)
                lineTo(13.13f, 11.72f)
                curveTo(13.5f, 11.33f, 13.5f, 10.7f, 13.13f, 10.3f)
                lineTo(9.83f, 7f)
                horizontalLineTo(7f)
                moveTo(17f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _ConsoleNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _ConsoleNetwork: ImageVector? = null

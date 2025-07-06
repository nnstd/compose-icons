package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ConsoleNetworkOutline: ImageVector
    get() {
        if (_ConsoleNetworkOutline != null) {
            return _ConsoleNetworkOutline!!
        }
        _ConsoleNetworkOutline = ImageVector.Builder(
            name = "ConsoleNetworkOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 23f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                moveTo(7f, 15f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(8f, 6.89f)
                lineTo(11.56f, 10.45f)
                lineTo(8f, 14f)
                horizontalLineTo(10.53f)
                lineTo(13.45f, 11.08f)
                curveTo(13.78f, 10.74f, 13.78f, 10.18f, 13.45f, 9.82f)
                lineTo(10.5f, 6.89f)
                horizontalLineTo(8f)
                moveTo(16f, 12.22f)
                horizontalLineTo(13.33f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(12.22f)
                close()
            }
        }.build()

        return _ConsoleNetworkOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ConsoleNetworkOutline: ImageVector? = null

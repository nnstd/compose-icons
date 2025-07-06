package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Signal3G: ImageVector
    get() {
        if (_Signal3G != null) {
            return _Signal3G!!
        }
        _Signal3G = ImageVector.Builder(
            name = "Signal3G",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 16.5f)
                verticalLineTo(14.25f)
                curveTo(11f, 13f, 10f, 12f, 8.75f, 12f)
                curveTo(10f, 12f, 11f, 11f, 11f, 9.75f)
                verticalLineTo(7.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4.5f)
                horizontalLineTo(2f)
                verticalLineTo(7.5f)
                horizontalLineTo(8f)
                verticalLineTo(10.5f)
                horizontalLineTo(5f)
                verticalLineTo(13.5f)
                horizontalLineTo(8f)
                verticalLineTo(16.5f)
                horizontalLineTo(2f)
                verticalLineTo(19.5f)
                horizontalLineTo(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 16.5f)
                moveTo(22f, 16.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(19f)
                verticalLineTo(16.5f)
                horizontalLineTo(16f)
                verticalLineTo(7.5f)
                horizontalLineTo(22f)
                verticalLineTo(4.5f)
                horizontalLineTo(16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7.5f)
                verticalLineTo(16.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 19.5f)
                horizontalLineTo(19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16.5f)
                close()
            }
        }.build()

        return _Signal3G!!
    }

@Suppress("ObjectPropertyName")
private var _Signal3G: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Signal2G: ImageVector
    get() {
        if (_Signal2G != null) {
            return _Signal2G!!
        }
        _Signal2G = ImageVector.Builder(
            name = "Signal2G",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 19.5f)
                horizontalLineTo(2f)
                verticalLineTo(13.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 10.5f)
                horizontalLineTo(8f)
                verticalLineTo(7.5f)
                horizontalLineTo(2f)
                verticalLineTo(4.5f)
                horizontalLineTo(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7.5f)
                verticalLineTo(10.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13.5f)
                horizontalLineTo(5f)
                verticalLineTo(16.5f)
                horizontalLineTo(11f)
                moveTo(22f, 10.5f)
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
            }
        }.build()

        return _Signal2G!!
    }

@Suppress("ObjectPropertyName")
private var _Signal2G: ImageVector? = null

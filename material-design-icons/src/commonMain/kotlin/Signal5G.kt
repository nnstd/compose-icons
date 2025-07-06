package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Signal5G: ImageVector
    get() {
        if (_Signal5G != null) {
            return _Signal5G!!
        }
        _Signal5G = ImageVector.Builder(
            name = "Signal5G",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(10f, 4.5f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                lineTo(3f, 13.5f)
                horizontalLineTo(7f)
                verticalLineTo(16.5f)
                horizontalLineTo(3f)
                verticalLineTo(19.5f)
                horizontalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 18f)
                verticalLineTo(12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 10.5f)
                horizontalLineTo(6f)
                verticalLineTo(7.5f)
                horizontalLineTo(10f)
                verticalLineTo(4.5f)
                close()
            }
        }.build()

        return _Signal5G!!
    }

@Suppress("ObjectPropertyName")
private var _Signal5G: ImageVector? = null

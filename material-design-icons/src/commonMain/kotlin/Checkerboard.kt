package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Checkerboard: ImageVector
    get() {
        if (_Checkerboard != null) {
            return _Checkerboard!!
        }
        _Checkerboard = ImageVector.Builder(
            name = "Checkerboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                moveTo(20f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                moveTo(16f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                moveTo(12f, 12f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _Checkerboard!!
    }

@Suppress("ObjectPropertyName")
private var _Checkerboard: ImageVector? = null

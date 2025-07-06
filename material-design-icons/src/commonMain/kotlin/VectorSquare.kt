package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorSquare: ImageVector
    get() {
        if (_VectorSquare != null) {
            return _VectorSquare!!
        }
        _VectorSquare = ImageVector.Builder(
            name = "VectorSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                moveTo(16f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                moveTo(4f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                moveTo(18f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                moveTo(4f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                moveTo(18f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _VectorSquare!!
    }

@Suppress("ObjectPropertyName")
private var _VectorSquare: ImageVector? = null

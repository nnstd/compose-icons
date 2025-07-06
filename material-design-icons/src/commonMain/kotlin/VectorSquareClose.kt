package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorSquareClose: ImageVector
    get() {
        if (_VectorSquareClose != null) {
            return _VectorSquareClose!!
        }
        _VectorSquareClose = ImageVector.Builder(
            name = "VectorSquareClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(6f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                moveTo(18f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                moveTo(20f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                moveTo(18f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                moveTo(14f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _VectorSquareClose!!
    }

@Suppress("ObjectPropertyName")
private var _VectorSquareClose: ImageVector? = null

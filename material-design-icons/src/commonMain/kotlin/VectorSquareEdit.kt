package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorSquareEdit: ImageVector
    get() {
        if (_VectorSquareEdit != null) {
            return _VectorSquareEdit!!
        }
        _VectorSquareEdit = ImageVector.Builder(
            name = "VectorSquareEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.7f, 14.4f)
                lineTo(21.7f, 15.4f)
                lineTo(19.6f, 13.3f)
                lineTo(20.6f, 12.3f)
                curveTo(20.8f, 12.1f, 21.2f, 12.1f, 21.4f, 12.3f)
                lineTo(22.7f, 13.6f)
                curveTo(22.9f, 13.8f, 22.9f, 14.1f, 22.7f, 14.4f)
                moveTo(13f, 19.9f)
                lineTo(19.1f, 13.8f)
                lineTo(21.2f, 15.9f)
                lineTo(15.1f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(19.9f)
                moveTo(11f, 19.9f)
                verticalLineTo(19.1f)
                lineTo(11.6f, 18.5f)
                lineTo(12.1f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(12.1f)
                lineTo(19.1f, 11f)
                lineTo(19.3f, 10.8f)
                curveTo(19.5f, 10.6f, 19.8f, 10.4f, 20.1f, 10.3f)
                verticalLineTo(8f)
                horizontalLineTo(22.1f)
                verticalLineTo(2f)
                horizontalLineTo(16.1f)
                verticalLineTo(4f)
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
                lineTo(11f, 19.9f)
                moveTo(18f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
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
                close()
            }
        }.build()

        return _VectorSquareEdit!!
    }

@Suppress("ObjectPropertyName")
private var _VectorSquareEdit: ImageVector? = null

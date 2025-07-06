package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorSquareRemove: ImageVector
    get() {
        if (_VectorSquareRemove != null) {
            return _VectorSquareRemove!!
        }
        _VectorSquareRemove = ImageVector.Builder(
            name = "VectorSquareRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                curveTo(13f, 18.7f, 13f, 18.3f, 13.1f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(13.1f)
                curveTo(18.3f, 13f, 18.7f, 13f, 19f, 13f)
                curveTo(19.3f, 13f, 19.7f, 13f, 20f, 13.1f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(16f)
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
                horizontalLineTo(13.1f)
                curveTo(13f, 19.7f, 13f, 19.3f, 13f, 19f)
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
                moveTo(22.5f, 16.9f)
                lineTo(20.4f, 19f)
                lineTo(22.5f, 21.1f)
                lineTo(21.1f, 22.5f)
                lineTo(19f, 20.4f)
                lineTo(16.9f, 22.5f)
                lineTo(15.5f, 21.1f)
                lineTo(17.6f, 19f)
                lineTo(15.5f, 16.9f)
                lineTo(16.9f, 15.5f)
                lineTo(19f, 17.6f)
                lineTo(21.1f, 15.5f)
                lineTo(22.5f, 16.9f)
                close()
            }
        }.build()

        return _VectorSquareRemove!!
    }

@Suppress("ObjectPropertyName")
private var _VectorSquareRemove: ImageVector? = null

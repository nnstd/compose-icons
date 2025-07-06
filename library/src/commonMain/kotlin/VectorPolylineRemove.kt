package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorPolylineRemove: ImageVector
    get() {
        if (_VectorPolylineRemove != null) {
            return _VectorPolylineRemove!!
        }
        _VectorPolylineRemove = ImageVector.Builder(
            name = "VectorPolylineRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.1f, 15.5f)
                lineTo(19f, 17.6f)
                lineTo(16.9f, 15.5f)
                lineTo(15.5f, 16.9f)
                lineTo(17.6f, 19f)
                lineTo(15.5f, 21.1f)
                lineTo(16.9f, 22.5f)
                lineTo(19f, 20.4f)
                lineTo(21.1f, 22.5f)
                lineTo(22.5f, 21.1f)
                lineTo(20.4f, 19f)
                lineTo(22.5f, 16.9f)
                lineTo(21.1f, 15.5f)
                moveTo(16f, 5f)
                verticalLineTo(9.6f)
                lineTo(10.6f, 15f)
                horizontalLineTo(9.1f)
                lineTo(7.1f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                lineTo(7f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(16.4f)
                lineTo(17.4f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                moveTo(6f, 7f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                moveTo(10f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                moveTo(20f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
            }
        }.build()

        return _VectorPolylineRemove!!
    }

@Suppress("ObjectPropertyName")
private var _VectorPolylineRemove: ImageVector? = null

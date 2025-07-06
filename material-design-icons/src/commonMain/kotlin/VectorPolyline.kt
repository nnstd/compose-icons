package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorPolyline: ImageVector
    get() {
        if (_VectorPolyline != null) {
            return _VectorPolyline!!
        }
        _VectorPolyline = ImageVector.Builder(
            name = "VectorPolyline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                verticalLineTo(9f)
                horizontalLineTo(4.95f)
                lineTo(6.95f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(16.41f)
                lineTo(17.41f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(9.57f)
                lineTo(10.59f, 15f)
                horizontalLineTo(9.06f)
                lineTo(7.06f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                moveTo(4f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                moveTo(18f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                moveTo(8f, 17f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _VectorPolyline!!
    }

@Suppress("ObjectPropertyName")
private var _VectorPolyline: ImageVector? = null

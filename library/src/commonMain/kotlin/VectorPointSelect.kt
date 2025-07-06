package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorPointSelect: ImageVector
    get() {
        if (_VectorPointSelect != null) {
            return _VectorPointSelect!!
        }
        _VectorPointSelect = ImageVector.Builder(
            name = "VectorPointSelect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                lineTo(7f, 22f)
                lineTo(12f, 11f)
                lineTo(17f, 22f)
                lineTo(12f, 20f)
                moveTo(8f, 2f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                moveTo(10f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _VectorPointSelect!!
    }

@Suppress("ObjectPropertyName")
private var _VectorPointSelect: ImageVector? = null

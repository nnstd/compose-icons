package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorLine: ImageVector
    get() {
        if (_VectorLine != null) {
            return _VectorLine!!
        }
        _VectorLine = ImageVector.Builder(
            name = "VectorLine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3f)
                verticalLineTo(7.59f)
                lineTo(7.59f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(16.42f)
                lineTo(16.42f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(17f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                moveTo(5f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
            }
        }.build()

        return _VectorLine!!
    }

@Suppress("ObjectPropertyName")
private var _VectorLine: ImageVector? = null

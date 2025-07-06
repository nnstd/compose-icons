package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CompareVertical: ImageVector
    get() {
        if (_CompareVertical != null) {
            return _CompareVertical!!
        }
        _CompareVertical = ImageVector.Builder(
            name = "CompareVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 15f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                lineTo(15f, 11f)
                lineTo(11f, 15f)
                horizontalLineTo(14f)
                moveTo(13f, 9f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                lineTo(9f, 13f)
                lineTo(13f, 9f)
                close()
            }
        }.build()

        return _CompareVertical!!
    }

@Suppress("ObjectPropertyName")
private var _CompareVertical: ImageVector? = null

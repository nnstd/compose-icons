package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PineTree: ImageVector
    get() {
        if (_PineTree != null) {
            return _PineTree!!
        }
        _PineTree = ImageVector.Builder(
            name = "PineTree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 21f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                lineTo(8f, 13f)
                horizontalLineTo(5f)
                lineTo(10f, 8f)
                horizontalLineTo(7f)
                lineTo(12f, 3f)
                lineTo(17f, 8f)
                horizontalLineTo(14f)
                lineTo(19f, 13f)
                horizontalLineTo(16f)
                lineTo(21f, 18f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _PineTree!!
    }

@Suppress("ObjectPropertyName")
private var _PineTree: ImageVector? = null

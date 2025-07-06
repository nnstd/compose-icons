package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewQuilt: ImageVector
    get() {
        if (_ViewQuilt != null) {
            return _ViewQuilt!!
        }
        _ViewQuilt = ImageVector.Builder(
            name = "ViewQuilt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                moveTo(16f, 18f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                moveTo(4f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                moveTo(10f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _ViewQuilt!!
    }

@Suppress("ObjectPropertyName")
private var _ViewQuilt: ImageVector? = null

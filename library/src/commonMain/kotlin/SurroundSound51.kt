package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SurroundSound51: ImageVector
    get() {
        if (_SurroundSound51 != null) {
            return _SurroundSound51!!
        }
        _SurroundSound51 = ImageVector.Builder(
            name = "SurroundSound51",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                moveTo(20f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                moveTo(10f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                curveTo(9.1f, 11f, 10f, 11.9f, 10f, 13f)
                verticalLineTo(15f)
                curveTo(10f, 16.1f, 9.1f, 17f, 8f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _SurroundSound51!!
    }

@Suppress("ObjectPropertyName")
private var _SurroundSound51: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SurroundSound21: ImageVector
    get() {
        if (_SurroundSound21 != null) {
            return _SurroundSound21!!
        }
        _SurroundSound21 = ImageVector.Builder(
            name = "SurroundSound21",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                curveTo(4.9f, 11f, 4f, 11.9f, 4f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                curveTo(9.1f, 13f, 10f, 12.1f, 10f, 11f)
                verticalLineTo(9f)
                curveTo(10f, 7.9f, 9.1f, 7f, 8f, 7f)
                horizontalLineTo(4f)
                moveTo(14f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                moveTo(16f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _SurroundSound21!!
    }

@Suppress("ObjectPropertyName")
private var _SurroundSound21: ImageVector? = null

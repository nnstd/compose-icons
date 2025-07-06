package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MathLog: ImageVector
    get() {
        if (_MathLog != null) {
            return _MathLog!!
        }
        _MathLog = ImageVector.Builder(
            name = "MathLog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 7f)
                curveTo(16.9f, 7f, 16f, 7.9f, 16f, 9f)
                verticalLineTo(15f)
                curveTo(16f, 16.1f, 16.9f, 17f, 18f, 17f)
                horizontalLineTo(20f)
                curveTo(21.1f, 17f, 22f, 16.1f, 22f, 15f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                moveTo(2f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                moveTo(11f, 7f)
                curveTo(9.9f, 7f, 9f, 7.9f, 9f, 9f)
                verticalLineTo(15f)
                curveTo(9f, 16.1f, 9.9f, 17f, 11f, 17f)
                horizontalLineTo(13f)
                curveTo(14.1f, 17f, 15f, 16.1f, 15f, 15f)
                verticalLineTo(9f)
                curveTo(15f, 7.9f, 14.1f, 7f, 13f, 7f)
                horizontalLineTo(11f)
                moveTo(11f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _MathLog!!
    }

@Suppress("ObjectPropertyName")
private var _MathLog: ImageVector? = null

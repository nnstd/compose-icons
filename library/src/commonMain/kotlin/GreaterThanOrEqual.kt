package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GreaterThanOrEqual: ImageVector
    get() {
        if (_GreaterThanOrEqual != null) {
            return _GreaterThanOrEqual!!
        }
        _GreaterThanOrEqual = ImageVector.Builder(
            name = "GreaterThanOrEqual",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 2.27f)
                lineTo(20f, 10.14f)
                lineTo(6.5f, 18f)
                lineTo(5.5f, 16.27f)
                lineTo(16.03f, 10.14f)
                lineTo(5.5f, 4f)
                lineTo(6.5f, 2.27f)
                moveTo(20f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _GreaterThanOrEqual!!
    }

@Suppress("ObjectPropertyName")
private var _GreaterThanOrEqual: ImageVector? = null

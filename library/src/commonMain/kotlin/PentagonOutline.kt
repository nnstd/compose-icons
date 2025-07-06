package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PentagonOutline: ImageVector
    get() {
        if (_PentagonOutline != null) {
            return _PentagonOutline!!
        }
        _PentagonOutline = ImageVector.Builder(
            name = "PentagonOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                lineTo(19.6f, 10.5f)
                lineTo(16.7f, 19.4f)
                horizontalLineTo(7.3f)
                lineTo(4.4f, 10.5f)
                lineTo(12f, 5f)
                moveTo(12f, 2.5f)
                lineTo(2f, 9.8f)
                lineTo(5.8f, 21.5f)
                horizontalLineTo(18.1f)
                lineTo(22f, 9.8f)
                lineTo(12f, 2.5f)
                close()
            }
        }.build()

        return _PentagonOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PentagonOutline: ImageVector? = null

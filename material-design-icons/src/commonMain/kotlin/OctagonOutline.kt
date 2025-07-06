package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OctagonOutline: ImageVector
    get() {
        if (_OctagonOutline != null) {
            return _OctagonOutline!!
        }
        _OctagonOutline = ImageVector.Builder(
            name = "OctagonOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.27f, 3f)
                lineTo(3f, 8.27f)
                verticalLineTo(15.73f)
                lineTo(8.27f, 21f)
                horizontalLineTo(15.73f)
                curveTo(17.5f, 19.24f, 21f, 15.73f, 21f, 15.73f)
                verticalLineTo(8.27f)
                lineTo(15.73f, 3f)
                moveTo(9.1f, 5f)
                horizontalLineTo(14.9f)
                lineTo(19f, 9.1f)
                verticalLineTo(14.9f)
                lineTo(14.9f, 19f)
                horizontalLineTo(9.1f)
                lineTo(5f, 14.9f)
                verticalLineTo(9.1f)
            }
        }.build()

        return _OctagonOutline!!
    }

@Suppress("ObjectPropertyName")
private var _OctagonOutline: ImageVector? = null

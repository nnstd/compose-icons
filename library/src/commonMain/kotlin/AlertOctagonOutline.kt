package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertOctagonOutline: ImageVector
    get() {
        if (_AlertOctagonOutline != null) {
            return _AlertOctagonOutline!!
        }
        _AlertOctagonOutline = ImageVector.Builder(
            name = "AlertOctagonOutline",
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
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(11f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
            }
        }.build()

        return _AlertOctagonOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlertOctagonOutline: ImageVector? = null

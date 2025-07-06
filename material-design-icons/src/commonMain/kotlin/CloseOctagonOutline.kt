package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloseOctagonOutline: ImageVector
    get() {
        if (_CloseOctagonOutline != null) {
            return _CloseOctagonOutline!!
        }
        _CloseOctagonOutline = ImageVector.Builder(
            name = "CloseOctagonOutline",
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
                moveTo(9.12f, 7.71f)
                lineTo(7.71f, 9.12f)
                lineTo(10.59f, 12f)
                lineTo(7.71f, 14.88f)
                lineTo(9.12f, 16.29f)
                lineTo(12f, 13.41f)
                lineTo(14.88f, 16.29f)
                lineTo(16.29f, 14.88f)
                lineTo(13.41f, 12f)
                lineTo(16.29f, 9.12f)
                lineTo(14.88f, 7.71f)
                lineTo(12f, 10.59f)
            }
        }.build()

        return _CloseOctagonOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloseOctagonOutline: ImageVector? = null

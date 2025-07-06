package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PauseOctagonOutline: ImageVector
    get() {
        if (_PauseOctagonOutline != null) {
            return _PauseOctagonOutline!!
        }
        _PauseOctagonOutline = ImageVector.Builder(
            name = "PauseOctagonOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                moveTo(11f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                moveTo(15.73f, 3f)
                lineTo(21f, 8.27f)
                verticalLineTo(15.73f)
                lineTo(15.73f, 21f)
                horizontalLineTo(8.27f)
                lineTo(3f, 15.73f)
                verticalLineTo(8.27f)
                lineTo(8.27f, 3f)
                horizontalLineTo(15.73f)
                moveTo(14.9f, 5f)
                horizontalLineTo(9.1f)
                lineTo(5f, 9.1f)
                verticalLineTo(14.9f)
                lineTo(9.1f, 19f)
                horizontalLineTo(14.9f)
                lineTo(19f, 14.9f)
                verticalLineTo(9.1f)
                lineTo(14.9f, 5f)
                close()
            }
        }.build()

        return _PauseOctagonOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PauseOctagonOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PauseOctagon: ImageVector
    get() {
        if (_PauseOctagon != null) {
            return _PauseOctagon!!
        }
        _PauseOctagon = ImageVector.Builder(
            name = "PauseOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.73f, 3f)
                lineTo(21f, 8.27f)
                verticalLineTo(15.73f)
                lineTo(15.73f, 21f)
                horizontalLineTo(8.27f)
                lineTo(3f, 15.73f)
                verticalLineTo(8.27f)
                lineTo(8.27f, 3f)
                horizontalLineTo(15.73f)
                moveTo(15f, 16f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                moveTo(11f, 16f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _PauseOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _PauseOctagon: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertOctagon: ImageVector
    get() {
        if (_AlertOctagon != null) {
            return _AlertOctagon!!
        }
        _AlertOctagon = ImageVector.Builder(
            name = "AlertOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                moveTo(15.73f, 3f)
                horizontalLineTo(8.27f)
                lineTo(3f, 8.27f)
                verticalLineTo(15.73f)
                lineTo(8.27f, 21f)
                horizontalLineTo(15.73f)
                lineTo(21f, 15.73f)
                verticalLineTo(8.27f)
                lineTo(15.73f, 3f)
                close()
            }
        }.build()

        return _AlertOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _AlertOctagon: ImageVector? = null

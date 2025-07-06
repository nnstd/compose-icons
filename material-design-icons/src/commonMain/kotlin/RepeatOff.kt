package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RepeatOff: ImageVector
    get() {
        if (_RepeatOff != null) {
            return _RepeatOff!!
        }
        _RepeatOff = ImageVector.Builder(
            name = "RepeatOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(15.73f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                lineTo(3f, 18f)
                lineTo(7f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(13.73f)
                lineTo(7f, 10.27f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(8.27f)
                lineTo(2f, 5.27f)
                moveTo(17f, 13f)
                horizontalLineTo(19f)
                verticalLineTo(17.18f)
                lineTo(17f, 15.18f)
                verticalLineTo(13f)
                moveTo(17f, 5f)
                verticalLineTo(2f)
                lineTo(21f, 6f)
                lineTo(17f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(8.82f)
                lineTo(6.82f, 5f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _RepeatOff!!
    }

@Suppress("ObjectPropertyName")
private var _RepeatOff: ImageVector? = null

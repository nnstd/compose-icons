package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PianoOff: ImageVector
    get() {
        if (_PianoOff != null) {
            return _PianoOff!!
        }
        _PianoOff = ImageVector.Builder(
            name = "PianoOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(2f, 3.89f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(8f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(5.89f)
                lineTo(6.8f, 8.69f)
                verticalLineTo(13f)
                curveTo(6.8f, 13.56f, 7.24f, 14f, 7.79f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                moveTo(15f, 20f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(9.31f)
                curveTo(9.86f, 14f, 10.3f, 13.56f, 10.3f, 13f)
                verticalLineTo(12.19f)
                lineTo(15f, 16.89f)
                verticalLineTo(20f)
                moveTo(16f, 20f)
                verticalLineTo(17.89f)
                lineTo(18.11f, 20f)
                horizontalLineTo(16f)
                moveTo(10.3f, 7.1f)
                lineTo(5.2f, 2f)
                horizontalLineTo(20f)
                curveTo(21.11f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(18.8f)
                lineTo(20f, 16.8f)
                verticalLineTo(4f)
                horizontalLineTo(17.25f)
                verticalLineTo(13f)
                curveTo(17.25f, 13.3f, 17.13f, 13.55f, 16.93f, 13.73f)
                lineTo(13.75f, 10.55f)
                verticalLineTo(4f)
                horizontalLineTo(10.3f)
                verticalLineTo(7.1f)
                close()
            }
        }.build()

        return _PianoOff!!
    }

@Suppress("ObjectPropertyName")
private var _PianoOff: ImageVector? = null

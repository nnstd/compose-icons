package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveOff: ImageVector
    get() {
        if (_ArchiveOff != null) {
            return _ArchiveOff!!
        }
        _ArchiveOff = ImageVector.Builder(
            name = "ArchiveOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.2f, 7f)
                lineTo(6.2f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(10.2f)
                moveTo(20f, 8f)
                horizontalLineTo(11.2f)
                lineTo(20f, 16.8f)
                verticalLineTo(8f)
                moveTo(20f, 19.35f)
                verticalLineTo(19.34f)
                lineTo(8.66f, 8f)
                horizontalLineTo(8.66f)
                lineTo(7.66f, 7f)
                horizontalLineTo(7.66f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3f, 4.89f)
                verticalLineTo(7f)
                horizontalLineTo(5.11f)
                lineTo(6.11f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(19.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20f, 19.35f)
                close()
            }
        }.build()

        return _ArchiveOff!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveOff: ImageVector? = null

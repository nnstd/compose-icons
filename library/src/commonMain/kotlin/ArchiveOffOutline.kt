package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveOffOutline: ImageVector
    get() {
        if (_ArchiveOffOutline != null) {
            return _ArchiveOffOutline!!
        }
        _ArchiveOffOutline = ImageVector.Builder(
            name = "ArchiveOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.2f, 5f)
                lineTo(6.2f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(12.2f)
                lineTo(10.2f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(8.2f)
                moveTo(20f, 16.8f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(14.8f)
                lineTo(20f, 16.8f)
                moveTo(20f, 19.35f)
                verticalLineTo(19.34f)
                lineTo(18f, 17.34f)
                verticalLineTo(17.35f)
                lineTo(9.66f, 9f)
                horizontalLineTo(9.66f)
                lineTo(7.66f, 7f)
                horizontalLineTo(7.66f)
                lineTo(6.13f, 5.47f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3f, 4.89f)
                verticalLineTo(9f)
                horizontalLineTo(7.11f)
                lineTo(17.11f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(19.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20f, 19.35f)
                close()
            }
        }.build()

        return _ArchiveOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveOffOutline: ImageVector? = null

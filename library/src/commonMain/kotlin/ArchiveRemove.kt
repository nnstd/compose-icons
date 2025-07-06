package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveRemove: ImageVector
    get() {
        if (_ArchiveRemove != null) {
            return _ArchiveRemove!!
        }
        _ArchiveRemove = ImageVector.Builder(
            name = "ArchiveRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                moveTo(13f, 19f)
                curveTo(13f, 19.7f, 13.13f, 20.37f, 13.35f, 21f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13f, 19f, 13f)
                curveTo(15.69f, 13f, 13f, 15.69f, 13f, 19f)
                moveTo(15f, 13f)
                verticalLineTo(11.5f)
                curveTo(15f, 11.22f, 14.78f, 11f, 14.5f, 11f)
                horizontalLineTo(9.5f)
                curveTo(9.22f, 11f, 9f, 11.22f, 9f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }.build()

        return _ArchiveRemove!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveRemove: ImageVector? = null

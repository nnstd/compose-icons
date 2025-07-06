package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlaylistRemove: ImageVector
    get() {
        if (_PlaylistRemove != null) {
            return _PlaylistRemove!!
        }
        _PlaylistRemove = ImageVector.Builder(
            name = "PlaylistRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                moveTo(14f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                moveTo(3f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                moveTo(14.4f, 22f)
                lineTo(17f, 19.4f)
                lineTo(19.6f, 22f)
                lineTo(21f, 20.6f)
                lineTo(18.4f, 18f)
                lineTo(21f, 15.4f)
                lineTo(19.6f, 14f)
                lineTo(17f, 16.6f)
                lineTo(14.4f, 14f)
                lineTo(13f, 15.4f)
                lineTo(15.6f, 18f)
                lineTo(13f, 20.6f)
                lineTo(14.4f, 22f)
                close()
            }
        }.build()

        return _PlaylistRemove!!
    }

@Suppress("ObjectPropertyName")
private var _PlaylistRemove: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlaylistEdit: ImageVector
    get() {
        if (_PlaylistEdit != null) {
            return _PlaylistEdit!!
        }
        _PlaylistEdit = ImageVector.Builder(
            name = "PlaylistEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                moveTo(3f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                moveTo(20f, 10.1f)
                curveTo(19.9f, 10.1f, 19.7f, 10.2f, 19.6f, 10.3f)
                lineTo(18.6f, 11.3f)
                lineTo(20.7f, 13.4f)
                lineTo(21.7f, 12.4f)
                curveTo(21.9f, 12.2f, 21.9f, 11.8f, 21.7f, 11.6f)
                lineTo(20.4f, 10.3f)
                curveTo(20.3f, 10.2f, 20.2f, 10.1f, 20f, 10.1f)
                moveTo(18.1f, 11.9f)
                lineTo(12f, 17.9f)
                verticalLineTo(20f)
                horizontalLineTo(14.1f)
                lineTo(20.2f, 13.9f)
                lineTo(18.1f, 11.9f)
                moveTo(3f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _PlaylistEdit!!
    }

@Suppress("ObjectPropertyName")
private var _PlaylistEdit: ImageVector? = null

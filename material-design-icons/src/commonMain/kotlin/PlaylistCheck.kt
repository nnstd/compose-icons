package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlaylistCheck: ImageVector
    get() {
        if (_PlaylistCheck != null) {
            return _PlaylistCheck!!
        }
        _PlaylistCheck = ImageVector.Builder(
            name = "PlaylistCheck",
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
                moveTo(21.5f, 11.5f)
                lineTo(23f, 13f)
                lineTo(16f, 20f)
                lineTo(11.5f, 15.5f)
                lineTo(13f, 14f)
                lineTo(16f, 17f)
                lineTo(21.5f, 11.5f)
                close()
            }
        }.build()

        return _PlaylistCheck!!
    }

@Suppress("ObjectPropertyName")
private var _PlaylistCheck: ImageVector? = null

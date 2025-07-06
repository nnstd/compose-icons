package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlaylistPlay: ImageVector
    get() {
        if (_PlaylistPlay != null) {
            return _PlaylistPlay!!
        }
        _PlaylistPlay = ImageVector.Builder(
            name = "PlaylistPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                moveTo(3f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                moveTo(3f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                moveTo(16f, 13f)
                verticalLineTo(21f)
                lineTo(22f, 17f)
                lineTo(16f, 13f)
                close()
            }
        }.build()

        return _PlaylistPlay!!
    }

@Suppress("ObjectPropertyName")
private var _PlaylistPlay: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlaylistMinus: ImageVector
    get() {
        if (_PlaylistMinus != null) {
            return _PlaylistMinus!!
        }
        _PlaylistMinus = ImageVector.Builder(
            name = "PlaylistMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                moveTo(12f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                moveTo(14f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                moveTo(14f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _PlaylistMinus!!
    }

@Suppress("ObjectPropertyName")
private var _PlaylistMinus: ImageVector? = null

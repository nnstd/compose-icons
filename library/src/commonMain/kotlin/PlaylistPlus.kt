package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlaylistPlus: ImageVector
    get() {
        if (_PlaylistPlus != null) {
            return _PlaylistPlus!!
        }
        _PlaylistPlus = ImageVector.Builder(
            name = "PlaylistPlus",
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
                moveTo(18f, 14f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
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

        return _PlaylistPlus!!
    }

@Suppress("ObjectPropertyName")
private var _PlaylistPlus: ImageVector? = null

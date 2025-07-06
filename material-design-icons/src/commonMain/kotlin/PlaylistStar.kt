package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlaylistStar: ImageVector
    get() {
        if (_PlaylistStar != null) {
            return _PlaylistStar!!
        }
        _PlaylistStar = ImageVector.Builder(
            name = "PlaylistStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 19.1f)
                lineTo(19.5f, 20.6f)
                lineTo(18.8f, 17.8f)
                lineTo(21f, 15.9f)
                lineTo(18.1f, 15.7f)
                lineTo(17f, 13f)
                lineTo(15.9f, 15.6f)
                lineTo(13f, 15.9f)
                lineTo(15.2f, 17.8f)
                lineTo(14.5f, 20.6f)
                lineTo(17f, 19.1f)
                moveTo(3f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                moveTo(3f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                moveTo(3f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _PlaylistStar!!
    }

@Suppress("ObjectPropertyName")
private var _PlaylistStar: ImageVector? = null

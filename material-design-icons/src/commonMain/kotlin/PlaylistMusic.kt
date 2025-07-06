package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlaylistMusic: ImageVector
    get() {
        if (_PlaylistMusic != null) {
            return _PlaylistMusic!!
        }
        _PlaylistMusic = ImageVector.Builder(
            name = "PlaylistMusic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                moveTo(15f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                moveTo(3f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                moveTo(17f, 6f)
                verticalLineTo(14.18f)
                curveTo(16.69f, 14.07f, 16.35f, 14f, 16f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 17f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _PlaylistMusic!!
    }

@Suppress("ObjectPropertyName")
private var _PlaylistMusic: ImageVector? = null

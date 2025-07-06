package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlaylistMusicOutline: ImageVector
    get() {
        if (_PlaylistMusicOutline != null) {
            return _PlaylistMusicOutline!!
        }
        _PlaylistMusicOutline = ImageVector.Builder(
            name = "PlaylistMusicOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                moveTo(15f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                moveTo(3f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                moveTo(17f, 6f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 14f)
                curveTo(16.35f, 14f, 16.69f, 14.07f, 17f, 14.18f)
                verticalLineTo(6f)
                moveTo(16f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                close()
            }
        }.build()

        return _PlaylistMusicOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PlaylistMusicOutline: ImageVector? = null

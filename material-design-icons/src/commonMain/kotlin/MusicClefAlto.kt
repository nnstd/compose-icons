package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicClefAlto: ImageVector
    get() {
        if (_MusicClefAlto != null) {
            return _MusicClefAlto!!
        }
        _MusicClefAlto = ImageVector.Builder(
            name = "MusicClefAlto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                moveTo(15.46f, 13f)
                horizontalLineTo(14.83f)
                lineTo(13.83f, 12f)
                lineTo(14.83f, 11f)
                horizontalLineTo(15.46f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.96f, 7.5f)
                horizontalLineTo(13.96f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.46f, 9f)
                horizontalLineTo(14f)
                lineTo(12f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                lineTo(14f, 15f)
                horizontalLineTo(15.46f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.96f, 16.5f)
                horizontalLineTo(11.96f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15.46f, 13f)
                close()
            }
        }.build()

        return _MusicClefAlto!!
    }

@Suppress("ObjectPropertyName")
private var _MusicClefAlto: ImageVector? = null

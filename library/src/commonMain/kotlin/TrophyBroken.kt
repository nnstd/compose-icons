package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrophyBroken: ImageVector
    get() {
        if (_TrophyBroken != null) {
            return _TrophyBroken!!
        }
        _TrophyBroken = ImageVector.Builder(
            name = "TrophyBroken",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.2f, 13f)
                curveTo(6.6f, 14.8f, 7.6f, 16.3f, 10f, 16.8f)
                verticalLineTo(19.34f)
                curveTo(8f, 20.12f, 8f, 22f, 8f, 22f)
                horizontalLineTo(13.2f)
                lineTo(10.2f, 15f)
                lineTo(14.2f, 10f)
                lineTo(10.7f, 4f)
                horizontalLineTo(8f)
                curveTo(8f, 3f, 6.9f, 2f, 6f, 2f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                curveTo(2f, 12f, 3f, 13f, 4f, 13f)
                horizontalLineTo(6.2f)
                moveTo(6f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                moveTo(17.8f, 13f)
                horizontalLineTo(20f)
                curveTo(21f, 13f, 22f, 12f, 22f, 11f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                curveTo(17.1f, 2f, 16f, 3f, 16f, 4f)
                horizontalLineTo(13.9f)
                lineTo(16.7f, 10f)
                lineTo(12.2f, 15f)
                lineTo(13.2f, 22f)
                horizontalLineTo(16f)
                curveTo(16f, 22f, 16f, 20.12f, 14f, 19.34f)
                lineTo(14f, 16.85f)
                curveTo(16.39f, 16.35f, 17.5f, 14.7f, 17.8f, 13f)
                moveTo(20f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _TrophyBroken!!
    }

@Suppress("ObjectPropertyName")
private var _TrophyBroken: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrophyAward: ImageVector
    get() {
        if (_TrophyAward != null) {
            return _TrophyAward!!
        }
        _TrophyAward = ImageVector.Builder(
            name = "TrophyAward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.2f, 10.7f)
                lineTo(16.6f, 16f)
                lineTo(12f, 12.2f)
                lineTo(7.4f, 16f)
                lineTo(8.8f, 10.8f)
                lineTo(4.6f, 7.3f)
                lineTo(10f, 7f)
                lineTo(12f, 2f)
                lineTo(14f, 7f)
                lineTo(19.4f, 7.3f)
                lineTo(15.2f, 10.7f)
                moveTo(14f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                lineTo(12f, 15f)
                lineTo(11f, 16f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                curveTo(8.9f, 19f, 8f, 19.9f, 8f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                curveTo(16f, 19.9f, 15.11f, 19f, 14f, 19f)
                close()
            }
        }.build()

        return _TrophyAward!!
    }

@Suppress("ObjectPropertyName")
private var _TrophyAward: ImageVector? = null

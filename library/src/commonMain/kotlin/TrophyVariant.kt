package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrophyVariant: ImageVector
    get() {
        if (_TrophyVariant != null) {
            return _TrophyVariant!!
        }
        _TrophyVariant = ImageVector.Builder(
            name = "TrophyVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                curveTo(2f, 12.1f, 2.9f, 13f, 4f, 13f)
                horizontalLineTo(7.1f)
                curveTo(7.5f, 14.96f, 9.04f, 16.5f, 11f, 16.9f)
                verticalLineTo(19.08f)
                curveTo(8f, 19.54f, 8f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(16f, 22f, 16f, 19.54f, 13f, 19.08f)
                verticalLineTo(16.9f)
                curveTo(14.96f, 16.5f, 16.5f, 14.96f, 16.9f, 13f)
                horizontalLineTo(20f)
                curveTo(21.1f, 13f, 22f, 12.1f, 22f, 11f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                moveTo(4f, 11f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                lineTo(4f, 11f)
                moveTo(20f, 11f)
                lineTo(17f, 11f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                lineTo(20f, 11f)
                close()
            }
        }.build()

        return _TrophyVariant!!
    }

@Suppress("ObjectPropertyName")
private var _TrophyVariant: ImageVector? = null

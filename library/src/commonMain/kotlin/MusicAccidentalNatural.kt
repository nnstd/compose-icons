package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicAccidentalNatural: ImageVector
    get() {
        if (_MusicAccidentalNatural != null) {
            return _MusicAccidentalNatural!!
        }
        _MusicAccidentalNatural = ImageVector.Builder(
            name = "MusicAccidentalNatural",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 8.75f)
                verticalLineTo(3.5f)
                horizontalLineTo(8f)
                verticalLineTo(17.5f)
                lineTo(14f, 15.25f)
                verticalLineTo(20.5f)
                horizontalLineTo(16f)
                verticalLineTo(6.5f)
                lineTo(10f, 8.75f)
                moveTo(14f, 13.25f)
                lineTo(10f, 14.75f)
                verticalLineTo(10.75f)
                lineTo(14f, 9.25f)
                verticalLineTo(13.25f)
                close()
            }
        }.build()

        return _MusicAccidentalNatural!!
    }

@Suppress("ObjectPropertyName")
private var _MusicAccidentalNatural: ImageVector? = null

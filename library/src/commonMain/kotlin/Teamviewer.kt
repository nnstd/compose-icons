package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Teamviewer: ImageVector
    get() {
        if (_Teamviewer != null) {
            return _Teamviewer!!
        }
        _Teamviewer = ImageVector.Builder(
            name = "Teamviewer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.04f, 9.2f)
                lineTo(9.3f, 11f)
                horizontalLineTo(14.75f)
                lineTo(14f, 9.2f)
                lineTo(19.55f, 12f)
                lineTo(14f, 14.8f)
                lineTo(14.75f, 13f)
                horizontalLineTo(9.3f)
                lineTo(10.04f, 14.8f)
                lineTo(4.5f, 12f)
                lineTo(10.04f, 9.2f)
                moveTo(20.83f, 22f)
                horizontalLineTo(3.17f)
                curveTo(2.53f, 22f, 2f, 21.5f, 2f, 20.83f)
                verticalLineTo(3.17f)
                curveTo(2f, 2.53f, 2.53f, 2f, 3.17f, 2f)
                horizontalLineTo(20.83f)
                curveTo(21.5f, 2f, 22f, 2.53f, 22f, 3.17f)
                verticalLineTo(20.83f)
                curveTo(22f, 21.47f, 21.5f, 22f, 20.83f, 22f)
                moveTo(11.93f, 3.76f)
                curveTo(7.41f, 3.82f, 3.78f, 7.5f, 3.76f, 12f)
                curveTo(3.72f, 16.5f, 7.35f, 20.2f, 11.86f, 20.24f)
                horizontalLineTo(12f)
                curveTo(16.53f, 20.18f, 20.18f, 16.53f, 20.24f, 12f)
                curveTo(20.31f, 7.5f, 16.74f, 3.83f, 12.26f, 3.76f)
                curveTo(12.15f, 3.75f, 12.04f, 3.76f, 11.93f, 3.76f)
                close()
            }
        }.build()

        return _Teamviewer!!
    }

@Suppress("ObjectPropertyName")
private var _Teamviewer: ImageVector? = null

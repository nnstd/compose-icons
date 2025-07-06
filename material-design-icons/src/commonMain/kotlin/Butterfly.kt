package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Butterfly: ImageVector
    get() {
        if (_Butterfly != null) {
            return _Butterfly!!
        }
        _Butterfly = ImageVector.Builder(
            name = "Butterfly",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                lineTo(9.03f, 3.97f)
                lineTo(10f, 3f)
                lineTo(12f, 5f)
                lineTo(14f, 3f)
                lineTo(15f, 4f)
                lineTo(13f, 6f)
                verticalLineTo(21f)
                moveTo(7f, 6f)
                curveTo(4.24f, 6f, 2f, 8.24f, 2f, 11f)
                curveTo(2f, 12.64f, 2.79f, 14.09f, 4f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 5.79f, 21f, 8f, 21f)
                curveTo(8.72f, 21f, 9.39f, 20.81f, 9.97f, 20.5f)
                lineTo(10f, 20.46f)
                verticalLineTo(7f)
                curveTo(9.16f, 6.37f, 8.13f, 6f, 7f, 6f)
                moveTo(6.5f, 12.5f)
                lineTo(5f, 11f)
                lineTo(6.5f, 9.5f)
                lineTo(8f, 11f)
                lineTo(6.5f, 12.5f)
                moveTo(22f, 11f)
                curveTo(22f, 8.24f, 19.76f, 6f, 17f, 6f)
                curveTo(15.88f, 6f, 14.85f, 6.37f, 14f, 7f)
                lineTo(14f, 7f)
                verticalLineTo(20.46f)
                curveTo(14.59f, 20.81f, 15.27f, 21f, 16f, 21f)
                curveTo(18.21f, 21f, 20f, 19.21f, 20f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                curveTo(21.21f, 14.09f, 22f, 12.64f, 22f, 11f)
                moveTo(17.5f, 12.5f)
                lineTo(16f, 11f)
                lineTo(17.5f, 9.5f)
                lineTo(19f, 11f)
                lineTo(17.5f, 12.5f)
                close()
            }
        }.build()

        return _Butterfly!!
    }

@Suppress("ObjectPropertyName")
private var _Butterfly: ImageVector? = null

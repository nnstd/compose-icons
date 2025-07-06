package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Run: ImageVector
    get() {
        if (_Run != null) {
            return _Run!!
        }
        _Run = ImageVector.Builder(
            name = "Run",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 5.5f)
                curveTo(14.59f, 5.5f, 15.5f, 4.58f, 15.5f, 3.5f)
                curveTo(15.5f, 2.38f, 14.59f, 1.5f, 13.5f, 1.5f)
                curveTo(12.39f, 1.5f, 11.5f, 2.38f, 11.5f, 3.5f)
                curveTo(11.5f, 4.58f, 12.39f, 5.5f, 13.5f, 5.5f)
                moveTo(9.89f, 19.38f)
                lineTo(10.89f, 15f)
                lineTo(13f, 17f)
                verticalLineTo(23f)
                horizontalLineTo(15f)
                verticalLineTo(15.5f)
                lineTo(12.89f, 13.5f)
                lineTo(13.5f, 10.5f)
                curveTo(14.79f, 12f, 16.79f, 13f, 19f, 13f)
                verticalLineTo(11f)
                curveTo(17.09f, 11f, 15.5f, 10f, 14.69f, 8.58f)
                lineTo(13.69f, 7f)
                curveTo(13.29f, 6.38f, 12.69f, 6f, 12f, 6f)
                curveTo(11.69f, 6f, 11.5f, 6.08f, 11.19f, 6.08f)
                lineTo(6f, 8.28f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(9.58f)
                lineTo(9.79f, 8.88f)
                lineTo(8.19f, 17f)
                lineTo(3.29f, 16f)
                lineTo(2.89f, 18f)
                lineTo(9.89f, 19.38f)
                close()
            }
        }.build()

        return _Run!!
    }

@Suppress("ObjectPropertyName")
private var _Run: ImageVector? = null

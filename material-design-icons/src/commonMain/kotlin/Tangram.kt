package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tangram: ImageVector
    get() {
        if (_Tangram != null) {
            return _Tangram!!
        }
        _Tangram = ImageVector.Builder(
            name = "Tangram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.1f, 22f, 22f, 21.1f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(18.59f, 4f)
                lineTo(12f, 10.59f)
                lineTo(5.41f, 4f)
                horizontalLineTo(18.59f)
                moveTo(13.41f, 12f)
                lineTo(16.5f, 8.91f)
                lineTo(19.59f, 12f)
                lineTo(16.5f, 15.09f)
                lineTo(13.41f, 12f)
                moveTo(14.59f, 16f)
                horizontalLineTo(9.41f)
                lineTo(12f, 13.41f)
                lineTo(14.59f, 16f)
                moveTo(4f, 5.41f)
                lineTo(10.59f, 12f)
                lineTo(4f, 18.59f)
                verticalLineTo(5.41f)
                moveTo(11.59f, 20f)
                horizontalLineTo(5.41f)
                lineTo(7.41f, 18f)
                horizontalLineTo(13.59f)
                lineTo(11.59f, 20f)
                moveTo(20f, 20f)
                horizontalLineTo(14.41f)
                lineTo(20f, 14.41f)
                verticalLineTo(20f)
                moveTo(20f, 9.59f)
                lineTo(17.91f, 7.5f)
                lineTo(20f, 5.41f)
                verticalLineTo(9.59f)
                close()
            }
        }.build()

        return _Tangram!!
    }

@Suppress("ObjectPropertyName")
private var _Tangram: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagRemove: ImageVector
    get() {
        if (_FlagRemove != null) {
            return _FlagRemove!!
        }
        _FlagRemove = ImageVector.Builder(
            name = "FlagRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.46f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18f, 16.59f)
                lineTo(20.12f, 14.46f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.46f, 20.12f)
                lineTo(16.59f, 18f)
                lineTo(14.46f, 15.88f)
                moveTo(12.4f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                curveTo(15.78f, 12f, 13.84f, 13.21f, 12.8f, 15f)
                horizontalLineTo(11f)
                lineTo(10.6f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                lineTo(12.4f, 5f)
                close()
            }
        }.build()

        return _FlagRemove!!
    }

@Suppress("ObjectPropertyName")
private var _FlagRemove: ImageVector? = null

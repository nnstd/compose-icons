package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WhiteBalanceIridescent: ImageVector
    get() {
        if (_WhiteBalanceIridescent != null) {
            return _WhiteBalanceIridescent!!
        }
        _WhiteBalanceIridescent = ImageVector.Builder(
            name = "WhiteBalanceIridescent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.96f, 19.95f)
                lineTo(6.76f, 18.15f)
                lineTo(5.34f, 16.74f)
                lineTo(3.55f, 18.53f)
                moveTo(3.55f, 4.46f)
                lineTo(5.34f, 6.26f)
                lineTo(6.76f, 4.84f)
                lineTo(4.96f, 3.05f)
                moveTo(20.45f, 18.53f)
                lineTo(18.66f, 16.74f)
                lineTo(17.24f, 18.15f)
                lineTo(19.04f, 19.95f)
                moveTo(13f, 22.45f)
                verticalLineTo(19.5f)
                horizontalLineTo(11f)
                verticalLineTo(22.45f)
                curveTo(11.32f, 22.45f, 13f, 22.45f, 13f, 22.45f)
                moveTo(19.04f, 3.05f)
                lineTo(17.24f, 4.84f)
                lineTo(18.66f, 6.26f)
                lineTo(20.45f, 4.46f)
                moveTo(11f, 3.5f)
                horizontalLineTo(13f)
                verticalLineTo(0.55f)
                horizontalLineTo(11f)
                moveTo(5f, 14.5f)
                horizontalLineTo(19f)
                verticalLineTo(8.5f)
                horizontalLineTo(5f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _WhiteBalanceIridescent!!
    }

@Suppress("ObjectPropertyName")
private var _WhiteBalanceIridescent: ImageVector? = null

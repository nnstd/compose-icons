package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Twitch: ImageVector
    get() {
        if (_Twitch != null) {
            return _Twitch!!
        }
        _Twitch = ImageVector.Builder(
            name = "Twitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.64f, 5.93f)
                horizontalLineTo(13.07f)
                verticalLineTo(10.21f)
                horizontalLineTo(11.64f)
                moveTo(15.57f, 5.93f)
                horizontalLineTo(17f)
                verticalLineTo(10.21f)
                horizontalLineTo(15.57f)
                moveTo(7f, 2f)
                lineTo(3.43f, 5.57f)
                verticalLineTo(18.43f)
                horizontalLineTo(7.71f)
                verticalLineTo(22f)
                lineTo(11.29f, 18.43f)
                horizontalLineTo(14.14f)
                lineTo(20.57f, 12f)
                verticalLineTo(2f)
                moveTo(19.14f, 11.29f)
                lineTo(16.29f, 14.14f)
                horizontalLineTo(13.43f)
                lineTo(10.93f, 16.64f)
                verticalLineTo(14.14f)
                horizontalLineTo(7.71f)
                verticalLineTo(3.43f)
                horizontalLineTo(19.14f)
                close()
            }
        }.build()

        return _Twitch!!
    }

@Suppress("ObjectPropertyName")
private var _Twitch: ImageVector? = null

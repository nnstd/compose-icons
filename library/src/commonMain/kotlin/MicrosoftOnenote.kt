package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftOnenote: ImageVector
    get() {
        if (_MicrosoftOnenote != null) {
            return _MicrosoftOnenote!!
        }
        _MicrosoftOnenote = ImageVector.Builder(
            name = "MicrosoftOnenote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.17f, 3.25f)
                quadTo(21.5f, 3.25f, 21.76f, 3.5f)
                quadTo(22f, 3.74f, 22f, 4.08f)
                verticalLineTo(19.92f)
                quadTo(22f, 20.26f, 21.76f, 20.5f)
                quadTo(21.5f, 20.75f, 21.17f, 20.75f)
                horizontalLineTo(7.83f)
                quadTo(7.5f, 20.75f, 7.24f, 20.5f)
                quadTo(7f, 20.26f, 7f, 19.92f)
                verticalLineTo(17f)
                horizontalLineTo(2.83f)
                quadTo(2.5f, 17f, 2.24f, 16.76f)
                quadTo(2f, 16.5f, 2f, 16.17f)
                verticalLineTo(7.83f)
                quadTo(2f, 7.5f, 2.24f, 7.24f)
                quadTo(2.5f, 7f, 2.83f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(4.08f)
                quadTo(7f, 3.74f, 7.24f, 3.5f)
                quadTo(7.5f, 3.25f, 7.83f, 3.25f)
                moveTo(5.8f, 11.17f)
                lineTo(8.16f, 15.27f)
                horizontalLineTo(9.65f)
                verticalLineTo(8.73f)
                horizontalLineTo(8.2f)
                verticalLineTo(12.92f)
                lineTo(5.93f, 8.73f)
                horizontalLineTo(4.35f)
                verticalLineTo(15.27f)
                horizontalLineTo(5.8f)
                moveTo(20.75f, 19.5f)
                verticalLineTo(17f)
                horizontalLineTo(18.25f)
                verticalLineTo(19.5f)
                moveTo(20.75f, 15.75f)
                verticalLineTo(13.25f)
                horizontalLineTo(18.25f)
                verticalLineTo(15.75f)
                moveTo(20.75f, 12f)
                verticalLineTo(9.5f)
                horizontalLineTo(18.25f)
                verticalLineTo(12f)
                moveTo(20.75f, 8.25f)
                verticalLineTo(4.5f)
                horizontalLineTo(8.25f)
                verticalLineTo(7f)
                horizontalLineTo(11.17f)
                quadTo(11.5f, 7f, 11.76f, 7.24f)
                quadTo(12f, 7.5f, 12f, 7.83f)
                verticalLineTo(16.17f)
                quadTo(12f, 16.5f, 11.76f, 16.76f)
                quadTo(11.5f, 17f, 11.17f, 17f)
                horizontalLineTo(8.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(17f)
                verticalLineTo(8.25f)
                close()
            }
        }.build()

        return _MicrosoftOnenote!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftOnenote: ImageVector? = null

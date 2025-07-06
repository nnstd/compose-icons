package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardRemoveOutline: ImageVector
    get() {
        if (_CardRemoveOutline != null) {
            return _CardRemoveOutline!!
        }
        _CardRemoveOutline = ImageVector.Builder(
            name = "CardRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.41f, 19f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.47f, 21.12f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 16.88f)
                lineTo(16.88f, 15.47f)
                lineTo(19f, 17.59f)
                lineTo(21.12f, 15.47f)
                lineTo(22.54f, 16.88f)
                lineTo(20.41f, 19f)
                moveTo(13.09f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(13.09f)
                curveTo(20.72f, 13.21f, 21.39f, 13.46f, 22f, 13.81f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.11f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 19.67f, 13f, 19.34f, 13f, 19f)
                curveTo(13f, 18.66f, 13.04f, 18.33f, 13.09f, 18f)
                close()
            }
        }.build()

        return _CardRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardRemoveOutline: ImageVector? = null

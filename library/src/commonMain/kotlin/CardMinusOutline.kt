package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardMinusOutline: ImageVector
    get() {
        if (_CardMinusOutline != null) {
            return _CardMinusOutline!!
        }
        _CardMinusOutline = ImageVector.Builder(
            name = "CardMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
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

        return _CardMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardMinusOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardOffOutline: ImageVector
    get() {
        if (_CardOffOutline != null) {
            return _CardOffOutline!!
        }
        _CardOffOutline = ImageVector.Builder(
            name = "CardOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.2f, 6f)
                lineTo(7.2f, 4f)
                horizontalLineTo(20f)
                curveTo(21.11f, 4f, 22f, 4.89f, 22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 18.24f, 21.96f, 18.47f, 21.88f, 18.68f)
                lineTo(20f, 16.8f)
                verticalLineTo(6f)
                horizontalLineTo(9.2f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.11f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 5.42f, 2.25f, 4.9f, 2.65f, 4.54f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(6.66f, 6f)
                lineTo(18.65f, 18f)
                horizontalLineTo(18.66f)
                lineTo(20.57f, 19.91f)
                lineTo(20.56f, 19.91f)
                lineTo(22.11f, 21.46f)
                moveTo(16.11f, 18f)
                lineTo(4.11f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(16.11f)
                close()
            }
        }.build()

        return _CardOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardOffOutline: ImageVector? = null
